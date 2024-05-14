package controlador.bd;

import modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.util.ArrayList;
import java.util.List;

import modelo.Academia;
import modelo.Horario;

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

    public List<Object[]> seleccionar(Academia academia) {
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

                while (rst.next()) {
                    Object[] registro = new Object[cantCol];
                    for (int i = 0; i < cantCol; i++) {
                        registro[i] = rst.getObject(i + 1);
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

    //------------------------------------------------------------------------------------------------------------------------------------------ EQUIPO HAU
    //COMIENZA HORARIO
    //metodo para insertar un usuario
    public boolean insertarHorario(Horario horario) {
        if (ConexionBD.conectarBD()) {
            try {
                String procedimiento = "{CALL insertarHorario(?,?)}";
                CallableStatement st = ConexionBD.conexion.prepareCall(procedimiento);
                st.setString(1, horario.getDesde());
                st.setString(2, horario.getHasta());
                st.execute();

                return true;
            } catch (SQLException e) {
                System.err.println("Error: " + e.getMessage());
                return false;
            }//cierra catch
        } //cierraif
        return false;
    }//cierra metodo insertarHorario

    public boolean actualizarHorario(Horario horario) {
        if (ConexionBD.conectarBD()) {
            try {
                String procedimiento = "{CALL actualizarHorario(?,?,?)}";
                CallableStatement st = ConexionBD.conexion.prepareCall(procedimiento);

                st.setInt(1, horario.getIdHorario());
                st.setString(2, horario.getDesde());
                st.setString(3, horario.getHasta());

                st.execute();
                return true;
            } catch (SQLException e) {
                System.err.println("Error: " + e.getMessage());
                return false;
            }//cierra catch
        } //cierraif
        return false;
    }//cierra metodo actualizarHorario

    public boolean eliminarHorario(Horario horario) {

        if (ConexionBD.conectarBD()) {

            try {

                String procedimiento = "{CALL eliminarHorario(?)}";
                CallableStatement st = ConexionBD.conexion.prepareCall(procedimiento);
                st.setInt(1, horario.getIdHorario());

                st.execute();

                return true;

            } catch (SQLException e) {
                System.err.println("Error: " + e.getMessage());
                return false;
            }//cierra catch

        }//cierra if
        return false;

    }//cierra metodo eliminarHorario

    public List<Object[]> seleccionarHorario(Horario horario) {
        List<Object[]> resultado = null;
        //----------------------------------
        if (ConexionBD.conectarBD()) {
            try {
                String procedimiento = "{CALL seleccionarHorario(?)}";
                CallableStatement st = ConexionBD.conexion.prepareCall(procedimiento);
                st.setInt(1, horario.getIdHorario());
                ResultSet rst = st.executeQuery();

                int cantCol = rst.getMetaData().getColumnCount();
                resultado = new ArrayList();

                while (rst.next()) {

                    Object[] registro = new Object[cantCol];
                    for (int i = 0; i < cantCol; i++) {
                        registro[i] = rst.getObject(i + 1);
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
//FINALIZA HORARIO
    //------------------------------------------------------------------------------------------------------------------------------------------

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
