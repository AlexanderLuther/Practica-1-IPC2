package Backend;

import java.io.Serializable;
import java.util.Date;


public class Libro implements Serializable, Comparable<Libro>{
    
    private String codigo;
    private String autor;
    private String titulo;
    private String editorial;
    private int cantidadCopias;
    private Date fechaPublicacion;

    public Libro(String codigo, String autor, String titulo, int cantidadCopias, Date fechaPublicacion, String editorial) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.cantidadCopias = cantidadCopias;
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getAutor() {
        return autor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getEditorial() {
        return editorial;
    }
    
    public int getCantidadCopias() {
        return cantidadCopias;
    }
    
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditorioal(String editorioal) {
        this.editorial = editorioal;
    }
    
    public void setCantidadCopias(int cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
    }
    
    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    /*
    Metodo utilizado para ordenar una lista de objetos del tipo Libro por 
    orden de numero de codigo
    */
    @Override
    public int compareTo(Libro o) {
        String a = String.valueOf(this.getCodigo());
        String b = String.valueOf(o.getCodigo());
        return a.compareTo(b);
    }
}
