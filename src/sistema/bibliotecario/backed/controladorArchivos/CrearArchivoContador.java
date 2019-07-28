/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.bibliotecario.backed.controladorArchivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author bryan
 */
public class CrearArchivoContador {
    public static void crearNuevoContador(int nuevoContador, String nombreContador){
        try {
            ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream(nombreContador));
            write.writeInt(nuevoContador);
            write.close();
            //System.out.println(nombreContador);
            //System.out.println(nuevoContador + " createNewCounter");
        } catch (Exception ex) {
            System.out.println("Error en escribir contador");
        }
    }
    
    
    public static int  leerContador(String nombreContador){
        int accountant = 0;
        int accountant1 = 0;
        try {
            ObjectInputStream read = new ObjectInputStream(new FileInputStream(nombreContador));
            accountant1 = read.readInt() +1;
            read.close();
            accountant  = accountant1;
            //System.out.println(accountant + " readCounter contador ha escribir");
            //System.out.println(accountant1 + " readCounter contador para buscar" );
            crearNuevoContador(accountant, nombreContador);
            return accountant1;
        } catch (Exception ex) {
            System.out.println("Error en leer contador");
            System.out.println(nombreContador);
            System.out.println(accountant);
        }
        return 0;
     }
     
     public static int  leerContadorABuscar(String nameCounter, int accountantRead){
        int accountant;
         try {
            ObjectInputStream read = new ObjectInputStream(new FileInputStream(nameCounter));
            accountant = read.readInt() + 1;
             //System.out.println(accountant + " readCounterSerch contador a buscar");
             //System.out.println(accountantRead + " a escribir");
            read.close();
            crearNuevoContador(accountantRead, nameCounter);
            return accountant;
        } catch (Exception ex) {
        }
        return 0;
     }
     
     
}
