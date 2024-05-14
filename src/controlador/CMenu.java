package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import vista.VAcademia;
import vista.VDocentes;
import vista.VHorario;
import vista.VLaboratorios;
import vista.VMaterias;
import vista.VMenu;
import vista.VReservacion;
import javax.swing.JPanel;
import java.awt.Component;

public class CMenu implements ActionListener {

    VMenu menu;

    public CMenu(VMenu menu) {

        this.menu = menu;

        //Agregamos los eventos a cada item
        this.menu.itemAcademia.addActionListener(this);
        this.menu.itemHorario.addActionListener(this);
        this.menu.itemLaboratorios.addActionListener(this);
        this.menu.itemMaterias.addActionListener(this);
        this.menu.itemProfesores.addActionListener(this);
        this.menu.itemAcercaDe.addActionListener(this);
        this.menu.itemSalir.addActionListener(this);    
        this.menu.itemReservaciones.addActionListener(this);//agregado
        this.menu.checkNA.addActionListener(this);//agregado
    }

    public void iniciarMenu(boolean privilegios) {
        this.menu.setLocationRelativeTo(null);
        this.menu.setTitle("Menú");
        this.menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.menu.pack();  //redimensión de contenedores

        this.menu.menuDepartamento.setVisible(privilegios);
        
        this.menu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.menu.itemAcademia) {
            VAcademia dialog = new VAcademia(this.menu, true);
            CAcademia cAcademia = new CAcademia(dialog);
            cAcademia.iniciarAcademia();

        } else if (e.getSource() == this.menu.itemHorario) {
             VHorario dialog = new VHorario(this.menu, true);
           CHorario cHorario = new CHorario(dialog);
           cHorario.iniciarHorario();

        } else if (e.getSource() == this.menu.itemLaboratorios) {
            VLaboratorios dialog = new VLaboratorios(this.menu, true);
            CLaboratorios cAcademia = new CLaboratorios(dialog);
            cAcademia.iniciarLaboratorios();

        } else if (e.getSource() == this.menu.itemMaterias) {
            VMaterias dialog = new VMaterias(this.menu, true);
            CMaterias cAcademia = new CMaterias(dialog);
            cAcademia.iniciarMaterias();

        } else if (e.getSource() == this.menu.itemProfesores) {
            VDocentes dialog = new VDocentes(this.menu, true);
            CDocentes cAcademia = new CDocentes(dialog);
            cAcademia.iniciarDocentes();

        } else if (e.getSource() == this.menu.itemAcercaDe) {
            //hacer

        } else if (e.getSource() == this.menu.itemSalir) {
            System.exit(0);

        } else if (e.getSource() == this.menu.itemReservaciones) {
            VReservacion dialog = new VReservacion(this.menu, true);
            CReservacion cReservacion = new CReservacion(dialog);
            cReservacion.iniciarReservacion();
            
        } else if (e.getSource() == this.menu.checkSolicitar){
            boolean check = this.menu.checkSolicitar.isSelected();

            if (check) {
                bloquearPanelAsistencia();
            } else {
                bloquearPanelNoAsistencia();                
            }

        }

    } //close actionPerformed

    //metodo para bloquear todos los componentes del panel asistente
    private void bloquearPanelAsistencia() {
        bloquearComponents(this.menu.jPanel5,false);
        bloquearComponents(this.menu.jPanel7,false);
        bloquearComponents(this.menu.jPanel8,false);
        bloquearComponents(this.menu.jPanel9,false);
        bloquearComponents(this.menu.jPanel10,false);

        bloquearComponents(this.menu.panelNoAsignacion,true);
        bloquearComponents(this.menu.jPanel11,true);
        bloquearComponents(this.menu.jPanel12,true);
        bloquearComponents(this.menu.jPanel13,true);
        bloquearComponents(this.menu.jPanel15,true);

        
    }

    //metodo para bloquear todos los componentes del panel no asistente
    private void bloquearPanelNoAsistencia() {
        bloquearComponents(this.menu.jPanel5,true);
        bloquearComponents(this.menu.jPanel7,true);
        bloquearComponents(this.menu.jPanel8,true);
        bloquearComponents(this.menu.jPanel9,true);
        bloquearComponents(this.menu.jPanel10,true);

        bloquearComponents(this.menu.panelNoAsignacion,false);
        bloquearComponents(this.menu.jPanel11,false);
        bloquearComponents(this.menu.jPanel12,false);
        bloquearComponents(this.menu.jPanel13,false);
        bloquearComponents(this.menu.jPanel15,false);

        
    }

    private void bloquearComponents(JPanel panel, boolean bloquear) {
        for (Component component : panel.getComponents()) {
            component.setEnabled(bloquear);
        }
    }

    //comentario

} //close class
