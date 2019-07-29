package Backend;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Estudiante implements Serializable, Comparable<Estudiante>{
    
    private String nombre;
    private int carne;
    private int codigoCarrera;
    private Date fechaNacimiento;
    private List<Prestamo> historialPrestamos = new ArrayList<>();
    private List<Prestamo> prestamosActuales = new ArrayList<>();

    public Estudiante(String nombre, int carne, int codigoCarrera, Date fechaNacimiento, List<Prestamo> prestamosHechos, List<Prestamo> prestamosActuales){
        this.nombre = nombre;
        this.carne = carne;
        this.codigoCarrera = codigoCarrera;
        this.fechaNacimiento = fechaNacimiento;
        this.historialPrestamos = prestamosHechos;
        this.prestamosActuales = prestamosActuales;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCarne() {
        return carne;
    }

    public int getCodigoCarrera() {
        return codigoCarrera;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public List<Prestamo> getHistorialPrestamos() {
        return historialPrestamos;
    }

    public List<Prestamo> getPrestamosActuales() {
        return prestamosActuales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public void setCodigoCarrera(int codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setHistorialPrestamos(List<Prestamo> historialPrestamos) {
        this.historialPrestamos = historialPrestamos;
    }

    public void setPrestamosActuales(List<Prestamo> prestamosActuales) {
        this.prestamosActuales = prestamosActuales;
    }

    /*
    Metodo utilizado para ordenar una lista de objetos del tipo Estudiante por 
    orden de numero de carne.
    */
    @Override
    public int compareTo(Estudiante o) {
        String a = String.valueOf(this.getCarne());
        String b = String.valueOf(o.getCarne());
        return a.compareTo(b);
    }
   
}
