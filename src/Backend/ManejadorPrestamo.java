package Backend;

import java.io.File;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class ManejadorPrestamo {

    //Constantes de la clase
    private final String ESTUDIANTE = "ESTUDIANTE";
    private final String LIBRO = "LIBRO";
    private final String PRESTAMO = "PRESTAMO";
    
    //Variables e instancias de la clase
    private ManejadorArchivosBinarios<Estudiante> archivoEstudiante = new ManejadorArchivosBinarios<>();
    private ManejadorArchivosBinarios<Libro> archivoLibro = new ManejadorArchivosBinarios<>();
    private ManejadorArchivosBinarios<Prestamo> archivoPrestamo = new ManejadorArchivosBinarios<>();
    private ManejadorFechas manejadorFechas = new ManejadorFechas();
    private List<Prestamo> listaNuevoHistorial = new ArrayList<>();
    private List<Prestamo> listaNuevoPrestamosActuales = new ArrayList<>();
    private List<Prestamo> listaPrestamos = new ArrayList<>();
    private Estudiante estudiantePrestamo;
    private Libro libroPrestamo;
    private Prestamo prestamo;
    private Date fechaLimite;
    private Date fechaActual = new Date();
    
    /*
    Metodo encargado de realizar el proceso de prestamo.
        1. Se obtiene el archivo binario del estudiante basado en el numero de carne si no se encuentra
           el archivo es porque el estudiante no esta registrado en el sistema. 
        2. Se comprueba que la cantidad de libros prestados actualmente sea menor a 3.
        3. Se obtiene el archivo binario del libro basado en el codigo, si no se encuentra el archivo es
           porque el libro no esta registrado en el sistema.
        4. Se comprueba que existan copias del libro deseado.
        5. Se registra el prestamo solicitado. Se obtiene la fecha de entrega y se crea una nueva instancia
           de la clase Prestamo agregandole todos sus atributos, se llama al metodo guardarPrestamo y se 
           agrega el registro de prestamos hechos a la instancia de estudiante correspondiente. Por ultimo
           se actualiza la cantidad de copias actuales del libro prestado.
    */
    public String procesarPrestamo(int carneEstudiante, String codigoLibro, Date fechaPrestamo, boolean validarCantidadCopias) {
        //PASO 1----------------------------------------------------------------------------------------------------
        if (!buscarEstudiante(carneEstudiante)) {
            return "El estudiante no se encuentra registrado en el sistema";
        } 
        //PASO 2----------------------------------------------------------------------------------------------------
        else {
            if (comprobarLibrosPrestados(estudiantePrestamo)) {
                return "Se ha llegado al limite de prestamos por estudiante";
            }
        //PASO 3----------------------------------------------------------------------------------------------------    
            else {
                if (!buscarLibro(codigoLibro)) {
                    return "El libro no se encuentra registrado en el sistema";
                }
        //PASO 4----------------------------------------------------------------------------------------------------        
                else {
                    if(validarCantidadCopias){
                        
                        if (!comprobarExistencias(libroPrestamo)) {
                        return "Se han agotado las existencias del libro solicitado";     
                        }
                    }
        //PASO 5----------------------------------------------------------------------------------------------------            
                    
                    fechaLimite = manejadorFechas.sumarDias(fechaPrestamo);
                    prestamo = new Prestamo(0,libroPrestamo.getCodigo(), estudiantePrestamo.getCarne(), fechaPrestamo, fechaLimite,true, 0);
                    guardarPrestamo(prestamo);
                    agregarListado(estudiantePrestamo, prestamo);
                    if(validarCantidadCopias){
                        disminuirCantidad(libroPrestamo);
                    }
                    return "Prestamo Realizado Exitosamente";                
                }                
            }
        }
    }
    
    
    /*
    Metodo encargado del proceso de devolucion
        1. Validar que el estudiante y el libro esten registrados en el sistema.
        2. Buscar el archivo binario que contiene el prestamo.
        3. Verificar si se debe aplicar mora.
    */
    public String procesarDevolucion(String codigoLibro, int carneEstudiante){
    //PASO 1----------------------------------------------------------------------------------------------------------------------            
        if (!buscarEstudiante(carneEstudiante)) {
            return "El estudiante no se encuentra registrado en el sistema";
        } 
        else if (!buscarLibro(codigoLibro)) {
           return "El libro no se encuentra registrado en el sistema";
        }
    //PASO 2----------------------------------------------------------------------------------------------------------------------    
        listaPrestamos = archivoPrestamo.leerListaArchivos(".pre");
        for (int i = 0; i < listaPrestamos.size(); i++){
            if(listaPrestamos.get(i).getCodigolibro().equals(codigoLibro) && listaPrestamos.get(i).getCarne() == carneEstudiante
               && listaPrestamos.get(i).isActivo()){
                prestamo = listaPrestamos.get(i);
    //PASO 3----------------------------------------------------------------------------------------------------------------------            
                System.out.println(fechaActual);
                System.out.println(prestamo.getFechaLimite());
                if(fechaActual.compareTo(prestamo.getFechaLimite()) > 0){
                    System.out.println("Pagar Mora");
                }
                    
                
                
                
                
                
                
                
                System.out.println("Prestamo encontrado");
        
            }

        }
        
      
        return "";
    }
    
    
    /*
    Metodo encargado de leer la longitud del listado de prestamos actuales de un estudiante.Si la
    longitud es igual a tres se devuelve true, caso contrario incluyeno null se devolvera false.
    */
    public boolean comprobarLibrosPrestados(Estudiante estudiante){
        try{
            return estudiante.getPrestamosActuales().size() == 3;
        }
        catch(NullPointerException e){
            return false;
        }  
    }
    
    /*
    Metodo encargado de obtener el objeto dentro del archivo binario correspondiente al libro 
    solicitado
    */
    public boolean buscarLibro(String codigoLibro){
        libroPrestamo = archivoLibro.leerArchivo(LIBRO, codigoLibro, ".lib");
        return libroPrestamo != null;
    }
    
    public boolean buscarEstudiante(int carneEstudiante){
        estudiantePrestamo = archivoEstudiante.leerArchivo(ESTUDIANTE, String.valueOf(carneEstudiante), ".est");
        return estudiantePrestamo != null;
    }
    
    
    /*
    Metodo encargado de comprobar la cantidad de copias existentes del libro solicitado
    */
    public boolean comprobarExistencias(Libro libro){
        return libro.getCantidadCopias() > 0;
    }
    
    /*
    Metodo encargado de obtener un codigo unico para identificar el prestamo realizado mediante
    la apertura de un flujo hacia un archivo llamado ContadorPrestamo. Si el archivo no existe
    se crea. Por ultimo se llama al metodo crearArchivo.
    */
    public void guardarPrestamo(Prestamo prestamo) {
        int accountant = 0;
        File archivoCont = new File("./Archivos/ContadorPrestamo.bin");
        if(archivoCont.exists()){
            accountant = ManejadorArchivoContador.leerContador("./Archivos/ContadorPrestamo.bin");
        } else {
            ManejadorArchivoContador.crearNuevoContador(0, "./Archivos/ContadorPrestamo.bin");
        }
        prestamo.setCodigoPrestamo(accountant);
        archivoPrestamo.crearArchivo(prestamo, PRESTAMO, Integer.toString(accountant), ".pre");
    }   
    
    
    /*
    Metodo encargado de actualizar las listas de prestamosActuales e historialPrestamos
    de la instancia de estudiante que se recibe como parametro.
    */
    public void agregarListado(Estudiante estudiante, Prestamo prestamoRealizado) {
        if(estudiante.getPrestamosActuales() == null){
            listaNuevoPrestamosActuales.add(prestamo);
            estudiante.setPrestamosActuales(listaNuevoPrestamosActuales);
        }
        else{
            listaNuevoPrestamosActuales = estudiante.getPrestamosActuales();
            listaNuevoPrestamosActuales.add(prestamo);
            estudiante.setPrestamosActuales(listaNuevoPrestamosActuales);
        }
        
        if(estudiante.getHistorialPrestamos() == null){
           listaNuevoHistorial.add(prestamo);
           estudiante.setHistorialPrestamos(listaNuevoHistorial);
        }
        else{
            listaNuevoHistorial = estudiante.getHistorialPrestamos();
            listaNuevoHistorial.add(prestamo);
            estudiante.setHistorialPrestamos(listaNuevoHistorial);
        }
        archivoEstudiante.crearArchivo(estudiante, ESTUDIANTE, String.valueOf(estudiante.getCarne()), ".est");
        listaNuevoHistorial.clear();
        listaNuevoPrestamosActuales.clear();
        
    }
    
    /*
    Metodo encargado de disminuir la cantidadCopias de la instancia de la clase libro
    que recibe como parametro.
    */
    public void disminuirCantidad(Libro libro){
        libro.setCantidadCopias(libro.getCantidadCopias()-1);
        archivoLibro.crearArchivo(libro, LIBRO, libro.getCodigo(), ".lib");
    }
}   