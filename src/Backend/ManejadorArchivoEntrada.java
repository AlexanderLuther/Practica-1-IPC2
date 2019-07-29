package Backend;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ManejadorArchivoEntrada {

    //Constantes de la clase
    private final String LIBRO = "LIBRO";
    private final String ESTUDIANTE = "ESTUDIANTE";
    private final String PRESTAMO = "PRESTAMO";
    private final String TITULO = "TITULO:";
    private final String AUTOR = "AUTOR:";
    private final String CODIGO = "CODIGO:";
    private final String CANTIDAD = "CANTIDAD:";
    private final String CARNET = "CARNET:";
    private final String NOMBRE = "NOMBRE:";
    private final String CARRERA = "CARRERA:";
    private final String CODIGOLIBRO = "CODIGOLIBRO:";
    private final String FECHA = "FECHA:";
    
    //Variables e instancias de la clase
    private String lineasError = "";
    private Libro libro;
    private Estudiante estudiante;
    private Prestamo prestamo;
    private RealizarPrestamo realizarPrestamo = new RealizarPrestamo();
    private ManejadorArchivoContador archivoContador = new ManejadorArchivoContador();
    private ManejadorArchivosBinarios<Libro> archivoLibro = new ManejadorArchivosBinarios<>();
    private ManejadorArchivosBinarios<Estudiante> archivoEstudiante = new ManejadorArchivosBinarios<>();
    private ManejadorArchivosBinarios<Prestamo> archivoPrestamo = new ManejadorArchivosBinarios<>();
    
    
    /*
    Metodo encargado de la lectura del archivo de entrada, recibe como paremetros el archivo de texto
    a leer y el tiempo a implementar en el hilo. Inicia un hilo previo a la lectura del archivo. Detecta
    las palabras "LIBRO", "ESTUDIANTE" y "PRESTAMO" y sentencia la accion a realizar.
    */
    public void leerArchivo(File archivoSeleccionado, long tiempo) throws FileNotFoundException, IOException{
        Runnable thread = new Runnable() {
            @Override
            public void run(){
                crearCarpeta();
                try{Thread.currentThread().sleep(tiempo);
                    BufferedReader bufferLeer = new BufferedReader(new  FileReader(archivoSeleccionado));
                    String linea = bufferLeer.readLine();
                    while (linea != null) {
                        if (linea.equalsIgnoreCase(LIBRO)){
                            leerLibro(bufferLeer, linea);
                        }
                        else if (linea.equalsIgnoreCase(ESTUDIANTE)){
                            leerEstudiante(bufferLeer, linea);
                        }
                        else if (linea.equalsIgnoreCase(PRESTAMO)){
                            leerPrestamo(bufferLeer, linea);
                        }
                        else {
                            System.out.println("Formato no reconocido.");
                        }
                        linea  = bufferLeer.readLine();
                    }
                } catch(Exception e){ }
            }
        };
        Thread hilo = new Thread(thread);
        hilo.start();
    }
    
    
    /*
    Metodo encargado de crear un directorio denominado "Archivos". Valida si el directorio ya existe,
    de lo contrario crea el mismo.
    */
    public void crearCarpeta() {
        File carpeta = new File("Archivos");
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }
    }
 
    public void leerLibro(BufferedReader buffer, String linea) throws IOException {
        String codigo = null;
        String autor = "Desconocido";
        String titulo = "Sin Titulo";
        int cantidadDeCopias = 0;
        for (int i = 0; i < 4; i++) {
            linea  = buffer.readLine();
                switch (i) {
                    case 0:
                            linea = linea.replaceAll(TITULO, "");
                            titulo = linea;
                        break;
                    case 1:
                            linea = linea.replaceAll(AUTOR, "");
                            autor = linea;
                        break;
                    case 2:
                            linea = linea.replaceAll(CODIGO, "");
                            codigo = linea;
                        break;
                    case 3:
                            linea = linea.replaceAll(CANTIDAD, "");
                            cantidadDeCopias = Integer.parseInt(linea);
                        break;
                }
        }
            libro = new Libro(codigo, autor, titulo, cantidadDeCopias, null,"");
            System.out.println("Libro Titulo: " + libro.getTitulo());
            archivoLibro.crearArchivo(libro, LIBRO, libro.getCodigo(), ".lib"); 
    }
   
    
    public void leerEstudiante(BufferedReader buffer, String linea) throws IOException{
        String nombre = null;
        int carne = 0;
        int codigoCarrera = 0;
        for (int i = 0; i < 3; i++) {
                linea  = buffer.readLine();
                switch (i) {
                    case 0:
                        linea = linea.replaceAll(CARNET, "");
                        carne = Integer.parseInt(linea);
                        break;
                    case 1:
                        linea = linea.replaceAll(NOMBRE, "");
                        nombre = linea;
                        break;
                    case 2:
                        codigoCarrera = Integer.parseInt(linea.replaceAll(CARRERA, ""));
                        break;
                }
        }
        estudiante = new Estudiante(nombre, carne, codigoCarrera, null, null, null);
        System.out.println("Estudiante: " + estudiante.getNombre());
        archivoEstudiante.crearArchivo(estudiante, ESTUDIANTE, Integer.toString(estudiante.getCarne()), ".est");
    }
    
    public void leerPrestamo(BufferedReader buffer, String linea) throws IOException {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String codigo = null;
        int carnet = 0;
        Date fechaPrestamo = null;
        for (int i = 0; i < 3; i++) {
                linea  = buffer.readLine();
                switch (i) {
                    case 0:
                        codigo = linea.replaceAll(CODIGOLIBRO, "");
                        break;
                    case 1:
                        carnet = Integer.parseInt(linea.replaceAll(CARNET, ""));
                        break;
                    case 2:
                    try {
                        fechaPrestamo = formato.parse(linea.replaceAll(FECHA, ""));
                    } catch (ParseException ex) {
                        System.out.println("Error de Formato fecha");
                    }
                        break;
                }
        }
        prestamo = new Prestamo(codigo, carnet, fechaPrestamo);
        System.out.println("Prestamo: " + prestamo.getCodigolibro());
        System.out.println("Prestamo: " + formato.format(fechaPrestamo));
        realizarPrestamo.comprobarEstudiante(prestamo.getCarnet(), prestamo.getCodigolibro());
        //guardarPrestamo(prestamo); Comento esto para que realice de una vez la comprobación del Prestamo
    }
    
    public void guardarPrestamo(Prestamo prestamoGuargar) {
        int accountant = 0;
        File archivoCont = new File("ContadorPrestamo.bin");
        if(archivoCont.exists()){
            accountant = ManejadorArchivoContador.leerContador("ContadorPrestamo.bin");
            System.out.println(accountant);
        } else {
            ManejadorArchivoContador.crearNuevoContador(0, "ContadorPrestamo.bin");
            System.out.println("Creado");
        }
        archivoPrestamo.crearArchivo(prestamo, PRESTAMO, Integer.toString(accountant), ".pre");
        System.out.println("Archivo Creado");
    }    
}