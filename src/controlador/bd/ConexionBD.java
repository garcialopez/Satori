package controlador.bd;
//Importamos las librerias necesarias
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


//ESTE ES UN NUEVO COMENTARIO
//HOla profeee

public class ConexionBD {
    //Declaramos las variables necesarias para la conexion
    private static String USER = "root2"; //usuario de la base de datos
    private static String PASS = "123456789"; //contraseña de la base de datos
    private static String DB = "bd_lab";//nombre de la base de datos
    private static String PORT = "3306"; //puerto de la base de datos
    private static String HOST = "localhost"; //host de la base de datos
    private static String ZONE = "serverTimezone=UTC"; //zona horaria de la base de datos

    public static Connection conexion; //variable de conexion

    /**
     * Metodo para conectar a la base de datos
     * @return true si la conexion fue exitosa, false si no lo fue
     */
    public static boolean conectarBD(){
        try {
            //Verificamos si la conexion es nula o esta cerrada
            if(conexion == null || conexion.isClosed()){
                //Cargamos el driver de la base de datos
                String PATH = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB + "?" + ZONE;
                //Establecemos la conexion
                conexion = DriverManager.getConnection(PATH, USER, PASS);
            } //cierra if
            return true; //retorna true si la conexion fue exitosa
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
            return false;
        } //cierra catch
    } //cierra funcion conectarBD

    /**
     * Metodo para cerrar la conexion a la base de datos
     */
    public static void cerrarConexion(){
        try {
            //Verificamos si la conexion no es nula y no esta cerrada
            if (conexion != null && !conexion.isClosed()) {
                //Cerramos la conexion
                conexion.isClosed();
            } //cierra if
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }//cierra catch
    } //cierra funcion cerrarConexion

} // cierra class ConexionBD


