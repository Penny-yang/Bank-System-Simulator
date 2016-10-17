/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypanels;

import com.mysql.jdbc.Connection;
import java.awt.Component;
import java.awt.Container;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import mybanksystem.MySqlConnect;
import mybanksystem.SBtransferConfirm;

/**
 *
 * @author yangp
 */
public class TransferSameB extends javax.swing.JPanel {
        public String acctno = null;
        public String password = null;
        public String cardno = null;
        public String balancepayee = null;
    /**
     * Creates new form SameBTransfer
     */
    public TransferSameB() {
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

        sameBTransterPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        payerPanel = new javax.swing.JPanel();
        cardNum = new javax.swing.JLabel();
        cardName = new javax.swing.JLabel();
        AMT = new javax.swing.JLabel();
        cardNumTF = new javax.swing.JTextField();
        cardNameTF = new javax.swing.JTextField();
        balanceTF = new javax.swing.JTextField();
        balanceCurrency = new javax.swing.JTextField();
        idType = new javax.swing.JLabel();
        idNum = new javax.swing.JLabel();
        idTypeTF = new javax.swing.JTextField();
        idNumTF = new javax.swing.JTextField();
        searchButn = new javax.swing.JButton();
        payeePanel = new javax.swing.JPanel();
        payeeAcct = new javax.swing.JLabel();
        payeeName = new javax.swing.JLabel();
        payeeAMT = new javax.swing.JLabel();
        payeeAcctTF = new javax.swing.JTextField();
        payeeNameTF = new javax.swing.JTextField();
        payeeAmtTF = new javax.swing.JTextField();
        currency = new javax.swing.JLabel();
        currencyCB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bankNoTF = new javax.swing.JTextField();
        bankNameTF = new javax.swing.JTextField();
        cardNum1 = new javax.swing.JLabel();
        payeeCardNumTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        nextButn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        sameBTransterPanel.setBackground(new java.awt.Color(255, 255, 255));
        sameBTransterPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        sameBTransterPanel.setLayout(null);

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setText("Transfer (Same Bank)");
        sameBTransterPanel.add(title);
        title.setBounds(160, 30, 270, 29);

        payerPanel.setBackground(new java.awt.Color(255, 255, 255));
        payerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), "Payer Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        payerPanel.setEnabled(false);

        cardNum.setText("Card Num:");

        cardName.setText("Card Name:");

        AMT.setText("Account Balance:");

        balanceTF.setEnabled(false);

        balanceCurrency.setEnabled(false);

        idType.setText("ID Type:");

        idNum.setText("ID Num:");

        idTypeTF.setEnabled(false);

        idNumTF.setEnabled(false);

        searchButn.setText("search");
        searchButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout payerPanelLayout = new javax.swing.GroupLayout(payerPanel);
        payerPanel.setLayout(payerPanelLayout);
        payerPanelLayout.setHorizontalGroup(
            payerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payerPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(payerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(payerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cardNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cardName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AMT, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(idType)
                    .addComponent(idNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(payerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cardNumTF)
                    .addComponent(cardNameTF)
                    .addGroup(payerPanelLayout.createSequentialGroup()
                        .addComponent(balanceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(balanceCurrency))
                    .addComponent(idTypeTF)
                    .addComponent(idNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        payerPanelLayout.setVerticalGroup(
            payerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payerPanelLayout.createSequentialGroup()
                .addGroup(payerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardNum)
                    .addComponent(cardNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(payerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardName)
                    .addComponent(cardNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(payerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AMT)
                    .addComponent(balanceCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(payerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idType)
                    .addComponent(idTypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(payerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idNum)))
        );

        sameBTransterPanel.add(payerPanel);
        payerPanel.setBounds(20, 70, 500, 200);

        payeePanel.setBackground(new java.awt.Color(255, 255, 255));
        payeePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), "Payee Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        payeePanel.setEnabled(false);

        payeeAcct.setText("Payee Account:");

        payeeName.setText("Payee Name:");

        payeeAMT.setText("Payee Amount:");

        currency.setText("Currency:");

        currencyCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "RMB" }));

        jLabel3.setText("Bank No:");

        jLabel4.setText("Bank Name:");

        cardNum1.setText("Card Num:");

        javax.swing.GroupLayout payeePanelLayout = new javax.swing.GroupLayout(payeePanel);
        payeePanel.setLayout(payeePanelLayout);
        payeePanelLayout.setHorizontalGroup(
            payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payeePanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(payeePanelLayout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bankNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(payeePanelLayout.createSequentialGroup()
                            .addGroup(payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(currency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(payeeAcct, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(payeeAMT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(payeeName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cardNum1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(32, 32, 32)
                            .addGroup(payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(currencyCB, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(payeeCardNumTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(payeeAmtTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(payeeNameTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(payeeAcctTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(bankNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        payeePanelLayout.setVerticalGroup(
            payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payeePanelLayout.createSequentialGroup()
                .addGroup(payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardNum1)
                    .addComponent(payeeCardNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payeeAcct)
                    .addComponent(payeeAcctTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payeeName)
                    .addComponent(payeeNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payeeAMT)
                    .addComponent(payeeAmtTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currency)
                    .addComponent(currencyCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bankNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        sameBTransterPanel.add(payeePanel);
        payeePanel.setBounds(20, 270, 500, 260);

        jButton1.setText("Cancel");
        sameBTransterPanel.add(jButton1);
        jButton1.setBounds(299, 540, 90, 29);

        nextButn.setText("Next");
        nextButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButnActionPerformed(evt);
            }
        });
        sameBTransterPanel.add(nextButn);
        nextButn.setBounds(425, 540, 80, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sameBTransterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sameBTransterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButnActionPerformed
        if((payeeAcctTF.getText()).equals("")){
            JOptionPane.showMessageDialog(null, "Payee account number must be entered !!");
        }else if ((payeeCardNumTF.getText()).equals("")){
            JOptionPane.showMessageDialog(null, "Payee card no must be entered !!");
        }else if((payeeNameTF.getText()).equals("")){
            JOptionPane.showMessageDialog(null, "Payee account name must be entered !!");
        }else if((payeeAmtTF.getText()).equals("")){
            JOptionPane.showMessageDialog(null, "Transaction amount must be entered !!");
        }else if((bankNoTF.getText()).equals("")){
             JOptionPane.showMessageDialog(null, "Bank NO must be entered !!");
        }else if((bankNameTF.getText()).equals("")){
             JOptionPane.showMessageDialog(null, "Bank Name must be entered !!");
       }else{
            
          //check account information~~---same bank transfer have to put correct information, no DAICHULI status
          try{ 
            Connection con = MySqlConnect.ConnectDB();
            String query1 ="select * from acctinfo where cardNo = ?";
            PreparedStatement sti = con.prepareStatement(query1);
            sti.setString(1,payeeCardNumTF.getText() );
            ResultSet result1 = sti.executeQuery();
            if(result1.next()){
                balancepayee = result1.getString("balance");
                if(!(payeeAcctTF.getText()).equals(result1.getString("acctNo"))){
                    JOptionPane.showMessageDialog(null,"Payee Account Number is WRONG! \n");
                }else if(!(payeeNameTF.getText()).equals(result1.getString("acctName"))){
                    JOptionPane.showMessageDialog(null,"Payee Account Name is WRONG! \n");
                }else{
                    SBtransferConfirm confirm = new SBtransferConfirm(this);
                    confirm.setVisible(true);
                    setEnableRec(sameBTransterPanel,false);
                }
            }else{
                JOptionPane.showMessageDialog(null,"Payee Card Number is WRONG! \n");
            }
         }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Transaction sending failed! \n" + e);
            }
             
        }
    }//GEN-LAST:event_nextButnActionPerformed

    private void searchButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButnActionPerformed
        cardno = cardNumTF.getText();
        if((cardNumTF.getText()).equals("")){
            JOptionPane.showMessageDialog(null, "Card Number must be entered !!");
        }else if((cardNameTF.getText()).equals("")){
            JOptionPane.showMessageDialog(null, "Card Name must be entered !!");
        }else{
            try{
           
             Connection con = MySqlConnect.ConnectDB(); 
             String query = "select * from acctinfo where cardNo = ? and acctName = ?";
              PreparedStatement st = con.prepareStatement(query);
              st.setString(1, cardNumTF.getText());
              st.setString(2, cardNameTF.getText());
             
              ResultSet result = st.executeQuery();
              
              if(result.next()){
                   acctno = result.getString("acctNo");
                   password = result.getString("cardPassword");
                   balanceTF.setText(result.getString("balance"));
                   balanceCurrency.setText(result.getString("currency"));
                   idTypeTF.setText(result.getString("applicantIDType"));
                   idNumTF.setText(result.getString("applicantIDNum"));
              }else{
                  JOptionPane.showMessageDialog(null, "There is no eligible record !!");
              }
             
     
          } catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Search data failed! \n" + ex);
        }
       }
    }//GEN-LAST:event_searchButnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AMT;
    private javax.swing.JTextField balanceCurrency;
    private javax.swing.JTextField balanceTF;
    private javax.swing.JTextField bankNameTF;
    private javax.swing.JTextField bankNoTF;
    private javax.swing.JLabel cardName;
    private javax.swing.JTextField cardNameTF;
    private javax.swing.JLabel cardNum;
    private javax.swing.JLabel cardNum1;
    private javax.swing.JTextField cardNumTF;
    private javax.swing.JLabel currency;
    private javax.swing.JComboBox<String> currencyCB;
    private javax.swing.JLabel idNum;
    private javax.swing.JTextField idNumTF;
    private javax.swing.JLabel idType;
    private javax.swing.JTextField idTypeTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton nextButn;
    private javax.swing.JLabel payeeAMT;
    private javax.swing.JLabel payeeAcct;
    private javax.swing.JTextField payeeAcctTF;
    private javax.swing.JTextField payeeAmtTF;
    private javax.swing.JTextField payeeCardNumTF;
    private javax.swing.JLabel payeeName;
    private javax.swing.JTextField payeeNameTF;
    private javax.swing.JPanel payeePanel;
    private javax.swing.JPanel payerPanel;
    private javax.swing.JPanel sameBTransterPanel;
    private javax.swing.JButton searchButn;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JPanel getmainpanel(){
        return this.sameBTransterPanel;
    }
    
    public javax.swing.JTextField getpayname(){
        return this.cardNameTF;
    }
    public javax.swing.JTextField getcardnum(){
        return this.cardNumTF;
    }
    
    public javax.swing.JTextField getbalance(){
        return this.balanceTF;
    }
    public javax.swing.JTextField getidnum(){
        return this.idNumTF;
    }
    public javax.swing.JTextField getidtype(){
        return this.idTypeTF;
    }
    
    public javax.swing.JTextField getpayeeacct(){
        return this.payeeAcctTF;
    }
    public javax.swing.JTextField getpayeename(){
        return this.payeeNameTF;
    }
    public javax.swing.JTextField getamt(){
        return this.payeeAmtTF;
    }
    public javax.swing.JComboBox<String> getpayeecurrency(){
        return this.currencyCB;
    }
    
     public javax.swing.JTextField getbankno(){
        return this.bankNoTF;
    }
     
      public javax.swing.JTextField getbankname(){
        return this.bankNameTF;
    }
      
       public javax.swing.JTextField getpayeecardno(){
        return this.payeeCardNumTF;
    }
       public javax.swing.JTextField getbalancecurrency(){
           return this.balanceCurrency;
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
