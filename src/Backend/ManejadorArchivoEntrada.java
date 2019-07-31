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
    private Libro libro;
    private Estudiante estudiante;
    private Prestamo prestamo;
    private ManejadorPrestamo realizarPrestamo = new ManejadorPrestamo();
    private ManejadorArchivoContador archivoContador = new ManejadorArchivoContador();
    private ManejadorArchivosBinarios<Libro> archivoLibro = new ManejadorArchivosBinarios<>();
    private ManejadorArchivosBinarios<Estudiante> archivoEstudiante = new ManejadorArchivosBinarios<>();
    private ManejadorArchivosBinarios<Prestamo> archivoPrestamo = new ManejadorArchivosBinarios<>();
    private String errores = "";
    
    
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
                            errores = errores + "Formato no reconocido: " + linea + "\n";
                        }
                        linea  = bufferLeer.readLine();
                    }
                } catch(Exception e){ }
            }
        };
        //System.out.println(errores);
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
        String autor = null;
        String titulo = null;
        int cantidadDeCopias = -1;
        for (int i = 0; i < 4; i++) {
            linea  = buffer.readLine();
            switch (i) {
                case 0:
                    if (linea.contains(TITULO)) {
                        titulo = linea.replaceAll(TITULO, "");
                    } else {
                        System.out.println("Error, la instrucción no va en el orden que corresponde");
                        i=4; 
                    }
                    break;
                case 1:
                    if (linea.contains(AUTOR)) {
                        autor= linea.replaceAll(AUTOR, "");
                    } else {
                        i=4;
                        System.out.println("Error, la instrucción no va en el orden que corresponde");
                    }
                    break;
                case 2:
                    if (linea.contains(CODIGO)) {
                        codigo = linea.replaceAll(CODIGO, "");
                    } else {
                        i=4;
                        System.out.println("Error, la instrucción no va en el orden que corresponde");
                    }
                    break;
                case 3:
                    try {
                        if (linea.contains(CANTIDAD)) {
                        linea = linea.replaceAll(CANTIDAD, "");
                        cantidadDeCopias = Integer.parseInt(linea);
                    } else {
                            System.out.println("Error, la instrucción no va en el orden que corresponde");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Formato incorrecto");
                    }
                    break;
            }
        }
        if (codigo == null || autor == null || titulo == null || cantidadDeCopias == -1) {
            errores = errores + "Error, no se a ejecutado el comando 'LIBRO' por falta del algun campo obligatorio.\n";
        } else {
            libro = new Libro(codigo, autor, titulo, cantidadDeCopias, null,"");
            archivoLibro.crearArchivo(libro, LIBRO, libro.getCodigo(), ".lib"); 
        }
    }
    
    public void leerEstudiante(BufferedReader buffer, String linea) throws IOException{
        String nombre = null;
        int carne = 0;
        int codigoCarrera = 0;
        for (int i = 0; i < 3; i++) {
            try {
                linea  = buffer.readLine();
                switch (i) {
                    case 0:
                        if (linea.contains(CARNET)) {
                            carne = Integer.parseInt(linea.replaceAll(CARNET, ""));
                        } else {
                            i=4;
                            System.out.println("Error, la instrucción no va en el orden que corresponde");
                        }
                        break;
                    case 1:
                        if (linea.contains(NOMBRE)) {
                            nombre = linea.replaceAll(NOMBRE, "");
                        } else {
                            i=4;
                            System.out.println("Error, la instrucción no va en el orden que corresponde");
                        }
                        break;
                    case 2:
                        if (linea.contains(linea)) {
                            codigoCarrera = Integer.parseInt(linea.replaceAll(CARRERA, ""));
                        } else {
                            i=4;
                            System.out.println("Error, la instrucción no va en el orden que corresponde");
                        }
                        break;
                }
            } catch (NumberFormatException e) {
                i=4;
                System.out.println("Formato incorrecto");
            }
        }
        if (nombre == null || carne == 0 || codigoCarrera == 0) {
            errores = errores + "Error, no se a ejecutado el comando 'ESTUDIANTE' por falta del algun campo obligatorio.\n";
        } else {
            estudiante = new Estudiante(nombre, carne, codigoCarrera, null, null, null);
            archivoEstudiante.crearArchivo(estudiante, ESTUDIANTE, Integer.toString(estudiante.getCarne()), ".est");
        }
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
                    if (linea.contains(CODIGOLIBRO)) {
                        codigo = linea.replaceAll(CODIGOLIBRO, "");
                    } else {
                        i=4;
                        System.out.println("Error, la instrucción no va en el orden que corresponde");
                    }
                    break;
                case 1:
                    try {
                        if (linea.contains(CARNET)) {
                            carnet = Integer.parseInt(linea.replaceAll(CARNET, ""));
                        } else {
                            i=4;
                            System.out.println("Error, la instrucción no va en el orden que corresponde");
                        }
                    } catch (NumberFormatException e) {
                        i=4;
                        System.out.println("Error de formato");
                    }
                    break;
                case 2:
                    try {
                        if (linea.contains(FECHA)) {
                            fechaPrestamo = formato.parse(linea.replaceAll(FECHA, ""));
                        } else {
                            System.out.println("Error, la instrucción no va en el orden que corresponde");
                        }
                    } 
                    catch (ParseException ex) {
                        errores = errores + "Error en formato de fecha: " + linea + "\n";
                    }
                    break;
            }
        }
        if (codigo == null || carnet == 0 || fechaPrestamo == null) {
            errores = errores + "Error, no se a ejecutado el comando 'PRESTAMO' por falta del algun campo obligatorio.\n";
            System.out.println("Error Prestamo");
        } else {
            String mensaje = realizarPrestamo.procesarPrestamo(carnet, codigo, fechaPrestamo, false);
            System.out.println(mensaje);
        }
        
    }
}