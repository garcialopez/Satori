package controlador;

import controlador.bd.Transacciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Horario;
import vista.VHorario;

/**
 *
 * @author ahcer
 */
public class CHorario implements ActionListener {

    VHorario vHorario;
    Horario horario;
    private int idFilaTemporal;

    DefaultTableModel modelo;

    public CHorario(VHorario horario) {
        this.vHorario = horario;

        this.vHorario.btnBuscar.addActionListener(this);
        this.vHorario.btnEliminar.addActionListener(this);
        this.vHorario.btnInsertar.addActionListener(this);
        this.vHorario.btnModificar.addActionListener(this);
        this.vHorario.btnNuevo.addActionListener(this);

        this.vHorario.btnEliminar.setEnabled(false);
        this.vHorario.btnModificar.setEnabled(false);

        this.idFilaTemporal = -1;

    }

    public void iniciarComboDesde() {

        // Agregar elementos manualmente al JComboBox
        this.vHorario.comboDesde.addItem("07:00:00");
        this.vHorario.comboDesde.addItem("08:00:00");
        this.vHorario.comboDesde.addItem("09:00:00");
        this.vHorario.comboDesde.addItem("10:00:00");
        this.vHorario.comboDesde.addItem("11:00:00");
        this.vHorario.comboDesde.addItem("12:00:00");
        this.vHorario.comboDesde.addItem("13:00:00");
        this.vHorario.comboDesde.addItem("14:00:00");
        this.vHorario.comboDesde.addItem("15:00:00");
        this.vHorario.comboDesde.addItem("16:00:00");
        this.vHorario.comboDesde.addItem("17:00:00");
        this.vHorario.comboDesde.addItem("18:00:00");
        this.vHorario.comboDesde.addItem("19:00:00");
    }

    public void iniciarComboHasta() {

        // Agregar elementos manualmente al JComboBox
        this.vHorario.comboHasta.addItem("07:00:00");
        this.vHorario.comboHasta.addItem("08:00:00");
        this.vHorario.comboHasta.addItem("09:00:00");
        this.vHorario.comboHasta.addItem("10:00:00");
        this.vHorario.comboHasta.addItem("11:00:00");
        this.vHorario.comboHasta.addItem("12:00:00");
        this.vHorario.comboHasta.addItem("13:00:00");
        this.vHorario.comboHasta.addItem("14:00:00");
        this.vHorario.comboHasta.addItem("15:00:00");
        this.vHorario.comboHasta.addItem("16:00:00");
        this.vHorario.comboHasta.addItem("17:00:00");
        this.vHorario.comboHasta.addItem("18:00:00");
        this.vHorario.comboHasta.addItem("19:00:00");
    }

    public void iniciarHorario() {
        this.vHorario.setLocationRelativeTo(null);
        this.vHorario.setTitle("Horarios");
        this.vHorario.setResizable(false);

        //iniciar combo desde
        iniciarComboDesde();
        //iniciar combo hasta
        iniciarComboHasta();

        //iniciar tabla
        iniciarTabla();
        this.vHorario.pack();  //redimensión de contenedores
        this.vHorario.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vHorario.btnNuevo) {
            limpiarCampos();
            this.vHorario.btnEliminar.setEnabled(false);
            this.vHorario.btnModificar.setEnabled(false);

            this.vHorario.btnBuscar.setEnabled(true);
            this.vHorario.btnInsertar.setEnabled(true);

        } else if (e.getSource() == this.vHorario.btnBuscar) {
            buscar();
            vHorario.btnInsertar.setEnabled(false);

            vHorario.btnModificar.setEnabled(true);
            vHorario.btnEliminar.setEnabled(true);

        } else if (e.getSource() == this.vHorario.btnInsertar) {
            vHorario.btnModificar.setEnabled(true);
            vHorario.btnEliminar.setEnabled(true);
            if (vHorario.comboDesde.getSelectedItem().equals("") || vHorario.comboHasta.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(null, "Error, campos vacíos", "Error de insecion", JOptionPane.ERROR_MESSAGE);
            } else {
                insertar();
                iniciarTabla();
            }

        } else if (e.getSource() == this.vHorario.btnModificar) {
            modificar();

            vHorario.btnEliminar.setEnabled(false);
            vHorario.btnModificar.setEnabled(false);

            vHorario.btnInsertar.setEnabled(true);
            vHorario.btnBuscar.setEnabled(true);
            iniciarTabla();
            limpiarCampos();
        } else if (e.getSource() == this.vHorario.btnEliminar) {
            vHorario.btnEliminar.setEnabled(false);
            vHorario.btnModificar.setEnabled(false);
            vHorario.btnInsertar.setEnabled(true);
            vHorario.btnBuscar.setEnabled(true);
            this.borrar();
            iniciarTabla();
        }
    }

    private void limpiarCampos() {
        this.idFilaTemporal = -1;
        this.vHorario.comboDesde.setSelectedItem(null);
        this.vHorario.comboHasta.setSelectedItem(null);
        this.vHorario.txtBuscar.setText("");
        this.vHorario.txtClave.setText("");

    }//cierra limpiar campos

    private void insertar() {
        this.horario = new Horario();
        //recogemos los datos
        String desde = (String) this.vHorario.comboDesde.getSelectedItem(); // Obtener del comboBox
        String hasta = this.vHorario.comboHasta.getSelectedItem().toString(); // Obtener del comboBox
        //asignamos al objeto
        this.horario.setDesde(desde);
        this.horario.setHasta(hasta);

        //INSERTAR EN LA BD
        Transacciones t = new Transacciones();

        if (t.insertarHorario(horario)) {
            JOptionPane.showMessageDialog(null, "Insertado correctamente",
                    "Exitoso", JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "No se inserto",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//cierra insertar horarios

    private void buscar() {
        try {
            int idBuscar = Integer.parseInt(this.vHorario.txtBuscar.getText());
            int filas = this.modelo.getRowCount();
            for (int i = 0; i < filas; i++) {
                int idModelo = Integer.parseInt(modelo.getValueAt(i, 0).toString());
                if (idModelo == idBuscar) {
                    this.idFilaTemporal = i;
                    this.vHorario.txtClave.setText(modelo.getValueAt(i, 0).toString());
                    this.vHorario.comboDesde.setSelectedItem(modelo.getValueAt(i, 1).toString());
                    this.vHorario.comboHasta.setSelectedItem(modelo.getValueAt(i, 2).toString());
                    break;
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Mensaje de error",
                    "Error de formato", JOptionPane.ERROR_MESSAGE);
        } //cierra catch
    } //cierra buscar

    private void borrar() {
        this.horario = new Horario();

        Transacciones t = new Transacciones();

        String idTexto = this.vHorario.txtBuscar.getText();
        int id = Integer.parseInt(idTexto);

        //asignamos al objeto        
        this.horario.setIdHorario(id);

        if (t.eliminarHorario(horario)) {
            JOptionPane.showMessageDialog(null, "Eliminado", "Existoso", JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "No se elimino", "Error de actualización", JOptionPane.ERROR_MESSAGE);
        }

    }//cierra borrar

    private void modificar() {
        this.horario = new Horario();
        //recogemos los datos
        String desde = (String) this.vHorario.comboDesde.getSelectedItem();
        String hasta = (String) this.vHorario.comboHasta.getSelectedItem();

        String idTexto = this.vHorario.txtBuscar.getText();
        int id = Integer.parseInt(idTexto);
        //asignamos al objeto
        this.horario.setIdHorario(id);
        this.horario.setDesde(desde);
        this.horario.setHasta(hasta);

        //INSERTAR EN LA BD
        Transacciones t = new Transacciones();

        if (t.actualizarHorario(horario)) {
            JOptionPane.showMessageDialog(null, "Actualizado correctamente",
                    "Exitoso", JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "No se actualizo",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//cierra modificar

    private void iniciarTabla() {

        this.modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Hacer que todas las celdas sean no editables
            }
        };

        // Agregamos columnas al modelo
        this.modelo.addColumn("Clave");
        this.modelo.addColumn("Desde");
        this.modelo.addColumn("Hasta");

        // Agregamos unos datos
        Transacciones t = new Transacciones();
        this.horario = new Horario();
        List<Object[]> resultados = t.seleccionarHorario(this.horario);

        for (int i = 0; i < resultados.size(); i++) {
            this.modelo.addRow(resultados.get(i));
        } //cierra for
        //asinamos el modelo a la tabla
        this.vHorario.tblRegistros.setModel(this.modelo);

    } // termina iniciarTabla
}
