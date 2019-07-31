package Backend;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManejadorBusqueda {

    private List<Libro> librosEncontrados = new ArrayList<>();
    private List<Estudiante> estudiantesEncontrados = new ArrayList<>();
    private List<Prestamo> prestamosEncontrados = new ArrayList<>();
    private List<Prestamo> prestamosEncontradosFiltrados = new ArrayList<>();
    private ManejadorFechas manejadorFecha = new ManejadorFechas();
    private Date fechaActual;
    private int cuotaTotal;
    private int moraTotal;
    private int total;
    
    
    /*
    Metodo encargado de realizar una busqueda dentro de una lista. Recibe como parametros 
    la lista donde se desea buscar y el patron a buscar. Devuelve una lista con los elementos
    encontrados
    */
    public List<Libro> busquedaLibro(List<Libro> listadoLibros, String patron){
        librosEncontrados.clear();
        for(int i = 0; i < listadoLibros.size(); i++){
            if(listadoLibros.get(i).getAutor().contains(patron) || listadoLibros.get(i).getCodigo().contains(patron)
            || listadoLibros.get(i).getTitulo().contains(patron)){
                   librosEncontrados.add(listadoLibros.get(i));
            }                   
        }
        return librosEncontrados; 
    }
    
    /*
    Metodo encargado de realizar una busqueda dentro de una lista. Recibe como parametros 
    la lista donde se desea buscar y el patron a buscar. Devuelve una lista con los elementos
    encontrados
    */
    public List<Estudiante> busquedaEstudiante(List<Estudiante> listadoEstudiantes, String patron){
        estudiantesEncontrados.clear();
        for(int i = 0; i < listadoEstudiantes.size(); i++){
            if(String.valueOf(listadoEstudiantes.get(i).getCarne()).contains(patron) || listadoEstudiantes.get(i).getNombre().contains(patron)
            || String.valueOf(listadoEstudiantes.get(i).getCodigoCarrera()).contains(patron)){
                   estudiantesEncontrados.add(listadoEstudiantes.get(i));
            }                   
        }
        return estudiantesEncontrados; 
    }
        
    /*
    Metodo encargado de buscar dentro de una lista que recibe como parametro. Todas las
    coincidencias encontradas son almacenadas dentro de la lista prestamosEncontrados
    la cual es devuelta al metodo llamador
    */
    public List<Prestamo> busquedaPrestamosMorosos(List<Prestamo> prestamos){
        prestamosEncontrados.clear();
        for(int i = 0; i < prestamos.size(); i++){
            if(manejadorFecha.compararFechasDespuesActual(manejadorFecha.sumarDias(prestamos.get(i).getFechaLimite(), 1))){
                prestamosEncontrados.add(prestamos.get(i));
            }
        }
        return prestamosEncontrados;
    }
    
    /*
    Metodo encargado de buscar dentro de una lista que recibe como parametro. Todas las
    coincidencias encontradas son almacenadas dentro de la lista prestamosEncontrados
    la cual es devuelta al metodo llamador
    */
    public List<Prestamo> busquedaPrestamosActuales(List<Prestamo> prestamos){
        prestamosEncontrados.clear();
        for(int i = 0; i < prestamos.size(); i++){
            if(manejadorFecha.compararFechasIdenticasActual(prestamos.get(i).getFechaLimite())){
                   prestamosEncontrados.add(prestamos.get(i));
            }
        }
        return prestamosEncontrados;
    }
    
    /*
    Metodo encargado de buscar dentro de una lista que recibe como parametro. Todas las
    coincidencias encontradas son almacenadas dentro de la lista prestamosEncontrados
    la cual es devuelta al metodo llamador
    */
    public List<Prestamo> busquedaPrestamosFinalizados(List<Prestamo> prestamos){
        prestamosEncontrados.clear();
        for(int i = 0; i < prestamos.size(); i++){
            if(!prestamos.get(i).isActivo()){
                   prestamosEncontrados.add(prestamos.get(i));
            }
        }
        return prestamosEncontrados;
    }
    
    /*
    Metodo encargado de buscar dentro de una lista que recibe como parametro. Primero determina
    todos los prestamos que ya han sido devueltos, posteriormente determina los prestamos contenidos
    dentro del intervalo de tiempo que se recibe como parametro. Todas las coincidencias encontradas
    son almacenadas dentro de la lista prestamosEncontrados la cual es devuelta al metodo llamador.
    */
    public List<Prestamo> busquedaPrestamosFinalizadosIntervaloTiempo(List<Prestamo> prestamos, Date fechaInicial, Date fechaFinal){
        prestamosEncontradosFiltrados.clear();
        prestamosEncontrados = busquedaPrestamosFinalizados(prestamos);   
        for(int i = 0; i < prestamosEncontrados.size(); i++){
            if(manejadorFecha.compararFechasDespues(prestamosEncontrados.get(i).getFechaPrestamo(), fechaInicial) &&
               manejadorFecha.compararFechasAntes(prestamosEncontrados.get(i).getFechaPrestamo(), fechaFinal)){
                   prestamosEncontradosFiltrados.add(prestamosEncontrados.get(i));
            }
            if(manejadorFecha.compararFechasIdenticas(prestamosEncontrados.get(i).getFechaPrestamo(), fechaInicial)){
                prestamosEncontradosFiltrados.add(prestamosEncontrados.get(i));
            }
            if(manejadorFecha.compararFechasIdenticas(prestamosEncontrados.get(i).getFechaPrestamo(), fechaFinal)){
                prestamosEncontradosFiltrados.add(prestamosEncontrados.get(i));
            }
        }
        return prestamosEncontradosFiltrados;
    }     
    
    /*
    Metodo encargado de devolver la cantidad de cuota total obtenida de el listado
    recibido como parametro
    */
    public int devolverCuotaTotal(List<Prestamo> prestamos){
        cuotaTotal = 0;
        for(int i = 0; i < prestamos.size(); i++){
            cuotaTotal = cuotaTotal + prestamos.get(i).getCantidadCuota();
        }
        return cuotaTotal;
    }
    
    /*
    Metodo encargado de devolver la cantidad de mora total obtenida de el listado
    recibido como parametro
    */
    public int devolverMoraTotal(List<Prestamo> prestamos){
        moraTotal = 0;
        for(int i = 0; i < prestamos.size(); i++){
            moraTotal = moraTotal + prestamos.get(i).getCantidadMora();
        }
        return moraTotal;
    }
    
    /*
    Metodo encargado de devolver la cantidad de total obtenida de la suma
    entre el total de cuota y el total de mora.
    */
    public int devolverTotal(){
        total = 0;
         return total = moraTotal + cuotaTotal;
    }
     
}
