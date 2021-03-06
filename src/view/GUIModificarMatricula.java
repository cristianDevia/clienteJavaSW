/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.sun.org.apache.xalan.internal.xsltc.dom.SingletonIterator;
import estructural.Estudiante;
import estructural.Matricula;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
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
public class GUIModificarMatricula extends javax.swing.JFrame {

 
    /**
     * Creates new form GUIEliminarMatricula
     */
    public GUIModificarMatricula() {
  
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
        txtCodigoEstu = new javax.swing.JTextField();
        txtCedulaEstu = new javax.swing.JTextField();
        txtNumCreditos = new javax.swing.JTextField();
        txtPrograma = new javax.swing.JTextField();
        txtPPA = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        rSDateChooser1 = new rojeru_san.componentes.RSDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Matricula");

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

        txtCodigoEstu.setEditable(false);

        txtCedulaEstu.setEditable(false);

        txtPrograma.setEditable(false);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labCodigoEstu)
                            .addComponent(labCedulaEstu)
                            .addComponent(labPrograma)
                            .addComponent(labNumCreditos)
                            .addComponent(labFechaMatricula)
                            .addComponent(labPPA)
                            .addComponent(labValor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPPA, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumCreditos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrograma, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCedulaEstu, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoEstu, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(txtValor)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labNumMatricula)
                        .addGap(27, 27, 27)
                        .addComponent(txtNumMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNumMatricula)
                    .addComponent(txtNumMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(labFechaMatricula)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labPPA))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            txtCodigoEstu.setText(b.getCodigoEstudiante());
            txtNumCreditos.setText(String.valueOf(b.getNumCreditos()));
            txtPPA.setText(String.valueOf(b.getPpa()));
            txtPrograma.setText(b.getPrograma());
            txtValor.setText(String.valueOf(b.getValor()));
            rSDateChooser1.setDatoFecha(fechaN);
            
                
  
            }            
        } catch (Exception ex) 
        {
            Logger.getLogger(GUIBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
      
        try 
        {
                    
            //int numeroMatricula,int numCreditos,Date fechaIngreso,double valor,double  ppa
            int numCreditos = Integer.parseInt(txtNumCreditos.getText());
            double valor = Double.parseDouble(txtValor.getText());
            double ppa = Double.parseDouble(txtPPA.getText());
            int num = Integer.parseInt(txtNumMatricula.getText());
            Date fecha = rSDateChooser1.getDatoFecha();
             GregorianCalendar calendar = new GregorianCalendar();	
            calendar.setTime(fecha);
           
            
            Singleton.ServiceSingleton.getPort().actualizarMatricula(num, numCreditos, DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar) , valor,ppa);
            limpiar();
            
          
        } catch (Exception ex) {
            Logger.getLogger(GUIModificar.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
    }//GEN-LAST:event_btnActualizarActionPerformed

     private Date darFecha()
    {
        Date fecha = rSDateChooser1.getDatoFecha();
        
        return fecha;
        
    }
     
     private void limpiar()
     {
                
              txtCedulaEstu.setText("");
              txtCodigoEstu.setText("");
              txtNumMatricula.setText("");
              txtValor.setText("");
              txtPrograma.setText("");
              txtPPA.setText("");
              txtNumCreditos.setText("");
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel labCedulaEstu;
    private javax.swing.JLabel labCodigoEstu;
    private javax.swing.JLabel labFechaMatricula;
    private javax.swing.JLabel labNumCreditos;
    private javax.swing.JLabel labNumMatricula;
    private javax.swing.JLabel labPPA;
    private javax.swing.JLabel labPrograma;
    private javax.swing.JLabel labValor;
    private rojeru_san.componentes.RSDateChooser rSDateChooser1;
    private javax.swing.JTextField txtCedulaEstu;
    private javax.swing.JTextField txtCodigoEstu;
    private javax.swing.JTextField txtNumCreditos;
    private javax.swing.JTextField txtNumMatricula;
    private javax.swing.JTextField txtPPA;
    private javax.swing.JTextField txtPrograma;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
