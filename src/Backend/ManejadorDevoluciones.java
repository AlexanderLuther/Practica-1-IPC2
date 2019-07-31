package Backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class ManejadorDevoluciones {

    //Constantes de la clase
    private final String ESTUDIANTE = "ESTUDIANTE";
    private final String LIBRO = "LIBRO";
    private final String PRESTAMO = "PRESTAMO";
    private final int MORA = 10;
    private final int CUOTA = 5;
    
    //Varaiables e instancias de la clase
    private List<Prestamo> listaPrestamos = new ArrayList<>();
    private ManejadorArchivosBinarios<Prestamo> manejadorArchivoPrestamo = new ManejadorArchivosBinarios<>();
    private ManejadorArchivosBinarios<Libro> manejadorArchivoLibro = new ManejadorArchivosBinarios<>();
    private ManejadorArchivosBinarios<Estudiante> manejadorArchivoEstudiante = new ManejadorArchivosBinarios<>();
    private ManejadorFechas manejadorFechas = new ManejadorFechas();
    private List<Prestamo> listaPrestamosEncontrados = new ArrayList<>();
    private List<Prestamo> prestamosActuales = new ArrayList<>();
    private Prestamo prestamo;
    private Libro libro;
    private Estudiante estudiante;
    private Date fechaMora;
    private int cantidadDiasMora;
    private int cantidadDiasPrestamo;
    private int cantidadMoraTotal;
    private int cantidadCuotaTotal;
    private int cantidadTotal;
    
    /*
    Metodo encargado de obtener todos los prestamos vigentes correspondientes a un codigo de libro y
    numero de carne de estudiante especifico.
    */
    public List<Prestamo> obtenerPrestamos(String codigoLibro, int carneEstudiante){
        listaPrestamos = manejadorArchivoPrestamo.leerListaArchivos(".pre");
        for (int i = 0; i < listaPrestamos.size(); i++){
            if(listaPrestamos.get(i).getCodigolibro().equals(codigoLibro) && listaPrestamos.get(i).getCarne() == carneEstudiante
               && listaPrestamos.get(i).isActivo()){
                listaPrestamosEncontrados.add(listaPrestamos.get(i));
            }
        }
       return listaPrestamosEncontrados;
    }

    /*
    Metodo encargado de verificar la existencia de un archivo binario correspondiente al codigo 
    del libro y el numero de carne del estudiante que recibe como parametro.
    */
    public String validarExistenciaLibroEstudiante(String codigoLibro, int carneEstudiante){
        if (!buscarEstudiante(carneEstudiante)) {
            return "El estudiante no se encuentra registrado en el sistema";
        } 
        if (!buscarLibro(codigoLibro)) {
           return "El libro no se encuentra registrado en el sistema";
        }
        return "";
    }
    
    /*
    Metodo encargado del proceso de cobro al momento de devolver un libro.
        1. Verificar si se debe aplicar mora. Si es el caso se obtiene la cantidad de dias en los
           que se excedio la fecha de entrega llamando al metodo obtenerDiferenciaFechas, posteriormente
           se aplica la cuota normal por tres dias de prestamo y se calcula la cantidad de mora a pagar.
           Por ultimo se calcular el total y se devuelve un mensaje indicando la respectiva cuota.
    
        4. Si no se debe aplicar mora entonces se obtiene la cantidad de dias en los se tuvo en prestamo el 
           libro llamando al metodo obtenerDiferenciaFechas, posteriormente se aplica la cuota normal por la 
           cantidad de dias que se tuvo el libro. Por ultimo se calcular el total y se devuelve un mensaje
           indicando la respectiva cuota.
    */
    public String procesarDevolucion(Prestamo prestamo){
        cantidadCuotaTotal = 0;
        cantidadMoraTotal = 0;
        cantidadTotal = 0;
    //PASO 1----------------------------------------------------------------------------------------------------------------------           
        fechaMora = manejadorFechas.sumarDias(prestamo.getFechaLimite(),1);
        if(manejadorFechas.compararFechasDespuesActual(fechaMora)){
            cantidadDiasMora = manejadorFechas.obtenerDiferenciaFechas(prestamo.getFechaLimite());
            calcularCuota(3);
            calcularMora(cantidadDiasMora);
            calcularTotal();
            return ("<html> <center> El total a cancelar es de Q" + cantidadTotal+
                    "<br> Se excedio la fecha limite de entrega en " + cantidadDiasMora + " dias </br>"+
                    "<br> Se aplico una mora de Q" + cantidadMoraTotal + "</br> </center> </html>");
            
        }
    //PASO 2----------------------------------------------------------------------------------------------------------------------            
        else{
            cantidadDiasPrestamo = manejadorFechas.obtenerDiferenciaFechas(prestamo.getFechaPrestamo());
            calcularCuota(cantidadDiasPrestamo);
            calcularTotal();
            return ("El total a cancelar es de Q" + cantidadTotal);
            
        }
    }
    
    /*
    Metodo encargado de calcular la cantidad que se debe cancelar por un pretamo realizado. 
    Recibe como parametro la cantidad de dias sin mora que estuvo activo el prestamo y un
    booleano que indica si se aplica o no mora.
    */
   public void calcularCuota(int cantidadDias){ 
        switch (cantidadDias) {
            case 0:
                cantidadCuotaTotal = CUOTA;
                break;
            case 1:
                cantidadCuotaTotal = 2 * CUOTA;
                break;
            default:
                cantidadCuotaTotal = 3 * CUOTA;
                break;
        }
   }  
   
   /*
   Metodo encargado de calcular la cantidad de mora a pagar tomando en cuenta la cantidad de 
   dias en que se ha excecido la fecha limite, la cual se recibe como parametro.
   */
   public void calcularMora(int cantidadDias){
       cantidadMoraTotal = cantidadDias * MORA;
   }
    
   /*
   Metodo encargado de calcular la cantidad total a pagar por el prestamo.
   */
   public void calcularTotal(){
       cantidadTotal = cantidadCuotaTotal + cantidadMoraTotal;
   }
   
    /*
    Metodo encargado de obtener el objeto dentro del archivo binario correspondiente al libro 
    solicitado
    */
    public boolean buscarLibro(String codigoLibro){
        libro = manejadorArchivoLibro.leerArchivo(LIBRO, codigoLibro, ".lib");
        return libro != null;
    }
    
    /*
    Metodo encargado de obtener el objeto dentro del archivo binario correspondiente al estudiante 
    solicitado
    */
    public boolean buscarEstudiante(int carneEstudiante){
        estudiante = manejadorArchivoEstudiante.leerArchivo(ESTUDIANTE, String.valueOf(carneEstudiante), ".est");
        return estudiante != null;
    }
    
    
    /*
    Metodo encargado de aumentar la cantidadCopias de la instancia de la clase libro
    que recibe como parametro.
    */
    public void aumentarCantidadLibro(String codigolibro){
        libro = manejadorArchivoLibro.leerArchivo(LIBRO, codigolibro, ".lib");
        libro.setCantidadCopias(libro.getCantidadCopias()+1);
        manejadorArchivoLibro.crearArchivo(libro, LIBRO, libro.getCodigo(), ".lib");
    }
    
    /*
    Metodo encargado de cambiar el estado de un prestamo. Modifica el atributo activo
    que se encuentra como true y lo sustituye por false.
    */
    public void cambiarEstadoPrestamo(int codigoPrestamo){
        prestamo = manejadorArchivoPrestamo.leerArchivo(PRESTAMO, String.valueOf(codigoPrestamo), ".pre");
        prestamo.setActivo(false);
        manejadorArchivoPrestamo.crearArchivo(prestamo, PRESTAMO, String.valueOf(prestamo.getCodigoPrestamo()), ".pre");
    }
    
     /*
    Metodo encargado de cambiar el valor de la cantidad pagada de un prestamo.
    */
    public void cambiarCuotaPrestamo(int codigoPrestamo){
        prestamo = manejadorArchivoPrestamo.leerArchivo(PRESTAMO, String.valueOf(codigoPrestamo), ".pre");
        prestamo.setCantidadCuota(cantidadCuotaTotal);
        prestamo.setCantidadMora(cantidadMoraTotal);
        manejadorArchivoPrestamo.crearArchivo(prestamo, PRESTAMO, String.valueOf(prestamo.getCodigoPrestamo()), ".pre");
    }
    
     /*
    Metodo encargado de cambiar el valor de la cantidad pagada de un prestamo.
    */
    public void cambiarListaPrestamosActuales(int carne, int codigoPrestamo){
        estudiante = manejadorArchivoEstudiante.leerArchivo(ESTUDIANTE, String.valueOf(carne), ".est");
        prestamosActuales = estudiante.getPrestamosActuales();
        for(int i = 0; i < prestamosActuales.size(); i++){
            if(prestamosActuales.get(i).getCodigoPrestamo() == codigoPrestamo){
                prestamosActuales.remove(i);
            }
        }        
        manejadorArchivoEstudiante.crearArchivo(estudiante, ESTUDIANTE, String.valueOf(estudiante.getCarne()), ".est");
    }
}
