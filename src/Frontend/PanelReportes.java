package Frontend;

import javax.swing.JFrame;

public class PanelReportes extends javax.swing.JPanel {

    
    private Reporte4 reportePrestamoHecho;
    private Reporte1 reporte1;
     private Reporte5 reportePrestamosActuales;
   
 
    private Reporte6 reportePrestamosHechosCarrera;
    
     public PanelReportes(JFrame framePrincipal) {
        this.reportePrestamoHecho = new Reporte4(framePrincipal, true);
        this.reporte1 = new Reporte1(framePrincipal, true);
        this.reportePrestamoHecho = new Reporte4(framePrincipal, true);
        this.reporte1 = new Reporte1(framePrincipal, true);
        this.reportePrestamosActuales = new Reporte5(framePrincipal, true);
        this.reportePrestamosHechosCarrera = new Reporte6(framePrincipal, true);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        rSButtonIconI1 = new rojerusan.RSButtonIconI();
        rSButtonIconI2 = new rojerusan.RSButtonIconI();
        rSButtonIconI3 = new rojerusan.RSButtonIconI();
        rSButtonIconI4 = new rojerusan.RSButtonIconI();
        rSButtonIconI5 = new rojerusan.RSButtonIconI();
        rSButtonIconI6 = new rojerusan.RSButtonIconI();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        rSButtonIconI1.setBackground(new java.awt.Color(0, 153, 153));
        rSButtonIconI1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportar.png"))); // NOI18N
        rSButtonIconI1.setText("4. Prestamos hechos por un estudiante");
        rSButtonIconI1.setColorHover(new java.awt.Color(153, 153, 153));
        rSButtonIconI1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rSButtonIconI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconI1ActionPerformed(evt);
            }
        });

        rSButtonIconI2.setBackground(new java.awt.Color(0, 153, 153));
        rSButtonIconI2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportar.png"))); // NOI18N
        rSButtonIconI2.setText("5. Libros prestados a un estudiante actualmente");
        rSButtonIconI2.setColorHover(new java.awt.Color(153, 153, 153));
        rSButtonIconI2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rSButtonIconI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconI2ActionPerformed(evt);
            }
        });

        rSButtonIconI3.setBackground(new java.awt.Color(0, 153, 153));
        rSButtonIconI3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportar.png"))); // NOI18N
        rSButtonIconI3.setText("6. Prestamos hechos a cada carrera");
        rSButtonIconI3.setColorHover(new java.awt.Color(153, 153, 153));
        rSButtonIconI3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rSButtonIconI3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconI3ActionPerformed(evt);
            }
        });

        rSButtonIconI4.setBackground(new java.awt.Color(0, 153, 153));
        rSButtonIconI4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportar.png"))); // NOI18N
        rSButtonIconI4.setText("1. Prestamos que deben ser entregados el dia actual");
        rSButtonIconI4.setColorHover(new java.awt.Color(153, 153, 153));
        rSButtonIconI4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rSButtonIconI4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconI4ActionPerformed(evt);
            }
        });

        rSButtonIconI5.setBackground(new java.awt.Color(0, 153, 153));
        rSButtonIconI5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportar.png"))); // NOI18N
        rSButtonIconI5.setText("2. Prestamos Morosos");
        rSButtonIconI5.setColorHover(new java.awt.Color(153, 153, 153));
        rSButtonIconI5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        rSButtonIconI6.setBackground(new java.awt.Color(0, 153, 153));
        rSButtonIconI6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportar.png"))); // NOI18N
        rSButtonIconI6.setText("3. Total Dinero recaudado");
        rSButtonIconI6.setColorHover(new java.awt.Color(153, 153, 153));
        rSButtonIconI6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(rSButtonIconI3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSButtonIconI2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSButtonIconI1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(rSButtonIconI4, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                        .addComponent(rSButtonIconI5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSButtonIconI6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(rSButtonIconI4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonIconI5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonIconI6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonIconI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonIconI2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonIconI3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void rSButtonIconI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconI1ActionPerformed
        reportePrestamoHecho.setVisible(true);
    }//GEN-LAST:event_rSButtonIconI1ActionPerformed

    private void rSButtonIconI4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconI4ActionPerformed
        reporte1.setVisible(true);
    }//GEN-LAST:event_rSButtonIconI4ActionPerformed

    private void rSButtonIconI3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconI3ActionPerformed
        reportePrestamosHechosCarrera.setVisible(true);
    }//GEN-LAST:event_rSButtonIconI3ActionPerformed

    private void rSButtonIconI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconI2ActionPerformed
        reportePrestamosActuales.setVisible(true);
    }//GEN-LAST:event_rSButtonIconI2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private rojerusan.RSButtonIconI rSButtonIconI1;
    private rojerusan.RSButtonIconI rSButtonIconI2;
    private rojerusan.RSButtonIconI rSButtonIconI3;
    private rojerusan.RSButtonIconI rSButtonIconI4;
    private rojerusan.RSButtonIconI rSButtonIconI5;
    private rojerusan.RSButtonIconI rSButtonIconI6;
    // End of variables declaration//GEN-END:variables
}
