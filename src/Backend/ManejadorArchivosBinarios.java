package Backend;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class ManejadorArchivosBinarios <T> {
    
    /*
    Metodo encargado de crear un archivo binario basandose en los atributos que recibe
    como parametros.
        tipoObjeto: Libro, Estudiante, Prestamo
        tipoArchivo: LIBRO, ESTUDIANTE, PRESTAMO
        identificadorUnico: codigoLibro, carne.
        extensionArchivo: .lib, .est, .pre
    */
    public  boolean crearArchivo(T tipoObjeto, String tipoArchivo,  String identificadorUnico, String extensionArchivo) {
        String ruta = "./Archivos/" + tipoArchivo + "(" + identificadorUnico + ")" + extensionArchivo;
        File file = new File(ruta);
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
                ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);) {
            outputStream.writeObject(tipoObjeto);
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
        return true;
    }
      
    /*
    Metodo encargado de leer archivos binarios, recibe como parametos la ruta del archivo deseado
    y devuelve el objeto contenido dentro del mismo.
    */
    public T leerArchivo(String pathInicial, String pathNombreArchivo, String tipoDeArchivoPath){
        String ruta = "./Archivos/" + pathInicial + "(" + pathNombreArchivo + ")" + tipoDeArchivoPath;
        File file =  new File(ruta);
        try (FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);) {
            return (T) inputStream.readObject();
        } catch (IOException e) {
           System.out.println(pathNombreArchivo);
           System.out.println("Error de conexion con el archivo");
           return null;
        } catch (ClassNotFoundException e) {
            System.out.println("El objeto no tiene la forma de una pieza");
        }
        return null;
    }
   
    /*
    Metodo encargado de obtener todos los archivos contenidos dentro de un directorio que cumplan
    con la extension recibida como parametro. Se abre un flujo de entreda en el directorio deseado
    y se obtiene un listado con todos los nombres de los archivos deseados. Por cada nombre obtenido
    se crea un nuevo flujo de entrada y se almacena el archivo binario dentro de una lista. Por ultimo
    se regresa la lista.
    */
    public  List<T> leerListaArchivos(String extensionArchivo) {
        List<T> lista = new ArrayList<>();
        File folder = new File("./Archivos/");
        if (folder.isDirectory()) {
            String[] files = folder.list();
            
            for (String fileName : files){
                if (fileName.endsWith(extensionArchivo)){      
                    File childFile = new File("./Archivos/"+fileName);
                    
                    try(FileInputStream fileInputStream = new FileInputStream(childFile);
                        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);){
                            lista.add((T) inputStream.readObject());
                        } 
                    catch (IOException e){
                        System.out.println(e.getMessage());;
                        e.printStackTrace();
                        System.out.println("Error de conexion con el archivo");
                        System.out.println("Error en leer el archivo");				
                    } catch (ClassNotFoundException e) {
                        System.out.println("El objeto no tiene la forma de un " + extensionArchivo );
                    }
                }
            }
        }
        return lista;
    }
    
}    
    