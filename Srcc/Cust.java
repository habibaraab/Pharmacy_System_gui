
import deo.ConnectionProvider;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Nourhan
 */
public class Cust extends javax.swing.JFrame {
    private int customerPk=0;
    /**
     * Creates new form Cust
     */
    public Cust() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private boolean validateFields() {
        if (!textname.getText().equals("") && !txtmobilenumber.getText().equals("") && !txtemail.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablecustomer = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textname = new javax.swing.JTextField();
        txtmobilenumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_background.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_background.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_background.png"))); // NOI18N
        jLabel8.setText("llllllllllllllllllllaalallalalalalalallala");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_background.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_background.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setText("Customer Manger");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 288, 41));

        tablecustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile Number", "Email"
            }
        ));
        tablecustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablecustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablecustomer);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 90, -1, -1));

        textname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnameActionPerformed(evt);
            }
        });
        getContentPane().add(textname, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 128, 244, -1));

        txtmobilenumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtmobilenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobilenumberActionPerformed(evt);
            }
        });
        getContentPane().add(txtmobilenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 224, 244, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("ُEmail");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 284, -1, -1));

        txtemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 310, 244, -1));

        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 100, -1));

        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 90, -1));

        btnreset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 100, -1));

        btnclose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 90, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Mobile Number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 192, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/vvvlog.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-290, -180, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) tablecustomer.getModel();
      try{
          Connection  con =ConnectionProvider.getCon();
            Statement st =con.createStatement();
            ResultSet rs=st.executeQuery("select *from customer");
     
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("customer_pk"), rs.getString("name"), rs.getString("mobileNumber"), rs.getString("email")});
            }
        }
  catch(SQLException e){
      JOptionPane.showMessageDialog(null, e);
  }
      btnupdate.setEnabled(false);
      
    }//GEN-LAST:event_formComponentShown

    private void txtmobilenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobilenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobilenumberActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here:
        
       
        setVisible(false);
      
        
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        String name=textname.getText();
     String mobilenumber =  txtmobilenumber.getText();
          String  email =  txtemail.getText();
          if(validateFields()){
          JOptionPane.showMessageDialog(null,"All fields are require");
          }
          else {
              try{ 
                  Connection con= ConnectionProvider.getCon();
                  PreparedStatement ps =con.prepareStatement(" insert into customer(name,mobileNumber,email) value (?,?,?)");
                  ps.setString(1,name); 
                   ps.setString(2,mobilenumber);
                  ps.setString(3,email);
                  ps.executeUpdate();
                  JOptionPane.showMessageDialog(null, "Customer Added Sucsessfully");
setVisible(false);
new Cust().setVisible(true);
                  
              }
               catch(Exception e){
      JOptionPane.showMessageDialog(null, e);
  }
          }
        
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
        new Cust().setVisible(true);
    }//GEN-LAST:event_btnresetActionPerformed

    private void textnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnameActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        
        String name=textname.getText();
     String mobilenumber =  txtmobilenumber.getText();
          String  email =  txtemail.getText();
          if(validateFields()){
          JOptionPane.showMessageDialog(null,"All fields are require");
          }
          else {
              try{ 
                  Connection con= ConnectionProvider.getCon();
                  PreparedStatement ps =con.prepareStatement("update customer set name =?,mobileNumber=? ,email=? where customer_pk=?");
                  ps.setString(1,name); 
                   ps.setString(2,mobilenumber);
                  ps.setString(3,email);
                  ps.setInt(4, customerPk);
                  ps.executeUpdate();
                  JOptionPane.showMessageDialog(null, "Customer updated Sucsessfully");
setVisible(false);
new Cust().setVisible(true);
                  
              }
               catch(Exception e){
      JOptionPane.showMessageDialog(null, e);
  }
          }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void tablecustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablecustomerMouseClicked
        // TODO add your handling code here:
        int index = tablecustomer.getSelectedRow();
        TableModel model =tablecustomer.getModel();
         String id = model.getValueAt(index,0).toString();
         customerPk = Integer.parseInt(id); 
         String name = model.getValueAt(index,1).toString();
          textname.setText(name);
          String mobilenumber = model.getValueAt(index,2).toString();
           txtmobilenumber.setText(mobilenumber);
           String email = model.getValueAt(index,3).toString();
           txtemail.setText(email);
         btnsave.setEnabled(false);
          btnupdate.setEnabled(true);

        
    }//GEN-LAST:event_tablecustomerMouseClicked

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
            java.util.logging.Logger.getLogger(Cust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cust().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablecustomer;
    private javax.swing.JTextField textname;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmobilenumber;
    // End of variables declaration//GEN-END:variables
}
