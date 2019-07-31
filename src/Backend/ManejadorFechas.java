package Backend;

import java.util.Calendar;
import java.util.Date;

public class ManejadorFechas {
    
    private Date fechaActual = new Date();
    private int cantidadDias;
    
    /*
    Metodo que recibe como parametro una fecha. Se encarga de aumentar en tres dias 
    la fecha que recibe como parametro.
    */
    public Date sumarDias(Date fecha, int cantidad){
      Calendar calendar = Calendar.getInstance();
      calendar.setTime(fecha); 
      calendar.add(Calendar.DAY_OF_YEAR, cantidad);
      return calendar.getTime(); 
    }
    
    /*
    Metodo que recibe como parametro una fecha. Devuelve la fecha como una String 
    con un formato especifico (yyyy-mm-dd).
    */
    public String darFormatoFecha(Date fecha){
        return String.format("%1$tY-%1$tm-%1$td ", fecha);
    }
    
    /*
    Metodo encargado de obtener la diferencia en enteros entre dos fechas. Recibe como 
    parametro una de las fechas a comparar.
    */
    public int obtenerDiferenciaFechas(Date fechaPrestamo){             
	cantidadDias=(int) ((fechaActual.getTime() - fechaPrestamo.getTime())/86400000);
	return	 cantidadDias;
    }
    
    /*
    Metodo encargado de comparar si la fecha que recibe como parametro se encuentra despues de la 
    fecha actual.
    */
    public boolean compararFechas(Date fechaLimite){
        return fechaActual.after(fechaLimite);
    }    
}
