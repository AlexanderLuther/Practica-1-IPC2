package Frontend;

import Backend.Estudiante;
import Backend.Libro;
import Backend.ManejadorArchivosBinarios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class PanelListado extends javax.swing.JPanel {

    //Variables e instancias usadas por la clase
    private ManejadorArchivosBinarios manejadorArchivos = new ManejadorArchivosBinarios();
    private List <Estudiante> listadoEstudiantes = new ArrayList<>();
    private List <Libro> listadoLibros = new ArrayList<>();
    private String busquedaLibros;
    private String busquedaEstudiantes;
    private String libroModificar;
    private int nuevaCantidadCopias;
    private Libro libro;
    
    public PanelListado() {
        initComponents();
    }
    
    /*
    Metodo encargado de obtener el listado de libros almacenados en la base de datos,
    ordena de menor a mayor segun el codigo de los libros y crea el listado en el 
    JComboBox.
    */
    public void llenarListaLibros(){
        listadoLibros = manejadorArchivos.leerListaArchivos(".lib");
        Collections.sort(listadoLibros);
        for(int i = 0; i < listadoLibros.size(); i++){
            selectorLibros.addItem(listadoLibros.get(i).getTitulo());
        }
    }
    
    /*
    Metodo encargado de obtener el listado de estudiantes almacenados en la base de datos,
    ordena de menor a mayor segun el carne de los estudiantes y crea el listado en el 
    JComboBox.
    */
    public void llenarListaEstudiantes(){
        listadoEstudiantes = manejadorArchivos.leerListaArchivos(".est");
        Collections.sort(listadoEstudiantes);
        for(int i = 0; i < listadoEstudiantes.size(); i++){
            selectorEstudiantes.addItem(listadoEstudiantes.get(i).getNombre());
        }
    }
    
    /*
    Metodo encargado de limpiar el JComboBox de libros
    */
    public void limpiarListaLibros(){
        selectorLibros.removeAllItems();
    }
    
    /*
    Metodo encargado de limpiar el JComboBox de estudiantes
    */
    public void limpiarListaEstudiantes(){
        selectorEstudiantes.removeAllItems();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel4 = new javax.swing.JPanel();
        grupoLibros = new javax.swing.ButtonGroup();
        grupoEstudiantes = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        filtroTituloLibro = new javax.swing.JRadioButton();
        filtroAutorLibro = new javax.swing.JRadioButton();
        filtroCodigoLibro = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        textoBusquedaLibros = new rojeru_san.RSMTextFull();
        botonBuscarLibros = new rojerusan.RSButtonIconI();
        selectorLibros = new javax.swing.JComboBox<>();
        botonModificar = new rojeru_san.RSButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        botonBuscarEstudiantes = new rojerusan.RSButtonIconI();
        textoBusquedaEstudiantes = new rojeru_san.RSMTextFull();
        selectorEstudiantes = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        filtroNombreEstudiante = new javax.swing.JRadioButton();
        filtroCarneEstudiante = new javax.swing.JRadioButton();
        filtroCodigoEstudiante = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

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
        gridBagConstraints.insets = new java.awt.Insets(31, 186, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        filtroTituloLibro.setBackground(new java.awt.Color(204, 204, 204));
        grupoLibros.add(filtroTituloLibro);
        filtroTituloLibro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        filtroTituloLibro.setForeground(new java.awt.Color(0, 153, 153));
        filtroTituloLibro.setText("Titulo");
        filtroTituloLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroTituloLibroActionPerformed(evt);
            }
        });

        filtroAutorLibro.setBackground(new java.awt.Color(204, 204, 204));
        grupoLibros.add(filtroAutorLibro);
        filtroAutorLibro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        filtroAutorLibro.setForeground(new java.awt.Color(0, 153, 153));
        filtroAutorLibro.setText("Autor");
        filtroAutorLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroAutorLibroActionPerformed(evt);
            }
        });

        filtroCodigoLibro.setBackground(new java.awt.Color(204, 204, 204));
        grupoLibros.add(filtroCodigoLibro);
        filtroCodigoLibro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        filtroCodigoLibro.setForeground(new java.awt.Color(0, 153, 153));
        filtroCodigoLibro.setText("Codigo");
        filtroCodigoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroCodigoLibroActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Filtrar por:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(filtroTituloLibro)
                        .addGap(18, 18, 18)
                        .addComponent(filtroAutorLibro)
                        .addGap(18, 18, 18)
                        .addComponent(filtroCodigoLibro)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtroTituloLibro)
                    .addComponent(filtroAutorLibro)
                    .addComponent(filtroCodigoLibro))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 154, 0, 0);
        jPanel1.add(jPanel7, gridBagConstraints);

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
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectorLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(botonBuscarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoBusquedaLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoBusquedaLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addComponent(selectorLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = -4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 54, 233, 30);
        jPanel1.add(jPanel5, gridBagConstraints);

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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 148, 0, 0);
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
                .addGap(55, 55, 55)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(selectorEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(botonBuscarEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoBusquedaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonBuscarEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoBusquedaEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(selectorEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 50, 223, 36);
        jPanel2.add(jPanel6, gridBagConstraints);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        filtroNombreEstudiante.setBackground(new java.awt.Color(204, 204, 204));
        grupoEstudiantes.add(filtroNombreEstudiante);
        filtroNombreEstudiante.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        filtroNombreEstudiante.setForeground(new java.awt.Color(0, 153, 153));
        filtroNombreEstudiante.setText("Nombre");
        filtroNombreEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroNombreEstudianteActionPerformed(evt);
            }
        });

        filtroCarneEstudiante.setBackground(new java.awt.Color(204, 204, 204));
        grupoEstudiantes.add(filtroCarneEstudiante);
        filtroCarneEstudiante.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        filtroCarneEstudiante.setForeground(new java.awt.Color(0, 153, 153));
        filtroCarneEstudiante.setText("Carne");
        filtroCarneEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroCarneEstudianteActionPerformed(evt);
            }
        });

        filtroCodigoEstudiante.setBackground(new java.awt.Color(204, 204, 204));
        grupoEstudiantes.add(filtroCodigoEstudiante);
        filtroCodigoEstudiante.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        filtroCodigoEstudiante.setForeground(new java.awt.Color(0, 153, 153));
        filtroCodigoEstudiante.setText("Codigo");
        filtroCodigoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroCodigoEstudianteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Filtrar por:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(filtroNombreEstudiante)
                        .addGap(18, 18, 18)
                        .addComponent(filtroCarneEstudiante)
                        .addGap(18, 18, 18)
                        .addComponent(filtroCodigoEstudiante)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtroNombreEstudiante)
                    .addComponent(filtroCarneEstudiante)
                    .addComponent(filtroCodigoEstudiante))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 160, 0, 0);
        jPanel2.add(jPanel8, gridBagConstraints);

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents
    /*
    Metodo encargado de realizar una busqueda en los elementos de la lista
    */
    private void botonBuscarEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarEstudiantesActionPerformed
       if(textoBusquedaEstudiantes.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "No se ha ingresado ningun caracter");
       }
       else{
           busquedaEstudiantes = textoBusquedaEstudiantes.getText();
           
       }
    }//GEN-LAST:event_botonBuscarEstudiantesActionPerformed
    /*
    Metodo encargado de realizar una busqueda en los elementos de la lista
    */
    private void botonBuscarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarLibrosActionPerformed
        if(textoBusquedaLibros.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No se ha ingresado ningun caracter");
       }
       else{
            busquedaLibros = textoBusquedaLibros.getText();
       }
    }//GEN-LAST:event_botonBuscarLibrosActionPerformed
    /*
    Metodo encargado de recargar la lista de libros y presentarla segun el autor del libro
    */
    private void filtroAutorLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroAutorLibroActionPerformed
        limpiarListaLibros();
        for(int i = 0; i < listadoLibros.size(); i++){
            selectorLibros.addItem(listadoLibros.get(i).getAutor());
        }    
    }//GEN-LAST:event_filtroAutorLibroActionPerformed
    /*
    Metodo encargado de recargar la lista de libros y presentarla segun el titulo del libro
    */
    private void filtroTituloLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroTituloLibroActionPerformed
        limpiarListaLibros();
        for(int i = 0; i < listadoLibros.size(); i++){
            selectorLibros.addItem(listadoLibros.get(i).getTitulo());
        }
    }//GEN-LAST:event_filtroTituloLibroActionPerformed
    /*
    Metodo encargado de recargar la lista de libros y presentarla segun el codigo del libro
    */
    private void filtroCodigoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroCodigoLibroActionPerformed
        limpiarListaLibros();
        for(int i = 0; i < listadoLibros.size(); i++){
            selectorLibros.addItem(listadoLibros.get(i).getCodigo());
        }
    }//GEN-LAST:event_filtroCodigoLibroActionPerformed
    /*
    Metodo encargado de recargar la lista de estudiantes y presentarla segun el nombre del estudiante
    */
    private void filtroNombreEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroNombreEstudianteActionPerformed
        limpiarListaEstudiantes();
        for(int i = 0; i < listadoEstudiantes.size(); i++){
            selectorEstudiantes.addItem(listadoEstudiantes.get(i).getNombre());
        }
    }//GEN-LAST:event_filtroNombreEstudianteActionPerformed
    /*
    Metodo encargado de recargar la lista de estudiantes y presentarla segun el carne del estudiante
    */
    private void filtroCarneEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroCarneEstudianteActionPerformed
       limpiarListaEstudiantes();
        for(int i = 0; i < listadoEstudiantes.size(); i++){
            selectorEstudiantes.addItem(String.valueOf(listadoEstudiantes.get(i).getCarne()));
        }
    }//GEN-LAST:event_filtroCarneEstudianteActionPerformed
    /*
    Metodo encargado de recargar la lista de estudiantes y presentarla segun el cidigo de carrera del estudiante
    */
    private void filtroCodigoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroCodigoEstudianteActionPerformed
       limpiarListaEstudiantes();
        for(int i = 0; i < listadoEstudiantes.size(); i++){
            selectorEstudiantes.addItem(String.valueOf(listadoEstudiantes.get(i).getCodigoCarrera()));
        }
    }//GEN-LAST:event_filtroCodigoEstudianteActionPerformed
    /*
    Metodo encargado de obtener el nombre del item seleccionado en el JComboBox de libros y realizar una busqueda en la lista
    de libros. Al encontrar el libro se extraen sus atributos para crear una nueva instancia del mismo pero con la cantidad 
    de copias nueva. Por ultimo se reescribe el archivo binario correspondiente al libro seleccionado.
    */

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        libroModificar = selectorLibros.getSelectedItem().toString();
        for(int i = 0; i < listadoLibros.size(); i++){
            if(listadoLibros.get(i).getCodigo().equals(libroModificar) || listadoLibros.get(i).getTitulo().equals(libroModificar) || listadoLibros.get(i).getAutor().equals(libroModificar)){
                JOptionPane.showMessageDialog(this, "Numero actual de copias: " + listadoLibros.get(i).getCantidadCopias());
                try{
                    nuevaCantidadCopias = Integer.parseInt(JOptionPane.showInputDialog(this,"Ingrese la nueva cantidad de copias"));
                    libro = new Libro(listadoLibros.get(i).getCodigo(), listadoLibros.get(i).getAutor(), listadoLibros.get(i).getTitulo(),
                                      nuevaCantidadCopias, listadoLibros.get(i).getFechaPublicacion(), listadoLibros.get(i).getEditorial());
                    manejadorArchivos.crearArchivo(libro, "LIBRO", listadoLibros.get(i).getCodigo(), ".lib");
                    JOptionPane.showMessageDialog(this, "Cantidad modificada exitosamente");
                    limpiarListaLibros();
                    llenarListaLibros();
                    
                }
                catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(this, "No se modifico la cantidad de copias del libro: "+ listadoLibros.get(i).getTitulo());
                }
            }
        }
    }//GEN-LAST:event_botonModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonIconI botonBuscarEstudiantes;
    private rojerusan.RSButtonIconI botonBuscarLibros;
    private rojeru_san.RSButton botonModificar;
    private javax.swing.JRadioButton filtroAutorLibro;
    private javax.swing.JRadioButton filtroCarneEstudiante;
    private javax.swing.JRadioButton filtroCodigoEstudiante;
    private javax.swing.JRadioButton filtroCodigoLibro;
    private javax.swing.JRadioButton filtroNombreEstudiante;
    private javax.swing.JRadioButton filtroTituloLibro;
    private javax.swing.ButtonGroup grupoEstudiantes;
    private javax.swing.ButtonGroup grupoLibros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JComboBox<String> selectorEstudiantes;
    private javax.swing.JComboBox<String> selectorLibros;
    private rojeru_san.RSMTextFull textoBusquedaEstudiantes;
    private rojeru_san.RSMTextFull textoBusquedaLibros;
    // End of variables declaration//GEN-END:variables
}
