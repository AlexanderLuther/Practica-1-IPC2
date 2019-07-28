/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.bibliotecario.backet.objetos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bryan
 */
public class Estudiante implements Serializable{
    private String nombre;
    private int carne;
    private int codigoCarrera;
    private List<Prestamo> prestamosHechos = new ArrayList<>();
    private List<Prestamo> prestamosActuales = new ArrayList<>();

    public Estudiante(String nombre, int carne, int codigoCarrera) {
        this.nombre = nombre;
        this.carne = carne;
        this.codigoCarrera = codigoCarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public int getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(int codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public List<Prestamo> getPrestamosHechos() {
        return prestamosHechos;
    }

    public void setPrestamosHechos(List<Prestamo> prestamosHechos) {
        this.prestamosHechos = prestamosHechos;
    }

    public List<Prestamo> getPrestamosActuales() {
        return prestamosActuales;
    }

    public void setPrestamosActuales(List<Prestamo> prestamosActuales) {
        this.prestamosActuales = prestamosActuales;
    }
   
}
