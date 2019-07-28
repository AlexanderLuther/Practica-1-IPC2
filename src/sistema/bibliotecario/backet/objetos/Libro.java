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
public class Libro implements Serializable{
    private String codigo;
    private String autor;
    private String titulo;
    private String editorioal;
    private int cantidadCopias;
    private Date fechaPublicacion;

    public Libro(String codigo, String autor, String titulo, int cantidadCopias) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.cantidadCopias = cantidadCopias;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorioal() {
        return editorioal;
    }

    public void setEditorioal(String editorioal) {
        this.editorioal = editorioal;
    }

    public int getCantidadCopias() {
        return cantidadCopias;
    }

    public void setCantidadCopias(int cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    
}
