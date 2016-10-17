/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypanels;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JOptionPane;
import mybanksystem.CheckNumber;
import mybanksystem.OpenAcctConfirm;

/**
 *
 * @author yangp
 */
public class OpenAcct extends javax.swing.JPanel implements CheckNumber{
    public String teller = null;
  
   
    public OpenAcct() {
        initComponents();
    }
      public OpenAcct(String tellerID) {
        initComponents();
        teller = tellerID;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        openAcctPanel = new javax.swing.JPanel();
        titleLB = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        NameLB = new javax.swing.JLabel();
        appliNameTF = new javax.swing.JTextField();
        addressLB = new javax.swing.JLabel();
        addressTF = new javax.swing.JTextField();
        phoneNumLB = new javax.swing.JLabel();
        phoneNumTF = new javax.swing.JTextField();
        countryLB = new javax.swing.JLabel();
        countryTF = new javax.swing.JTextField();
        idTypeLB = new javax.swing.JLabel();
        idTypeCB = new javax.swing.JComboBox<>();
        idNumLB = new javax.swing.JLabel();
        idNumTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cardNumLB = new javax.swing.JLabel();
        cardNumTF = new javax.swing.JTextField();
        accNumLB = new javax.swing.JLabel();
        accNumTF = new javax.swing.JTextField();
        remarkLB = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        remarkTA = new javax.swing.JTextArea();
        acctType = new javax.swing.JLabel();
        acctTypeCB = new javax.swing.JComboBox<>();
        cardType = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        enterButn = new javax.swing.JButton();
        cancelButn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        openAcctPanel.setBackground(new java.awt.Color(255, 255, 255));
        openAcctPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        openAcctPanel.setEnabled(false);
        openAcctPanel.setLayout(null);

        titleLB.setFont(titleLB.getFont().deriveFont(titleLB.getFont().getSize()+6f));
        titleLB.setText("Open an Account");
        openAcctPanel.add(titleLB);
        titleLB.setBounds(170, 10, 180, 27);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)), "Applicatnt Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.setEnabled(false);
        jPanel1.setLayout(null);

        NameLB.setText("Name:");
        jPanel1.add(NameLB);
        NameLB.setBounds(10, 40, 47, 20);

        appliNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appliNameTFActionPerformed(evt);
            }
        });
        jPanel1.add(appliNameTF);
        appliNameTF.setBounds(130, 40, 130, 26);

        addressLB.setText("Address:");
        jPanel1.add(addressLB);
        addressLB.setBounds(10, 160, 70, 20);

        addressTF.setToolTipText("Address1");
        jPanel1.add(addressTF);
        addressTF.setBounds(130, 160, 390, 26);

        phoneNumLB.setText("Phone Num:");
        jPanel1.add(phoneNumLB);
        phoneNumLB.setBounds(10, 80, 90, 20);
        jPanel1.add(phoneNumTF);
        phoneNumTF.setBounds(130, 80, 130, 26);

        countryLB.setText("Home Country:");
        jPanel1.add(countryLB);
        countryLB.setBounds(10, 120, 120, 20);
        jPanel1.add(countryTF);
        countryTF.setBounds(130, 120, 130, 26);

        idTypeLB.setText("ID type:");
        jPanel1.add(idTypeLB);
        idTypeLB.setBounds(290, 30, 70, 20);

        idTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Social Security Card", "Passport", " ", " " }));
        jPanel1.add(idTypeCB);
        idTypeCB.setBounds(350, 30, 170, 26);

        idNumLB.setText("ID Num:");
        jPanel1.add(idNumLB);
        idNumLB.setBounds(290, 70, 70, 20);
        jPanel1.add(idNumTF);
        idNumTF.setBounds(360, 70, 160, 26);

        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("*");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 50, 20, 10);

        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("*");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 90, 20, 10);

        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("*");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 130, 20, 10);

        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("*");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 170, 20, 10);

        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("*");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(350, 80, 20, 10);

        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("*");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(340, 40, 20, 10);

        openAcctPanel.add(jPanel1);
        jPanel1.setBounds(10, 70, 530, 200);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)), "Card Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel2.setEnabled(false);
        jPanel2.setLayout(null);

        cardNumLB.setText("Card Num:");
        jPanel2.add(cardNumLB);
        cardNumLB.setBounds(10, 30, 90, 20);

        cardNumTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNumTFActionPerformed(evt);
            }
        });
        jPanel2.add(cardNumTF);
        cardNumTF.setBounds(130, 30, 160, 26);

        accNumLB.setText("Account Num:");
        jPanel2.add(accNumLB);
        accNumLB.setBounds(10, 60, 110, 20);
        jPanel2.add(accNumTF);
        accNumTF.setBounds(130, 60, 160, 26);

        remarkLB.setText("Remark: ");
        jPanel2.add(remarkLB);
        remarkLB.setBounds(10, 110, 80, 20);

        remarkTA.setColumns(20);
        remarkTA.setRows(5);
        jScrollPane1.setViewportView(remarkTA);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(130, 90, 300, 70);

        acctType.setText("Acct Type:");
        jPanel2.add(acctType);
        acctType.setBounds(310, 60, 76, 20);

        acctTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saving Acct", "Checking Acct", " " }));
        jPanel2.add(acctTypeCB);
        acctTypeCB.setBounds(390, 60, 130, 26);

        cardType.setText("Card Type:");
        jPanel2.add(cardType);
        cardType.setBounds(310, 30, 80, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Debit Card", "Credit Card", " " }));
        jPanel2.add(jComboBox2);
        jComboBox2.setBounds(390, 30, 130, 26);

        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("*");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(300, 40, 20, 10);

        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("*");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(100, 40, 20, 10);

        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("*");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(110, 70, 20, 10);

        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("*");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(300, 70, 20, 10);

        openAcctPanel.add(jPanel2);
        jPanel2.setBounds(10, 280, 530, 180);

        enterButn.setText("Next");
        enterButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButnActionPerformed(evt);
            }
        });
        openAcctPanel.add(enterButn);
        enterButn.setBounds(430, 480, 93, 29);

        cancelButn.setText("Cancel");
        cancelButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButnActionPerformed(evt);
            }
        });
        openAcctPanel.add(cancelButn);
        cancelButn.setBounds(310, 480, 79, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(openAcctPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(openAcctPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void appliNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appliNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appliNameTFActionPerformed

    private void cardNumTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNumTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNumTFActionPerformed

    private void cancelButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelButnActionPerformed

    private void enterButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButnActionPerformed
     
        if ((appliNameTF.getText().equals(""))||(phoneNumTF.getText()).equals("") || (countryTF.getText()).equals("") ||
               (addressTF.getText()).equals("") || (idNumTF.getText()).equals("") || (cardNumTF.getText()).equals("") ||
               (accNumTF.getText()).equals("") )
        {
           
        JOptionPane.showMessageDialog(null, "Required information is missing\n please check and try again!", "Warning", JOptionPane.OK_OPTION);      
        }
        else if((! CheckNumber.isNumeric(phoneNumTF.getText())) || (phoneNumTF.getText()).length()> 10)
        {
            
         JOptionPane.showMessageDialog(null, "Phone Number is invalid! Requirement:  11 number\n please check and try again!"); 
        }
                   
        else if(! CheckNumber.isNumeric(cardNumTF.getText()) || cardNumTF.getText().length() != 16) {
           JOptionPane.showMessageDialog(null, "Card Number is invalid! Requirement: 16 numbers\n please check and try again!");         
 
        }
        else if(! CheckNumber.isNumeric(accNumTF.getText())){
             JOptionPane.showMessageDialog(null, "Account Number is invalid! \n please check and try again!");     
        }
        
 
       else{
 
            OpenAcctConfirm confirmopen = new OpenAcctConfirm(this);
            confirmopen.setVisible(true);
            setEnableRec(openAcctPanel,false);
       }
    }//GEN-LAST:event_enterButnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameLB;
    private javax.swing.JLabel accNumLB;
    private javax.swing.JTextField accNumTF;
    private javax.swing.JLabel acctType;
    private javax.swing.JComboBox<String> acctTypeCB;
    private javax.swing.JLabel addressLB;
    private javax.swing.JTextField addressTF;
    private javax.swing.JTextField appliNameTF;
    private javax.swing.JButton cancelButn;
    private javax.swing.JLabel cardNumLB;
    private javax.swing.JTextField cardNumTF;
    private javax.swing.JLabel cardType;
    private javax.swing.JLabel countryLB;
    private javax.swing.JTextField countryTF;
    private javax.swing.JButton enterButn;
    private javax.swing.JLabel idNumLB;
    private javax.swing.JTextField idNumTF;
    private javax.swing.JComboBox<String> idTypeCB;
    private javax.swing.JLabel idTypeLB;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel openAcctPanel;
    private javax.swing.JLabel phoneNumLB;
    private javax.swing.JTextField phoneNumTF;
    private javax.swing.JLabel remarkLB;
    private javax.swing.JTextArea remarkTA;
    private javax.swing.JLabel titleLB;
    // End of variables declaration//GEN-END:variables

 
 public  javax.swing.JTextField getappliNameTF(){
     return this.appliNameTF;
 }
 
  public  javax.swing.JTextField getphoneNumTF(){
     return this.phoneNumTF;
 }
  public  javax.swing.JTextField getcountryTF(){
     return this.countryTF;
 }
  public  javax.swing.JTextField getaddressTF(){
     return this.addressTF;
 }
  public  javax.swing.JComboBox<String> getidTypeCB(){
     return this.idTypeCB;
 }
  public  javax.swing.JTextField getidNumTF(){
     return this.idNumTF;
 }
  public  javax.swing.JTextField getcardNumTF(){
     return this.cardNumTF;
 }
  
 public  javax.swing.JTextField getaccNumTF(){
     return this.accNumTF;
 }
 
  public  javax.swing.JTextArea getremarkTA(){
     return this.remarkTA;
 }
  
  public  javax.swing.JComboBox<String> getacctTypeCB(){
     return this.acctTypeCB;
 }
  public  javax.swing.JComboBox<String> getcardTypeCB(){
     return this.jComboBox2;
 }
  
 public javax.swing.JPanel getpanel(){
     return this.openAcctPanel;
 }
 
  ///disable the panel when new frame show up
  public void setEnableRec(Component container, boolean enable){
    container.setEnabled(enable);

    try {
        Component[] components= ((Container) container).getComponents();
        for (int i = 0; i < components.length; i++) {
            setEnableRec(components[i], enable);
        }
    } catch (ClassCastException e) {
        System.out.println("there is error");
    }
}
  
}