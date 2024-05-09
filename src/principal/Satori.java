package principal;

import com.jtattoo.plaf.aero.AeroLookAndFeel;
import controlador.CLogin;
import controlador.bd.ConexionBD;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vista.VLogin;

/**
 *
 * @author José Adrian García López
 */
public class Satori {
//cambio desde ramana origin main garcialopez
    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(new AeroLookAndFeel());              

        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Error de LookAndFeel");
        }//cierra catch
       
        if (ConexionBD.conectarBD()) {
            VLogin login = new VLogin();
            CLogin cLogin = new CLogin(login);
            cLogin.iniciarLogin();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.\nContacte al administrador", "Error", JOptionPane.ERROR_MESSAGE);
        }//cierra else

    } // close main

} // close class
