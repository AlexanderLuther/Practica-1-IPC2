package Frontend;

import javax.swing.JFrame;

public class PanelReportes extends javax.swing.JPanel {

    private Reporte1 reportePrestamosEntregaHoy;
    private Reporte2 reportePrestamosMorosos;
    private Reporte3 reporteDineroRecaudado;
    private Reporte4 reportePrestamoHecho;
    private Reporte5 reportePrestamosActuales;
    private Reporte6 reportePrestamosHechosCarrera;
    
     public PanelReportes(JFrame framePrincipal) {
        this.reportePrestamosEntregaHoy = new Reporte1(framePrincipal, true);
        this.reportePrestamosMorosos = new Reporte2(framePrincipal, true);
        this.reporteDineroRecaudado = new Reporte3(framePrincipal, true);
        this.reportePrestamoHecho = new Reporte4(framePrincipal, true);
        this.reportePrestamosActuales = new Reporte5(framePrincipal, true);
        this.reportePrestamosHechosCarrera = new Reporte6(framePrincipal, true);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        botonReporte4 = new rojerusan.RSButtonIconI();
        botonReporte5 = new rojerusan.RSButtonIconI();
        botonReporte6 = new rojerusan.RSButtonIconI();
        botonReporte1 = new rojerusan.RSButtonIconI();
        botonReporte2 = new rojerusan.RSButtonIconI();
        botonReporte3 = new rojerusan.RSButtonIconI();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        botonReporte4.setBackground(new java.awt.Color(0, 153, 153));
        botonReporte4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportar.png"))); // NOI18N
        botonReporte4.setText("4. Prestamos hechos por un estudiante");
        botonReporte4.setColorHover(new java.awt.Color(153, 153, 153));
        botonReporte4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonReporte4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporte4ActionPerformed(evt);
            }
        });

        botonReporte5.setBackground(new java.awt.Color(0, 153, 153));
        botonReporte5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportar.png"))); // NOI18N
        botonReporte5.setText("5. Libros prestados a un estudiante actualmente");
        botonReporte5.setColorHover(new java.awt.Color(153, 153, 153));
        botonReporte5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonReporte5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporte5ActionPerformed(evt);
            }
        });

        botonReporte6.setBackground(new java.awt.Color(0, 153, 153));
        botonReporte6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportar.png"))); // NOI18N
        botonReporte6.setText("6. Prestamos hechos a cada carrera");
        botonReporte6.setColorHover(new java.awt.Color(153, 153, 153));
        botonReporte6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonReporte6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporte6ActionPerformed(evt);
            }
        });

        botonReporte1.setBackground(new java.awt.Color(0, 153, 153));
        botonReporte1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportar.png"))); // NOI18N
        botonReporte1.setText("1. Prestamos que deben ser entregados el dia actual");
        botonReporte1.setColorHover(new java.awt.Color(153, 153, 153));
        botonReporte1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonReporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporte1ActionPerformed(evt);
            }
        });

        botonReporte2.setBackground(new java.awt.Color(0, 153, 153));
        botonReporte2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportar.png"))); // NOI18N
        botonReporte2.setText("2. Prestamos Morosos");
        botonReporte2.setColorHover(new java.awt.Color(153, 153, 153));
        botonReporte2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonReporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporte2ActionPerformed(evt);
            }
        });

        botonReporte3.setBackground(new java.awt.Color(0, 153, 153));
        botonReporte3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportar.png"))); // NOI18N
        botonReporte3.setText("3. Total Dinero recaudado");
        botonReporte3.setColorHover(new java.awt.Color(153, 153, 153));
        botonReporte3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonReporte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporte3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonReporte6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonReporte5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonReporte4, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonReporte1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                        .addComponent(botonReporte2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonReporte3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(botonReporte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonReporte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonReporte3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonReporte4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonReporte5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonReporte6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 25);
        add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void botonReporte4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporte4ActionPerformed
        reportePrestamoHecho.limpiar();
        reportePrestamoHecho.setVisible(true);
    }//GEN-LAST:event_botonReporte4ActionPerformed

    private void botonReporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporte1ActionPerformed
        reportePrestamosEntregaHoy.llenarTabla();
        reportePrestamosEntregaHoy.setVisible(true);
    }//GEN-LAST:event_botonReporte1ActionPerformed

    private void botonReporte6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporte6ActionPerformed
        reportePrestamosHechosCarrera.limpiar();
        reportePrestamosHechosCarrera.setVisible(true);
    }//GEN-LAST:event_botonReporte6ActionPerformed

    private void botonReporte5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporte5ActionPerformed
        reportePrestamosActuales.limpiar();
        reportePrestamosActuales.setVisible(true);
    }//GEN-LAST:event_botonReporte5ActionPerformed

    private void botonReporte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporte3ActionPerformed
        reporteDineroRecaudado.solicitarIntervaloTiempo();
        //reporteDineroRecaudado.setVisible(true);
    }//GEN-LAST:event_botonReporte3ActionPerformed

    private void botonReporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporte2ActionPerformed
        reportePrestamosMorosos.llenarTabla();
        reportePrestamosMorosos.setVisible(true);
    }//GEN-LAST:event_botonReporte2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonIconI botonReporte1;
    private rojerusan.RSButtonIconI botonReporte2;
    private rojerusan.RSButtonIconI botonReporte3;
    private rojerusan.RSButtonIconI botonReporte4;
    private rojerusan.RSButtonIconI botonReporte5;
    private rojerusan.RSButtonIconI botonReporte6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
