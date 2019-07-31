
package Frontend;

public class PanelCargarArchivo extends javax.swing.JPanel {


    public PanelCargarArchivo() {
        initComponents();
    }
    
    public void llenarErrores(String errores){
       textoErrores.setText(errores);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane2 = new javax.swing.JScrollPane();
        textoErrores = new javax.swing.JTextArea();

        setLayout(new java.awt.GridBagLayout());

        textoErrores.setEditable(false);
        textoErrores.setColumns(20);
        textoErrores.setRows(5);
        jScrollPane2.setViewportView(textoErrores);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 233;
        gridBagConstraints.ipady = 227;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 61, 42, 81);
        add(jScrollPane2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textoErrores;
    // End of variables declaration//GEN-END:variables
}
