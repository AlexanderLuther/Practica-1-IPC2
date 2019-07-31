package Frontend;

import Backend.ManejadorArchivosBinarios;
import Backend.ManejadorBusqueda;
import Backend.Prestamo;
import java.util.ArrayList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;



public class Reporte1 extends javax.swing.JDialog {

    //Instancias utilizadas para llenar la tabla utilizando Beans Binding
    private List<Prestamo> listadoPrestamo = new ArrayList<>();
    private ObservableList<Prestamo> observableList = ObservableCollections.observableList(listadoPrestamo);
    
    //Varaibles e instancias de la clase
    private ManejadorArchivosBinarios<Prestamo> manejadorArchivoPrestamo = new ManejadorArchivosBinarios<>();
    private ManejadorBusqueda manejadorBusqueda = new ManejadorBusqueda();
    
    
    /*
     //Metodos utilizados para llenar la tabla  utilizando Beans binding
    */
    public Reporte1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
    
    public void llenarTabla(){
        listadoPrestamo = manejadorArchivoPrestamo.leerListaArchivos(".pre");
        actualizarObservableList(manejadorBusqueda.busquedaPrestamo(listadoPrestamo));
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        mostardorFechaActual = new rojeru_san.RSLabelFecha();
        etiquetaNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Prestamos a entregar hoy");

        tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tabla.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
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
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(tabla);

        etiquetaNombre.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        etiquetaNombre.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaNombre.setText("Fecha Actual:");
        etiquetaNombre.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaNombre)
                        .addGap(18, 18, 18)
                        .addComponent(mostardorFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostardorFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Reporte1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Reporte1 dialog = new Reporte1(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JScrollPane jScrollPane2;
    private rojeru_san.RSLabelFecha mostardorFechaActual;
    private javax.swing.JTable tabla;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
