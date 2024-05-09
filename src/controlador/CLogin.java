package controlador;

import controlador.bd.Transacciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Usuario;
import vista.VLogin;
import vista.VMenu;

public class CLogin implements ActionListener {

    VLogin login;
    Usuario usuario;
    Seguridad seguridad;
    Transacciones transacciones;

    public CLogin(VLogin login) {
        this.seguridad = new Seguridad();
        this.transacciones = new Transacciones();

        this.login = login;
        this.login.btnIniciarSesion.addActionListener(this);
        
    }

    public void iniciarLogin() {
        this.login.setLocationRelativeTo(null);
        this.login.setTitle("Login");
        this.login.setResizable(false);

        this.login.pack();  //redimensión de contenedores
        this.login.setVisible(true);
    } //close iniciarLogin

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == login.btnIniciarSesion) {
            iniciarSesion();
        }//close if

    } //close actionPerformed  
    
    public void iniciarSesion(){
        //Obtenemos los datos que han ingresado en el VLogin
        String nombreUsuario = this.login.txtUsuario.getText();
        char[] contrasenaChars = this.login.txtContrasena.getPassword();
        String contrasena = this.seguridad.getHashMD5(new String(contrasenaChars));

        //validamos que los campos no estén vacíos
        if (nombreUsuario.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese su nombre de usuario", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            //creamos un objeto de tipo Usuario
            this.usuario = new Usuario();
            this.usuario.setNombreUsuario(nombreUsuario);
            this.usuario.setContrasena(contrasena);
            //validamos que el usuario exista en la base de datos
            if (this.transacciones.validarSesion(usuario)) {

                VMenu menu = new VMenu();
                CMenu cmenu = new CMenu(menu);
                cmenu.iniciarMenu();
                this.login.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            } //close else

        }//close else
    }

} //close class CLogin