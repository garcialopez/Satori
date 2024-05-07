package principal;

import com.jtattoo.plaf.aero.AeroLookAndFeel;
import controlador.CLogin;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vista.VLogin;

/**
 *
 * @author José Adrian García López
 */
public class Satori {

    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(new AeroLookAndFeel());              

        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Error de LookAndFeel");
        }
        
        VLogin login = new VLogin();
        CLogin cLogin = new CLogin(login);
        cLogin.iniciarLogin();
           

    } // close main

} // close class
