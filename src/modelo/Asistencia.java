package modelo;


public class Asistencia {
    
    private int idAsistencia;
    private String fecha;
    private String estatus;
    private int idReservacion;
    private int cantidadAlumnos;
    private String practica;

    /**
     * @return the idAsistencia
     */
    public int getIdAsistencia() {
        return idAsistencia;
    }

    /**
     * @param idAsistencia the idAsistencia to set
     */
    public void setIdAsistencia(int idAsistencia) {
        this.idAsistencia = idAsistencia;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the estatus
     */
    public String getEstatus() {
        return estatus;
    }

    /**
     * @param estatus the estatus to set
     */
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    /**
     * @return the idReservacion
     */
    public int getIdReservacion() {
        return idReservacion;
    }

    /**
     * @param idReservacion the idReservacion to set
     */
    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    /**
     * @return the cantidadAlumnos
     */
    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    /**
     * @param cantidadAlumnos the cantidadAlumnos to set
     */
    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    /**
     * @return the practica
     */
    public String getPractica() {
        return practica;
    }

    /**
     * @param practica the practica to set
     */
    public void setPractica(String practica) {
        this.practica = practica;
    }
    
    
    
    
} //close Asistencia
