package modelo;

/**
 *
 * @author adrian
 */
public class Docente {

    private int idEmpleado;
    private int numeroEmpleado;
    private String nombres;
    private String apellidos;
    private int academia;

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }



    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAcademia() {
        return academia;
    }

    public void setAcademia(int academia) {
        this.academia = academia;
    }



}
