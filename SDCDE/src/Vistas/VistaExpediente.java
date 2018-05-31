package Vistas;


import Conexiones.sql;
import Modelos.ModeloExpediente;
import Tabla.TablaExpediente;
import Modelos.PdfDoc;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author German
 */
public class VistaExpediente extends javax.swing.JFrame {

    TablaExpediente te = new TablaExpediente();
    String rutaArchivo = "";
    int id = -1;
    public VistaExpediente() {
        initComponents();
        te.visualizar_Pdf(tablaExpediente);
        activa_boton(false, false);
        nombre_txt.setEnabled(false);
        //prueba();
        //cargarDocumentos();
    }

    public void guardar_pdf(int id_expediente, String nombre, File ruta) {
        ModeloExpediente me = new ModeloExpediente();
        PdfDoc doc = new PdfDoc();
        doc.setIdExpediente(id_expediente);
        doc.setNombrepdf(nombre);
        
        try {
            byte[] pdf = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(pdf);
            doc.setArchivopdf(pdf);
        } catch (IOException ex) {
            doc.setArchivopdf(null);
            //System.out.println("Error al agregar archivo pdf "+ex.getMessage());
        }
        me.agregarDoc(doc);
    }
    
    public void eliminar_pdf(int codigo) {
        ModeloExpediente me = new ModeloExpediente();
        PdfDoc doc = new PdfDoc();
        doc.setIdExpediente(codigo);
        me.eliminarPdf(doc);
    }
    
    public void seleccionar_pdf() {
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fi = new FileNameExtensionFilter("pdf", "pdf");
        j.setFileFilter(fi);
        int se = j.showOpenDialog(this);
        if (se == 0) {
            this.seleccionar_btn.setText("" + j.getSelectedFile().getName());
            rutaArchivo = j.getSelectedFile().getAbsolutePath();

        } else {
        }
    }
    public void activa_boton(boolean a, boolean c) {
        guardar_btn.setEnabled(a);
        eliminar_btn.setEnabled(c);
        nombre_txt.setText("");
        seleccionar_btn.setText("Seleccionar...");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre_txt = new javax.swing.JTextField();
        seleccionar_btn = new javax.swing.JButton();
        nuevo_btn = new javax.swing.JButton();
        cancelar_btn = new javax.swing.JButton();
        guardar_btn = new javax.swing.JButton();
        eliminar_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaExpediente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jLabel1.setText("Nombre del Archivo");

        jLabel2.setText("Seleccionar Archivo");

        seleccionar_btn.setText("archivo.pdf");
        seleccionar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionar_btnActionPerformed(evt);
            }
        });

        nuevo_btn.setText("Nuevo");
        nuevo_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_btnActionPerformed(evt);
            }
        });

        cancelar_btn.setText("Cancelar");
        cancelar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_btnActionPerformed(evt);
            }
        });

        guardar_btn.setText("Guardar");
        guardar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_btnActionPerformed(evt);
            }
        });

        eliminar_btn.setText("Eliminar");
        eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_btnActionPerformed(evt);
            }
        });

        tablaExpediente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tipo de Documento", "Archivo"
            }
        ));
        tablaExpediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaExpedienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaExpediente);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombre_txt)
                            .addComponent(seleccionar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevo_btn)
                        .addGap(34, 34, 34)
                        .addComponent(guardar_btn)
                        .addGap(34, 34, 34)
                        .addComponent(eliminar_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(cancelar_btn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccionar_btn))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo_btn)
                    .addComponent(guardar_btn)
                    .addComponent(eliminar_btn)
                    .addComponent(cancelar_btn))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionar_btnActionPerformed
        seleccionar_pdf();
    }//GEN-LAST:event_seleccionar_btnActionPerformed

    private void guardar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btnActionPerformed
        // TODO add your handling code here:
        String nombre = nombre_txt.getText();
        //int codigo = s.autoIncrementar("SELECT MAX(codigopdf) FROM pdf;");
        try{
            int id_expediente = 1;
            File ruta = new File(rutaArchivo);
        if (nombre.trim().length() != 0 && rutaArchivo.trim().length() != 0) {
            guardar_pdf(id_expediente, nombre, ruta);
            te.visualizar_Pdf(tablaExpediente);
            rutaArchivo = "";
            activa_boton(false, false);
            nombre_txt.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Rellenar todo los campos");
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Entro");
        }
        
    }//GEN-LAST:event_guardar_btnActionPerformed

    private void tablaExpedienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaExpedienteMouseClicked
        int column = tablaExpediente.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tablaExpediente.getRowHeight();
        int sRow = tablaExpediente.getSelectedRow();
        String archivo = null;
        
        activa_boton(false, true);
        nombre_txt.setEnabled(true);
        if (row < tablaExpediente.getRowCount() && row >= 0 && column < tablaExpediente.getColumnCount() && column >= 0) {
            //id = (int) tablaExpediente.getValueAt(row, 0);
            Object value = tablaExpediente.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                if (boton.getText().equals("Vacio")) {
                    JOptionPane.showMessageDialog(null, "No hay archivo");
                } else {
                    ModeloExpediente me = new ModeloExpediente();
                    archivo = tablaExpediente.getModel().getValueAt(sRow, 0).toString();
                    System.out.println(archivo);
                    me.ejecutarArchivoPdf(archivo);
                    try {
                        Desktop.getDesktop().open(new File("new.pdf"));
                    } catch (Exception ex) {
                    }
                }

            } else {
                String name = "" + tablaExpediente.getValueAt(row, 1);
                nombre_txt.setText(name);
            }
        }
    }//GEN-LAST:event_tablaExpedienteMouseClicked

    private void eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_btnActionPerformed
        // TODO add your handling code here:
        eliminar_pdf(id);
        te.visualizar_Pdf(tablaExpediente);
        activa_boton(false, false);
        nombre_txt.setEnabled(false);
        rutaArchivo = "";
    }//GEN-LAST:event_eliminar_btnActionPerformed

    private void cancelar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_btnActionPerformed
        // TODO add your handling code here:
        activa_boton(false, false);
        rutaArchivo = "";
        nombre_txt.setEnabled(false);
    }//GEN-LAST:event_cancelar_btnActionPerformed

    private void nuevo_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_btnActionPerformed
        // TODO add your handling code here:
        activa_boton(true, false);
        nombre_txt.setEnabled(true);
        rutaArchivo = "";
    }//GEN-LAST:event_nuevo_btnActionPerformed

    
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
            java.util.logging.Logger.getLogger(VistaExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaExpediente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar_btn;
    private javax.swing.JButton eliminar_btn;
    private javax.swing.JButton guardar_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre_txt;
    private javax.swing.JButton nuevo_btn;
    private javax.swing.JButton seleccionar_btn;
    private javax.swing.JTable tablaExpediente;
    // End of variables declaration//GEN-END:variables
}
