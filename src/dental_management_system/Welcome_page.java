package dental_management_system;


/**
 *
 * @author bushra
 */
public class Welcome_page extends javax.swing.JFrame {
  

    /**
     * Creates new form Welcome_page_doctor
     */
    User user;
    public Welcome_page() {
        initComponents();
        
       
    }
public Welcome_page(User user) 
    {
        initComponents();
        
       this.setLocationRelativeTo(null); // for centering form on screen
        
        
        this.user = user;
        
        label_welcome.setText("Welcome, "+user.userName);
        switch(user.userType)
        {
            case "Doctor":
            {
                btnAppointmentsList.setVisible(true);
                btnExpensesRecord.setVisible(false);
                btnMedicinesRecord.setVisible(false);
                btnPatientsHistory.setVisible(true);
                jLabel4.setVisible(false);
                jLabel1.setVisible(false);
                break;
            }
            case "Receptionist":
            {
                btnAppointmentsList.setVisible(true);
                btnExpensesRecord.setVisible(false);
                btnMedicinesRecord.setVisible(true);
                btnPatientsHistory.setVisible(true);
                jLabel4.setVisible(false);
                break;
            }
            case "Admin":
            {
                btnAppointmentsList.setVisible(false);
                btnExpensesRecord.setVisible(true);
                btnMedicinesRecord.setVisible(true);
                btnPatientsHistory.setVisible(false);
                jLabel4.setVisible(true);
                break;
            }
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

        Label_heading = new javax.swing.JLabel();
        label_welcome = new javax.swing.JLabel();
        btnPatientsHistory = new javax.swing.JButton();
        btnAppointmentsList = new javax.swing.JButton();
        btnExpensesRecord = new javax.swing.JButton();
        btnMedicinesRecord = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Label_backimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1000, 500));
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setPreferredSize(new java.awt.Dimension(1000, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 500));
        getContentPane().setLayout(null);

        Label_heading.setBackground(new java.awt.Color(51, 255, 255));
        Label_heading.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Label_heading.setText("   Dental Clinic Management System");
        getContentPane().add(Label_heading);
        Label_heading.setBounds(120, 10, 750, 80);

        label_welcome.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        label_welcome.setText("HELLO,");
        getContentPane().add(label_welcome);
        label_welcome.setBounds(160, 120, 380, 50);

        btnPatientsHistory.setBackground(new java.awt.Color(0, 0, 0));
        btnPatientsHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientsHistoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnPatientsHistory);
        btnPatientsHistory.setBounds(320, 270, 190, 110);

        btnAppointmentsList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppointmentsListActionPerformed(evt);
            }
        });
        getContentPane().add(btnAppointmentsList);
        btnAppointmentsList.setBounds(780, 260, 180, 120);

        btnExpensesRecord.setPreferredSize(new java.awt.Dimension(650, 325));
        btnExpensesRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpensesRecordActionPerformed(evt);
            }
        });
        getContentPane().add(btnExpensesRecord);
        btnExpensesRecord.setBounds(560, 260, 160, 120);

        btnMedicinesRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicinesRecordActionPerformed(evt);
            }
        });
        getContentPane().add(btnMedicinesRecord);
        btnMedicinesRecord.setBounds(90, 250, 140, 130);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 2, 18)); // NOI18N
        jLabel1.setText("MEDICINES & EQUIPMENTS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 380, 240, 40);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 2, 16)); // NOI18N
        jLabel2.setText("HISTORY OF PATIENTS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 380, 180, 40);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 2, 18)); // NOI18N
        jLabel3.setText(" APPOINTMENT LIST ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(790, 380, 180, 40);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 2, 16)); // NOI18N
        jLabel4.setText(" RECORD OF EXPENSES");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(550, 380, 190, 40);

        Label_backimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dental_management_system/images/appbackground.png"))); // NOI18N
        Label_backimage.setText("jLabel3");
        Label_backimage.setMaximumSize(new java.awt.Dimension(650, 490));
        Label_backimage.setMinimumSize(new java.awt.Dimension(650, 490));
        Label_backimage.setPreferredSize(new java.awt.Dimension(650, 490));
        getContentPane().add(Label_backimage);
        Label_backimage.setBounds(0, 0, 1000, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPatientsHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientsHistoryActionPerformed

         new ViewPatientData(user).setVisible(true);
    }//GEN-LAST:event_btnPatientsHistoryActionPerformed

    private void btnExpensesRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpensesRecordActionPerformed
         new ViewExpensesRecord(user).setVisible(true);
    }//GEN-LAST:event_btnExpensesRecordActionPerformed

    private void btnAppointmentsListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentsListActionPerformed
       
         new ViewAppointmentList(user).setVisible(true);
    }//GEN-LAST:event_btnAppointmentsListActionPerformed

    private void btnMedicinesRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicinesRecordActionPerformed
       new ViewMedicinesrecord(user).setVisible(true);
    }//GEN-LAST:event_btnMedicinesRecordActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_backimage;
    private javax.swing.JLabel Label_heading;
    private javax.swing.JButton btnAppointmentsList;
    private javax.swing.JButton btnExpensesRecord;
    private javax.swing.JButton btnMedicinesRecord;
    private javax.swing.JButton btnPatientsHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel label_welcome;
    // End of variables declaration//GEN-END:variables
}