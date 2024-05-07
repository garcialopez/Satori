package controlador.bd;

import modelo.Usuario;

/**
 *
 * @author adrian
 */
public class Transacciones {
    
    
    public boolean validarSesion(Usuario usuario){
    
        try {
            
            //si tuvieramos base de datos, aquí ejecutariamos la consulta
            
            //validamos
            return (usuario.getNombreUsuario().equals("admin") && usuario.getContrasena().equals("202cb962ac59075b964b07152d234b70"));
                        
        } catch (Exception e) {
            System.out.println("Error al validar la sesión");
            return false;
        }
        
    } //close vaidarSesion
    
    
}
