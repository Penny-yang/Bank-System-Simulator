/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypanels;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import mybanksystem.MySqlConnect;

/**
 *
 * @author yangp
 */
public class RemoveReportLoss extends javax.swing.JPanel {

    /**
     * Creates new form RemoveReportLoss
     */
    public RemoveReportLoss() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        removeReportedPanel = new javax.swing.JPanel();
        queryPanel = new javax.swing.JPanel();
        queryButn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        flowNumTF = new javax.swing.JTextField();
        resultPanel = new javax.swing.JPanel();
        accountTypeL = new javax.swing.JLabel();
        accountTypeTF = new javax.swing.JTextField();
        accountNameL = new javax.swing.JLabel();
        accountNameTF = new javax.swing.JTextField();
        phoneNumL = new javax.swing.JLabel();
        phoneNumTF = new javax.swing.JTextField();
        adressL = new javax.swing.JLabel();
        addressTF = new javax.swing.JTextField();
        idTypeL = new javax.swing.JLabel();
        idTypeTF = new javax.swing.JTextField();
        idNumL = new javax.swing.JLabel();
        idNumTF = new javax.swing.JTextField();
        cardNumTF = new javax.swing.JTextField();
        cardNumL = new javax.swing.JLabel();
        acctNumL = new javax.swing.JLabel();
        accountNumTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        acctStatusTF = new javax.swing.JTextField();
        backButn = new javax.swing.JButton();
        authorizeButn = new javax.swing.JButton();
        enterButn = new javax.swing.JButton();
        title = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        removeReportedPanel.setBackground(new java.awt.Color(255, 255, 255));
        removeReportedPanel.setLayout(null);

        queryPanel.setBackground(new java.awt.Color(255, 255, 255));
        queryPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        queryPanel.setLayout(null);

        queryButn.setText("Search");
        queryButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryButnActionPerformed(evt);
            }
        });
        queryPanel.add(queryButn);
        queryButn.setBounds(390, 20, 100, 29);

        jLabel1.setText("Transaction flow num:");
        queryPanel.add(jLabel1);
        jLabel1.setBounds(10, 20, 170, 20);

        flowNumTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flowNumTFActionPerformed(evt);
            }
        });
        queryPanel.add(flowNumTF);
        flowNumTF.setBounds(180, 20, 190, 26);

        removeReportedPanel.add(queryPanel);
        queryPanel.setBounds(30, 70, 500, 70);

        resultPanel.setBackground(new java.awt.Color(255, 255, 255));
        resultPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        accountTypeL.setText("Account Type:");

        accountTypeTF.setEnabled(false);

        accountNameL.setText("Acctount Name:");

        accountNameTF.setEnabled(false);

        phoneNumL.setText("Phone Num:");

        phoneNumTF.setEnabled(false);

        adressL.setText("Address:");

        addressTF.setEnabled(false);

        idTypeL.setText("ID Type:");

        idTypeTF.setEnabled(false);

        idNumL.setText("ID Num:");

        idNumTF.setEnabled(false);

        cardNumTF.setEnabled(false);

        cardNumL.setText("Card Num:");

        acctNumL.setText("Account Num:");

        accountNumTF.setEnabled(false);

        jLabel2.setText("Account Status:");

        acctStatusTF.setEnabled(false);

        javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idNumL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardNumL, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTypeL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adressL, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumL, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountNameL, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acctNumL, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountTypeL, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cardNumTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountTypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(acctStatusTF, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acctNumL)
                    .addComponent(accountNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardNumL)
                    .addComponent(cardNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountTypeL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountTypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountNameL)
                    .addComponent(accountNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumL)
                    .addComponent(phoneNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adressL)
                    .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTypeL)
                    .addComponent(idTypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idNumL)
                    .addComponent(idNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(acctStatusTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        removeReportedPanel.add(resultPanel);
        resultPanel.setBounds(30, 140, 500, 350);

        backButn.setText("Cancel");
        backButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButnActionPerformed(evt);
            }
        });
        removeReportedPanel.add(backButn);
        backButn.setBounds(180, 510, 90, 40);

        authorizeButn.setText("Authorize");
        authorizeButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorizeButnActionPerformed(evt);
            }
        });
        removeReportedPanel.add(authorizeButn);
        authorizeButn.setBounds(300, 510, 100, 40);

        enterButn.setText("Enter");
        enterButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButnActionPerformed(evt);
            }
        });
        removeReportedPanel.add(enterButn);
        enterButn.setBounds(430, 510, 90, 40);

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setText("Remove Reported Loss");
        removeReportedPanel.add(title);
        title.setBounds(140, 10, 280, 40);

        add(removeReportedPanel);
        removeReportedPanel.setBounds(0, 0, 600, 580);
    }// </editor-fold>//GEN-END:initComponents

    private void flowNumTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flowNumTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flowNumTFActionPerformed

    private void authorizeButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorizeButnActionPerformed

        DialogPanel  dpanel = new DialogPanel();
        JOptionPane.showConfirmDialog(null,dpanel,"Authorize Transaction", JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
        String idname= String.valueOf(dpanel.getID().getSelectedItem());
        String id = idname.substring(0, 10);
        String password = dpanel.getPassword().getText();
        try{
            Connection con = MySqlConnect.ConnectDB(); 
            String query = "select * from tellerinfo where tellID = ? and password = ?";
                          
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, id);
            st.setString(2, password);
            ResultSet result  = st.executeQuery();
            if(result.next()){
                enterButn.setEnabled(true);
                authorizeButn.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(null, "ID and Password do NOT matched!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }  
    }//GEN-LAST:event_authorizeButnActionPerformed

    private void enterButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButnActionPerformed
        removeReportedPanel.setVisible(false);
        try{
            Connection con = MySqlConnect.ConnectDB(); 
            String query = "update acctinfo set acctStatus = \"Valid\" where lossFlowNum = ?";
                          
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, flowNumTF.getText());
                    
            int result  = st.executeUpdate();
            if(result>0){
                 JOptionPane.showMessageDialog(null, "Transaction is successful!");
                 
                
            }else{
                JOptionPane.showMessageDialog(null, "ID and Password do NOT matched!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }  
    }//GEN-LAST:event_enterButnActionPerformed

    private void backButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButnActionPerformed
       removeReportedPanel.setVisible(false);
    }//GEN-LAST:event_backButnActionPerformed

    private void queryButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryButnActionPerformed
         try{
            Connection con = MySqlConnect.ConnectDB(); 
            String query = "select acctNo,acctName,acctType,acctStatus, cardNo,applicantIDType,applicantIDNum,applicantPhone,applicantAddress from acctinfo\n" +
                            " where lossFlowNum = ? ";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, flowNumTF.getText());
            ResultSet result  = st.executeQuery();
          
            if(result.next() ){
                accountNumTF.setText(result.getString("acctNo"));
                accountTypeTF.setText(result.getString("acctType"));
                accountNameTF.setText(result.getString("acctName"));
                phoneNumTF.setText(result.getString("applicantPhone"));
                addressTF.setText(result.getString("applicantAddress"));
                idTypeTF.setText(result.getString("applicantIDType"));
                idNumTF.setText(result.getString("applicantIDNum"));
                acctStatusTF.setText(result.getString("acctStatus"));
                cardNumTF.setText(result.getString("cardNo"));
            }
            else{
                 JOptionPane.showMessageDialog(null, "There is no eligible record, please check!!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Research failed! \n " + e);
        }
        if(acctStatusTF.getText().equals("Valid")){
            JOptionPane.showMessageDialog(null, "This card has already been removed the report of loss!!");
            
        }
        enterButn.setEnabled(false);
       
        
    }//GEN-LAST:event_queryButnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountNameL;
    private javax.swing.JTextField accountNameTF;
    private javax.swing.JTextField accountNumTF;
    private javax.swing.JLabel accountTypeL;
    private javax.swing.JTextField accountTypeTF;
    private javax.swing.JLabel acctNumL;
    private javax.swing.JTextField acctStatusTF;
    private javax.swing.JTextField addressTF;
    private javax.swing.JLabel adressL;
    private javax.swing.JButton authorizeButn;
    private javax.swing.JButton backButn;
    private javax.swing.JLabel cardNumL;
    private javax.swing.JTextField cardNumTF;
    private javax.swing.JButton enterButn;
    private javax.swing.JTextField flowNumTF;
    private javax.swing.JLabel idNumL;
    private javax.swing.JTextField idNumTF;
    private javax.swing.JLabel idTypeL;
    private javax.swing.JTextField idTypeTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel phoneNumL;
    private javax.swing.JTextField phoneNumTF;
    private javax.swing.JButton queryButn;
    private javax.swing.JPanel queryPanel;
    private javax.swing.JPanel removeReportedPanel;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
    public javax.swing.JPanel getmainpanel(){
        return this.removeReportedPanel;
    }
}
