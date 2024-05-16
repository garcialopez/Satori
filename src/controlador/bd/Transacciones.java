package controlador.bd;

import modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import modelo.Academia;

import modelo.Docente;
import modelo.Laboratorio;

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
    
     public boolean eliminarAcademia(Academia academia){
        if(ConexionBD.conectarBD()){
            try {
                String procedimientos = "{call eliminarAcademia(?)}";
                CallableStatement st = ConexionBD.conexion.prepareCall(procedimientos);
                st.setInt(1, academia.getIdAcademia());               
                st.execute();
                return true;
            } catch (SQLException e) {
                System.err.println("Error: " + e.getMessage());
                return false;
            }//cierra catch
        }
        return false;
    }//cierra metodo eliminar academia

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

    //----------------------------------------------------------------------------------EQUIPO 3
    public boolean insertarLab(Laboratorio laboratorio) {

        if (ConexionBD.conectarBD()) {

            try {
                String procedimiento = "{CALL insertarLab(?)}";
                PreparedStatement st = ConexionBD.conexion.prepareCall(procedimiento);
                st.setString(1, laboratorio.getNombre());
                st.execute();
                return true;

            } catch (SQLException e) {
                System.err.println("Error: " + e.getMessage());
                return false;
            } //Cierra catch

        } //Cierra IF
        return false;
    } //Cierra método insertar laboratorio

    public boolean actualizarLab(Laboratorio laboratorio) {

        if (ConexionBD.conectarBD()) {

            try {
                String procedimiento1 = "{CALL actualizarLab(?,?)}";
                PreparedStatement st = ConexionBD.conexion.prepareCall(procedimiento1);
                st.setInt(1, laboratorio.getIdLaboratorio());
                st.setString(2, laboratorio.getNombre());
                st.execute();
                return true;

            } catch (SQLException e) {
                System.err.println("Error: " + e.getMessage());
                return false;
            } //Cierra catch

        } //Cierra IF
        return false;
    } //Cierra método actualizar laboratorio

    public List<Object[]> seleccionarLab(Laboratorio laboratorio) {
        List<Object[]> resultado = null;
        //----------------------------------
        if (ConexionBD.conectarBD()) {
            try {
                String procedimiento = "{CALL seleccionarLab(?)}";
                CallableStatement st = ConexionBD.conexion.prepareCall(procedimiento);
                st.setInt(1, laboratorio.getIdLaboratorio());
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

    //----------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------EQUIPO 4
    public List<Object[]> seleccionarDoc(Docente docente) {
        List<Object[]> resultado = null;
        //----------------------------------
        if (ConexionBD.conectarBD()) {
            try {
                String procedimiento = "{CALL seleccionarDoc(?)}";
                CallableStatement st = ConexionBD.conexion.prepareCall(procedimiento);
                st.setInt(1, docente.getIdEmpleado());
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

    public boolean insertarDocente(Docente docente) {
        if (ConexionBD.conectarBD()) {
            try {
                String procedimiento = "{CALL insertDoc(?,?,?,?)}";
                CallableStatement st = ConexionBD.conexion.prepareCall(procedimiento);
                st.setInt(1, docente.getNumeroEmpleado());
                st.setString(2, docente.getNombres());
                st.setString(3, docente.getApellidos());
                st.setInt(4, docente.getAcademia());

                st.execute();

                return true;
            } catch (SQLException e) {
                System.err.println("Error: " + e.getMessage());
                return false;
            }//cierra catch
        } //cierraif
        return false;
    }//cierra metodo insertarDocente

    public boolean actualizarDocente(Docente docente) {
        if (ConexionBD.conectarBD()) {
            try {
                String procedimiento = "{CALL updateDoc(?,?,?,?)}";
                CallableStatement st = ConexionBD.conexion.prepareCall(procedimiento);

//            	st.setInt(1, docente.getIdEmpleado());
                st.setInt(1, docente.getNumeroEmpleado());
                st.setString(2, docente.getNombres());
                st.setString(3, docente.getApellidos());
                st.setInt(4, docente.getAcademia());

                st.execute();
                return true;
            } catch (SQLException e) {
                System.err.println("Error: " + e.getMessage());
                return false;
            }//cierra catch
        } //cierraif
        return false;
    }//cierra metodo actualizar docente

    public boolean borrarDocente(Docente docente) {
        if (ConexionBD.conectarBD()) {
            try {
                String procedimiento = "{CALL deleteDoc(?)}"; // Nombre del procedimiento almacenado
                CallableStatement st = ConexionBD.conexion.prepareCall(procedimiento);

                st.setInt(1, docente.getIdEmpleado()); // Pasar el ID del registro a borrar

                st.execute();
                return true;
            } catch (SQLException e) {
                System.err.println("Error: " + e.getMessage());
                return false;
            }
        }
        return false;
    }

    //----------------------------------------------------------------------------------
}