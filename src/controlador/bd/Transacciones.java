package controlador.bd;

import modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.util.ArrayList;
import java.util.List;

import modelo.Academia;
import modelo.Materia;

public class Transacciones {
    //metodo para insertar un usuario
    public boolean insertarAcademia(Academia academia) {
        if (ConexionBD.conectarBD()) {
            try {
                String procedimiento = "{CALL insertarAcademia(?)}";
                CallableStatement st = ConexionBD.conexion.prepareCall(procedimiento);
                st.setString(1, academia.getNombre());
                st.execute();

                return true;
            } catch (SQLException e) {
                System.err.println("Error: " + e.getMessage());
                return false;
            }//cierra catch
        } //cierraif
        return false;
    }//cierra metodo insertarAcademia

    public boolean actualizarAcademia(Academia academia) {
        if (ConexionBD.conectarBD()) {
            try {
                String procedimiento = "{CALL actualizarAcademia(?,?)}";
                CallableStatement st = ConexionBD.conexion.prepareCall(procedimiento);

                st.setInt(1, academia.getIdAcademia());
                st.setString(2, academia.getNombre());

                st.execute();
                return true;
            } catch (SQLException e) {
                System.err.println("Error: " + e.getMessage());
                return false;
            }//cierra catch
        } //cierraif
        return false;
    }//cierra metodo insertar Academia

    public List<Object[]> seleccionar(Academia academia){
        List<Object[]> resultado = null;
        //----------------------------------
        if (ConexionBD.conectarBD()) {
            try {
                String procedimiento = "{CALL seleccionarAcademia(?)}";
                CallableStatement st = ConexionBD.conexion.prepareCall(procedimiento);
                st.setInt(1, academia.getIdAcademia());
                ResultSet rst = st.executeQuery();

                int cantCol = rst.getMetaData().getColumnCount();
                resultado = new ArrayList();

                while(rst.next()){
                    Object[] registro = new Object[cantCol];
                    for (int i = 0; i < cantCol; i++) {
                        registro[i] = rst.getObject( i + 1);
                    }//cierra for
                    resultado.add(registro);
                } //cierra while

                return resultado;
            } catch (SQLException e) {
                System.err.println("Error: " + e.getMessage());
                return resultado;
            }//cierra catch
        } //cierraif

        //----------------------------------
        return resultado;
    }
    
     public boolean insertarMaterias(Materia materia){
        
    if(ConexionBD.conectarBD()){
        try {
            String procedimiento = "{CALL insertarMaterias(?, ?, ?)}";
            CallableStatement st = ConexionBD.conexion.prepareCall(procedimiento);
            
            st.setString(1, materia.getClave());
            st.setString(2, materia.getNombre());
            st.setInt(3, materia.getAcademia());
            st.execute();
            return true;
        } catch (SQLException e) {
             System.err.println("Error: " + e.getMessage());
              return false;
        }
    }
    return false;
}// cierra método insertarLaboratorio
      public boolean actualizarMateria(Materia materia){
        
    if(ConexionBD.conectarBD()){
        try {
            String procedimiento = "{CALL actualizarMateria(?,?,?,?)}";
            CallableStatement st = ConexionBD.conexion.prepareCall(procedimiento);
            st.setInt(1, materia.getIdMateria());
            st.setString(2, materia.getClave());
            st.setString(3, materia.getNombre());
            st.setInt(4, materia.getAcademia());
            st.execute();
            return true;
        } catch (SQLException e) {
             System.err.println("Error: " + e.getMessage());
              return false;
        }
    }
    return false;
      }   
    public boolean eliminarMateria (Materia materia){
        
    if(ConexionBD.conectarBD()){
        try {
            String procedimiento = "{CALL eliminarMateria(?)}";
            CallableStatement st = ConexionBD.conexion.prepareCall(procedimiento);
            st.setInt(1, materia.getIdMateria());
        
            st.execute();
            return true;
        } catch (SQLException e) {
             System.err.println("Error: " + e.getMessage());
              return false;
        }
    }
    return false;
}// cierra método insertarLaboratorio
         public List<Object[]> seleccionar(Materia materia){
        List<Object[]> resultado = null;
        //----------------------------------
        if (ConexionBD.conectarBD()) {
            try {
                String procedimiento = "{CALL seleccionarMaterias(?)}";
                CallableStatement st = ConexionBD.conexion.prepareCall(procedimiento);
                st.setInt(1, materia.getIdMateria());
                ResultSet rst = st.executeQuery();

                int cantCol = rst.getMetaData().getColumnCount();
                resultado = new ArrayList();

                while(rst.next()){
                    Object[] registro = new Object[cantCol];
                    for (int i = 0; i < cantCol; i++) {
                        registro[i] = rst.getObject( i + 1);
                    }//cierra for
                    resultado.add(registro);
                } //cierra while

                return resultado;
            } catch (SQLException e) {
                System.err.println("Error: " + e.getMessage());
                return resultado;
            }//cierra catch
        } //cierraif

        //----------------------------------
        return resultado;
    }
         
    public boolean validarSesion(Usuario usuario) {
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
