/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import Backend.Estudiante;
import Backend.ManejadorArchivosBinarios;
import Backend.Prestamo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;

/**
 *
 * @author bryan
 */
public class ReportePrestamoActuales extends javax.swing.JDialog {
    private Estudiante estudiante;
    private List<Prestamo> listadoPrestamo;
    private ObservableList<Prestamo> observableList;
    private ManejadorArchivosBinarios<Estudiante> archivosEstudiante;
    private ManejadorArchivosBinarios<Prestamo> archivosPrestamo;
    
    /**
     * Creates new form ReportePrestamosActuales
     */
    public ReportePrestamoActuales(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.listadoPrestamo = new ArrayList<>();
        this.observableList = ObservableCollections.observableList(listadoPrestamo);
        this.archivosEstudiante = new ManejadorArchivosBinarios<>();
        this.archivosPrestamo = new ManejadorArchivosBinarios<>();
        initComponents();
        lblValidacionCampo.setVisible(false);
        lblValidacionRegistro.setVisible(false);
        this.setLocationRelativeTo(null);
    }

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

    public void actualizarListado(List<Prestamo> list){
        this.observableList.clear();
        this.observableList.addAll(list);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblCarnet = new javax.swing.JLabel();
        lblPrestamosActuales = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCarnet = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        txtEstudiante = new javax.swing.JTextField();
        lblValidacionCampo = new javax.swing.JLabel();
        lblValidacionRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${observableList}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${carne}"));
        columnBinding.setColumnName("Carne");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoPrestamo}"));
        columnBinding.setColumnName("Codigo Prestamo");
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
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTable1);

        lblCarnet.setText("Carnet*:");

        lblPrestamosActuales.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        lblPrestamosActuales.setText("Prestamos Actuales");

        jLabel1.setText("Estudiante:");

        txtCarnet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCarnetKeyTyped(evt);
            }
        });

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        txtEstudiante.setEditable(false);

        lblValidacionCampo.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        lblValidacionCampo.setForeground(new java.awt.Color(255, 0, 3));
        lblValidacionCampo.setText("El campo esta vacio");

        lblValidacionRegistro.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        lblValidacionRegistro.setForeground(new java.awt.Color(255, 0, 0));
        lblValidacionRegistro.setText("El estudiante no esta registrado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCarnet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCarnet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPrestamosActuales)
                                .addGap(0, 35, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstudiante)))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValidacionCampo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblValidacionRegistro)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPrestamosActuales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarnet)
                    .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValidacionCampo)
                    .addComponent(lblValidacionRegistro))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCarnetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCarnetKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if (value <'0' || value >'9') evt.consume();
    }//GEN-LAST:event_txtCarnetKeyTyped

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        if (txtCarnet.getText().isEmpty()) {
            lblValidacionCampo.setVisible(true);
        } else {
            estudiante = archivosEstudiante.leerArchivo("ESTUDIANTE", txtCarnet.getText(), ".est");
            if (estudiante == null) {
                lblValidacionRegistro.setVisible(true);
            } else {
                txtEstudiante.setText(estudiante.getNombre());
                actualizarListado(estudiante.getPrestamosActuales());
                if (estudiante.getPrestamosActuales().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "El estudiante no tiene libros prestados actualmente.");
                }
            }
        }
        lblValidacionCampo.setVisible(false);
        lblValidacionRegistro.setVisible(false);
    }//GEN-LAST:event_botonBuscarActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCarnet;
    private javax.swing.JLabel lblPrestamosActuales;
    private javax.swing.JLabel lblValidacionCampo;
    private javax.swing.JLabel lblValidacionRegistro;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtEstudiante;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
