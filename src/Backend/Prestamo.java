package Backend;

import java.io.Serializable;
import java.util.Date;


public class Prestamo implements Serializable{
    
    private int codigoPrestamo;
    private String codigolibro;
    private int carne;
    private Date fechaPrestamo;
    private Date fechaLimite;
    private boolean activo;
    private int cantidadPagada;

    public Prestamo(int codigoPrestamo, String codigolibro, int carnet, Date fechaPrestamo, Date fechaLimite, boolean activo, int cantidadPagada) {
        this.codigoPrestamo =codigoPrestamo;
        this.codigolibro = codigolibro;
        this.carne = carnet;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaLimite = fechaLimite;
        this.activo = activo;
        this.cantidadPagada = cantidadPagada;
    }
    
    public int getCodigoPrestamo() {
        return codigoPrestamo;
    }

    public String getCodigolibro() {
        return codigolibro;
    }

    public int getCarne() {
        return carne;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setCodigoPrestamo(int codigoPrestamo) {
        this.codigoPrestamo = codigoPrestamo;
    }

    public void setCodigolibro(String codigolibro) {
        this.codigolibro = codigolibro;
    }

    public void setCarne(int carnet) {
        this.carne = carnet;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getCantidadPagada() {
        return cantidadPagada;
    }

    public void setCantidadPagada(int cantidadPagada) {
        this.cantidadPagada = cantidadPagada;
    }    
}
