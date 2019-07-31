package Frontend;

import Backend.ManejadorArchivosBinarios;
import Backend.ManejadorBusqueda;
import Backend.Prestamo;
import java.util.ArrayList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;


/**
 *
 * @author bryan
 */
public class Reporte2 extends javax.swing.JDialog {
    
    //Instancias utilizadas para llenar la tabla aplicando Beans Binding
    private List<Prestamo> listadoPrestamo;
    private ObservableList<Prestamo> observableList;
    
    //Instancias de la clase
    private ManejadorArchivosBinarios<Prestamo> archivoPrestamo;
    private ManejadorBusqueda busqueda = new ManejadorBusqueda();
    
    /**
     * Creates new form ReportePrestamoHecho
     */
    public Reporte2(java.awt.Frame parent, boolean modal) {
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
    }
    
    /*
    Metodo encargado de inicializar la lista con la cual se llenara la tabla
    */
    public void llenarTabla(){
        listadoPrestamo = busqueda.busquedaPrestamosMorosos(archivoPrestamo.leerListaArchivos(".pre"));
        actualizarObservableList(listadoPrestamo); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();

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
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tabla);

        lblTitulo.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblTitulo.setText("Prestamos Morosos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tabla;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
