/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import estructural.Estudiante;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
    
/**
 *
 * @author Cristian Devia
 */
public class GUIModificar extends javax.swing.JFrame {

    /**
     * Creates new form GUIModificar
     */
    public GUIModificar() {
        
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        labNormal = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        labCedula = new javax.swing.JLabel();
        labCorreo = new javax.swing.JLabel();
        labCelular = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rSDateChooser1 = new rojeru_san.componentes.RSDateChooser();
        labGenero = new javax.swing.JLabel();
        rbtMasculino = new javax.swing.JRadioButton();
        rbtFemenino = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labCodigo.setText("Código");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        labNormal.setText("Nombre");

        labCedula.setText("Cédula");

        labCorreo.setText("Correo");

        labCelular.setText("Celular");

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha de nacimiento");

        labGenero.setText("Genero");

        rbtMasculino.setText("Masculino");

        rbtFemenino.setText("Femenino");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(labCodigo)
                        .addGap(14, 14, 14)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labNormal)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labCorreo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labCelular)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(labCedula)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(rSDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(labGenero)
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtFemenino)
                                    .addComponent(rbtMasculino)
                                    .addComponent(btnModificar))))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNormal)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(rSDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtMasculino)
                    .addComponent(labGenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtFemenino)
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
          
        model.Estudiante est;
        String codigo = txtCodigo.getText();
        
        try 
        {
            // TODO add your handling code here:
            est = Singleton.ServiceSingleton.getPort().buscarEstudiantePorCodigo(codigo);           
            
            XMLGregorianCalendar fecha = est.getFechaNacimiento();
            Date fechaN = fecha.toGregorianCalendar().getTime();            
            txtCedula.setText(String.valueOf(est.getCedula()));
            txtCelular.setText(String.valueOf(est.getCelular()));
            txtCorreo.setText(est.getCorreo());
            txtNombre.setText(est.getNombre());
            rSDateChooser1.setDatoFecha(fechaN);
            
            if(est.getGenero().equals("F"))
            {
                rbtFemenino.setSelected(true);
            }
            if(est.getGenero().equals("M"))
            {
                rbtMasculino.setSelected(true);
            }
        
            
                      
        } catch (Exception ex) 
        {
            Logger.getLogger(GUIBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
              
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
 
        String codigo = txtCodigo.getText();
        
        try 
        {        
            String nombre = txtNombre.getText();
             String cedula = txtCedula.getText();
            String correo = txtCorreo.getText();
             String genero = "";
            String celular = txtCelular.getText(); 
             if(rbtMasculino.isSelected())
             {
            genero = "M";
             }
            if(rbtFemenino.isSelected())
            {
              genero = "F";
            }
            GregorianCalendar calendar = new GregorianCalendar();	
            calendar.setTime(darFecha());
          
            Singleton.ServiceSingleton.getPort().actualizarEstudiantePorCodigo(nombre, Integer.parseInt(cedula), codigo, correo, Integer.parseInt(celular),DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar) , genero);
            
            limpiar();
            
          
        } catch (Exception ex) {
            Logger.getLogger(GUIModificar.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed


     private Date darFecha()
    {
        Date fecha = rSDateChooser1.getDatoFecha();
        
        return fecha;
        
    }

       private void limpiar()
    {
             txtNombre.setText("");
              txtCedula.setText("");
              txtCorreo.setText("");
              txtCelular.setText("");
              
              
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labCedula;
    private javax.swing.JLabel labCelular;
    private javax.swing.JLabel labCodigo;
    private javax.swing.JLabel labCorreo;
    private javax.swing.JLabel labGenero;
    private javax.swing.JLabel labNormal;
    private rojeru_san.componentes.RSDateChooser rSDateChooser1;
    private javax.swing.JRadioButton rbtFemenino;
    private javax.swing.JRadioButton rbtMasculino;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    
}
