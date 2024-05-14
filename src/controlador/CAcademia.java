package controlador;

import controlador.bd.Transacciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Academia;
import vista.VAcademia;

/**
 *
 * @author adrian
 */
public class CAcademia implements ActionListener {

    VAcademia vAcademia;
    Academia academia;
    private int contador;
    private int idFilaTemporal;

    DefaultTableModel modelo;

    public CAcademia(VAcademia academia) {
        this.vAcademia = academia;

        this.vAcademia.btnNuevo.addActionListener(this);
        this.vAcademia.btnBuscar.addActionListener(this);
        this.vAcademia.btnInsertar.addActionListener(this);
        this.vAcademia.btnModificar.addActionListener(this);
        this.vAcademia.btnEliminar.addActionListener(this);

        //Modificamos botones
        this.vAcademia.btnBuscar.setEnabled(true);
        this.vAcademia.btnInsertar.setEnabled(true);
        this.vAcademia.btnEliminar.setEnabled(false);
        this.vAcademia.btnModificar.setEnabled(false);

        this.contador = 1;
        this.idFilaTemporal = -1;
    }

    public void iniciarAcademia() {
        this.vAcademia.setLocationRelativeTo(null);
        this.vAcademia.setTitle("Academias");
        this.vAcademia.setResizable(false);

        //iniciamos la tabla
        iniciarTabla();

        this.vAcademia.pack();  //redimensión de contenedores
        this.vAcademia.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.vAcademia.btnNuevo) {
            limpiarCampos();
            this.vAcademia.btnBuscar.setEnabled(true);
            this.vAcademia.btnInsertar.setEnabled(true);

            this.vAcademia.btnEliminar.setEnabled(false);
            this.vAcademia.btnModificar.setEnabled(false);

        } else if (e.getSource() == this.vAcademia.btnBuscar) {
            buscar();
            this.vAcademia.btnInsertar.setEnabled(false);

            this.vAcademia.btnModificar.setEnabled(true);
            this.vAcademia.btnEliminar.setEnabled(true);

        } else if (e.getSource() == this.vAcademia.btnInsertar) {
            insertar();
            iniciarTabla();
            this.vAcademia.btnEliminar.setEnabled(false);
            this.vAcademia.btnModificar.setEnabled(false);

        } else if (e.getSource() == this.vAcademia.btnModificar) {
            this.modificar();
            limpiarCampos();
            iniciarTabla();
            this.vAcademia.btnInsertar.setEnabled(true);
            this.vAcademia.btnBuscar.setEnabled(true);

            this.vAcademia.btnModificar.setEnabled(false);
            this.vAcademia.btnEliminar.setEnabled(false);

        } else if (e.getSource() == this.vAcademia.btnEliminar) {
            this.borrar();
            limpiarCampos();
            this.vAcademia.btnInsertar.setEnabled(true);
            this.vAcademia.btnBuscar.setEnabled(true);
            this.vAcademia.btnModificar.setEnabled(false);
            this.vAcademia.btnEliminar.setEnabled(false);

        }

    }

    private void limpiarCampos() {
        this.idFilaTemporal = -1;
        this.vAcademia.txtNombre.setText("");
        this.vAcademia.txtBuscar.setText("");
    }

    private void insertar() {
        this.academia = new Academia();

        if ("".equals(this.vAcademia.txtNombre.getText())) {
            JOptionPane.showMessageDialog(null, "Existen campos vacios",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            //recogemos los datos
            String nombre = this.vAcademia.txtNombre.getText();

            //asignamos al objeto
            this.academia.setNombre(nombre);

            //insertar en la BD
            Transacciones t = new Transacciones();

            if (t.insertarAcademia(academia)) {
                JOptionPane.showMessageDialog(null, "Insertado correctamente en la BD",
                        "Exitoso", JOptionPane.DEFAULT_OPTION);
            } else {
                JOptionPane.showMessageDialog(null, "No se inserto en la BD",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void buscar() {
        try {
            int idBuscar = Integer.parseInt(this.vAcademia.txtBuscar.getText());

            int filas = this.modelo.getRowCount();

            for (int i = 0; i < filas; i++) {

                int idModelo = Integer.parseInt(modelo.getValueAt(i, 0).toString());

                if (idModelo == idBuscar) {
                    this.idFilaTemporal = i;
                    this.vAcademia.txtNombre.setText(modelo.getValueAt(i, 1).toString());
                    break;
                }//cierra if
            }//cierra for
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No se admiten campos vacios",
                    "Error de formato", JOptionPane.ERROR_MESSAGE);
        }//cierra catch
    }

    private void borrar() {
        this.modelo.removeRow(this.idFilaTemporal);
        this.vAcademia.tblRegistros.setModel(this.modelo);

        //recogemos los datos        
        String idTexto = this.vAcademia.txtBuscar.getText();
        int id = Integer.parseInt(idTexto);

        //asignamos al objeto        
        this.academia.setIdAcademia(id); //pendiente

        //eliminar en la BD
        Transacciones t = new Transacciones();

        if (t.eliminarAcademia(academia)) {
            JOptionPane.showMessageDialog(null, "Eliminado correctamente en la BD",
                    "Exitoso", JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "No se elimino en la BD",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void modificar() {
        this.academia = new Academia();

        //recogemos los datos        
        String nombre = this.vAcademia.txtNombre.getText();
        String idTexto = this.vAcademia.txtBuscar.getText();
        int id = Integer.parseInt(idTexto);

        //asignamos al objeto        
        this.academia.setIdAcademia(id); //pendiente
        this.academia.setNombre(nombre);

        //actualizar en la BD
        Transacciones t = new Transacciones();

        if (t.actualizarAcademia(academia)) {
            JOptionPane.showMessageDialog(null, "Actualizado correctamente en la BD",
                    "Exitoso", JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "No se actualizo en la BD",
                    "Error", JOptionPane.ERROR_MESSAGE);
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
        this.modelo.addColumn("Clave");
        this.modelo.addColumn("Nombre");

        // Agregamos unos datos
        Transacciones t = new Transacciones();
        this.academia = new Academia();
        List<Object[]> resultados = t.seleccionar(this.academia);

        for (int i = 0; i < resultados.size(); i++) {
            this.modelo.addRow(resultados.get(i));
        }//cierra for

        //asinamos el modelo a la tabla
        this.vAcademia.tblRegistros.setModel(this.modelo);
        
    } // termina iniciarTabla

}