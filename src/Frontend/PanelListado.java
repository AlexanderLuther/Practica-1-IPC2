package Frontend;

import Backend.Estudiante;
import Backend.Libro;
import Backend.ManejadorArchivosBinarios;
import Backend.ManejadorBusqueda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;

public class PanelListado extends javax.swing.JPanel {

     //Instancias utilizadas para llenar la tabla de estudiantes utilizando Beans binding
    private List<Estudiante> listadoEstudiantes = new ArrayList<>();
    private ObservableList<Estudiante> observableListEstudiantes = ObservableCollections.observableList(listadoEstudiantes);
    private ManejadorArchivosBinarios<Estudiante> manejadorArchivoEstudiante = new ManejadorArchivosBinarios<>();
    
    //Instancias utilizadas para llenar la tabla de libros utilizando Beans binding
    private List<Libro> listadoLibros = new ArrayList<>();
    private ObservableList<Libro> observableListLibros = ObservableCollections.observableList(listadoLibros);
    private ManejadorArchivosBinarios<Libro> manejadorArchivoLibro = new ManejadorArchivosBinarios<>();
    
    //Variables e instancias usadas por la clase.
    private ManejadorBusqueda manejadorBusqueda = new ManejadorBusqueda();
    private List<Libro> listadoLibrosFiltrados = new ArrayList<>();
    private List<Estudiante> listadoEstudiantesFiltrados = new ArrayList<>();
    private Libro libro;
    private String libroBusqueda;
    private String estudianteBusqueda;
    private int indice;
    
     public PanelListado() {
        initComponents();
    }

    //Metodos utilizados para la tabla de estudiantes utilizando Beans binding
    public List<Estudiante> getListadoEstudiante() {
        return listadoEstudiantes;
    }

    public void setListadoEstudiante(List<Estudiante> listadoEstudiantes) {
        this.listadoEstudiantes = listadoEstudiantes;
    }

    public ObservableList<Estudiante> getObservableListEstudiantes() {
        return observableListEstudiantes;
    }

    public void setObservableList(ObservableList<Estudiante> observableList) {
        this.observableListEstudiantes = observableList;
    }
    
    public void actualizarObservableListEstudiantes(List<Estudiante> estudiantesListObservable) {
        this.observableListEstudiantes.clear();
        this.observableListEstudiantes.addAll(estudiantesListObservable);
    }
    
    //Metodos utilizados para la tabla de libros utilizando Beans binding
    public List<Libro> getListadoLibro() {
        return listadoLibros;
    }

    public void setListadoLibro(List<Libro> listadoLibros) {
        this.listadoLibros = listadoLibros;
    }

    public ObservableList<Libro> getObservableListLibros() {
        return observableListLibros;
    }

    public void setObservableListLibros(ObservableList<Libro> observableList) {
        this.observableListLibros = observableList;
    }
    
    public void actualizarObservableListLibros(List<Libro> librosListObservable) {
        this.observableListLibros.clear();
        this.observableListLibros.addAll(librosListObservable);
    }
    
    
    /*
    Metodo encargado de obtener la lista de estudiantes con la cual llenar la tabla 
    correspondiente.
    */
    public void llenarTablaEstudiantesCompletos(){
        listadoEstudiantes = manejadorArchivoEstudiante.leerListaArchivos(".est");
        Collections.sort(listadoEstudiantes);
        actualizarObservableListEstudiantes(listadoEstudiantes);    
    }
    
    /*
    Metodo encargado de obtener la lista de libros con la cual llenar la tabla 
    correspondiente.
    */
    public void llenarTablaLibrosCompletos(){
        listadoLibros = manejadorArchivoLibro.leerListaArchivos("lib");
        Collections.sort(listadoLibros);
        actualizarObservableListLibros(listadoLibros);
    }
    
    /*
    Metodo encargado de obtener la lista filtrada de libros con la cual llenar 
    la tabla correspondiente.
    */
    private void llenarTablaLibrosFiltrados(List libros){
        Collections.sort(libros);
        actualizarObservableListLibros(libros);
    }
    
    /*
    Metodo encargado de obtener la lista filtrada de estudiantes con la cual llenar
    la tabla correspondiente.
    */
    private void llenarTablaEstudiantesFiltrados(List estudiantes){
        Collections.sort(estudiantes);
        actualizarObservableListEstudiantes(estudiantes);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel4 = new javax.swing.JPanel();
        grupoLibros = new javax.swing.ButtonGroup();
        grupoEstudiantes = new javax.swing.ButtonGroup();
        dialogoCopias = new javax.swing.JDialog();
        textoCopias = new rojeru_san.RSMTextFull();
        botonAceptar = new rojerusan.RSButtonIconI();
        etiquetaMensaje = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        textoBusquedaLibros = new rojeru_san.RSMTextFull();
        botonBuscarLibros = new rojerusan.RSButtonIconI();
        botonModificar = new rojeru_san.RSButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaLibros = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        botonBuscarEstudiantes = new rojerusan.RSButtonIconI();
        textoBusquedaEstudiantes = new rojeru_san.RSMTextFull();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiantes = new javax.swing.JTable();

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        dialogoCopias.setTitle("Modificar Copias");
        dialogoCopias.setMinimumSize(new java.awt.Dimension(384, 189));
        dialogoCopias.setResizable(false);

        textoCopias.setPlaceholder("Ingrese la nueva cantidad de copias...");
        textoCopias.setSoloNumeros(true);

        botonAceptar.setBackground(new java.awt.Color(204, 204, 204));
        botonAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        botonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comprobar.png"))); // NOI18N
        botonAceptar.setText("ACEPTAR");
        botonAceptar.setColorHover(new java.awt.Color(0, 204, 0));
        botonAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        etiquetaMensaje.setForeground(new java.awt.Color(255, 0, 0));
        etiquetaMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaMensaje.setText("No se indico ninguna cantidad");

        javax.swing.GroupLayout dialogoCopiasLayout = new javax.swing.GroupLayout(dialogoCopias.getContentPane());
        dialogoCopias.getContentPane().setLayout(dialogoCopiasLayout);
        dialogoCopiasLayout.setHorizontalGroup(
            dialogoCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoCopiasLayout.createSequentialGroup()
                .addGroup(dialogoCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoCopiasLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(textoCopias, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogoCopiasLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoCopiasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(etiquetaMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dialogoCopiasLayout.setVerticalGroup(
            dialogoCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoCopiasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(textoCopias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaMensaje)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("LISTADO DE LIBROS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 264, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        textoBusquedaLibros.setPlaceholder("Buscar Libro...");

        botonBuscarLibros.setBackground(new java.awt.Color(204, 204, 204));
        botonBuscarLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        botonBuscarLibros.setBorderPainted(false);
        botonBuscarLibros.setColorHover(new java.awt.Color(0, 153, 153));
        botonBuscarLibros.setHideActionText(true);
        botonBuscarLibros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonBuscarLibros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonBuscarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarLibrosActionPerformed(evt);
            }
        });

        botonModificar.setBackground(new java.awt.Color(153, 153, 153));
        botonModificar.setForeground(new java.awt.Color(0, 153, 153));
        botonModificar.setText("Modificar");
        botonModificar.setColorHover(new java.awt.Color(0, 153, 153));
        botonModificar.setFont(new java.awt.Font("Roboto Bold", 1, 10)); // NOI18N
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonBuscarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoBusquedaLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoBusquedaLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.ipady = -26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 115, 0, 0);
        jPanel1.add(jPanel5, gridBagConstraints);

        tablaLibros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tablaLibros.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        tablaLibros.setForeground(new java.awt.Color(0, 153, 153));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${observableListLibros}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, tablaLibros);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${titulo}"));
        columnBinding.setColumnName("Titulo");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${autor}"));
        columnBinding.setColumnName("Autor");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${editorial}"));
        columnBinding.setColumnName("Editorial");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cantidadCopias}"));
        columnBinding.setColumnName("Copias");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fechaPublicacion}"));
        columnBinding.setColumnName("Publicacion");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(tablaLibros);
        if (tablaLibros.getColumnModel().getColumnCount() > 0) {
            tablaLibros.getColumnModel().getColumn(0).setPreferredWidth(250);
            tablaLibros.getColumnModel().getColumn(1).setPreferredWidth(200);
            tablaLibros.getColumnModel().getColumn(2).setPreferredWidth(75);
            tablaLibros.getColumnModel().getColumn(3).setPreferredWidth(150);
            tablaLibros.getColumnModel().getColumn(4).setPreferredWidth(60);
            tablaLibros.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 607;
        gridBagConstraints.ipady = 250;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 61, 89, 60);
        jPanel1.add(jScrollPane2, gridBagConstraints);

        add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("LISTADO DE ESTUDIANTES");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 260, 0, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        botonBuscarEstudiantes.setBackground(new java.awt.Color(204, 204, 204));
        botonBuscarEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        botonBuscarEstudiantes.setBorderPainted(false);
        botonBuscarEstudiantes.setColorHover(new java.awt.Color(0, 153, 153));
        botonBuscarEstudiantes.setHideActionText(true);
        botonBuscarEstudiantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonBuscarEstudiantes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonBuscarEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarEstudiantesActionPerformed(evt);
            }
        });

        textoBusquedaEstudiantes.setPlaceholder("Buscar Estudiante...");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(botonBuscarEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoBusquedaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonBuscarEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoBusquedaEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 130, 0, 0);
        jPanel2.add(jPanel6, gridBagConstraints);

        tablaEstudiantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tablaEstudiantes.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        tablaEstudiantes.setForeground(new java.awt.Color(0, 153, 153));

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${observableListEstudiantes}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, tablaEstudiantes);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${carne}"));
        columnBinding.setColumnName("Carne");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoCarrera}"));
        columnBinding.setColumnName("Codigo Carrera");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fechaNacimiento}"));
        columnBinding.setColumnName("Fecha Nacimiento");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tablaEstudiantes);
        if (tablaEstudiantes.getColumnModel().getColumnCount() > 0) {
            tablaEstudiantes.getColumnModel().getColumn(0).setResizable(false);
            tablaEstudiantes.getColumnModel().getColumn(0).setPreferredWidth(300);
            tablaEstudiantes.getColumnModel().getColumn(1).setResizable(false);
            tablaEstudiantes.getColumnModel().getColumn(1).setPreferredWidth(100);
            tablaEstudiantes.getColumnModel().getColumn(2).setPreferredWidth(100);
            tablaEstudiantes.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 633;
        gridBagConstraints.ipady = 279;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 47, 83, 46);
        jPanel2.add(jScrollPane1, gridBagConstraints);

        add(jPanel2);

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents
    /*
    Metodo encargado de realizar una busqueda en los elementos de la lista y refrescar la tabla con 
    los elementos encontrados.
    */
    private void botonBuscarEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarEstudiantesActionPerformed
        if(textoBusquedaEstudiantes.getText().isEmpty()){
            this.llenarTablaEstudiantesCompletos();
        }
        else{
            listadoEstudiantesFiltrados.clear();
            estudianteBusqueda = textoBusquedaEstudiantes.getText();   
            listadoEstudiantesFiltrados = manejadorBusqueda.busquedaEstudiante(listadoEstudiantes, estudianteBusqueda);
            this.llenarTablaEstudiantesFiltrados(listadoEstudiantesFiltrados);
        }
    }//GEN-LAST:event_botonBuscarEstudiantesActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        indice = tablaLibros.getSelectedRow();
        if(indice == -1){
        JOptionPane.showMessageDialog(this, "No se selecciono ningun libro");
    }
    else{
        if(listadoLibros.isEmpty()){
            libro = listadoLibrosFiltrados.get(indice);
        }
        else{
            libro = listadoLibros.get(indice);
        }
        etiquetaMensaje.setVisible(false);
        dialogoCopias.setLocationRelativeTo(null);
        dialogoCopias.setVisible(true);
    }    
    }//GEN-LAST:event_botonModificarActionPerformed
    /*
    Metodo encargado de realizar una busqueda en los elementos de la lista y refrescar la tabla con 
    los elementos encontrados.
    */
    private void botonBuscarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarLibrosActionPerformed
        if(textoBusquedaLibros.getText().isEmpty()){
            this.llenarTablaLibrosCompletos();
        }
        else{
            listadoLibrosFiltrados.clear();
            libroBusqueda = textoBusquedaLibros.getText();   
            listadoLibrosFiltrados = manejadorBusqueda.busquedaLibro(listadoLibros, libroBusqueda);
            this.llenarTablaLibrosFiltrados(listadoLibrosFiltrados);
            listadoLibros.clear();
        }
    }//GEN-LAST:event_botonBuscarLibrosActionPerformed
    /*
    Metodo encargado de obtener la cantidad de copias y reescribir el objeto correspondiente.
    Por ultimo limpia el area de texto y manda a actualizar la lista enlazada a la tabla de 
    libros.
    */
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        if(textoCopias.getText().isEmpty()){
            etiquetaMensaje.setVisible(true);
        }
        else{
            libro.setCantidadCopias(Integer.parseInt(textoCopias.getText()));
            manejadorArchivoLibro.crearArchivo(libro, "LIBRO", libro.getCodigo(), ".lib");
            dialogoCopias.setVisible(false);
            textoCopias.setText(null);
            JOptionPane.showMessageDialog(this, "Cantidad de Copias Modificada Exitosamente");
            etiquetaMensaje.setVisible(false);
            if(listadoLibros.isEmpty()){
                llenarTablaLibrosFiltrados(listadoLibrosFiltrados);
            }
            else{
                llenarTablaLibrosCompletos();
            }
        }
    }//GEN-LAST:event_botonAceptarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonIconI botonAceptar;
    private rojerusan.RSButtonIconI botonBuscarEstudiantes;
    private rojerusan.RSButtonIconI botonBuscarLibros;
    private rojeru_san.RSButton botonModificar;
    private javax.swing.JDialog dialogoCopias;
    private javax.swing.JLabel etiquetaMensaje;
    private javax.swing.ButtonGroup grupoEstudiantes;
    private javax.swing.ButtonGroup grupoLibros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaEstudiantes;
    private javax.swing.JTable tablaLibros;
    private rojeru_san.RSMTextFull textoBusquedaEstudiantes;
    private rojeru_san.RSMTextFull textoBusquedaLibros;
    private rojeru_san.RSMTextFull textoCopias;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
