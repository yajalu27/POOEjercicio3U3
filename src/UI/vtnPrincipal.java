
package UI;

import javax.swing.JOptionPane;

/**
 *
 * @author labctr
 */
public class vtnPrincipal extends javax.swing.JFrame {
    

    public static void verMensaje(String msg,String titulo, int type) {
        JOptionPane.showMessageDialog(null, msg, titulo, type);
    }
    public vtnPrincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        mnimatricula = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        mninuevoestudiante = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        mnicalificaciones = new javax.swing.JMenuItem();
        mnireporte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/descarga.jpeg"))); // NOI18N
        desktopPane.add(jLabel2);
        jLabel2.setBounds(420, 240, 330, 250);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images.jpeg"))); // NOI18N
        desktopPane.add(jLabel1);
        jLabel1.setBounds(20, 30, 300, 230);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ESPE.jpeg"))); // NOI18N
        desktopPane.add(jLabel3);
        jLabel3.setBounds(440, 30, 240, 210);

        jLabel4.setFont(new java.awt.Font("Bitstream Charter", 2, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(231, 10, 193));
        jLabel4.setText("BIENVENIDOS....");
        desktopPane.add(jLabel4);
        jLabel4.setBounds(50, 280, 265, 80);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Matricula");

        mnimatricula.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mnimatricula.setFont(new java.awt.Font("Bitstream Charter", 2, 14)); // NOI18N
        mnimatricula.setMnemonic('o');
        mnimatricula.setText("Matricula");
        mnimatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnimatriculaActionPerformed(evt);
            }
        });
        fileMenu.add(mnimatricula);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Estudiante");

        mninuevoestudiante.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mninuevoestudiante.setMnemonic('t');
        mninuevoestudiante.setText("Nuevo");
        mninuevoestudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mninuevoestudianteActionPerformed(evt);
            }
        });
        editMenu.add(mninuevoestudiante);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Calificaciones");

        mnicalificaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnicalificaciones.setMnemonic('c');
        mnicalificaciones.setText("Registro");
        mnicalificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnicalificacionesActionPerformed(evt);
            }
        });
        helpMenu.add(mnicalificaciones);

        mnireporte.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnireporte.setMnemonic('r');
        mnireporte.setText("Reporte de Calificaciones");
        mnireporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnireporteActionPerformed(evt);
            }
        });
        helpMenu.add(mnireporte);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void mnimatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnimatriculaActionPerformed
     frmRegistromatricula  m =new frmRegistromatricula();
     this.desktopPane.add(m);
     m.show();
    }//GEN-LAST:event_mnimatriculaActionPerformed

    private void mninuevoestudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mninuevoestudianteActionPerformed
      frmRegistroEstudiantes e = new frmRegistroEstudiantes();
      this.desktopPane.add(e);
      e.show();
    }//GEN-LAST:event_mninuevoestudianteActionPerformed

    private void mnicalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnicalificacionesActionPerformed
        frmregistroCalificacion c = new frmregistroCalificacion();
        this.desktopPane.add(c);
        c.show();
    }//GEN-LAST:event_mnicalificacionesActionPerformed

    private void mnireporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnireporteActionPerformed
        frmReporteCalificaciones r = new frmReporteCalificaciones();
        this.desktopPane.add(r);
        r.show();
    }//GEN-LAST:event_mnireporteActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtnPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnicalificaciones;
    private javax.swing.JMenuItem mnimatricula;
    private javax.swing.JMenuItem mninuevoestudiante;
    private javax.swing.JMenuItem mnireporte;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
