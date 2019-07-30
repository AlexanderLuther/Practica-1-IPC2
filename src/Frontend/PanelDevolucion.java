package Frontend;

import java.util.ArrayList;
import java.util.List;
import Backend.ManejadorDevoluciones;
import Backend.ManejadorFechas;
import Backend.Prestamo;
import javax.swing.JOptionPane;

public class PanelDevolucion extends javax.swing.JPanel {
 
    //Variables e instancias de la clase
    private ManejadorDevoluciones manejadorDevoluciones = new ManejadorDevoluciones();
    private ManejadorFechas manejadorFechas = new ManejadorFechas();
    private List<Prestamo> listaPrestamos = new ArrayList<>(); 
    private Prestamo prestamo;
    private int carne;
    private String codigoLibro;
    private String mensaje;
    private int codigoPrestamo;
    
    public PanelDevolucion() {
        initComponents();
    }
    
    /*
    Meteodo encargado de asgianr un tamano, centrar y mostran un JDialog
    */
    public void inicializarDialog(){
        mostradorPrestamos.setSize(700, 700);
        mostradorPrestamos.setLocationRelativeTo(this);
        mostradorPrestamos.setVisible(true);
    }
    
    /*
    Metodo utilizado para llenar el JComboBox con todos los registros encontrados
    */
    public void inicializarSelectorPrestamo(){
        for(int i = 0; i < listaPrestamos.size(); i++){
            selectorPrestamos.addItem(String.valueOf(listaPrestamos.get(i).getCodigoPrestamo()));
        }
    }
    
    /*
    Metodo encargado de actualizar la ventanan selectorPrestamos basandose en si 
    existe o  no un elemento restante en la lista listaPrestamos.
    */
    public void refrescarDialog(){
        selectorPrestamos.removeAllItems();
        listaPrestamos.clear();
        listaPrestamos = manejadorDevoluciones.obtenerPrestamos(codigoLibro, carne);
        if(listaPrestamos.isEmpty()){
            mostradorPrestamos.setVisible(false);
            this.limparAreasTexo();
        }
        else{
            inicializarSelectorPrestamo();
        }
    
    }
    
    /*
    Metodo encargado de limpiar todas las areas de texto
    */
    public void limparAreasTexo(){
        textoCodigo.setText(null);
        textoCarne.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mostradorPrestamos = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        selectorPrestamos = new javax.swing.JComboBox<>();
        etiquetaCodigoPrestamo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        etiquetaAutor = new javax.swing.JLabel();
        areaCodigoLibro = new javax.swing.JLabel();
        areaCarneEstudiante = new javax.swing.JLabel();
        etiquetaEstudiante1 = new javax.swing.JLabel();
        areaFechaPrestamo = new javax.swing.JLabel();
        etiquetaFechaPrestamo = new javax.swing.JLabel();
        areaFechaLimite = new javax.swing.JLabel();
        etiquetaFechaLimite = new javax.swing.JLabel();
        calcular = new rojerusan.RSButtonIconI();
        cancelar = new rojerusan.RSButtonIconI();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        etiquetaCodigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoCodigo = new javax.swing.JFormattedTextField();
        textoCarne = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        etiquetaCarne = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        botonAceptar = new rojerusan.RSButtonIconI();

        mostradorPrestamos.setTitle("Prestamos Disponibles");
        mostradorPrestamos.setBackground(new java.awt.Color(255, 255, 255));
        mostradorPrestamos.setResizable(false);
        mostradorPrestamos.getContentPane().setLayout(new javax.swing.BoxLayout(mostradorPrestamos.getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));

        selectorPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorPrestamosActionPerformed(evt);
            }
        });

        etiquetaCodigoPrestamo.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        etiquetaCodigoPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaCodigoPrestamo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaCodigoPrestamo.setText("Codigo de Prestamo:");
        etiquetaCodigoPrestamo.setToolTipText("");

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        etiquetaAutor.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        etiquetaAutor.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaAutor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaAutor.setText("Codigo Libro:");
        etiquetaAutor.setToolTipText("");

        areaCodigoLibro.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        areaCodigoLibro.setForeground(new java.awt.Color(255, 255, 255));
        areaCodigoLibro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        areaCodigoLibro.setToolTipText("");

        areaCarneEstudiante.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        areaCarneEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        areaCarneEstudiante.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        areaCarneEstudiante.setToolTipText("");

        etiquetaEstudiante1.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        etiquetaEstudiante1.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaEstudiante1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaEstudiante1.setText("Carne Estudiante:");
        etiquetaEstudiante1.setToolTipText("");

        areaFechaPrestamo.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        areaFechaPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        areaFechaPrestamo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        areaFechaPrestamo.setToolTipText("");

        etiquetaFechaPrestamo.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        etiquetaFechaPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaFechaPrestamo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaFechaPrestamo.setText("Fecha de Prestamo:");
        etiquetaFechaPrestamo.setToolTipText("");

        areaFechaLimite.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        areaFechaLimite.setForeground(new java.awt.Color(255, 255, 255));
        areaFechaLimite.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        areaFechaLimite.setToolTipText("");

        etiquetaFechaLimite.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        etiquetaFechaLimite.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaFechaLimite.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaFechaLimite.setText("Fecha Limite:");
        etiquetaFechaLimite.setToolTipText("");

        calcular.setBackground(new java.awt.Color(204, 204, 204));
        calcular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comprobar.png"))); // NOI18N
        calcular.setText("Calcular");
        calcular.setColorHover(new java.awt.Color(0, 204, 0));
        calcular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(204, 204, 204));
        cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setBorderPainted(false);
        cancelar.setColorHover(new java.awt.Color(255, 0, 0));
        cancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(etiquetaEstudiante1)
                                .addGap(39, 39, 39)
                                .addComponent(areaCarneEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(etiquetaAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(areaCodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaFechaPrestamo)
                                    .addComponent(etiquetaFechaLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(areaFechaLimite, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                                    .addComponent(areaFechaPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(areaCodigoLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaEstudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(areaCarneEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaFechaLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(areaFechaLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(etiquetaCodigoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectorPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectorPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaCodigoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 39;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 28, 6, 6);
        jPanel6.add(jPanel7, gridBagConstraints);

        mostradorPrestamos.getContentPane().add(jPanel6);

        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        etiquetaCodigo.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        etiquetaCodigo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaCodigo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaCodigo.setText("Codigo:");
        etiquetaCodigo.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("*");

        textoCodigo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 153), null));
        textoCodigo.setForeground(new java.awt.Color(0, 112, 192));
        try {
            textoCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-UUU")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textoCodigo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N

        textoCarne.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 153), null));
        textoCarne.setForeground(new java.awt.Color(0, 112, 192));
        try {
            textoCarne.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textoCarne.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        textoCarne.setVerifyInputWhenFocusTarget(false);

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("*");

        etiquetaCarne.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        etiquetaCarne.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaCarne.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaCarne.setText("Carne:");
        etiquetaCarne.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(etiquetaCarne)
                        .addGap(34, 34, 34)
                        .addComponent(textoCarne)))
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiquetaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(textoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel4))
                            .addComponent(etiquetaCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(textoCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(39, 35, 0, 61);
        jPanel1.add(jPanel4, gridBagConstraints);

        jPanel8.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jPanel8, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(370, Short.MAX_VALUE)
                    .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(340, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(30, Short.MAX_VALUE)
                    .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 698;
        gridBagConstraints.ipady = 33;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 40, 13, 0);
        jPanel1.add(jPanel3, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1051, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1051, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    /*
    Metodo encargado de validar que todos los campos obligatorios se encuentren llenos.
    Obtiene la informacion almacenada en las areas de texto y valida la existencia del
    estudiante, del libro y del prestamo solicitado. Si todo es correcto muestra un 
    nuevo JDialog.
    */
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        if(textoCarne.getText().isEmpty() || textoCodigo.getText().equals("   -   ")){
            JOptionPane.showMessageDialog(this, "Se deben llenar todos los campos obligatorios");
        }
        else{
            carne = Integer.parseInt(textoCarne.getText());
            codigoLibro = textoCodigo.getText();
            mensaje = manejadorDevoluciones.validarExistenciaLibroEstudiante(codigoLibro, carne); 
            if(!mensaje.equals("")){
                JOptionPane.showMessageDialog(this, mensaje);
            }
            else{
                listaPrestamos = manejadorDevoluciones.obtenerPrestamos(codigoLibro, carne);
                if(listaPrestamos.isEmpty()){
                    JOptionPane.showMessageDialog(this, "No existe ningun prestamo resgistrado con esos datos");
                }
                else{
                    this.inicializarSelectorPrestamo();
                    this.inicializarDialog();
                    this.limparAreasTexo();
                }
            }
        }
    }//GEN-LAST:event_botonAceptarActionPerformed
    /*
    Metodo encargado de refrescar las areas de texto y llenarlas con la informacion del prestamo
    selecciona en el selectorPrestamos.
    */
    private void selectorPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorPrestamosActionPerformed
    try{
        for(int i = 0; i < listaPrestamos.size(); i++){
            if(String.valueOf(listaPrestamos.get(i).getCodigoPrestamo()).equals(selectorPrestamos.getSelectedItem().toString())){
                prestamo = (Prestamo)listaPrestamos.get(i);
            }
        }
        codigoPrestamo = prestamo.getCodigoPrestamo();
        areaCarneEstudiante.setText(String.valueOf(prestamo.getCarne()));
        areaCodigoLibro.setText(prestamo.getCodigolibro());
        areaFechaPrestamo.setText(manejadorFechas.darFormatoFecha(prestamo.getFechaPrestamo()));
        areaFechaLimite.setText(manejadorFechas.darFormatoFecha(prestamo.getFechaLimite()));
    }
    catch(NullPointerException e){
    }    
        
        
    }//GEN-LAST:event_selectorPrestamosActionPerformed
    /*
    Metodo encargado de gestionar las acciones a realizar si se acepta el pago del prestamo
    que se este mostrando en el instante.
    */
    
    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        mensaje = manejadorDevoluciones.procesarDevolucion(prestamo);
        switch(JOptionPane.showConfirmDialog(this, mensaje, "Confirmar Pago", 0)){  
            case 0:
                manejadorDevoluciones.aumentarCantidadLibro(codigoLibro);
                manejadorDevoluciones.cambiarEstadoPrestamo(codigoPrestamo);
                manejadorDevoluciones.cambiarCuotaPrestamo(codigoPrestamo);
                manejadorDevoluciones.cambiarListaPrestamosActuales(carne, codigoPrestamo);
                JOptionPane.showMessageDialog(this, "Pago Realizado Exitosamente");
                this.refrescarDialog();
            break;
            default:
            break;
        }
    }//GEN-LAST:event_calcularActionPerformed
    /*
    Metodo encargado de cerrar el mostradorPrestamos y limpiar las areas de texto
    juntos a las lista listaPrestamo y el selector de prestamos.
    */
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        mostradorPrestamos.setVisible(false);
        textoCarne.setText("");
        textoCodigo.setText("");
        listaPrestamos.clear();
        selectorPrestamos.removeAllItems();
    }//GEN-LAST:event_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaCarneEstudiante;
    private javax.swing.JLabel areaCodigoLibro;
    private javax.swing.JLabel areaFechaLimite;
    private javax.swing.JLabel areaFechaPrestamo;
    private rojerusan.RSButtonIconI botonAceptar;
    private rojerusan.RSButtonIconI calcular;
    private rojerusan.RSButtonIconI cancelar;
    private javax.swing.JLabel etiquetaAutor;
    private javax.swing.JLabel etiquetaCarne;
    private javax.swing.JLabel etiquetaCodigo;
    private javax.swing.JLabel etiquetaCodigoPrestamo;
    private javax.swing.JLabel etiquetaEstudiante1;
    private javax.swing.JLabel etiquetaFechaLimite;
    private javax.swing.JLabel etiquetaFechaPrestamo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JDialog mostradorPrestamos;
    private javax.swing.JComboBox<String> selectorPrestamos;
    private javax.swing.JFormattedTextField textoCarne;
    private javax.swing.JFormattedTextField textoCodigo;
    // End of variables declaration//GEN-END:variables
}
