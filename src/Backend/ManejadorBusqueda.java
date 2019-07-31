package Backend;

import java.util.ArrayList;
import java.util.List;

public class ManejadorBusqueda {

    private List<Libro> librosEncontrados = new ArrayList<>();
    private List<Estudiante> estudiantesEncontrados = new ArrayList<>();
    
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
    
}
