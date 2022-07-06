/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import static javax.management.remote.JMXConnectorFactory.connect;



import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
public class Agregar_Productos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Agregar_Productos
     */
    public Agregar_Productos() {
        initComponents();
        
        mode1=(DefaultTableModel)this.jTable1.getModel();
    }
    DefaultTableModel mode1;
String url ="jdbc:sqlite:D:\\Base de datos\\Software de facturacion.db";
    Connection connect;
    
    
    String nombre;
    String categoria;
    Integer cantidad;
    String precios;
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Agregar Producto ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 220, 30));

        jToggleButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jToggleButton2.setText("Conectar");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 200, 30));

        jToggleButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jToggleButton4.setText("Insertar");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 160, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Idproductos", "Nombre", "Categoria", "Cantidad", "Precio"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 770, 160));

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 210, 40));
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 210, 40));

        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 210, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 180, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Categoria");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 190, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Precio");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 190, 30));

        txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4ActionPerformed(evt);
            }
        });
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 210, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Cantidad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 190, 30));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        try{
            connect =DriverManager.getConnection(url);

            if(connect!=null){

                JOptionPane.showMessageDialog(null, "Conectando y Actualizando");
            }
        }
        catch(Exception x){
            JOptionPane.showInternalMessageDialog(null, x.getMessage().toString());

        }

        mode1.setRowCount(0);
        ResultSet result=null;
        try{
            PreparedStatement st =connect.prepareStatement ("select Idproductos, Nombre,Categoria,Cantidad,Precio from Productos");
            result=st.executeQuery();

            while(result.next()){
                mode1.addRow(new Object[]{result.getInt("Idproductos"),result.getString("Nombre"),result.getString("Categoria"),result.getInt("Cantidad"),result.getString("Precio")});

            }

        }catch(Exception x){
            JOptionPane.showMessageDialog(null, x.getMessage().toString());
        }
        
        
   

    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        nombre=txt1.getText();
        categoria=txt2.getText();
        cantidad=Integer.valueOf(txt3.getText());
        precios=txt4.getText();

        try {
            String sql="insert into Productos values (null,'"+nombre+"','"+categoria+"','"+cantidad+"','"+precios+"')";

            PreparedStatement st =connect.prepareStatement (sql);

            st.execute();

            JOptionPane.showMessageDialog(null,"Datos enviados");
        }catch(Exception x){
            JOptionPane.showMessageDialog(null, x.getMessage().toString());
        }
        
        
        
        
        try{
            connect =DriverManager.getConnection(url);

            if(connect!=null){


            }
        }
        catch(Exception x){
            JOptionPane.showInternalMessageDialog(null, x.getMessage().toString());

        }
        
        
        
        
         mode1.setRowCount(0);
        ResultSet result=null;
        try{
            PreparedStatement st =connect.prepareStatement ("select Idproductos, Nombre,Categoria,Cantidad,Precio from Productos");
            result=st.executeQuery();

            while(result.next()){
                mode1.addRow(new Object[]{result.getInt("Idproductos"),result.getString("Nombre"),result.getString("Categoria"),result.getInt("Cantidad"),result.getString("Precio")});
                
            }

        }catch(Exception x){
            JOptionPane.showMessageDialog(null, x.getMessage().toString());
        }
        

        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
