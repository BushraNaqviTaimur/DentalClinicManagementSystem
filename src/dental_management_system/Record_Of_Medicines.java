package dental_management_system;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author bushra
 */
public class Record_Of_Medicines extends javax.swing.JFrame
{
    
    User user;
    ResultSet rs; 
   
        public Record_Of_Medicines()
        {
            initComponents();
            this.setLocationRelativeTo(null); // for centering form on screen
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //does not close app on exit of window
        }
       

    public Record_Of_Medicines(User user) 
    {
        initComponents();
            this.setLocationRelativeTo(null); // for centering form on screen
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //does not close app on exit of window

            this.user = user;
            if("Receptionist".equals(user.userType))
        {
            Receptionist recept = new Receptionist(user.userName,user.password,user.userType);
            
            
            
            
            
            try
                {

                rs = recept.ShowAllMedicnesRecord();
                    
                while(jTable1_medicinesRecord.getRowCount() > 0) 
                {
                    ((DefaultTableModel) jTable1_medicinesRecord.getModel()).removeRow(0);

                }


                int columns = rs.getMetaData().getColumnCount();


                while(rs.next())
                {  

                    Object[] row = new Object[columns];
                    for (int i = 1; i <= columns; i++)
                    {  
                        row[i - 1] = rs.getObject(i);
                    }
                    ((DefaultTableModel) jTable1_medicinesRecord.getModel()).insertRow(rs.getRow()-1,row);
                }

            }
        catch (Exception e)
        {
                
        }  
            
        }
        
        
        if("Admin".equals(user.userType))
        {
           Admin admin = new Admin(user.userName,user.password,user.userType);
          
           
            
            
                try
                {
                    
                rs = admin.ShowAllMedicnesRecord();

                while(jTable1_medicinesRecord.getRowCount() > 0) 
                {
                    ((DefaultTableModel) jTable1_medicinesRecord.getModel()).removeRow(0);

                }


                int columns = rs.getMetaData().getColumnCount();


                while(rs.next())
                {  

                    Object[] row = new Object[columns];
                    for (int i = 1; i <= columns; i++)
                    {  
                        row[i - 1] = rs.getObject(i);
                    }
                    ((DefaultTableModel) jTable1_medicinesRecord.getModel()).insertRow(rs.getRow()-1,row);
                }

                }
                catch (Exception e)
                {

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

        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_medicinesRecord = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1_search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2_add = new javax.swing.JMenu();
        jMenuItem2_add = new javax.swing.JMenuItem();
        jMenuItem1_update = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1_refresh = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 23, 760, 500));
        setPreferredSize(new java.awt.Dimension(760, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jTable1_medicinesRecord.setBackground(new java.awt.Color(0, 153, 255));
        jTable1_medicinesRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Generic Name", "Company Name", "Medicine Name", "Quantity", "Cost"
            }
        ));
        jTable1_medicinesRecord.setBounds(new java.awt.Rectangle(0, 0, 900, 800));
        jTable1_medicinesRecord.setPreferredSize(new java.awt.Dimension(900, 800));
        jScrollPane1.setViewportView(jTable1_medicinesRecord);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 74, 750, 350);

        jTextField1.setBackground(new java.awt.Color(51, 102, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(180, 10, 430, 50);

        jButton1_search.setText("Search");
        jButton1_search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_searchActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_search);
        jButton1_search.setBounds(615, 9, 120, 50);

        jLabel1.setText("Search Medicine Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(15, 20, 170, 40);

        jMenu2_add.setText("Functions");

        jMenuItem2_add.setText("Add Record");
        jMenuItem2_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2_addActionPerformed(evt);
            }
        });
        jMenu2_add.add(jMenuItem2_add);

        jMenuItem1_update.setText("Update Record");
        jMenuItem1_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1_updateActionPerformed(evt);
            }
        });
        jMenu2_add.add(jMenuItem1_update);

        jMenuBar1.add(jMenu2_add);

        jMenu2.setText("File");

        jMenuItem1_refresh.setText("Refresh");
        jMenuItem1_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1_refreshActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1_refresh);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1_updateActionPerformed
        
        
        if(jTable1_medicinesRecord.getRowCount()==1)
        {
        Medicines_and_Equipments data = new Medicines_and_Equipments();
       
            data.Generic_Name = jTable1_medicinesRecord.getValueAt(0,0).toString();
            data.Company_Name = jTable1_medicinesRecord.getValueAt(0,1).toString();
            data.Medicines_Name = jTable1_medicinesRecord.getValueAt(0,2).toString();
            data.MQuantity = Integer.parseInt(jTable1_medicinesRecord.getValueAt(0,3).toString());
            data.MCost = Integer.parseInt(jTable1_medicinesRecord.getValueAt(0,4).toString());
            
        
            Receptionist recept = new  Receptionist(user.userName,user.password,user.userType);
       
            recept.UpdateMedicineData(data);
              
            JOptionPane.showMessageDialog(rootPane, "Record updated successfully.");
        }
            
        else
        {
            JOptionPane.showMessageDialog(rootPane, "You must first search for a specific medicine to update.");
        }
    }//GEN-LAST:event_jMenuItem1_updateActionPerformed

    private void jMenuItem2_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2_addActionPerformed
        new InsertMedicineRecordForm(user).setVisible(true);
    }//GEN-LAST:event_jMenuItem2_addActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_searchActionPerformed

            Receptionist recept = new Receptionist(user.userName,user.password,user.userType);
            rs = recept.SearchMedicineData(jTextField1.getText());
        
        
        
        try
        {

        
        while(jTable1_medicinesRecord.getRowCount() > 0) 
        {
            ((DefaultTableModel) jTable1_medicinesRecord.getModel()).removeRow(0);
        }
        int columns = rs.getMetaData().getColumnCount();
        while(rs.next())
        {  
            Object[] row = new Object[columns];
            for (int i = 1; i <= columns; i++)
            {  
                row[i - 1] = rs.getObject(i);
            }
            ((DefaultTableModel) jTable1_medicinesRecord.getModel()).insertRow(rs.getRow()-1,row);
        }
        
        
        }
        catch (Exception e)
        {
        
        }       
    }//GEN-LAST:event_jButton1_searchActionPerformed

    private void jMenuItem1_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1_refreshActionPerformed
         jTextField1.setText("");
         this.jButton1_searchActionPerformed(evt);  
    }//GEN-LAST:event_jMenuItem1_refreshActionPerformed

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
            java.util.logging.Logger.getLogger(Record_Of_Medicines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Record_Of_Medicines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Record_Of_Medicines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Record_Of_Medicines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Record_Of_Medicines().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu2_add;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1_refresh;
    private javax.swing.JMenuItem jMenuItem1_update;
    private javax.swing.JMenuItem jMenuItem2_add;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_medicinesRecord;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}