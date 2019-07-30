package Backend;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class ManejadorFechas {

    /*
    Metodo que recibe como parametro un String. Se encarga de convertir 
    una cadena recibida a una fecha con un formato especifico de tipo DATE.
    */
    public Date convetirFecha(String fechaObtenida){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fechaObtenida);
        } 
        catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }
    
    /*
    Metodo que recibe como parametro una fecha. Se encarga de aumentar en tres dias 
    la fecha que recibe como parametro.
    */
    public Date sumarDias(Date fecha){
      Calendar calendar = Calendar.getInstance();
      calendar.setTime(fecha); 
      calendar.add(Calendar.DAY_OF_YEAR, 2);
      return calendar.getTime(); 
    }
}
