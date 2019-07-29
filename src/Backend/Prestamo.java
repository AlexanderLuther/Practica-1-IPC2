package Backend;

import java.io.Serializable;
import java.util.Date;


public class Prestamo implements Serializable{

    private int codigoPrestamo;
    private String codigolibro;
    private int carnet;
    private Date fechaPrestamo;
    private Date fechaLimite;
    private boolean activo;

    public Prestamo(String codigolibro, int carnet, Date fechaPrestamo, Date fechaLimite, boolean activo) {
        this.codigolibro = codigolibro;
        this.carnet = carnet;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaLimite = fechaLimite;
        this.activo = activo;
    }

    public int getCodigoPrestamo() {
        return codigoPrestamo;
    }

    public String getCodigolibro() {
        return codigolibro;
    }

    public int getCarnet() {
        return carnet;
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

    public void setCarnet(int carnet) {
        this.carnet = carnet;
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

    
    
    
}
