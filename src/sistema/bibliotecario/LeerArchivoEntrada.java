/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.bibliotecario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import sistema.bibliotecario.backed.controladorArchivos.CrearArchivo;
import sistema.bibliotecario.backed.controladorArchivos.CrearArchivoContador;
import sistema.bibliotecario.backet.objetos.Estudiante;
import sistema.bibliotecario.backet.objetos.Libro;
import sistema.bibliotecario.backet.objetos.Prestamo;

/**
 *
 * @author bryan
 */
public class LeerArchivoEntrada {
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
    private Libro libro;
    private Estudiante estudiante;
    private Prestamo prestamo;
    private CrearArchivoContador archivoContador = new CrearArchivoContador();
    private CrearArchivo<Libro> archivoLibro = new CrearArchivo<>();
    private CrearArchivo<Estudiante> archivoEstudiante = new CrearArchivo<>();
    private CrearArchivo<Prestamo> archivoPrestamo = new CrearArchivo<>();
    
    public void leerArchivo(JFileChooser leer, File seleccionado, long tiempo) throws FileNotFoundException, IOException{
        Runnable thread = new Runnable() {
            @Override
            public void run(){
                crearCarpeta();
                try{Thread.currentThread().sleep(tiempo);
                BufferedReader bufferLeer = new BufferedReader(new  FileReader(seleccionado));
                String linea = bufferLeer.readLine();
                while (linea != null) {
                    if (linea.equalsIgnoreCase(LIBRO) || linea.equalsIgnoreCase(ESTUDIANTE) || linea.equalsIgnoreCase(PRESTAMO)) {
                        leer(bufferLeer, linea, tiempo);
                    } else {
                        System.out.println("Formato no reconocido");
                    }
                    linea  = bufferLeer.readLine();
                }
                } catch(Exception e){ }
            }
        };
        Thread hilo = new Thread(thread);
        hilo.start();
    }
    
    public void crearCarpeta() {
        File carpeta = new File("Archivos");
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }
    }
    
    public void leer(BufferedReader buffer, String linea, long tiempo) throws IOException, InterruptedException {
        if (linea.equalsIgnoreCase(LIBRO)) {
            Thread.sleep(tiempo);
            leerLibro(buffer, linea);
        } else if (linea.equalsIgnoreCase(ESTUDIANTE)) {
            Thread.sleep(tiempo);
            leerEstudiante(buffer, linea);
        } else {
            Thread.sleep(tiempo);
            leerPrestamo(buffer, linea);
        }
    }
    
    public void leerLibro(BufferedReader buffer, String linea) throws IOException {
        String codigo = null;
        String autor = null;
        String titulo = null;
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
        libro = new Libro(codigo, autor, titulo, cantidadDeCopias);
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
        estudiante = new Estudiante(nombre, carne, codigoCarrera);
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
        guardarPrestamo(prestamo);
    }
    
    public void guardarPrestamo(Prestamo prestamoGuargar) {
        int accountant = 0;
        File archivoCont = new File("ContadorPrestamo.bin");
        if(archivoCont.exists()){
            accountant = CrearArchivoContador.leerContador("ContadorPrestamo.bin");
            System.out.println(accountant);
        } else {
            CrearArchivoContador.crearNuevoContador(0, "ContadorPrestamo.bin");
            System.out.println("Creado");
        }
        archivoPrestamo.crearArchivo(prestamo, PRESTAMO, Integer.toString(accountant), ".pre");
        System.out.println("Archivo Creado");
    }
}

