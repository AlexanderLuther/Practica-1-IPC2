/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.bibliotecario.backet.objetos;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author bryan
 */
public class Prestamo implements Serializable{
    private int codigoPrestamo;
    private String codigolibro;
    private int carnet;
    private Date fechaPrestamo;
    private Date fechaLimite;

    public Prestamo(String codigolibro, int carnet, Date fechaPrestamo) {
        this.codigolibro = codigolibro;
        this.carnet = carnet;
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getCodigoPrestamo() {
        return codigoPrestamo;
    }

    public void setCodigoPrestamo(int codigoPrestamo) {
        this.codigoPrestamo = codigoPrestamo;
    }

    public String getCodigolibro() {
        return codigolibro;
    }

    public void setCodigolibro(String codigolibro) {
        this.codigolibro = codigolibro;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
    
}
