/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author bryan
 */
public class RealizarPrestamo {
    private final String ESTUDIANTE = "ESTUDIANTE";
    private final String LIBRO = "LIBRO";
    private final String PRESTAMO = "PRESTAMO";
    private ManejadorArchivosBinarios<Estudiante> archivoEstudiante = new ManejadorArchivosBinarios<>();
    private ManejadorArchivosBinarios<Libro> archivoLibro = new ManejadorArchivosBinarios<>();
    private ManejadorArchivosBinarios<Prestamo> archivoPrestamo = new ManejadorArchivosBinarios<>();
    private Estudiante estudiantePrestamo;
    private Libro libroAPrestar;
    private Prestamo prestamo;
    
    public void comprobarEstudiante(int carnetEstudiante, String codigoLibro) {
        estudiantePrestamo = archivoEstudiante.leerArchivo(ESTUDIANTE, Integer.toString(carnetEstudiante), ".est");
        if (estudiantePrestamo == null) {
            System.out.println("Estudiante no registrado");
        } else {
            if (comprobarLibrosPrestados(estudiantePrestamo)) {
                System.out.println("No puede realizar más prestamos");
            } else {
                if (!buscarLibro(codigoLibro)) {
                    System.out.println("Lo siento el codigo de libro no existe");
                } else {
                    if (!comprobarExistencias(libroAPrestar)) {
                        System.out.println("Lo siento Libros agotados");    
                    } else {
                        try {
                            registrarPrestamo(estudiantePrestamo, libroAPrestar);
                        } catch (ParseException ex) {
                            Logger.getLogger(RealizarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println("Prestamo Realizado");
                    }
                }
            }
        }
    }
    
    public boolean comprobarLibrosPrestados(Estudiante estudiante){
        return estudiante.getPrestamosActuales().size() == 3;
    }
    
    public boolean buscarLibro(String codigoLibro){
        libroAPrestar = archivoLibro.leerArchivo(LIBRO, codigoLibro, ".lib");
        return libroAPrestar != null;
    }
    
    public boolean comprobarExistencias(Libro libro){
        return libro.getCantidadCopias() > 0;
    }
    
    public void registrarPrestamo(Estudiante estudiante, Libro libro) throws ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        prestamo = new Prestamo(libro.getCodigo(), estudiante.getCarne(), (Date.from(Instant.now())));
        System.out.println("Fecha Prestamo: "+ prestamo.getFechaPrestamo());
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
        agregarAListado(estudiante, prestamo);
    }
    
    public void agregarAListado(Estudiante estudiante, Prestamo prestamoRealizado) {
        estudiante.getPrestamosActuales().add(prestamoRealizado);
        estudiante.getPrestamosHechos().add(prestamoRealizado);
        archivoEstudiante.crearArchivo(estudiante, ESTUDIANTE, Integer.toString(estudiante.getCarne()), ".est");
    }
    
    public void disminuirCantidad(Libro libro){
        libro.setCantidadCopias(libro.getCantidadCopias()-1);
        archivoLibro.crearArchivo(libro, LIBRO, libro.getCodigo(), ".lib");
    }
}
