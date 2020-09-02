/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import estructural.Estudiante;
import estructural.Matricula;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Cristian Devia
 */
public class GUIEliminarMatricula extends javax.swing.JFrame {
    /**
     * Creates new form GUIEliminarMatricula
     */
    public GUIEliminarMatricula() {
  
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

        labNumMatricula = new javax.swing.JLabel();
        txtNumMatricula = new javax.swing.JTextField();
        labFechaMatricula = new javax.swing.JLabel();
        labCodigoEstu = new javax.swing.JLabel();
        labCedulaEstu = new javax.swing.JLabel();
        labPrograma = new javax.swing.JLabel();
        labPPA = new javax.swing.JLabel();
        labNumCreditos = new javax.swing.JLabel();
        labValor = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtCodigoEstu = new javax.swing.JTextField();
        txtCedulaEstu = new javax.swing.JTextField();
        txtNumCreditos = new javax.swing.JTextField();
        txtPrograma = new javax.swing.JTextField();
        txtPPA = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar Matricula");

        labNumMatricula.setText("Número Matricula");
        labNumMatricula.setToolTipText("");

        labFechaMatricula.setText("Fecha Matricula");
        labFechaMatricula.setToolTipText("");

        labCodigoEstu.setText("Código estudiante");
        labCodigoEstu.setToolTipText("");

        labCedulaEstu.setText("Cédula estudiante");
        labCedulaEstu.setToolTipText("");

        labPrograma.setText("Programa Academico");
        labPrograma.setToolTipText("");

        labPPA.setText("PPA");
        labPPA.setToolTipText("");

        labNumCreditos.setText("Número de creditos");
        labNumCreditos.setToolTipText("");

        labValor.setText("Valor");
        labValor.setToolTipText("");

        txtFecha.setEditable(false);

        txtCodigoEstu.setEditable(false);

        txtCedulaEstu.setEditable(false);

        txtNumCreditos.setEditable(false);

        txtPrograma.setEditable(false);

        txtPPA.setEditable(false);

        txtValor.setEditable(false);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labNumMatricula)
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labFechaMatricula)
                                .addGap(35, 35, 35)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(txtNumMatricula))
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labCodigoEstu)
                            .addComponent(labCedulaEstu)
                            .addComponent(labPrograma)
                            .addComponent(labNumCreditos))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrograma, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(txtCedulaEstu)
                            .addComponent(txtCodigoEstu)
                            .addComponent(txtNumCreditos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labPPA)
                            .addComponent(labValor))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPPA)
                            .addComponent(txtValor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btnBuscar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNumMatricula)
                    .addComponent(txtNumMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFechaMatricula)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labCodigoEstu)
                            .addComponent(txtCodigoEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labCedulaEstu)
                            .addComponent(txtCedulaEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labPrograma)
                            .addComponent(txtPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labNumCreditos)
                            .addComponent(txtNumCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(labPPA))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(txtPPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
        model.Matricula b = null;
        String codigo = txtNumMatricula.getText();
        try 
        {
            // TODO add your handling code here:
            b = Singleton.ServiceSingleton.getPort().buscarMatricula(codigo);
            if(b == (null))
            {
                JOptionPane.showMessageDialog(this,  "NO EXISTE");
            }
            else
            {
            txtCedulaEstu.setText(String.valueOf(b.getCedulaEstudiante()));
            XMLGregorianCalendar fecha =  b.getFechaMatricula();
            Date fechaN = fecha.toGregorianCalendar().getTime();
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yy");
            String fechaComoCadena = formato.format(fechaN);
            txtFecha.setText(fechaComoCadena);
            txtCodigoEstu.setText(b.getCodigoEstudiante());
            txtNumCreditos.setText(String.valueOf(b.getNumCreditos()));
            txtPPA.setText(String.valueOf(b.getPpa()));
            txtPrograma.setText(b.getPrograma());
            txtValor.setText(String.valueOf(b.getValor()));
                
  
            }            
        } catch (Exception ex) 
        {
            Logger.getLogger(GUIBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
          String codigo = txtNumMatricula.getText();
    try 
    {
             Singleton.ServiceSingleton.getPort().eliminarPorNumeroMatricula(codigo);
              JOptionPane.showMessageDialog(this, "Matricula eliminado");
              txtFecha.setText("");
              txtCedulaEstu.setText("");
              txtCodigoEstu.setText("");
              txtNumMatricula.setText("");
              txtValor.setText("");
              txtPrograma.setText("");
              txtPPA.setText("");
              txtNumCreditos.setText("");
              
              
        
    } catch (Exception ex) {
        Logger.getLogger(GUIEliminar.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel labCedulaEstu;
    private javax.swing.JLabel labCodigoEstu;
    private javax.swing.JLabel labFechaMatricula;
    private javax.swing.JLabel labNumCreditos;
    private javax.swing.JLabel labNumMatricula;
    private javax.swing.JLabel labPPA;
    private javax.swing.JLabel labPrograma;
    private javax.swing.JLabel labValor;
    private javax.swing.JTextField txtCedulaEstu;
    private javax.swing.JTextField txtCodigoEstu;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNumCreditos;
    private javax.swing.JTextField txtNumMatricula;
    private javax.swing.JTextField txtPPA;
    private javax.swing.JTextField txtPrograma;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
