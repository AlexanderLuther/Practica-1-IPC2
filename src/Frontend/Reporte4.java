package Frontend;

import Backend.Estudiante;
import Backend.ManejadorArchivosBinarios;
import Backend.Prestamo;
import java.util.ArrayList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;


/**
 *
 * @author bryan
 */
public class Reporte4 extends javax.swing.JDialog {
    private Estudiante estudiante;
    private List<Prestamo> listadoPrestamo;
    private ObservableList<Prestamo> observableList;
    private ManejadorArchivosBinarios<Prestamo> archivoPrestamo;
    private ManejadorArchivosBinarios<Estudiante> archivoEstudiante;
    
    /**
     * Creates new form ReportePrestamoHecho
     */
    public Reporte4(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.archivoEstudiante = new ManejadorArchivosBinarios<>();
        this.archivoPrestamo = new ManejadorArchivosBinarios<>();
        this.listadoPrestamo = new ArrayList<>();
        this.observableList = ObservableCollections.observableList(listadoPrestamo);
        initComponents();
        this.lblValidacion.setVisible(false);
        this.lblValidacion2.setVisible(false);
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
    
    public void actualizarObservableList(List<Prestamo> prestamoListObservable) {
        this.observableList.clear();
        this.observableList.addAll(prestamoListObservable);
    }
    
    /*
    Metodo encargado de limpiar los campos de texto
    */
    public void limpiar(){
        observableList.clear();
        txtCarnet.setText(null);
        txtEstudiante.setText(null);
         lblValidacion.setVisible(false);
        lblValidacion2.setVisible(false);
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
        tabla = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblEstudiante = new javax.swing.JLabel();
        lblValidacion = new javax.swing.JLabel();
        txtCarnet = new javax.swing.JTextField();
        txtEstudiante = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        lblValidacion2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabla.setForeground(new java.awt.Color(0, 153, 153));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${observableList}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, tabla);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${carne}"));
        columnBinding.setColumnName("Carne");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoPrestamo}"));
        columnBinding.setColumnName("Codigo Prestamo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigolibro}"));
        columnBinding.setColumnName("Codigolibro");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fechaLimite}"));
        columnBinding.setColumnName("Fecha Limite");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fechaPrestamo}"));
        columnBinding.setColumnName("Fecha Prestamo");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tabla);

        lblTitulo.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblTitulo.setText("Prestamos Realizados");

        jLabel1.setText("Carnet:*");

        lblEstudiante.setText("Estudiante:");

        lblValidacion.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        lblValidacion.setForeground(new java.awt.Color(255, 0, 0));
        lblValidacion.setText("El campo esta vacio.");

        txtCarnet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCarnetKeyTyped(evt);
            }
        });

        txtEstudiante.setEditable(false);

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        lblValidacion2.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        lblValidacion2.setForeground(new java.awt.Color(253, 9, 5));
        lblValidacion2.setText("El carnet no esta registrado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEstudiante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstudiante))
                    .addComponent(lblTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCarnet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValidacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblValidacion2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstudiante)
                    .addComponent(txtEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValidacion)
                    .addComponent(lblValidacion2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCarnetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCarnetKeyTyped
      /*  // TODO add your handling code here:
        char value = evt.getKeyChar();
        if (value <'0' || value >'9') evt.consume();*/
    }//GEN-LAST:event_txtCarnetKeyTyped

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        if (txtCarnet.getText().isEmpty()) {
            lblValidacion.setVisible(true);
        } else {
            estudiante = archivoEstudiante.leerArchivo("ESTUDIANTE", txtCarnet.getText(), ".est");
            if (estudiante == null) {
                lblValidacion2.setVisible(true);
            } else {
                txtEstudiante.setText(estudiante.getNombre());
                actualizarObservableList(estudiante.getHistorialPrestamos());
            }
        }
        lblValidacion.setVisible(false);
        lblValidacion2.setVisible(false);
    }//GEN-LAST:event_botonBuscarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEstudiante;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValidacion;
    private javax.swing.JLabel lblValidacion2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtEstudiante;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
