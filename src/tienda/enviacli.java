/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Locale;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
public class enviacli extends javax.swing.JFrame {

   public static String dato="";// 
    public static String dato2="";
    public static String dato3="";
    public static String dato4="";
    public enviacli() {
        initComponents();
        mode1=(DefaultTableModel)this.jTable1.getModel();
    }
DefaultTableModel mode1;
 String url ="jdbc:sqlite:D:\\Base de datos\\Software de facturacion.db";
    Connection connect;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        filtro = new javax.swing.JTextField();
        jToggleButton3 = new javax.swing.JToggleButton();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 820, 140));

        jToggleButton1.setText("Enviar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 143, 50));

        jToggleButton2.setText("Agregar clientes");
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 143, 50));

        jLabel1.setText("Buscar clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 128, 30));

        filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroActionPerformed(evt);
            }
        });
        filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filtroKeyTyped(evt);
            }
        });
        getContentPane().add(filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 390, 30));

        jToggleButton3.setText("Conectar");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 120, 30));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 180, 30));
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 180, 30));
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 190, 30));

        txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4ActionPerformed(evt);
            }
        });
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 180, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int selection=jTable1.rowAtPoint(evt.getPoint());//con este selecciona la tabla para poner los productos
        txt1.setText(String.valueOf(jTable1.getValueAt(selection,1)));
        txt2.setText(String.valueOf(jTable1.getValueAt(selection,2)));
        txt3.setText(String.valueOf(jTable1.getValueAt(selection,3)));
        txt4.setText(String.valueOf(jTable1.getValueAt(selection,4)));
    }//GEN-LAST:event_jTable1MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        dato = txt1.getText();
        dato2 = txt2.getText();
        dato3 = txt3.getText();
        dato4 = txt4.getText();

        Prueba j= new Prueba();
        j.setVisible(true);
        this.setVisible(false);
        /**/
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
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
            PreparedStatement st =connect.prepareStatement ("select Idclientes, Nombre,Direccion,Telefono,Ruc from Clientes");
            result=st.executeQuery();

            while(result.next()){
                mode1.addRow(new Object[]{result.getInt("Idclientes"),result.getString("Nombre"),result.getString("Direccion"),result.getInt("Telefono"),result.getInt("Ruc")});
                
            }

        }catch(Exception x){
            JOptionPane.showMessageDialog(null, x.getMessage().toString());
        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4ActionPerformed

    private void filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroActionPerformed

    TableRowSorter trs=null;// esto es necesario para que cuando se filtre pueda funcionar  
    private void filtroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroKeyTyped
      
        
        // esto es para hacer el filtro 
        filtro.addKeyListener(new  KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)"+ filtro.getText(), 1));
                  
            
            }
            
           
           
    });
       
        
       trs =new TableRowSorter(mode1);
       jTable1.setRowSorter(trs);
       
       
       
        
        
      
    }//GEN-LAST:event_filtroKeyTyped

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
            java.util.logging.Logger.getLogger(enviacli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(enviacli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(enviacli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(enviacli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new enviacli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    // End of variables declaration//GEN-END:variables
}