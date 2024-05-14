package modelo;

/**
 *
 * @author adrian
 */
public class Materia {
    
    private int idMateria;
    private String clave;
    private String nombre;
    private int academia;
  

 
    public int getIdMateria() {
           return idMateria;
       }

       public void setIdMateria(int idMateria) {
           this.idMateria = idMateria;
       }
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    public int getAcademia() {
        return academia;
    }

    public void setAcademia(int academia) {
        this.academia = academia;
    }
    
    
    
}

