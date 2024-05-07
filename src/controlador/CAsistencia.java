package controlador;

import vista.VAsistencia;

public class CAsistencia {
    VAsistencia sistencia;

    public CAsistencia(VAsistencia sistencia) {
        this.sistencia = sistencia;
    }
    
    public void iniciarMaterias() {
        this.sistencia.setLocationRelativeTo(null);
        this.sistencia.setTitle("Asistencia");
        this.sistencia.setResizable(false);
        this.sistencia.pack();  //redimensión de contenedores
        this.sistencia.setVisible(true);
    }
    
    
}
