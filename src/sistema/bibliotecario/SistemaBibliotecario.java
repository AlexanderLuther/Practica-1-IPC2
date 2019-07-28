package sistema.bibliotecario;
import Frontend.VentanaPrincipal;

/**
 * @author Helmuth Luther
 * @author Bryan Gomez
 */
public class SistemaBibliotecario {

    static VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
    
    public static void main(String[] args) {
        FrameLeer frameLeerArchivo = new FrameLeer();
        frameLeerArchivo.setVisible(true);
        ventanaPrincipal.setVisible(true); 
    }
    
}
