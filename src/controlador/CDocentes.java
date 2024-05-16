package controlador;

import controlador.bd.Transacciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Academia;
import modelo.Docente;
import vista.VDocentes;

/**
 *
 * @author adrian
 */
public class CDocentes implements ActionListener {

    VDocentes vDocentes;
    Docente docente;

    DefaultTableModel modelo;

    List<Object[]> academias;
    int indiceBoxSeleccionado = -1;

    public CDocentes(VDocentes docentes) {
        this.vDocentes = docentes;

        this.vDocentes.btnNuevo.addActionListener(this);
        this.vDocentes.btnBuscar.addActionListener(this);
        this.vDocentes.btnInsertar.addActionListener(this);
        this.vDocentes.btnModificar.addActionListener(this);
        this.vDocentes.btnEliminar.addActionListener(this);

        academias = new ArrayList();

    }

    public void iniciarDocentes() {
        this.vDocentes.setLocationRelativeTo(null);
        this.vDocentes.setTitle("Docentes");
        this.vDocentes.setResizable(false);

        //iniciamos la tabla
        iniciarTabla();
        iniciarBox();

        this.vDocentes.pack();  //redimensión de contenedores
        this.vDocentes.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vDocentes.btnNuevo) {
            limpiarCampos();
        } else if (e.getSource() == this.vDocentes.btnBuscar) {
            buscar();
        } else if (e.getSource() == this.vDocentes.btnInsertar) {
            insertar();
        } else if (e.getSource() == this.vDocentes.btnModificar) {
            this.modificar();
        } else if (e.getSource() == this.vDocentes.btnEliminar) {
            this.borrar();
        }
    }

    private void limpiarCampos() {

        this.vDocentes.txtNumeroEmpleado.setText("");
        this.vDocentes.txtNombres.setText("");
        this.vDocentes.txtApellidoPaterno.setText("");
        this.vDocentes.txtApellidoMaterno.setText("");
        this.vDocentes.boxAcademia.setSelectedIndex(0);
    }

    private void insertar() {
        this.docente = new Docente();

        //recogemos los datos
        int numeroEmpleado = Integer.parseInt(this.vDocentes.txtNumeroEmpleado.getText());
        String nombre = this.vDocentes.txtNombres.getText();
        String apellidoPaterno = this.vDocentes.txtApellidoPaterno.getText();
        String apellidoMaterno = this.vDocentes.txtApellidoMaterno.getText();

        indiceBoxSeleccionado = this.vDocentes.boxAcademia.getSelectedIndex();
        Object idAux = academias.get(indiceBoxSeleccionado)[0];
        int idAcademia = Integer.parseInt(idAux.toString());

        String apellidos = apellidoPaterno + " " + apellidoMaterno;

        //asignamos al objeto
        this.docente.setNumeroEmpleado(numeroEmpleado);
        this.docente.setNombres(nombre);
        this.docente.setApellidos(apellidos);
        this.docente.setAcademia(idAcademia);

        Transacciones t = new Transacciones();

        if (t.insertarDocente(docente)) {
            JOptionPane.showMessageDialog(null, "Insertado correctamente",
                    "Exitoso", JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "No se inserto",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }// cierrametodo insertar

    private void buscar() {
        int idBuscar = Integer.parseInt(this.vDocentes.txtBuscar.getText());

        int filas = this.modelo.getRowCount();

        for (int i = 0; i < filas; i++) {

            int idModelo = Integer.parseInt(modelo.getValueAt(i, 0).toString());

            if (idModelo == idBuscar) {

                this.vDocentes.txtNumeroEmpleado.setText(idModelo + "");
                this.vDocentes.txtNombres.setText(modelo.getValueAt(i, 1).toString());
                this.vDocentes.txtApellidoPaterno.setText(modelo.getValueAt(i, 2).toString());
                this.vDocentes.txtApellidoMaterno.setText(modelo.getValueAt(i, 3).toString());
                this.vDocentes.boxAcademia.setSelectedItem(modelo.getValueAt(i, 4).toString());
                break;
            }
        }
    }

    private void borrar() {
        this.docente = new Docente();

        Transacciones t = new Transacciones();

        String idTexto = this.vDocentes.txtBuscar.getText();
        int id = Integer.parseInt(idTexto);

        //asignamos al objeto   	 
        this.docente.setIdEmpleado(id);

        if (t.borrarDocente(docente)) {
            JOptionPane.showMessageDialog(null, "Eliminado", "Existoso", JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "No se elimino", "Error de actualización", JOptionPane.ERROR_MESSAGE);
        }

    }//cierra borrar

    private void modificar() {
        this.docente = new Docente();

        //recogemos los datos
        //recogemos los datos
        int id = Integer.parseInt(this.vDocentes.txtNumeroEmpleado.getText());
        String nombre = this.vDocentes.txtNombres.getText();
        String apellidoPaterno = this.vDocentes.txtApellidoPaterno.getText();
        String apellidoMaterno = this.vDocentes.txtApellidoMaterno.getText();
        String academia = this.vDocentes.boxAcademia.getSelectedItem().toString();

        //asignamos al objeto
        //asignamos al objeto
        this.docente.setIdEmpleado(id);
        this.docente.setNombres(nombre);
        this.docente.setApellidos(apellidoPaterno);
//    	this.docente.setAcademia();
//    	this.docente.setApellidoMaterno(apellidoMaterno);

        Transacciones t = new Transacciones();

        if (t.actualizarDocente(docente)) {
            JOptionPane.showMessageDialog(null, "Actualizado correctamente",
                    "Exitoso", JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "No se actualizo",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

        this.vDocentes.tblRegistros.setModel(this.modelo);
    }

    private void iniciarTabla() {

        this.modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Hacer que todas las celdas sean no editables
            }
        };

        // Agregamos columnas al modelo
        this.modelo.addColumn("Número");
        this.modelo.addColumn("Nombre");
        this.modelo.addColumn("Ap. Paterno");
        this.modelo.addColumn("Ap. Materno");
        this.modelo.addColumn("Academia");

        // Agregamos unos datos de prueba
        // Agregar filas al modelo
        Transacciones t = new Transacciones();
        this.docente = new Docente();
        List<Object[]> resultados = t.seleccionarDoc(this.docente);

        for (int i = 0; i < resultados.size(); i++) {
            this.modelo.addRow(resultados.get(i));
        } //cierra for
        //asinamos el modelo a la tabla
        this.vDocentes.tblRegistros.setModel(this.modelo);
    } // termina iniciarTabla

    private void iniciarBox() {
        this.vDocentes.boxAcademia.removeAllItems();
        Transacciones t = new Transacciones();
        academias = t.seleccionar(new Academia());

        for (int i = 0; i < academias.size(); i++) {
            Object[] registro = academias.get(i);
            this.vDocentes.boxAcademia.addItem(registro[1].toString());
        }//cierra for
    }//cierra iniciarBox

}
