package dental_management_system;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author bushra
 */
public class InsertExpensesRecord extends javax.swing.JFrame 
{

    User user;
    
    public InsertExpensesRecord()
    {
        initComponents();
         //this.setLocationRelativeTo(null); // for centering form on screen
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //does not close app on exit of window
    }
     public InsertExpensesRecord(User user)
             
     {
         initComponents();
        //this.setLocationRelativeTo(null); // for centering form on screen
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //does not close app on exit of window
        
        this.user = user;
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1_month = new javax.swing.JLabel();
        jLabel2_payments = new javax.swing.JLabel();
        jLabel3_ebill = new javax.swing.JLabel();
        jLabel4_wbill = new javax.swing.JLabel();
        jLabel5_maintenance = new javax.swing.JLabel();
        jTextField1_month = new javax.swing.JTextField();
        jTextField2_payments = new javax.swing.JTextField();
        jTextField3_ebill = new javax.swing.JTextField();
        jTextField4_wbill = new javax.swing.JTextField();
        jTextField5_maintenance = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 23, 836, 488));
        setPreferredSize(new java.awt.Dimension(836, 488));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(510, 390, 75, 90);

        jLabel1_month.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1_month.setText("   Month");
        getContentPane().add(jLabel1_month);
        jLabel1_month.setBounds(250, 100, 80, 50);

        jLabel2_payments.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2_payments.setText("  Payments");
        getContentPane().add(jLabel2_payments);
        jLabel2_payments.setBounds(250, 160, 90, 40);

        jLabel3_ebill.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3_ebill.setText("Electric Bills");
        getContentPane().add(jLabel3_ebill);
        jLabel3_ebill.setBounds(250, 220, 100, 30);

        jLabel4_wbill.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4_wbill.setText("Water Bills");
        getContentPane().add(jLabel4_wbill);
        jLabel4_wbill.setBounds(245, 280, 80, 30);

        jLabel5_maintenance.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5_maintenance.setText("Maintenance Expenses");
        getContentPane().add(jLabel5_maintenance);
        jLabel5_maintenance.setBounds(190, 320, 170, 50);

        jTextField1_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_monthActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1_month);
        jTextField1_month.setBounds(370, 90, 360, 60);
        getContentPane().add(jTextField2_payments);
        jTextField2_payments.setBounds(370, 150, 360, 50);
        getContentPane().add(jTextField3_ebill);
        jTextField3_ebill.setBounds(370, 200, 360, 60);

        jTextField4_wbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4_wbillActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4_wbill);
        jTextField4_wbill.setBounds(370, 260, 360, 60);

        jTextField5_maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5_maintenanceActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5_maintenance);
        jTextField5_maintenance.setBounds(370, 320, 360, 60);

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 70, 180, 190);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel4.setText("            NEW MONTH RECORD");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 10, 420, 50);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 850, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5_maintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5_maintenanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5_maintenanceActionPerformed

    private void jTextField1_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_monthActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Expenses expenses = new Expenses();
        
        expenses.month = jTextField1_month.getText();
       expenses.payments = Integer.parseInt(jTextField2_payments.getText());
        expenses.electricityBills = Integer.parseInt(jTextField3_ebill.getText());
        expenses.waterBills = Integer.parseInt(jTextField4_wbill.getText());
        expenses.maintenance = Integer.parseInt(jTextField5_maintenance.getText());

        Admin admin = new Admin(user.userName,user.password,user.userType);

       admin.InsertExpensesData(expenses);

        JOptionPane.showMessageDialog(rootPane, "Record added successfully.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4_wbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4_wbillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_wbillActionPerformed

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
            java.util.logging.Logger.getLogger(InsertExpensesRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertExpensesRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertExpensesRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertExpensesRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertExpensesRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1_month;
    private javax.swing.JLabel jLabel2_payments;
    private javax.swing.JLabel jLabel3_ebill;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel4_wbill;
    private javax.swing.JLabel jLabel5_maintenance;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1_month;
    private javax.swing.JTextField jTextField2_payments;
    private javax.swing.JTextField jTextField3_ebill;
    private javax.swing.JTextField jTextField4_wbill;
    private javax.swing.JTextField jTextField5_maintenance;
    // End of variables declaration//GEN-END:variables
}