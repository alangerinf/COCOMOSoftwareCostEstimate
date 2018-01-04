package Interface;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Informatico40
 */
public class FactorPonderacion extends javax.swing.JFrame {

    /**
     *
     */
    private int tEntradas = 0, tSalidas = 0, tConsultas = 0, tArchivos = 0, tInterface = 0;
    public static float LDC, MLDC;
    public static int cuentaTotal;

    public FactorPonderacion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFactor = new javax.swing.JPanel();
        lblInterfaces1 = new javax.swing.JLabel();
        lblCuenta1 = new javax.swing.JLabel();
        cmbEntradas = new javax.swing.JComboBox();
        cmbSalidas = new javax.swing.JComboBox();
        cmbConsultas = new javax.swing.JComboBox();
        lblParametros1 = new javax.swing.JLabel();
        cmbArchivos = new javax.swing.JComboBox();
        lblSalidas1 = new javax.swing.JLabel();
        cmbInterfaces = new javax.swing.JComboBox();
        lblEntradas1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblConsultas1 = new javax.swing.JLabel();
        lblArchivos1 = new javax.swing.JLabel();
        lblFactor = new javax.swing.JLabel();
        SpinnerEntrada = new javax.swing.JSpinner();
        SpinnerSalida = new javax.swing.JSpinner();
        SpinnerConsultas = new javax.swing.JSpinner();
        SpinnerArchivos = new javax.swing.JSpinner();
        SpinnerInterfaces = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtEntradas = new javax.swing.JTextField();
        txtSalidas = new javax.swing.JTextField();
        txtConsultas = new javax.swing.JTextField();
        txtArchivos = new javax.swing.JTextField();
        txtInterfaces = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        btnFactorMedicion = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLDC = new javax.swing.JTextField();
        cmbLenguaje = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Punto Funcion Ventana Medicion");
        setBackground(new java.awt.Color(51, 255, 255));
        setBounds(new java.awt.Rectangle(450, 200, 0, 0));
        setResizable(false);

        panelFactor.setBackground(new java.awt.Color(185, 197, 198));
        panelFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuadro"));

        lblInterfaces1.setText("Interfaces");

        lblCuenta1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCuenta1.setText("Cuenta");

        cmbEntradas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Simple", "Medio", "Complejo" }));
        cmbEntradas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEntradasItemStateChanged(evt);
            }
        });

        cmbSalidas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Simple", "Medio", "Complejo" }));
        cmbSalidas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSalidasItemStateChanged(evt);
            }
        });

        cmbConsultas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Simple", "Medio", "Complejo" }));
        cmbConsultas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbConsultasItemStateChanged(evt);
            }
        });

        lblParametros1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblParametros1.setText("Parametros Medicion");

        cmbArchivos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Simple", "Medio", "Complejo" }));
        cmbArchivos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbArchivosItemStateChanged(evt);
            }
        });

        lblSalidas1.setText("Salidas");

        cmbInterfaces.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Simple", "Medio", "Complejo" }));
        cmbInterfaces.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbInterfacesItemStateChanged(evt);
            }
        });

        lblEntradas1.setText("Entradas");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Complejidad");

        lblConsultas1.setText("Consultas");

        lblArchivos1.setText("Archivos");

        lblFactor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFactor.setText("FACTOR DE MEDICION");

        SpinnerEntrada.setModel(new javax.swing.SpinnerNumberModel());
        SpinnerEntrada.setEditor(new javax.swing.JSpinner.NumberEditor(SpinnerEntrada, ""));
        SpinnerEntrada.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinnerEntradaStateChanged(evt);
            }
        });

        SpinnerSalida.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        SpinnerSalida.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinnerSalidaStateChanged(evt);
            }
        });

        SpinnerConsultas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        SpinnerConsultas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinnerConsultasStateChanged(evt);
            }
        });

        SpinnerArchivos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        SpinnerArchivos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinnerArchivosStateChanged(evt);
            }
        });

        SpinnerInterfaces.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        SpinnerInterfaces.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinnerInterfacesStateChanged(evt);
            }
        });

        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Total");

        txtEntradas.setText("0");

        txtSalidas.setText("0");

        txtConsultas.setText("0");

        txtArchivos.setText("0");

        txtInterfaces.setText("0");

        jLabel1.setText("Total:");

        txtTotal.setText("0");

        javax.swing.GroupLayout panelFactorLayout = new javax.swing.GroupLayout(panelFactor);
        panelFactor.setLayout(panelFactorLayout);
        panelFactorLayout.setHorizontalGroup(
            panelFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFactorLayout.createSequentialGroup()
                .addGroup(panelFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFactorLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(lblFactor))
                    .addGroup(panelFactorLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panelFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFactorLayout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelFactorLayout.createSequentialGroup()
                                .addGroup(panelFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSalidas1)
                                    .addComponent(lblConsultas1)
                                    .addComponent(lblArchivos1)
                                    .addComponent(lblInterfaces1)
                                    .addComponent(lblEntradas1)
                                    .addComponent(lblParametros1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(panelFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(SpinnerEntrada, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SpinnerInterfaces, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SpinnerArchivos, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SpinnerConsultas, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SpinnerSalida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47)
                                .addGroup(panelFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbSalidas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbEntradas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbConsultas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbArchivos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbInterfaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addGroup(panelFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelFactorLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel4))
                                    .addComponent(txtSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtInterfaces, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFactorLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(51, 51, 51)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(61, 61, 61))
        );
        panelFactorLayout.setVerticalGroup(
            panelFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFactorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFactor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFactorLayout.createSequentialGroup()
                        .addGroup(panelFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblParametros1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEntradas1)
                            .addComponent(cmbEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSalidas1)
                            .addComponent(cmbSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblConsultas1)
                            .addComponent(cmbConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblArchivos1)
                            .addComponent(cmbArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblInterfaces1)
                            .addComponent(cmbInterfaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInterfaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelFactorLayout.createSequentialGroup()
                        .addComponent(lblCuenta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SpinnerEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SpinnerSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SpinnerConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SpinnerArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SpinnerInterfaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(panelFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAtras.setText("Cancelar");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnFactorMedicion.setText("Enviar");
        btnFactorMedicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorMedicionActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(185, 197, 198));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Líneas de código"));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Lenguaje:");

        cmbLenguaje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbLenguaje.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "JAVA", "C++", "Visual Basic", "Delphi" }));
        cmbLenguaje.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbLenguajeItemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Lineas de codigo :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLDC, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(239, 239, 239)
                    .addComponent(cmbLenguaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(108, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(cmbLenguaje, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addGap(65, 65, 65)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFactorMedicion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelFactor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFactor, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFactorMedicion)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtras)
                        .addGap(61, 61, 61))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // Inicio init = new Inicio();
        if( JOptionPane.showConfirmDialog(null,"'Esta Seguro de Salir , Todos los datos se Perderan!", "Alerta!",JOptionPane.YES_NO_OPTION) == 0)
        {
            this.setVisible(false);
            //   init.setVisible(rootPaneCheckingEnabled);
        }
        else{this.setVisible(true);}
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnFactorMedicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorMedicionActionPerformed
        /*lineasDeCodigo = new LineasDeCodigo(); 
        this.setVisible(false);
        lineasDeCodigo.setVisible(true);*/
        if(cmbLenguaje.getSelectedIndex() == 0)
            {
                   JOptionPane.showMessageDialog(null,"Lenguaje no escogido", "Error!",JOptionPane.YES_OPTION);
            }
        else{
            Principal.txtKLDC.setText(Float.toString(MLDC));
            Principal.txtKLDC1.setText(Float.toString(MLDC));
            Principal.txtKLDC2.setText(Float.toString(MLDC));
            this.setVisible(false);
        }
        
        
        
    }//GEN-LAST:event_btnFactorMedicionActionPerformed

    private void Entradas(){
        int opEntradas = 0,cEntradas;
            // Complejdad de las Entradas
            cEntradas = (Integer)(SpinnerEntrada.getValue());
            if(cmbEntradas.getSelectedIndex() == 1){opEntradas = 3;}
            else if(cmbEntradas.getSelectedIndex() == 2){opEntradas = 4;}
            else if(cmbEntradas.getSelectedIndex() == 3){opEntradas = 6;}
            tEntradas = cEntradas*opEntradas;
            txtEntradas.setText(Integer.toString(tEntradas));
            
             // Calculo de la Cuenta Total
            cuentaTotal = tEntradas+tSalidas+tConsultas+tArchivos+tInterface;
            txtTotal.setText(Integer.toString(cuentaTotal));
            
    }
    
    private void Salidas(){
        int cSalidas, opSalidas = 0;
        cSalidas = (Integer)(SpinnerSalida.getValue());
        //Complejidad de las Salidas
            if(cmbSalidas.getSelectedIndex() == 1){opSalidas = 4;}
            else if(cmbSalidas.getSelectedIndex() == 2){opSalidas = 5;}
            else if(cmbSalidas.getSelectedIndex() == 3){opSalidas = 7;}
            tSalidas = cSalidas*opSalidas;
            txtSalidas.setText(Integer.toString(tSalidas));
             // Calculo de la Cuenta Total
            cuentaTotal = tEntradas+tSalidas+tConsultas+tArchivos+tInterface;
            txtTotal.setText(Integer.toString(cuentaTotal));
        
    }
    
    private void Consultas(){
        int cConsultas, opConsultas = 0;
         cConsultas = (Integer)(SpinnerConsultas.getValue());
          //Complejidad de Consultas
            if(cmbConsultas.getSelectedIndex() == 1){opConsultas = 3;}
            else if(cmbConsultas.getSelectedIndex() == 2){opConsultas = 4;}
            else if(cmbConsultas.getSelectedIndex() == 3){opConsultas= 6;}
            tConsultas = cConsultas*opConsultas;
            txtConsultas.setText(Integer.toString(tConsultas));
             // Calculo de la Cuenta Total
            cuentaTotal = tEntradas+tSalidas+tConsultas+tArchivos+tInterface;
            txtTotal.setText(Integer.toString(cuentaTotal));
        
    }
    
    private void Archivos(){
        int cArchivos, opArchivos = 0;
        cArchivos = (Integer)(SpinnerArchivos.getValue());
         //Consulta de Archivos
            if(cmbArchivos.getSelectedIndex() == 1){opArchivos = 7;}
            else if(cmbArchivos.getSelectedIndex() == 2){opArchivos = 10;}
            else if(cmbArchivos.getSelectedIndex() == 3){opArchivos = 15;}
            tArchivos = cArchivos*opArchivos;
            txtArchivos.setText(Integer.toString(tArchivos)); 
             // Calculo de la Cuenta Total
            cuentaTotal = tEntradas+tSalidas+tConsultas+tArchivos+tInterface;
            txtTotal.setText(Integer.toString(cuentaTotal));
    }
    
    private void Interfaces(){
        int cInterface, opInterface = 0;
        cInterface = (Integer)(SpinnerInterfaces.getValue());
        //Consulta de Interface
            if(cmbInterfaces.getSelectedIndex() == 1){opInterface = 5;}
            else if(cmbInterfaces.getSelectedIndex() == 2){opInterface = 7;}
            else if(cmbInterfaces.getSelectedIndex() == 3){opInterface = 10;}
            tInterface = cInterface*opInterface;
            txtInterfaces.setText(Integer.toString(tInterface));
             // Calculo de la Cuenta Total
            cuentaTotal = tEntradas+tSalidas+tConsultas+tArchivos+tInterface;
            txtTotal.setText(Integer.toString(cuentaTotal));
        
    }
    
    private void cmbEntradasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEntradasItemStateChanged
            Entradas();
    }//GEN-LAST:event_cmbEntradasItemStateChanged

    private void SpinnerEntradaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerEntradaStateChanged
            Entradas();
    }//GEN-LAST:event_SpinnerEntradaStateChanged

    private void SpinnerSalidaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerSalidaStateChanged
            Salidas();
    }//GEN-LAST:event_SpinnerSalidaStateChanged

    private void cmbSalidasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSalidasItemStateChanged
            Salidas();
    }//GEN-LAST:event_cmbSalidasItemStateChanged

    private void SpinnerConsultasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerConsultasStateChanged
            Consultas();
    }//GEN-LAST:event_SpinnerConsultasStateChanged

    private void cmbConsultasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbConsultasItemStateChanged
            Consultas();
    }//GEN-LAST:event_cmbConsultasItemStateChanged

    private void SpinnerArchivosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerArchivosStateChanged
            Archivos();
    }//GEN-LAST:event_SpinnerArchivosStateChanged

    private void cmbArchivosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbArchivosItemStateChanged
            Archivos();
    }//GEN-LAST:event_cmbArchivosItemStateChanged

    private void SpinnerInterfacesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerInterfacesStateChanged
            Interfaces();
    }//GEN-LAST:event_SpinnerInterfacesStateChanged

    private void cmbInterfacesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbInterfacesItemStateChanged
            Interfaces();
    }//GEN-LAST:event_cmbInterfacesItemStateChanged

    private void cmbLenguajeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbLenguajeItemStateChanged

        if(cmbLenguaje.getSelectedIndex()==1){
             LDC = FactorPonderacion.cuentaTotal * 53; MLDC = LDC/1000;
            txtLDC.setText(Float.toString(LDC));
        }
        else if(cmbLenguaje.getSelectedIndex()==2){
            LDC =FactorPonderacion.cuentaTotal * 29; MLDC = LDC/1000;
            txtLDC.setText(Float.toString(LDC));
        }
        else if(cmbLenguaje.getSelectedIndex()==3){
            LDC = FactorPonderacion.cuentaTotal * 32; MLDC = LDC/1000;
            txtLDC.setText(Float.toString(LDC));
        }
        else if(cmbLenguaje.getSelectedIndex()==4){
            LDC = FactorPonderacion.cuentaTotal * 29; MLDC = LDC/1000;
            txtLDC.setText(Float.toString(LDC));
        }
    }//GEN-LAST:event_cmbLenguajeItemStateChanged
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FactorPonderacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FactorPonderacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FactorPonderacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FactorPonderacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FactorPonderacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpinnerArchivos;
    private javax.swing.JSpinner SpinnerConsultas;
    private javax.swing.JSpinner SpinnerEntrada;
    private javax.swing.JSpinner SpinnerInterfaces;
    private javax.swing.JSpinner SpinnerSalida;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnFactorMedicion;
    private javax.swing.JComboBox cmbArchivos;
    private javax.swing.JComboBox cmbConsultas;
    private javax.swing.JComboBox cmbEntradas;
    private javax.swing.JComboBox cmbInterfaces;
    private javax.swing.JComboBox cmbLenguaje;
    private javax.swing.JComboBox cmbSalidas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblArchivos1;
    private javax.swing.JLabel lblConsultas1;
    private javax.swing.JLabel lblCuenta1;
    private javax.swing.JLabel lblEntradas1;
    private javax.swing.JLabel lblFactor;
    private javax.swing.JLabel lblInterfaces1;
    private javax.swing.JLabel lblParametros1;
    private javax.swing.JLabel lblSalidas1;
    private javax.swing.JPanel panelFactor;
    private javax.swing.JTextField txtArchivos;
    private javax.swing.JTextField txtConsultas;
    private javax.swing.JTextField txtEntradas;
    private javax.swing.JTextField txtInterfaces;
    private javax.swing.JTextField txtLDC;
    private javax.swing.JTextField txtSalidas;
    public static javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
