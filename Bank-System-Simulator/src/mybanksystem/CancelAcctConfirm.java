/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybanksystem;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import mypanels.CancelAcct;


/**
 *
 * @author yangp
 */
public class CancelAcctConfirm extends javax.swing.JFrame {
        
    CancelAcct canlscreen;
     String aNum;
     String cNum;
     String aName;
    /**
     * Creates new form CancelAcctConfirm
     */
    public CancelAcctConfirm() {
        initComponents();
    }
     public CancelAcctConfirm(CancelAcct c) {
        initComponents();
        canlscreen = c;

        JTable table = canlscreen.gettable();
        aNum = String.valueOf(table.getModel().getValueAt(table.getSelectedRow(), 0));
        accountNumTF.setText(aNum);
        cNum = String.valueOf(table.getModel().getValueAt(table.getSelectedRow(), 1));
        cardNumTF.setText(cNum);
        aName = String.valueOf(table.getModel().getValueAt(table.getSelectedRow(), 2));
        accountNameTF.setText(aName);
        
        try{
           
             Connection con = MySqlConnect.ConnectDB(); 
             String query = "select acctType,applicantIDNum,applicantIDType,applicantPhone,applicantAddress from acctinfo\n" +
                             "  where acctNo = ? and acctName = ? and cardNo = ?";
              PreparedStatement st = con.prepareStatement(query);
              st.setString(1, aNum);
              st.setString(2, aName);
              st.setString(3, cNum);
              ResultSet result = st.executeQuery();
              
              if(result.next()){
                   accountTypeTF.setText(result.getString("acctType"));
                   phoneNumTF.setText(result.getString("applicantPhone"));
                   addressTF.setText(result.getString("applicantAddress"));
                   idTypeTF.setText(result.getString("applicantIDType"));
                   idNumTF.setText(result.getString("applicantIDNum"));
              }
             
              
              
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Search data failed! \n" + ex);
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

        canAcctConfirmPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        acctNumL = new javax.swing.JLabel();
        accountNumTF = new javax.swing.JTextField();
        cardNumTF = new javax.swing.JTextField();
        cardNumL = new javax.swing.JLabel();
        accountTypeL = new javax.swing.JLabel();
        accountNameL = new javax.swing.JLabel();
        phoneNumL = new javax.swing.JLabel();
        adressL = new javax.swing.JLabel();
        accountTypeTF = new javax.swing.JTextField();
        accountNameTF = new javax.swing.JTextField();
        phoneNumTF = new javax.swing.JTextField();
        addressTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idTypeTF = new javax.swing.JTextField();
        idNumTF = new javax.swing.JTextField();
        backButn = new javax.swing.JButton();
        deleteButn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cancel Account Confirm ");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(744, 692));

        canAcctConfirmPanel.setBackground(new java.awt.Color(255, 255, 255));
        canAcctConfirmPanel.setLayout(null);

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setText("Cancel an Account");
        canAcctConfirmPanel.add(title);
        title.setBounds(220, 50, 240, 29);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel1.setLayout(null);

        acctNumL.setText("Account Num:");
        jPanel1.add(acctNumL);
        acctNumL.setBounds(70, 50, 110, 20);

        accountNumTF.setEnabled(false);
        jPanel1.add(accountNumTF);
        accountNumTF.setBounds(230, 50, 270, 26);

        cardNumTF.setEnabled(false);
        jPanel1.add(cardNumTF);
        cardNumTF.setBounds(230, 90, 270, 26);

        cardNumL.setText("Card Num:");
        jPanel1.add(cardNumL);
        cardNumL.setBounds(70, 90, 110, 20);

        accountTypeL.setText("Account Type:");
        jPanel1.add(accountTypeL);
        accountTypeL.setBounds(70, 120, 110, 30);

        accountNameL.setText("Acctount Name:");
        jPanel1.add(accountNameL);
        accountNameL.setBounds(70, 170, 120, 20);

        phoneNumL.setText("Phone Num:");
        jPanel1.add(phoneNumL);
        phoneNumL.setBounds(70, 210, 120, 20);

        adressL.setText("Address:");
        jPanel1.add(adressL);
        adressL.setBounds(70, 250, 110, 20);

        accountTypeTF.setEnabled(false);
        jPanel1.add(accountTypeTF);
        accountTypeTF.setBounds(230, 130, 270, 26);

        accountNameTF.setEnabled(false);
        jPanel1.add(accountNameTF);
        accountNameTF.setBounds(230, 170, 270, 26);

        phoneNumTF.setEnabled(false);
        jPanel1.add(phoneNumTF);
        phoneNumTF.setBounds(230, 210, 270, 26);

        addressTF.setEnabled(false);
        jPanel1.add(addressTF);
        addressTF.setBounds(230, 250, 270, 26);

        jLabel1.setText("ID Type:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 290, 100, 20);

        jLabel2.setText("ID Num:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 330, 100, 20);

        idTypeTF.setEnabled(false);
        jPanel1.add(idTypeTF);
        idTypeTF.setBounds(230, 290, 270, 26);

        idNumTF.setEnabled(false);
        jPanel1.add(idNumTF);
        idNumTF.setBounds(230, 330, 270, 26);

        canAcctConfirmPanel.add(jPanel1);
        jPanel1.setBounds(60, 110, 580, 390);

        backButn.setText("Back");
        backButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButnActionPerformed(evt);
            }
        });
        canAcctConfirmPanel.add(backButn);
        backButn.setBounds(400, 539, 90, 40);

        deleteButn.setText("Delete");
        deleteButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButnActionPerformed(evt);
            }
        });
        canAcctConfirmPanel.add(deleteButn);
        deleteButn.setBounds(540, 539, 93, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(canAcctConfirmPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(canAcctConfirmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButnActionPerformed
               
                this.setVisible(false);
                
                try{
           
                    Connection con = MySqlConnect.ConnectDB(); 
                    String query = "delete from acctinfo \n" +
"                                   where acctNo = ? and acctName = ? and cardNo = ?";
                    PreparedStatement st = con.prepareStatement(query);
                    st.setString(1, aNum);
                    st.setString(2, aName);
                    st.setString(3, cNum);
                    int result = st.executeUpdate();
                    if(result>0){
                        JOptionPane.showMessageDialog(null, " Account is deleted successfully ! ");
                        canlscreen.setEnableRec(canlscreen.getmainpanel(),true);
                        canlscreen.getmainpanel().setVisible(false); 
                    }
                }catch(Exception ex){
                    
                  JOptionPane.showMessageDialog(null,"Search data failed! \n" + ex);
        }
    }//GEN-LAST:event_deleteButnActionPerformed

    private void backButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButnActionPerformed
        canlscreen.setEnableRec(canlscreen.getmainpanel(),true);
        this.setVisible(false);
    }//GEN-LAST:event_backButnActionPerformed

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
            java.util.logging.Logger.getLogger(CancelAcctConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelAcctConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelAcctConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelAcctConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelAcctConfirm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountNameL;
    private javax.swing.JTextField accountNameTF;
    private javax.swing.JTextField accountNumTF;
    private javax.swing.JLabel accountTypeL;
    private javax.swing.JTextField accountTypeTF;
    private javax.swing.JLabel acctNumL;
    private javax.swing.JTextField addressTF;
    private javax.swing.JLabel adressL;
    private javax.swing.JButton backButn;
    private javax.swing.JPanel canAcctConfirmPanel;
    private javax.swing.JLabel cardNumL;
    private javax.swing.JTextField cardNumTF;
    private javax.swing.JButton deleteButn;
    private javax.swing.JTextField idNumTF;
    private javax.swing.JTextField idTypeTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel phoneNumL;
    private javax.swing.JTextField phoneNumTF;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
