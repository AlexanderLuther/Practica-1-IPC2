package Frontend;
import Backend.CambiadorPaneles;
import Backend.ManejadorArchivoEntrada;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    //Paneles utilizados en la interfaz grafica
    private PanelNuevoEstudiante panelEstudiante = new PanelNuevoEstudiante();
    private PanelNuevoLibro panelLibro = new PanelNuevoLibro();
    private PanelNuevoPrestamo panelPrestamo = new PanelNuevoPrestamo();
    private PanelCargarArchivo panelArchivo = new PanelCargarArchivo();
    private PanelAcercaDe panelInformacion = new PanelAcercaDe();
    private PanelInicio panelInicio = new PanelInicio();
    private PanelDevolucion panelDevolucion = new PanelDevolucion();
    private PanelListado panelListado = new PanelListado();
    private PanelReporte panelReportes = new PanelReporte(this);
    
    //Manejadores auxiliares
    private CambiadorPaneles cambiadorPaneles = new CambiadorPaneles();
    private JFileChooser selectorArchivos = new JFileChooser();
    private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
    private ManejadorArchivoEntrada  archivoEntrada = new ManejadorArchivoEntrada();
    
    //Variables usadas por la clase
    private File direccion;
    private int eleccionFileChooser;
    
    public VentanaPrincipal() {    
        initComponents();
        this.setLocationRelativeTo(this); 
        this.setExtendedState(MAXIMIZED_BOTH);
        cambiadorPaneles.cambiarPanel(panelPrincipal, panelInicio);   
    }
    
    /*
    Metodo encargado de abrir un JFileChooser y obtener la ruta del  archivo seleccionado para su posterior procesamiento en el sistema.
    Se llama al metodo leerArchivo de la clase ManejadorArchivoEntrada pasando como parametro la ruta obtenida y el inicio del hilo. Por
    ultimo Se devuelve un boleano basado en si se selecciono algun archivo o se cancelo la carga del mismo. 
    */
    private boolean cargarArchivo(){
        selectorArchivos.setFileFilter(filtro);
        selectorArchivos.setApproveButtonText("Cargar Archivo");
        eleccionFileChooser = selectorArchivos.showOpenDialog(null);
        
        if(eleccionFileChooser == selectorArchivos.APPROVE_OPTION){
            direccion = selectorArchivos.getSelectedFile();
            try {
                archivoEntrada.leerArchivo(direccion, 0l);//EN 0l el tiempo de espera del hilo
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        } 
        else return false;     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        logoIngenieria = new rojerusan.RSButtonIconI();
        jPanel7 = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        panelCargaArchivo = new javax.swing.JPanel();
        botonCargarArchivo = new rojerusan.RSButtonIconI();
        panelNuevo = new javax.swing.JPanel();
        botonNuevoEstudiante = new rojerusan.RSButtonIconI();
        botonDevolucion = new rojerusan.RSButtonIconI();
        botonNuevoLibro = new rojerusan.RSButtonIconI();
        jLabel3 = new javax.swing.JLabel();
        botonNuevoPrestamo = new rojerusan.RSButtonIconI();
        botonNuevoListado = new rojerusan.RSButtonIconI();
        botonReporte = new rojerusan.RSButtonIconI();
        etiquetaBaseDatos = new javax.swing.JLabel();
        etiquetaNuevo = new javax.swing.JLabel();
        panelMas = new javax.swing.JPanel();
        botonAcecaDe = new rojerusan.RSButtonIconI();
        botonHome = new rojerusan.RSButtonIconI();
        botonSalir = new rojerusan.RSButtonIconI();
        etiquetaMas = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Ingenieria CUNOC");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        logoIngenieria.setBackground(new java.awt.Color(0, 153, 153));
        logoIngenieria.setBorder(null);
        logoIngenieria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoIngenieria.jpg"))); // NOI18N
        logoIngenieria.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 119;
        gridBagConstraints.ipady = 117;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 56, 0, 18);
        jPanel1.add(logoIngenieria, gridBagConstraints);

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));

        titulo1.setBackground(new java.awt.Color(0, 153, 153));
        titulo1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setText("CENTRO UNIVERSITARIO DE OCCIDENTE ");

        titulo2.setBackground(new java.awt.Color(0, 153, 153));
        titulo2.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setText("DIVISION DE CIENCIAS DE LA INGENIERIA");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titulo1)
                        .addComponent(titulo2))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 15, Short.MAX_VALUE)
                    .addComponent(titulo1)
                    .addGap(7, 7, 7)
                    .addComponent(titulo2)
                    .addGap(0, 16, Short.MAX_VALUE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 71;
        gridBagConstraints.ipady = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 150, 0, 0);
        jPanel1.add(jPanel7, gridBagConstraints);

        panelMenu.setBackground(new java.awt.Color(204, 204, 204));
        panelMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        panelCargaArchivo.setBackground(new java.awt.Color(204, 204, 204));

        botonCargarArchivo.setBackground(new java.awt.Color(204, 204, 204));
        botonCargarArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/archivo.png"))); // NOI18N
        botonCargarArchivo.setText("CARGAR ARCHIVO");
        botonCargarArchivo.setBorderPainted(false);
        botonCargarArchivo.setColorHover(new java.awt.Color(0, 153, 153));
        botonCargarArchivo.setHideActionText(true);
        botonCargarArchivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonCargarArchivo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarArchivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCargaArchivoLayout = new javax.swing.GroupLayout(panelCargaArchivo);
        panelCargaArchivo.setLayout(panelCargaArchivoLayout);
        panelCargaArchivoLayout.setHorizontalGroup(
            panelCargaArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonCargarArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelCargaArchivoLayout.setVerticalGroup(
            panelCargaArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCargaArchivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonCargarArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelNuevo.setBackground(new java.awt.Color(204, 204, 204));
        panelNuevo.setPreferredSize(new java.awt.Dimension(260, 113));

        botonNuevoEstudiante.setBackground(new java.awt.Color(204, 204, 204));
        botonNuevoEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lectura.png"))); // NOI18N
        botonNuevoEstudiante.setText("ESTUDIANTE");
        botonNuevoEstudiante.setBorderPainted(false);
        botonNuevoEstudiante.setColorHover(new java.awt.Color(0, 153, 153));
        botonNuevoEstudiante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonNuevoEstudiante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonNuevoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoEstudianteActionPerformed(evt);
            }
        });

        botonDevolucion.setBackground(new java.awt.Color(204, 204, 204));
        botonDevolucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-devolver-libro-80.png"))); // NOI18N
        botonDevolucion.setText("DEVOLUCION");
        botonDevolucion.setBorderPainted(false);
        botonDevolucion.setColorHover(new java.awt.Color(0, 153, 153));
        botonDevolucion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonDevolucion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDevolucionActionPerformed(evt);
            }
        });

        botonNuevoLibro.setBackground(new java.awt.Color(204, 204, 204));
        botonNuevoLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/libro-abierto.png"))); // NOI18N
        botonNuevoLibro.setText("LIBRO");
        botonNuevoLibro.setBorderPainted(false);
        botonNuevoLibro.setColorHover(new java.awt.Color(0, 153, 153));
        botonNuevoLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonNuevoLibro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonNuevoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoLibroActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bitstream Charter", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NUEVO");

        botonNuevoPrestamo.setBackground(new java.awt.Color(204, 204, 204));
        botonNuevoPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impuesto.png"))); // NOI18N
        botonNuevoPrestamo.setText("PRESTAMO");
        botonNuevoPrestamo.setBorderPainted(false);
        botonNuevoPrestamo.setColorHover(new java.awt.Color(0, 153, 153));
        botonNuevoPrestamo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonNuevoPrestamo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonNuevoPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoPrestamoActionPerformed(evt);
            }
        });

        botonNuevoListado.setBackground(new java.awt.Color(204, 204, 204));
        botonNuevoListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marca-de-verificacion.png"))); // NOI18N
        botonNuevoListado.setText("LISTADO");
        botonNuevoListado.setBorderPainted(false);
        botonNuevoListado.setColorHover(new java.awt.Color(0, 153, 153));
        botonNuevoListado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonNuevoListado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonNuevoListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoListadoActionPerformed(evt);
            }
        });

        botonReporte.setBackground(new java.awt.Color(204, 204, 204));
        botonReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-reporte-de-negocios-512.png"))); // NOI18N
        botonReporte.setText("REPORTES");
        botonReporte.setBorderPainted(false);
        botonReporte.setColorHover(new java.awt.Color(0, 153, 153));
        botonReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonReporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNuevoLayout = new javax.swing.GroupLayout(panelNuevo);
        panelNuevo.setLayout(panelNuevoLayout);
        panelNuevoLayout.setHorizontalGroup(
            panelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonNuevoEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
            .addComponent(botonNuevoLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonNuevoListado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonNuevoPrestamo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelNuevoLayout.createSequentialGroup()
                    .addGap(107, 107, 107)
                    .addComponent(jLabel3)
                    .addContainerGap(105, Short.MAX_VALUE)))
        );
        panelNuevoLayout.setVerticalGroup(
            panelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonNuevoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonNuevoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonNuevoListado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(botonNuevoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(panelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelNuevoLayout.createSequentialGroup()
                    .addGap(97, 97, 97)
                    .addComponent(jLabel3)
                    .addContainerGap(297, Short.MAX_VALUE)))
        );

        etiquetaBaseDatos.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        etiquetaBaseDatos.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaBaseDatos.setText("BASE DE DATOS");

        etiquetaNuevo.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        etiquetaNuevo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaNuevo.setText("NUEVO");

        panelMas.setBackground(new java.awt.Color(204, 204, 204));

        botonAcecaDe.setBackground(new java.awt.Color(204, 204, 204));
        botonAcecaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pregunta.png"))); // NOI18N
        botonAcecaDe.setText("ACERCA DE");
        botonAcecaDe.setBorderPainted(false);
        botonAcecaDe.setColorHover(new java.awt.Color(0, 153, 153));
        botonAcecaDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonAcecaDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAcecaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcecaDeActionPerformed(evt);
            }
        });

        botonHome.setBackground(new java.awt.Color(204, 204, 204));
        botonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        botonHome.setText("INICIO");
        botonHome.setBorderPainted(false);
        botonHome.setColorHover(new java.awt.Color(0, 153, 153));
        botonHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHomeActionPerformed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(204, 204, 204));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        botonSalir.setText("SALIR");
        botonSalir.setBorderPainted(false);
        botonSalir.setColorHover(new java.awt.Color(255, 0, 0));
        botonSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMasLayout = new javax.swing.GroupLayout(panelMas);
        panelMas.setLayout(panelMasLayout);
        panelMasLayout.setHorizontalGroup(
            panelMasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonAcecaDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMasLayout.createSequentialGroup()
                .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMasLayout.setVerticalGroup(
            panelMasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMasLayout.createSequentialGroup()
                .addComponent(botonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAcecaDe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        etiquetaMas.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        etiquetaMas.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaMas.setText("MAS");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCargaArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaNuevo)
                            .addComponent(etiquetaMas))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addComponent(etiquetaBaseDatos)
                        .addContainerGap(125, Short.MAX_VALUE))))
            .addComponent(panelMas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(etiquetaBaseDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCargaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(etiquetaNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(etiquetaMas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel4);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonCargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarArchivoActionPerformed
        if(cargarArchivo()) cambiadorPaneles.cambiarPanel(panelPrincipal, panelArchivo);
        else JOptionPane.showMessageDialog(rootPane, "No se selecciono ningun archivo");
    }//GEN-LAST:event_botonCargarArchivoActionPerformed

    private void botonNuevoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoLibroActionPerformed
        panelLibro.limparAreasTexo();
        cambiadorPaneles.cambiarPanel(panelPrincipal, panelLibro);
    }//GEN-LAST:event_botonNuevoLibroActionPerformed

    private void botonNuevoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoEstudianteActionPerformed
        panelEstudiante.limparAreasTexo();
        cambiadorPaneles.cambiarPanel(panelPrincipal, panelEstudiante);
    }//GEN-LAST:event_botonNuevoEstudianteActionPerformed

    private void botonDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDevolucionActionPerformed
        panelDevolucion.limparAreasTexo();
        cambiadorPaneles.cambiarPanel(panelPrincipal, panelDevolucion);
    }//GEN-LAST:event_botonDevolucionActionPerformed

    private void botonAcecaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcecaDeActionPerformed
        cambiadorPaneles.cambiarPanel(panelPrincipal, panelInformacion);
    }//GEN-LAST:event_botonAcecaDeActionPerformed

    private void botonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHomeActionPerformed
       cambiadorPaneles.cambiarPanel(panelPrincipal, panelInicio);
    }//GEN-LAST:event_botonHomeActionPerformed

    private void botonNuevoPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoPrestamoActionPerformed
        panelPrestamo.limparAreasTexo();
        cambiadorPaneles.cambiarPanel(panelPrincipal, panelPrestamo);
    }//GEN-LAST:event_botonNuevoPrestamoActionPerformed

    private void botonNuevoListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoListadoActionPerformed
      panelListado.llenarTablaEstudiantesCompletos();
      panelListado.llenarTablaLibrosCompletos();
      cambiadorPaneles.cambiarPanel(panelPrincipal, panelListado);
    }//GEN-LAST:event_botonNuevoListadoActionPerformed

    private void botonReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporteActionPerformed
        cambiadorPaneles.cambiarPanel(panelPrincipal, panelReportes);
    }//GEN-LAST:event_botonReporteActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonIconI botonAcecaDe;
    private rojerusan.RSButtonIconI botonCargarArchivo;
    private rojerusan.RSButtonIconI botonDevolucion;
    private rojerusan.RSButtonIconI botonHome;
    private rojerusan.RSButtonIconI botonNuevoEstudiante;
    private rojerusan.RSButtonIconI botonNuevoLibro;
    private rojerusan.RSButtonIconI botonNuevoListado;
    private rojerusan.RSButtonIconI botonNuevoPrestamo;
    private rojerusan.RSButtonIconI botonReporte;
    private rojerusan.RSButtonIconI botonSalir;
    private javax.swing.JLabel etiquetaBaseDatos;
    private javax.swing.JLabel etiquetaMas;
    private javax.swing.JLabel etiquetaNuevo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private rojerusan.RSButtonIconI logoIngenieria;
    private javax.swing.JPanel panelCargaArchivo;
    private javax.swing.JPanel panelMas;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelNuevo;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
