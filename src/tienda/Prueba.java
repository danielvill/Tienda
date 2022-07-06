/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;
import java.security.PrivateKey;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public final class Prueba extends javax.swing.JFrame {
public static DefaultTableModel modelo2;
    /**
     * Creates new form Prueba
     */
    public Prueba() {
        initComponents();
        this.setLocationRelativeTo(null);


        
        
        
        // esto es para poner los datos
        modelo2=new DefaultTableModel();
        modelo2.addColumn("Id Producto");
        modelo2.addColumn("Nombre");
        modelo2.addColumn("Precio");
        modelo2.addColumn("Cantidad");
        
        tabla2.setModel(modelo2);

        
        
        enviacli m =new enviacli();
        txt6.setText(m.dato);
        txt7.setText(m.dato2);// aquie es donde el codigo hace que funcion  para la informacion para que llegue
        txt8.setText(m.dato3);
        txt9.setText(m.dato4);
        
        
        // para poner el codigo para la tabla
        
         mode1o2=(DefaultTableModel)this.tabla2.getModel();
    }
DefaultTableModel mode1o2;



   
   
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        txt8 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt9 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt7 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        total1 = new javax.swing.JTextField();
        iva = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jToggleButton3 = new javax.swing.JToggleButton();
        sub = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setText("Clientes");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 140, 40));

        txt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt8ActionPerformed(evt);
            }
        });
        getContentPane().add(txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 185, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Ruc");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 40, 30));

        txt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt9ActionPerformed(evt);
            }
        });
        getContentPane().add(txt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 185, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 111, -1));

        txt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt7ActionPerformed(evt);
            }
        });
        getContentPane().add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 185, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Telefono");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 60, -1));

        txt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt6ActionPerformed(evt);
            }
        });
        getContentPane().add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 185, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Direccion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 60, 20));

        jToggleButton2.setText("Productos");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 140, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setText("Total 12%");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 60, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setText("Subtotal");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 70, 30));

        total1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total1ActionPerformed(evt);
            }
        });
        getContentPane().add(total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 220, 30));
        getContentPane().add(iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 220, 30));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idproductos", "Nombre", "Precio", "Cantidad"
            }
        ));
        tabla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 610, 120));

        jToggleButton3.setText("Calcular");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 140, 40));
        getContentPane().add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 220, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setText("IVA%12");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 70, 30));

        jToggleButton4.setBackground(new java.awt.Color(255, 0, 0));
        jToggleButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jToggleButton4.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButton4.setText("X");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 40, 40));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        enviacli m1 =new enviacli();
        m1.setVisible(true);
        this.setVisible(false);// con este se mantiene la ventana abierta para que en este caso no se cierre

        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void txt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt8ActionPerformed

    private void txt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt9ActionPerformed

    private void txt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt7ActionPerformed

    private void txt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt6ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        enviarpro m1 =new enviarpro();
        m1.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void total1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total1ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
       double contar=tabla2.getRowCount();
       double suma=0;
       double suma1=0;
       double total=0;
       double promedio=0;
       double iva1=0;
       double total2=0;
       for (int i=0;i<contar;i++){
       // este es para que me saque el subtotal pero necesti para aplicar una formula 
           suma=Double.parseDouble( tabla2.getValueAt(i,2).toString());
           suma1=Double.parseDouble( tabla2.getValueAt(i,3).toString());
           promedio=suma*suma1;
           total+= promedio;
       /// en esta parte sera lo que es para el otro procedimiento  
           iva1=total/1.12;
           total2=total+iva1;
           
           
   }
       DecimalFormat df =new DecimalFormat("#.00");// este es para delimitar los decimaless usando la variable "df"    
       
       
       
    sub.setText(df.format(total));// esto es para mostrar cantidades numericas
    iva.setText(df.format(iva1));   
    total1.setText(df.format(total2));   
 
   
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void tabla2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla2MouseClicked
        // ESTE ES PARA ELIMINAR CUALQUIER SENTENCIA QUE SE ESTE REPITIENDO 
        
        
        
    }//GEN-LAST:event_tabla2MouseClicked

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
     if(tabla2.getSelectedRow() !=-1){
         modelo2.removeRow(tabla2.getSelectedRow());
     }else{
         JOptionPane.showMessageDialog(null,"No ha sellecionado un registro");
     }
    }//GEN-LAST:event_jToggleButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField iva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JTextField sub;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField total1;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    // End of variables declaration//GEN-END:variables
}
