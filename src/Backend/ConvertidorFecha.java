package Backend;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class ConvertidorFecha {

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
}
