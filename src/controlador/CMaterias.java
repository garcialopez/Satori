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
import modelo.Materia;
import vista.VMaterias;

/**
 *
 * @author adrian
 */
public class CMaterias implements ActionListener {

    VMaterias vMaterias;

    Materia materias;

    private int contador;
    private int idFilaTemporal;

    DefaultTableModel modelo;
    List<Object[]> academias;

    public CMaterias(VMaterias materias) {
        this.vMaterias = materias;

        this.vMaterias.btnNuevo.addActionListener(this);
        this.vMaterias.btnBuscar.addActionListener(this);
        this.vMaterias.btnInsertar.addActionListener(this);
        this.vMaterias.btnModificar.addActionListener(this);
        this.vMaterias.btnEliminar.addActionListener(this);

        this.contador = 1;
        this.idFilaTemporal = -1;
        academias = new ArrayList();
    }

    public void iniciarMaterias() {
        this.vMaterias.setLocationRelativeTo(null);
        this.vMaterias.setTitle("Materias");
        this.vMaterias.setResizable(false);

        //iniciamos la tabla
        iniciarTabla();
        iniciarBox();

        this.vMaterias.pack();  //redimensión de contenedores
        this.vMaterias.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vMaterias.btnNuevo) {
            limpiarCampos();
            
            this.vMaterias.btnModificar.setEnabled(false);
            this.vMaterias.btnEliminar.setEnabled(false);
            this.vMaterias.btnBuscar.setEnabled(false);
        } else if (e.getSource() == this.vMaterias.btnBuscar) {
            buscar();
             this.vMaterias.btnInsertar.setEnabled(false);
             this.vMaterias.btnBuscar.setEnabled(true);
        } else if (e.getSource() == this.vMaterias.btnInsertar) {
            insertar();
             iniciarTabla();
              this.vMaterias.btnModificar.setEnabled(true);
            this.vMaterias.btnEliminar.setEnabled(true);
            this.vMaterias.btnBuscar.setEnabled(true);
             this.vMaterias.btnInsertar.setEnabled(true);
        } else if (e.getSource() == this.vMaterias.btnModificar) {
            this.modificar();
             iniciarTabla();
             this.vMaterias.btnInsertar.setEnabled(true);
        } else if (e.getSource() == this.vMaterias.btnEliminar) {
            this.borrar();
             iniciarTabla();
             this.vMaterias.btnInsertar.setEnabled(true);
        }
    }

    private void limpiarCampos() {
        this.idFilaTemporal = -1;

        this.vMaterias.txtClave.setText("");
        this.vMaterias.txtNombre.setText("");

        this.vMaterias.boxAcademia.setSelectedIndex(0);
    }

    private void insertar() {
        this.materias = new Materia();

        // Recogemos los datos
        String clave = this.vMaterias.txtClave.getText();
        String nombre = this.vMaterias.txtNombre.getText();
      
        

        int indiceBoxSeleccionado = this.vMaterias.boxAcademia.getSelectedIndex();
        Object idAcademiaAux = academias.get(indiceBoxSeleccionado)[0];
        int idAcademia = Integer.parseInt(idAcademiaAux.toString());

        // Asignamos al objeto
        this.materias.setClave(clave);
        this.materias.setNombre(nombre);
        this.materias.setAcademia(idAcademia);

        Transacciones t = new Transacciones();
        if (t.insertarMaterias(materias)) {
            JOptionPane.showMessageDialog(null, "Materia insertada exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al insertar Materia", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void buscar() {
        try {
            int idBuscar = Integer.parseInt(this.vMaterias.txtBuscar.getText());

            int filas = this.modelo.getRowCount();

            for (int i = 0; i < filas; i++) {

                int idModelo = Integer.parseInt(modelo.getValueAt(i, 0).toString());

                if (idModelo == idBuscar) {
                    this.idFilaTemporal = i;
                    this.vMaterias.txtClave.setText(modelo.getValueAt(i, 1).toString());
                    this.vMaterias.txtNombre.setText(modelo.getValueAt(i, 2).toString());
                    break;
                }
            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Formato no valido",
                    "Error ", JOptionPane.ERROR_MESSAGE);
        }//ciera catch
    }

    private void borrar() {
        this.materias = new Materia();

        // Recogemos los datos
        String idTexto = this.vMaterias.txtBuscar.getText();
        int id = Integer.parseInt(idTexto);

        // Asignamos al objeto
        this.materias.setIdMateria(id);

        Transacciones t = new Transacciones();

        if (t.eliminarMateria(materias)) {
            JOptionPane.showMessageDialog(null, "Eliminado",
                    "Exitoso", JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "No se eliminó",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void modificar() {
        this.materias = new Materia();

        // Recogemos los datos
         String clave = this.vMaterias.txtClave.getText();
        String nombre = this.vMaterias.txtNombre.getText();
        String idTexto = this.vMaterias.txtBuscar.getText();
        int id = Integer.parseInt(idTexto);

        int indiceBoxSeleccionado = this.vMaterias.boxAcademia.getSelectedIndex();
        Object idAcademiaAux = academias.get(indiceBoxSeleccionado)[0];
        int idAcademia = Integer.parseInt(idAcademiaAux.toString());

        // Asignamos al objeto
        this.materias.setIdMateria(id);
        this.materias.setClave(clave);
        this.materias.setNombre(nombre);
        this.materias.setAcademia(idAcademia);

        Transacciones t = new Transacciones();
        if (t.actualizarMateria(materias)) {
            JOptionPane.showMessageDialog(null, "Materia actualizada exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar Materia", "Error", JOptionPane.ERROR_MESSAGE);
        }

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
        this.modelo.addColumn("Clave");
        this.modelo.addColumn("Nombre");
        this.modelo.addColumn("Número_Academia");

        this.materias = new Materia();
        Transacciones t = new Transacciones();
        List<Object[]> resultados = t.seleccionar(this.materias);

        for (int i = 0; i < resultados.size(); i++) {
            this.modelo.addRow(resultados.get(i));
        }

        //asinamos el modelo a la tabla
        this.vMaterias.tblRegistros.setModel(this.modelo);
    } // termina iniciarTabla

    private void iniciarBox() {
        this.vMaterias.boxAcademia.removeAllItems();
        this.vMaterias.boxAcademia.addItem("ISC");

        Transacciones t = new Transacciones();
        academias = t.seleccionar(new Academia());

        for (int i = 0; i < academias.size(); i++) {
            Object[] registro = academias.get(i);
            this.vMaterias.boxAcademia.addItem(registro[1].toString());
        }
    }

}
