/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BEU.Estudiante;
import BLL.GestionEstudiante;
import Lucas.Util;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author labctr
 */
public class frmRegistroEstudiantes extends javax.swing.JInternalFrame {

     private final String titulo = "Registro de Estudiante";
     private GestionEstudiante estudianteBLL=new GestionEstudiante();
       private List<Estudiante> estudiantes;
       
       private void iniciarListado() throws IOException{
     estudianteBLL.LeerEstudiantes();
       }
       private String VerificarClub(JCheckBox chk){
           return chk.isSelected()?chk.getText():"";
         /*  if(chk.isSelected())
               return chk.getText();
           return "";*/
               
           
       }
       
       private void  CrearEstudiante(){
           Estudiante nuevo=  new Estudiante();
           nuevo.setApellido(this.txtapellido.getText());
           nuevo.setNombre(this.txtnombre.getText());
           nuevo.setCedula(this.txtcedula.getText());
           nuevo.setCarrera(this.cmbcarrera.getSelectedItem().toString());
           nuevo.addClub(this.VerificarClub(chkdanza));
            nuevo.addClub(this.VerificarClub(chkfutbol));
             nuevo.addClub(this.VerificarClub(chkandinismo));
              nuevo.addClub(this.VerificarClub(chkperiodismo));
               nuevo.addClub(this.VerificarClub(chkbasquet));
                nuevo.addClub(this.VerificarClub(chkmusica));
                 nuevo.addClub(this.VerificarClub(chkrobotica));
                  nuevo.addClub(this.VerificarClub(chkgimnasia));
                  
           estudianteBLL.getEstudiantes().add(nuevo);
           
           
       }
       
       private void Archivar() throws IOException{
           estudianteBLL.archivar();
       }
    public frmRegistroEstudiantes() {
        initComponents();
         try { 
             iniciarListado();
         } catch (IOException ex) {
           Util.print(ex.toString());
         }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        pnldatosacademicos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cmbcarrera = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        chkmusica = new javax.swing.JCheckBox();
        chkdanza = new javax.swing.JCheckBox();
        chkrobotica = new javax.swing.JCheckBox();
        chkfutbol = new javax.swing.JCheckBox();
        chkgimnasia = new javax.swing.JCheckBox();
        chkbasquet = new javax.swing.JCheckBox();
        chkperiodismo = new javax.swing.JCheckBox();
        chkandinismo = new javax.swing.JCheckBox();
        btnGuardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registro de Estudiante");

        jLabel1.setFont(new java.awt.Font("Bitstream Charter", 2, 36)); // NOI18N
        jLabel1.setText("Registro de Estudiante");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(233, 36, 204)), "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bitstream Charter", 2, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Bitstream Charter", 2, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Bitstream Charter", 2, 18)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Bitstream Charter", 2, 18)); // NOI18N
        jLabel4.setText("Cedula:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(75, 75, 75)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(txtnombre))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pnldatosacademicos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 33, 221)), "Datos Academicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bitstream Charter", 2, 18))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Bitstream Charter", 2, 18)); // NOI18N
        jLabel5.setText("Carrera;");

        cmbcarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingenieria de Software", "Ingenieria Electronica", "Ingenieria ElectroMecanica", "Ingenieria Mecatronica" }));

        javax.swing.GroupLayout pnldatosacademicosLayout = new javax.swing.GroupLayout(pnldatosacademicos);
        pnldatosacademicos.setLayout(pnldatosacademicosLayout);
        pnldatosacademicosLayout.setHorizontalGroup(
            pnldatosacademicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnldatosacademicosLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel5)
                .addGap(79, 79, 79)
                .addComponent(cmbcarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        pnldatosacademicosLayout.setVerticalGroup(
            pnldatosacademicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnldatosacademicosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnldatosacademicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbcarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(223, 11, 205)), "Datos Extracurriculares", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bitstream Charter", 2, 18))); // NOI18N

        chkmusica.setText("Club de Musica");

        chkdanza.setText("Club de Danza");

        chkrobotica.setText("Club de Robotica");
        chkrobotica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkroboticaActionPerformed(evt);
            }
        });

        chkfutbol.setText("Club de Futbol");

        chkgimnasia.setText("Club de Gimnasia");

        chkbasquet.setText("Club de Basquet");

        chkperiodismo.setText("Club de Periodismo");

        chkandinismo.setText("Club de andinismo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkdanza)
                    .addComponent(chkmusica)
                    .addComponent(chkgimnasia)
                    .addComponent(chkandinismo))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkperiodismo)
                    .addComponent(chkfutbol)
                    .addComponent(chkrobotica)
                    .addComponent(chkbasquet))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkdanza)
                    .addComponent(chkrobotica))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkandinismo)
                    .addComponent(chkfutbol, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkmusica)
                    .addComponent(chkbasquet))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(chkgimnasia))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(chkperiodismo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnGuardar.setFont(new java.awt.Font("Bitstream Charter", 2, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(214, 214, 214)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(96, 96, 96)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(pnldatosacademicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnldatosacademicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkroboticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkroboticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkroboticaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try{
           CrearEstudiante();
           Archivar();
           vtnPrincipal.verMensaje("Estudiante agregado Correctamente", titulo,JOptionPane.INFORMATION_MESSAGE);
          
       }catch(Exception e){
           Util.print("ERROR:"+ e.toString());
           vtnPrincipal.verMensaje("Error alguardar el estudiante " ,titulo, JOptionPane.ERROR_MESSAGE);
           
       }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox chkandinismo;
    private javax.swing.JCheckBox chkbasquet;
    private javax.swing.JCheckBox chkdanza;
    private javax.swing.JCheckBox chkfutbol;
    private javax.swing.JCheckBox chkgimnasia;
    private javax.swing.JCheckBox chkmusica;
    private javax.swing.JCheckBox chkperiodismo;
    private javax.swing.JCheckBox chkrobotica;
    private javax.swing.JComboBox<String> cmbcarrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnldatosacademicos;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
