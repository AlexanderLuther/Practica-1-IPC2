package Frontend;

import Backend.ManejadorArchivosBinarios;
import Backend.ManejadorBusqueda;
import Backend.ManejadorFechas;
import Backend.Prestamo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;

public class Reporte3 extends javax.swing.JDialog {
   
    //Instancias utilizadas para llenar la tabla aplicando Beans Binding
    private List<Prestamo> listadoPrestamo;
    private ObservableList<Prestamo> observableList;
    
    //Instancias de la clase
    private ManejadorArchivosBinarios<Prestamo> archivoPrestamo;
    private ManejadorFechas manejadorFechas = new ManejadorFechas();
    private ManejadorBusqueda busqueda = new ManejadorBusqueda();
    private Date fechaInicial;
    private Date fechaFinal;
    

    
    public Reporte3(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.archivoPrestamo = new ManejadorArchivosBinarios<>();
        this.listadoPrestamo = new ArrayList<>();
        this.observableList = ObservableCollections.observableList(listadoPrestamo);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /*
    Metodos utilizados para llenar la tabla aplicando Beans Bindings
    */
    public List<Prestamo> getListadoPrestamo() {
        return listadoPrestamo;
    }

    public void setListadoPrestamo(List<Prestamo> listadoPrestamo) {
        this.listadoPrestamo = listadoPrestamo;
    }

    public ObservableList<Prestamo> getObservableList() {
        return observableList;
    }

    public void setObservableList(ObservableList<Prestamo> observableList) {
        this.observableList = observableList;
    }
    
    public void actualizarObservableList(List<Prestamo> prestamoListObservable) {
        this.observableList.clear();
        this.observableList.addAll(prestamoListObservable);
    }
    
    /*
    Metodo encargado de limpiar los campos de texto
    */
    public void limpiar(){
        observableList.clear();
        listadoPrestamo.clear();
        etiquetaCuotaTotal.setText(null);
        etiquetaMoraTotal.setText(null);
        etiquetaTotal.setText(null);
        etiquetaFechaFinal.setText(null);
        etiquetaFechaInicial.setText(null);
    }
    
    public void solicitarIntervaloTiempo(){
        alerta.setVisible(false);
        selectorFechas.setVisible(true);
        selectorFechas.setLocationRelativeTo(this);
    }
    
    
    public void llenarCamposCantidad(){
        etiquetaCuotaTotal.setText("Q" + String.valueOf(busqueda.devolverCuotaTotal(listadoPrestamo)));
        etiquetaMoraTotal.setText("Q" + String.valueOf(busqueda.devolverMoraTotal(listadoPrestamo)));
        etiquetaTotal.setText("Q" + String.valueOf(busqueda.devolverTotal()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        selectorFechas = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFecha1 = new javax.swing.JLabel();
        selectorFechaInicio = new rojeru_san.componentes.RSDateChooser();
        selectorFechaFin = new rojeru_san.componentes.RSDateChooser();
        jPanel2 = new javax.swing.JPanel();
        botonAceptar1 = new rojerusan.RSButtonIconI();
        sinIntervalo = new rojerusan.RSButtonIconI();
        jPanel3 = new javax.swing.JPanel();
        alerta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        etiquetaCuotaTotal = new javax.swing.JLabel();
        etiquetaMoraTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        etiquetaFechaInicial = new javax.swing.JLabel();
        etiquetaFechaFinal = new javax.swing.JLabel();

        selectorFechas.setTitle("Establecer Intervalo de Tiempo");
        selectorFechas.setMinimumSize(new java.awt.Dimension(472, 230));
        selectorFechas.setPreferredSize(new java.awt.Dimension(472, 230));
        selectorFechas.setResizable(false);
        selectorFechas.getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(472, 200));

        etiquetaFecha.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        etiquetaFecha.setForeground(new java.awt.Color(0, 153, 153));
        etiquetaFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaFecha.setText("Fecha Inicial:");
        etiquetaFecha.setToolTipText("");

        etiquetaFecha1.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        etiquetaFecha1.setForeground(new java.awt.Color(0, 153, 153));
        etiquetaFecha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaFecha1.setText("Fecha Final:");
        etiquetaFecha1.setToolTipText("");

        selectorFechaInicio.setColorBackground(new java.awt.Color(0, 153, 153));

        selectorFechaFin.setColorBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        botonAceptar1.setBackground(new java.awt.Color(204, 204, 204));
        botonAceptar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        botonAceptar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comprobar.png"))); // NOI18N
        botonAceptar1.setText("    ACEPTAR");
        botonAceptar1.setColorHover(new java.awt.Color(0, 204, 0));
        botonAceptar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptar1ActionPerformed(evt);
            }
        });

        sinIntervalo.setBackground(new java.awt.Color(204, 204, 204));
        sinIntervalo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        sinIntervalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        sinIntervalo.setText("Sin Intervalo");
        sinIntervalo.setColorHover(new java.awt.Color(255, 0, 0));
        sinIntervalo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        sinIntervalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinIntervaloActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        alerta.setBackground(new java.awt.Color(255, 255, 255));
        alerta.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        alerta.setForeground(new java.awt.Color(255, 0, 0));
        alerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alerta.setText("Se deben llenar todos los campos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(alerta, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(alerta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(botonAceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sinIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sinIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(etiquetaFecha))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(etiquetaFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectorFechaFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectorFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectorFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectorFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        selectorFechas.getContentPane().add(jPanel1, gridBagConstraints);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabla.setForeground(new java.awt.Color(0, 153, 153));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${observableList}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, tabla);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoPrestamo}"));
        columnBinding.setColumnName("Codigo Prestamo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${carne}"));
        columnBinding.setColumnName("Carne");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigolibro}"));
        columnBinding.setColumnName("Codigolibro");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fechaLimite}"));
        columnBinding.setColumnName("Fecha Limite");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fechaPrestamo}"));
        columnBinding.setColumnName("Fecha Prestamo");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cantidadCuota}"));
        columnBinding.setColumnName("Cuota");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cantidadMora}"));
        columnBinding.setColumnName("Mora");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tabla);

        lblTitulo.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblTitulo.setText("Prestamos Devueltos");

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Cuota Total:");

        etiquetaCuotaTotal.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        etiquetaCuotaTotal.setForeground(new java.awt.Color(0, 153, 153));

        etiquetaMoraTotal.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        etiquetaMoraTotal.setForeground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Mora Total:");

        etiquetaTotal.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        etiquetaTotal.setForeground(new java.awt.Color(0, 153, 153));

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Total:");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Fecha Inicial:");

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Fecha Final:");

        etiquetaFechaInicial.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        etiquetaFechaInicial.setForeground(new java.awt.Color(0, 153, 153));

        etiquetaFechaFinal.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        etiquetaFechaFinal.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitulo)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiquetaCuotaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etiquetaMoraTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiquetaFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(etiquetaFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(111, 111, 111))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaCuotaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaMoraTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(etiquetaTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sinIntervaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinIntervaloActionPerformed
        this.limpiar();
        listadoPrestamo = busqueda.busquedaPrestamosFinalizados(archivoPrestamo.leerListaArchivos(".pre"));
        this.actualizarObservableList(listadoPrestamo);
        this.llenarCamposCantidad();
        selectorFechas.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_sinIntervaloActionPerformed

    private void botonAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptar1ActionPerformed
        try{
            fechaInicial = selectorFechaInicio.getDatoFecha();
            fechaFinal = selectorFechaFin.getDatoFecha();
            if(fechaFinal.equals(null) || fechaInicial.equals(null)){
                alerta.setVisible(true);
            }
            else{
                listadoPrestamo = busqueda.busquedaPrestamosFinalizadosIntervaloTiempo(archivoPrestamo.leerListaArchivos(".pre"), fechaInicial, fechaFinal);
                this.actualizarObservableList(listadoPrestamo);
                this.llenarCamposCantidad();
                etiquetaFechaInicial.setText(manejadorFechas.darFormatoFecha(fechaInicial));
                etiquetaFechaFinal.setText(manejadorFechas.darFormatoFecha(fechaFinal));
                selectorFechas.setVisible(false);
                this.setVisible(true);
            }
        }
        catch(NullPointerException e){
            System.out.println("Alerta");
            alerta.setVisible(true);
        }
    }//GEN-LAST:event_botonAceptar1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alerta;
    private rojerusan.RSButtonIconI botonAceptar1;
    private javax.swing.JLabel etiquetaCuotaTotal;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaFecha1;
    private javax.swing.JLabel etiquetaFechaFinal;
    private javax.swing.JLabel etiquetaFechaInicial;
    private javax.swing.JLabel etiquetaMoraTotal;
    private javax.swing.JLabel etiquetaTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private rojeru_san.componentes.RSDateChooser selectorFechaFin;
    private rojeru_san.componentes.RSDateChooser selectorFechaInicio;
    private javax.swing.JDialog selectorFechas;
    private rojerusan.RSButtonIconI sinIntervalo;
    private javax.swing.JTable tabla;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
