package vista;


public class VReservacion extends javax.swing.JDialog {
   
    public VReservacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCuerpoGeneral = new javax.swing.JPanel();
        panelEncabezado = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        panelCuerpo = new javax.swing.JPanel();
        panelVertIzquierdo = new javax.swing.JPanel();
        panelBusqueda = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        panelOPeraciones = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        panelDetalles = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        boxLaboratorio = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtNumDocentes = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        boxDia = new javax.swing.JComboBox<>();
        btnBuscarDocente = new javax.swing.JButton();
        lblDocente = new javax.swing.JLabel();
        boxHorario = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtClaveMateria = new javax.swing.JTextField();
        btnBuscarMateria = new javax.swing.JButton();
        lblMateria = new javax.swing.JLabel();
        panelVertDerecho = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();
        menuOpciones = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        itemSalir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        itemAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelCuerpoGeneral.setBackground(new java.awt.Color(255, 255, 255));
        panelCuerpoGeneral.setPreferredSize(new java.awt.Dimension(980, 630));
        panelCuerpoGeneral.setLayout(new javax.swing.BoxLayout(panelCuerpoGeneral, javax.swing.BoxLayout.Y_AXIS));

        panelEncabezado.setBackground(new java.awt.Color(255, 255, 255));
        panelEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        panelEncabezado.setPreferredSize(new java.awt.Dimension(980, 70));
        panelEncabezado.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 70, 5));

        lblTitulo.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(98, 17, 50));
        lblTitulo.setText("OPERACIONES PARA LAS RESERVACION");
        panelEncabezado.add(lblTitulo);

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/SATORI230X65 blanco.png"))); // NOI18N
        panelEncabezado.add(lblLogo);

        panelCuerpoGeneral.add(panelEncabezado);

        panelCuerpo.setPreferredSize(new java.awt.Dimension(980, 560));
        panelCuerpo.setLayout(new java.awt.GridLayout(1, 0));

        panelVertIzquierdo.setBackground(new java.awt.Color(255, 255, 255));
        panelVertIzquierdo.setPreferredSize(new java.awt.Dimension(600, 560));

        panelBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        panelBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 1, 16))); // NOI18N

        lblInfo.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(153, 153, 153));
        lblInfo.setText("Solo para detalles, eliminar y actualizar.");

        txtBuscar.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(98, 17, 50));
        jLabel8.setText("Clave de la Reservacion:");

        btnBuscar.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setFocusPainted(false);

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusquedaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBusquedaLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar)))
                .addGap(6, 6, 6))
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblInfo)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelOPeraciones.setBackground(new java.awt.Color(255, 255, 255));
        panelOPeraciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 1, 16))); // NOI18N

        btnModificar.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setFocusPainted(false);

        btnInsertar.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        btnInsertar.setText("Insertar");
        btnInsertar.setFocusPainted(false);

        btnEliminar.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setFocusPainted(false);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout panelOPeracionesLayout = new javax.swing.GroupLayout(panelOPeraciones);
        panelOPeraciones.setLayout(panelOPeracionesLayout);
        panelOPeracionesLayout.setHorizontalGroup(
            panelOPeracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOPeracionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jSeparator1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelOPeracionesLayout.setVerticalGroup(
            panelOPeracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelOPeracionesLayout.createSequentialGroup()
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelDetalles.setBackground(new java.awt.Color(255, 255, 255));
        panelDetalles.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 1, 16))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(98, 17, 50));
        jLabel10.setText("Clave ");

        txtClave.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setFocusPainted(false);

        jLabel11.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(98, 17, 50));
        jLabel11.setText("Núm. Docente");

        jLabel13.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(98, 17, 50));
        jLabel13.setText("Laboratorio");

        boxLaboratorio.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        boxLaboratorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(98, 17, 50));
        jLabel12.setText("Día");

        txtNumDocentes.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(98, 17, 50));
        jLabel15.setText("Horario");

        boxDia.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        boxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnBuscarDocente.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        btnBuscarDocente.setText("Búscar");
        btnBuscarDocente.setFocusPainted(false);

        lblDocente.setFont(new java.awt.Font("Open Sans", 2, 11)); // NOI18N
        lblDocente.setForeground(new java.awt.Color(98, 17, 50));
        lblDocente.setText("i1 - nombre docente apellidos");

        boxHorario.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        boxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel14.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(98, 17, 50));
        jLabel14.setText("Clave Materia");

        txtClaveMateria.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N

        btnBuscarMateria.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        btnBuscarMateria.setText("Búscar");
        btnBuscarMateria.setFocusPainted(false);

        lblMateria.setFont(new java.awt.Font("Open Sans", 2, 11)); // NOI18N
        lblMateria.setForeground(new java.awt.Color(98, 17, 50));
        lblMateria.setText("2003j - materia");

        javax.swing.GroupLayout panelDetallesLayout = new javax.swing.GroupLayout(panelDetalles);
        panelDetalles.setLayout(panelDetallesLayout);
        panelDetallesLayout.setHorizontalGroup(
            panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetallesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetallesLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(boxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(boxHorario, 0, 160, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetallesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNuevo))
                    .addGroup(panelDetallesLayout.createSequentialGroup()
                        .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelDetallesLayout.createSequentialGroup()
                                    .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelDetallesLayout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelDetallesLayout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtNumDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnBuscarDocente)))
                                    .addGap(72, 72, 72)))
                            .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelDetallesLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtClaveMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnBuscarMateria)
                                    .addGap(72, 72, 72))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelDetallesLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(boxLaboratorio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDetallesLayout.setVerticalGroup(
            panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetallesLayout.createSequentialGroup()
                .addComponent(btnNuevo)
                .addGap(4, 4, 4)
                .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(btnBuscarDocente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDocente)
                .addGap(18, 18, 18)
                .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(boxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addComponent(boxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClaveMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(btnBuscarMateria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMateria)
                .addGap(18, 18, 18)
                .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(boxLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout panelVertIzquierdoLayout = new javax.swing.GroupLayout(panelVertIzquierdo);
        panelVertIzquierdo.setLayout(panelVertIzquierdoLayout);
        panelVertIzquierdoLayout.setHorizontalGroup(
            panelVertIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVertIzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVertIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelOPeraciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelVertIzquierdoLayout.setVerticalGroup(
            panelVertIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVertIzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOPeraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelCuerpo.add(panelVertIzquierdo);

        panelVertDerecho.setBackground(new java.awt.Color(255, 255, 255));
        panelVertDerecho.setPreferredSize(new java.awt.Dimension(380, 560));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 1, 16))); // NOI18N
        jPanel7.setPreferredSize(new java.awt.Dimension(450, 510));

        jLabel9.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Visualización de registros de solo lectura");

        jScrollPane1.setPreferredSize(new java.awt.Dimension(450, 400));

        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblRegistros);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelVertDerechoLayout = new javax.swing.GroupLayout(panelVertDerecho);
        panelVertDerecho.setLayout(panelVertDerechoLayout);
        panelVertDerechoLayout.setHorizontalGroup(
            panelVertDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVertDerechoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelVertDerechoLayout.setVerticalGroup(
            panelVertDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVertDerechoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelCuerpo.add(panelVertDerecho);

        panelCuerpoGeneral.add(panelCuerpo);

        menuOpciones.setBackground(new java.awt.Color(98, 17, 50));
        menuOpciones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuOpciones.setPreferredSize(new java.awt.Dimension(980, 40));

        menuArchivo.setForeground(new java.awt.Color(255, 255, 255));
        menuArchivo.setText("Archivo");
        menuArchivo.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N

        itemSalir.setBackground(new java.awt.Color(98, 17, 50));
        itemSalir.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        itemSalir.setForeground(new java.awt.Color(255, 255, 255));
        itemSalir.setText("Salir");
        menuArchivo.add(itemSalir);

        menuOpciones.add(menuArchivo);

        menuAyuda.setForeground(new java.awt.Color(255, 255, 255));
        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N

        itemAyuda.setBackground(new java.awt.Color(98, 17, 50));
        itemAyuda.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        itemAyuda.setForeground(new java.awt.Color(255, 255, 255));
        itemAyuda.setText("Acerca de");
        menuAyuda.add(itemAyuda);

        menuOpciones.add(menuAyuda);

        setJMenuBar(menuOpciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCuerpoGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCuerpoGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> boxDia;
    public javax.swing.JComboBox<String> boxHorario;
    public javax.swing.JComboBox<String> boxLaboratorio;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnBuscarDocente;
    public javax.swing.JButton btnBuscarMateria;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnInsertar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnNuevo;
    private javax.swing.JMenuItem itemAyuda;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDocente;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuBar menuOpciones;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelCuerpo;
    private javax.swing.JPanel panelCuerpoGeneral;
    private javax.swing.JPanel panelDetalles;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelOPeraciones;
    private javax.swing.JPanel panelVertDerecho;
    private javax.swing.JPanel panelVertIzquierdo;
    public javax.swing.JTable tblRegistros;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtClave;
    public javax.swing.JTextField txtClaveMateria;
    public javax.swing.JTextField txtNumDocentes;
    // End of variables declaration//GEN-END:variables
}
