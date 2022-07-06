
package tienda;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException; 
import static javax.management.remote.JMXConnectorFactory.connect;



import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
public class enviarpro extends javax.swing.JFrame {

    /**
     * Creates new form enviarpro
     */
    public enviarpro() {
        initComponents();
        
         mode1=new DefaultTableModel();
        mode1.addColumn("Id Producto");
        mode1.addColumn("Nombre");
        mode1.addColumn("Precio ");
        mode1.addColumn("Cantidad");
        tabla1.setModel(mode1);
        //abrimos el formulraio 2
        
        Prueba tabla2 =new Prueba();
        tabla2.setVisible(true);
    }

     DefaultTableModel mode1;
     String url ="jdbc:sqlite:D:\\Base de datos\\Software de facturacion.db";
     Connection connect;
      
    String nombre;
    String categoria;
    Integer cantidad;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        filtro = new javax.swing.JTextField();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Idproductos", "Nombre", "Precio", "Cantidad"
            }
        ));
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 770, 140));

        jToggleButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jToggleButton1.setText("Pasar los datos ");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 230, 30));

        jLabel1.setText("Buscar producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 128, 30));

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
        getContentPane().add(filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 390, 30));

        jToggleButton3.setText("Conectar");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 110, 30));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked

    }//GEN-LAST:event_tabla1MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        int Fila=tabla1.getSelectedRow();
        if(Fila>=0){
            String Datos[] =new String [4];
            Datos[0]=tabla1.getValueAt(Fila,0).toString();
            Datos[1]=tabla1.getValueAt(Fila,1).toString();
            Datos[2]=tabla1.getValueAt(Fila,2).toString();
            Datos[3]=tabla1.getValueAt(Fila,3).toString();

            Prueba.modelo2.addRow(Datos);
            
        }
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
            PreparedStatement st =connect.prepareStatement ("select Idproductos, Nombre ,Precio from Productos");
            result=st.executeQuery();

            while(result.next()){
                mode1.addRow(new Object[]{result.getInt("Idproductos"),result.getString("Nombre"),result.getDouble("Precio")});
                
               
            }

        }catch(Exception x){
            JOptionPane.showMessageDialog(null, x.getMessage().toString());
        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed
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
       tabla1.setRowSorter(trs);
        
        
        
        
        
    }//GEN-LAST:event_filtroKeyTyped

    private void filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroActionPerformed
       
    }//GEN-LAST:event_filtroActionPerformed

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
            java.util.logging.Logger.getLogger(enviarpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(enviarpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(enviarpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(enviarpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new enviarpro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
