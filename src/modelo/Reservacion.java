package modelo;


public class Reservacion {
    
    private int idReservacion;
    private String dia;
    private int idDocente;
    private int idHorario;
    private int idMateria;
    private int idLaboratorio;

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
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the idDocente
     */
    public int getIdDocente() {
        return idDocente;
    }

    /**
     * @param idDocente the idDocente to set
     */
    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    /**
     * @return the idHorario
     */
    public int getIdHorario() {
        return idHorario;
    }

    /**
     * @param idHorario the idHorario to set
     */
    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    /**
     * @return the idMateria
     */
    public int getIdMateria() {
        return idMateria;
    }

    /**
     * @param idMateria the idMateria to set
     */
    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    /**
     * @return the idLaboratorio
     */
    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    /**
     * @param idLaboratorio the idLaboratorio to set
     */
    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }
    
    
    
} //close reservacion
