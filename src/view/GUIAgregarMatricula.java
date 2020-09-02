/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeFactory;
/**
 *
 * @author Cristian Devia
 */
public class GUIAgregarMatricula extends javax.swing.JFrame {


    int cedula;
    String codigo,programa;
    /**
     * Creates new form GUIAgregarMatricula
     */
    public GUIAgregarMatricula() {
     
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

        rSDateChooser1 = new rojeru_san.componentes.RSDateChooser();
        labFechaMatricula = new javax.swing.JLabel();
        labNumMatricula = new javax.swing.JLabel();
        txtNumMatricula = new javax.swing.JTextField();
        labCedulaEstu = new javax.swing.JLabel();
        txtCedulaEstu = new javax.swing.JTextField();
        btnBuscarCedulaEstu = new javax.swing.JButton();
        labCodigoEstu = new javax.swing.JLabel();
        txtCodigoEstu = new javax.swing.JTextField();
        labPrograma = new javax.swing.JLabel();
        txtPrograma = new javax.swing.JTextField();
        btnBuscarPrograma = new javax.swing.JButton();
        labNumCreditos = new javax.swing.JLabel();
        txtNumCreditos = new javax.swing.JTextField();
        labValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        labPPA = new javax.swing.JLabel();
        txtPPA = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Matricula");

        labFechaMatricula.setText("Fecha de la matricula");

        labNumMatricula.setText("Número de matricula");

        labCedulaEstu.setText("Cédula Estudiante");

        btnBuscarCedulaEstu.setText("...");
        btnBuscarCedulaEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCedulaEstuActionPerformed(evt);
            }
        });

        labCodigoEstu.setText("Código Estudiante");

        labPrograma.setText("Programa academico");

        btnBuscarPrograma.setText("...");
        btnBuscarPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProgramaActionPerformed(evt);
            }
        });

        labNumCreditos.setText("Número de creditos");

        labValor.setText("Valor");

        labPPA.setText("PPA");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labFechaMatricula)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labCedulaEstu)
                                .addComponent(labNumMatricula)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rSDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labCodigoEstu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(txtCodigoEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCedulaEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarCedulaEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labPrograma)
                                    .addComponent(labValor)
                                    .addComponent(labNumCreditos)
                                    .addComponent(labPPA))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrograma, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(txtNumCreditos)
                                    .addComponent(txtValor)
                                    .addComponent(txtPPA))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(labFechaMatricula))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rSDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labNumMatricula)
                    .addComponent(txtNumMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCedulaEstu)
                    .addComponent(txtCedulaEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCedulaEstu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCodigoEstu)
                    .addComponent(txtCodigoEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labPrograma)
                    .addComponent(txtPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPrograma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labNumCreditos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labPPA)
                    .addComponent(txtPPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnAgregar)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        model.Matricula mat = new model.Matricula();
        
        int numeroMatricula = Integer.parseInt(txtNumMatricula.getText());
        int numeroCreditos = Integer.parseInt(txtNumCreditos.getText());
        Date fecha = darFecha();
        double valor = Double.parseDouble(txtValor.getText());
        double ppa = Double.parseDouble(txtPPA.getText());
        try {
            
            cedula = Integer.parseInt(txtCedulaEstu.getText());
            codigo = txtCodigoEstu.getText();
            programa = txtPrograma.getText();
            
            mat.setCedulaEstudiante(cedula);
            mat.setCodigoEstudiante(codigo);
            mat.setPrograma(programa);
            
            GregorianCalendar calendar = new GregorianCalendar();	
            calendar.setTime(fecha);            
            mat.setFechaMatricula(DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar));
            mat.setNumCreditos(numeroCreditos);
            mat.setNumeroMatricula(numeroMatricula);
            mat.setValor(valor);
            mat.setPpa(ppa);
            
            Singleton.ServiceSingleton.getPort().anadirMatricula(mat);
            
            limpiar();
            
        } 
        catch (Exception ex) {
            Logger.getLogger(GUIAgregarMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarCedulaEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCedulaEstuActionPerformed
        // TODO add your handling code here:
          
        GUIListaEstudiantes lista = new GUIListaEstudiantes(this);
        lista.setVisible(true);
    }//GEN-LAST:event_btnBuscarCedulaEstuActionPerformed

    private void btnBuscarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProgramaActionPerformed
        // TODO add your handling code here:
        GUIListaProgramas lista = new GUIListaProgramas( this);
        lista.setVisible(true);
    }//GEN-LAST:event_btnBuscarProgramaActionPerformed

    /**
     * @param args the command line arguments
     */
   private Date darFecha()
    {
        Date fecha = rSDateChooser1.getDatoFecha();
        
        return fecha;
        
    }
   
   
   public void setDatos(String cedula,String codigo)
   {
       txtCedulaEstu.setText(cedula);
       txtCodigoEstu.setText(codigo);
       
   }
   
   public void setPrograma(String codigo)
   {
       txtPrograma.setText(codigo);
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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarCedulaEstu;
    private javax.swing.JButton btnBuscarPrograma;
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