package controlador;

import vista.VReservacion;

public class CReservacion {
    VReservacion reservacion;

    public CReservacion(VReservacion reservacion) {
        this.reservacion = reservacion;
    }
    
    public void iniciarReservacion() {
        this.reservacion.setLocationRelativeTo(null);
        this.reservacion.setTitle("Reservacion");
        this.reservacion.setResizable(false);
        this.reservacion.pack();  //redimensión de contenedores
        this.reservacion.setVisible(true);
        
    }
    
    
}
