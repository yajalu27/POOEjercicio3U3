/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BEU.Curso;
import BEU.Matricula;
import BLL.GestionCurso;
import BLL.GestionMatricula;
import Lucas.Util;
import java.io.IOException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author labctr
 */
public class frmReporteCalificaciones extends javax.swing.JInternalFrame {
     private final String titulo = "Reporte  de Calificaciones";
     private GestionCurso cursosBLL=new GestionCurso();
      private GestionMatricula matriculaBLL=new GestionMatricula();
    private List<Curso> cursos;
 private List<Matricula> calificaciones;
  private DefaultTableModel dtmCalificaciones = new DefaultTableModel();

    private void LeerCursos(){
         try{
             Curso ficticio = new Curso("-Seleccione-",0.0f,"");
             ficticio.setTitulo("-Seleccione-");
             this.cbmcurso.addItem(ficticio);
           cursos=cursosBLL.getCursos();
          // for(Curso c :cursos){
            //   this.cbmcurso.addItem(c);
           //}
           //EXPRESION LAMBDA
           cursos.forEach((c)->{
               this.cbmcurso.addItem(c);
           });
       }catch(Exception e){
           Util.print("ERROR:"+ e.toString());
           vtnPrincipal.verMensaje("Error al leer los cusos" ,titulo, JOptionPane.ERROR_MESSAGE);
           
       }
        
    }
     private void configurarModeloTabla(){
        String[]columnas={"Nombre","Promedio","Estado"};
        this.dtmCalificaciones.setColumnIdentifiers(columnas);
        this.tblclificaciones.setModel(dtmCalificaciones);
    }
     
     private void  MostrarCalificaciones(){
         int lim =this.dtmCalificaciones.getRowCount()-1;
     for(int i=lim;i>=0;i--){
         this.dtmCalificaciones.removeRow(i);
     }
       
        for(Matricula m:calificaciones){
            Vector fila=new Vector();
            fila.addElement(m.getEstudiante());
            fila.addElement(m.getPromedio());
            fila.addElement(m.getEstado());
            this.dtmCalificaciones.addRow(fila);
            
        }
        this.tblclificaciones.setModel(dtmCalificaciones);
     }
     private void BuscarMatricula() throws IOException{
         Curso seleccionado=(Curso)this.cbmcurso.getSelectedItem();
         calificaciones=matriculaBLL.reportar(seleccionado.getTitulo());
         MostrarCalificaciones();
     }
    public frmReporteCalificaciones() {
        initComponents();
        LeerCursos();
        this.configurarModeloTabla();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblcurso = new javax.swing.JLabel();
        cbmcurso = new javax.swing.JComboBox<>();
        btnbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblclificaciones = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Reporte de Caificaciones");

        jLabel1.setFont(new java.awt.Font("Bitstream Charter", 2, 36)); // NOI18N
        jLabel1.setText("Reporte de Calificaciones");

        lblcurso.setFont(new java.awt.Font("Bitstream Charter", 2, 24)); // NOI18N
        lblcurso.setText("Curso:");

        btnbuscar.setFont(new java.awt.Font("Bitstream Charter", 2, 24)); // NOI18N
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/search.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        tblclificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblclificaciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(lblcurso)
                        .addGap(18, 18, 18)
                        .addComponent(cbmcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcurso)
                    .addComponent(cbmcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        try{
           BuscarMatricula();

        }catch(Exception e){
            Util.print("ERROR:"+ e.toString());
            vtnPrincipal.verMensaje("Error al Guardar la calificación" ,titulo, JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnbuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JComboBox<Curso> cbmcurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcurso;
    private javax.swing.JTable tblclificaciones;
    // End of variables declaration//GEN-END:variables
}
