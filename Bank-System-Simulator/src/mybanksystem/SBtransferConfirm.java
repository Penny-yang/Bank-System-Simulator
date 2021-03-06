/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybanksystem;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import javax.swing.JOptionPane;
import mypanels.TransferSameB;

/**
 *
 * @author yangp
 */
public class SBtransferConfirm extends javax.swing.JFrame {
        TransferSameB samebank;
        String cardnum;
        String status;
        String reason;
    /**
     * Creates new form SBtransferConfirm
     */
    public SBtransferConfirm() {
        initComponents();
    }
    
    public SBtransferConfirm(TransferSameB b) {
        initComponents();
        samebank = b;
        String name = String.valueOf(samebank.getpayname().getText());
        cardnum = String.valueOf(samebank.getcardnum().getText());
        
        accountNumTF.setText(samebank.acctno);
        accountNameTF.setText(name);
        balanceTF.setText(String.valueOf(samebank.getbalance().getText()));
        idTypeTF.setText(String.valueOf(samebank.getidtype().getText()));
        idNumTF.setText(String.valueOf(samebank.getidnum().getText()));
        balanceCurrency.setText(samebank.getbalancecurrency().getText());
        payeeAcctTF.setText(String.valueOf(samebank.getpayeeacct().getText()));
        payeeNameTF.setText(String.valueOf(samebank.getpayeename().getText()));
        payeeAmtTF.setText(String.valueOf(samebank.getamt().getText()));
        payeecurrency.setSelectedItem(String.valueOf(samebank.getpayeecurrency().getSelectedItem()));
        bankno.setText(samebank.getbankno().getText());
        bankName.setText(samebank.getbankname().getText());
        payeeCardNumTF.setText(samebank.getpayeecardno().getText());
        flowNumTF.setText(getflowNum());
                   
            
             
     
         
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        samebankTransfer = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        payerPanel = new javax.swing.JPanel();
        accountNum = new javax.swing.JLabel();
        acountName = new javax.swing.JLabel();
        AMT = new javax.swing.JLabel();
        accountNumTF = new javax.swing.JTextField();
        accountNameTF = new javax.swing.JTextField();
        balanceTF = new javax.swing.JTextField();
        balanceCurrency = new javax.swing.JTextField();
        idType = new javax.swing.JLabel();
        idNum = new javax.swing.JLabel();
        idTypeTF = new javax.swing.JTextField();
        idNumTF = new javax.swing.JTextField();
        payeePanel = new javax.swing.JPanel();
        payeeAcct = new javax.swing.JLabel();
        payeeName = new javax.swing.JLabel();
        payeeAMT = new javax.swing.JLabel();
        payeeAcctTF = new javax.swing.JTextField();
        payeeNameTF = new javax.swing.JTextField();
        payeeAmtTF = new javax.swing.JTextField();
        currency = new javax.swing.JLabel();
        payeecurrency = new javax.swing.JComboBox<>();
        cardNum = new javax.swing.JLabel();
        payeeCardNumTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bankno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bankName = new javax.swing.JTextField();
        transaInfPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RMTF = new javax.swing.JTextField();
        flowNumTF = new javax.swing.JTextField();
        backButn = new javax.swing.JButton();
        enterButn = new javax.swing.JButton();
        password = new javax.swing.JLabel();
        passwordTF = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transfer (Same Bank) Confirm ");
        setBackground(new java.awt.Color(255, 255, 255));

        samebankTransfer.setBackground(new java.awt.Color(255, 255, 255));
        samebankTransfer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setText("Transfer (Same Bank)");

        payerPanel.setBackground(new java.awt.Color(255, 255, 255));
        payerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), "Payer Information"));
        payerPanel.setEnabled(false);

        accountNum.setText("Account Num:");

        acountName.setText("Account Name:");

        AMT.setText("Account Balance:");

        accountNumTF.setEnabled(false);

        accountNameTF.setEnabled(false);

        balanceTF.setEnabled(false);

        balanceCurrency.setEnabled(false);

        idType.setText("ID Type:");

        idNum.setText("ID Num:");

        idTypeTF.setEnabled(false);

        idNumTF.setEnabled(false);

        javax.swing.GroupLayout payerPanelLayout = new javax.swing.GroupLayout(payerPanel);
        payerPanel.setLayout(payerPanelLayout);
        payerPanelLayout.setHorizontalGroup(
            payerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payerPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(payerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(payerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(accountNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(acountName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AMT, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(idType)
                    .addComponent(idNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(payerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accountNumTF)
                    .addComponent(accountNameTF)
                    .addGroup(payerPanelLayout.createSequentialGroup()
                        .addComponent(balanceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(balanceCurrency))
                    .addComponent(idNumTF)
                    .addComponent(idTypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );
        payerPanelLayout.setVerticalGroup(
            payerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payerPanelLayout.createSequentialGroup()
                .addGroup(payerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountNum)
                    .addComponent(accountNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(payerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acountName)
                    .addComponent(accountNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(payerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AMT)
                    .addComponent(balanceCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(payerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idType)
                    .addComponent(idTypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(payerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idNum))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        payeePanel.setBackground(new java.awt.Color(255, 255, 255));
        payeePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), "Payee Information"));
        payeePanel.setEnabled(false);

        payeeAcct.setText("Payee Account:");

        payeeName.setText("Payee Name:");

        payeeAMT.setText("Payee Amount:");

        payeeAcctTF.setEnabled(false);

        payeeNameTF.setEnabled(false);

        payeeAmtTF.setEnabled(false);

        currency.setText("Currency:");

        payeecurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "RMB" }));
        payeecurrency.setEnabled(false);

        cardNum.setText("Card Num:");

        payeeCardNumTF.setEnabled(false);

        jLabel3.setText("Bank No:");

        bankno.setEnabled(false);

        jLabel4.setText("Bank Name:");

        bankName.setEnabled(false);

        javax.swing.GroupLayout payeePanelLayout = new javax.swing.GroupLayout(payeePanel);
        payeePanel.setLayout(payeePanelLayout);
        payeePanelLayout.setHorizontalGroup(
            payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payeePanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cardNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(currency, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(payeeAcct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(payeeAMT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(payeeName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(payeeAcctTF)
                    .addComponent(payeeNameTF)
                    .addComponent(payeeAmtTF)
                    .addComponent(payeecurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payeeCardNumTF)
                    .addComponent(bankno)
                    .addComponent(bankName, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        payeePanelLayout.setVerticalGroup(
            payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payeePanelLayout.createSequentialGroup()
                .addGroup(payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardNum)
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
                    .addComponent(payeecurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(payeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        transaInfPanel.setBackground(new java.awt.Color(255, 255, 255));
        transaInfPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), "Transaction Information"));
        transaInfPanel.setEnabled(false);

        jLabel1.setText("tellerID:");

        jLabel2.setText("Transaction Flow Num:");

        RMTF.setEnabled(false);

        flowNumTF.setEnabled(false);

        javax.swing.GroupLayout transaInfPanelLayout = new javax.swing.GroupLayout(transaInfPanel);
        transaInfPanel.setLayout(transaInfPanelLayout);
        transaInfPanelLayout.setHorizontalGroup(
            transaInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaInfPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(transaInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(transaInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RMTF)
                    .addComponent(flowNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        transaInfPanelLayout.setVerticalGroup(
            transaInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaInfPanelLayout.createSequentialGroup()
                .addGroup(transaInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RMTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(transaInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(flowNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        backButn.setText("Back");
        backButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButnActionPerformed(evt);
            }
        });

        enterButn.setText("Enter");
        enterButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButnActionPerformed(evt);
            }
        });

        password.setText("Password: ");

        javax.swing.GroupLayout samebankTransferLayout = new javax.swing.GroupLayout(samebankTransfer);
        samebankTransfer.setLayout(samebankTransferLayout);
        samebankTransferLayout.setHorizontalGroup(
            samebankTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(samebankTransferLayout.createSequentialGroup()
                .addGroup(samebankTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(samebankTransferLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(samebankTransferLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(samebankTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(samebankTransferLayout.createSequentialGroup()
                                .addGroup(samebankTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(samebankTransferLayout.createSequentialGroup()
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(backButn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addComponent(enterButn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(samebankTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(transaInfPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(payerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(payeePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        samebankTransferLayout.setVerticalGroup(
            samebankTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(samebankTransferLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(transaInfPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(payerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(payeePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(samebankTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password)
                    .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(samebankTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enterButn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(samebankTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(samebankTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButnActionPerformed
        
       ///for outside--insert data into outtransaction file--
        if(!String.valueOf(passwordTF.getPassword()).equals(samebank.password)){
            JOptionPane.showMessageDialog(null, "Password is NOT correct !!");
        }else{
            try{ 
            Connection con = MySqlConnect.ConnectDB(); 
            String query = "insert into outtransaction values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, flowNumTF.getText());
            st.setString(2, accountNumTF.getText());
            st.setString(3, accountNameTF.getText());
            st.setString(4, bankno.getText());
            st.setString(5, bankName.getText());
            st.setString(6, cardnum);
            st.setString(7, payeeAcctTF.getText());
            st.setString(8, payeeNameTF.getText());
            st.setString(9, payeeCardNumTF.getText());
            st.setString(10,bankno.getText());
            st.setString(11,bankName.getText());
            st.setString(12,payeeAmtTF.getText());
            st.setString(13,payeecurrency.getSelectedItem().toString());
            st.setString(14,new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()));
            st.setString(15, new SimpleDateFormat("HHmmss").format(Calendar.getInstance().getTime()));
            st.setString(16, "ppppp");
            
          int result = st.executeUpdate();
          if(result>0){
               JOptionPane.showMessageDialog(null, "Date is saved! \n Transaction is successful! ");
               samebank.setEnableRec(samebank.getmainpanel(),true);
               this.setVisible(false);
               samebank.getmainpanel().setVisible(false);
 
         //inward--insert data into intransaction file--
          try{ 
            
            
            String query2 = "insert into intransaction values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st2 = con.prepareStatement(query2);
            st2.setString(1, getflowNum());
            st2.setString(2, accountNumTF.getText());
            st2.setString(3, accountNameTF.getText());
            st2.setString(4, bankno.getText());
            st2.setString(5, bankName.getText());
            st2.setString(6, cardnum);
            st2.setString(7, payeeAcctTF.getText());
            st2.setString(8, payeeNameTF.getText());
            st2.setString(9, payeeCardNumTF.getText());
            st2.setString(10,bankno.getText());
            st2.setString(11,bankName.getText());
            st2.setString(12,payeeAmtTF.getText());
            st2.setString(13,payeecurrency.getSelectedItem().toString());
            st2.setString(14,new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()));
            st2.setString(15, new SimpleDateFormat("HHmmss").format(Calendar.getInstance().getTime()));
            st2.setString(16, reason);
            st2.setString(17, "");
            st2.setString(18, "POST");
            st2.setString(19, null);
            st2.setString(20, null);
            st2.setString(21, "00000000");
            st2.setString(22, "000000");
            st2.setString(23, "");
  
            int result2 = st2.executeUpdate();
            if(result2>0){
               JOptionPane.showMessageDialog(null, "Transaction send successfully ! ");
             }else{
                JOptionPane.showMessageDialog(null, "Transaction sending failed! ");
             }
          }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Transaction sending failed! \n" + e);
            }
          
          //insert to intransaction finish 
          // insert data into acctinfo 
          double balanceamtpayer = Double.parseDouble(balanceTF.getText().toString());
          double transactionamt = Double.parseDouble(payeeAmtTF.getText().toString());
          double balanceamtpayee = Double.parseDouble(samebank.balancepayee);
          double amtpayer = balanceamtpayer - transactionamt;
          double amtpayee = balanceamtpayee + transactionamt;
            try{
                      
                String query3 = "update acctinfo set balance = ? where cardNo = ?";
                PreparedStatement st3 = con.prepareStatement(query3);
                st3.setString(1, String.valueOf(amtpayee));
                st3.setString(2, payeeCardNumTF.getText());
                int result3 = st3.executeUpdate();
                if(result3>0){
                    JOptionPane.showMessageDialog(null, "Card amount changed successfully !!");
                }else{
                    JOptionPane.showMessageDialog(null, "Card amount is not changed!!");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
               try{    
                    String query4 = "update acctinfo set balance = ? where cardNo = ?";
                    PreparedStatement st4 = con.prepareStatement(query4);
                    st4.setString(1, String.valueOf(amtpayer));
                    st4.setString(2, samebank.cardno);
                    int result4 = st4.executeUpdate();
                    if(result4 > 0){
                        JOptionPane.showMessageDialog(null, "Card amount changed successfully !!");
                    }else{
                        JOptionPane.showMessageDialog(null, "Card amount is not changed!!");
                     }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
             }
            
            //insert data into acctinfo finish
          
          }else{
                JOptionPane.showMessageDialog(null, "Date is NOT saved! Transaction is failed! ");
           }
           
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Transaction is failed! \n" + e);
            }
            
        }
        
       
    }//GEN-LAST:event_enterButnActionPerformed

    private void backButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButnActionPerformed
        this.setVisible(false);
        samebank.setEnableRec(samebank.getmainpanel(),true);
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
            java.util.logging.Logger.getLogger(SBtransferConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SBtransferConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SBtransferConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SBtransferConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SBtransferConfirm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AMT;
    private javax.swing.JTextField RMTF;
    private javax.swing.JTextField accountNameTF;
    private javax.swing.JLabel accountNum;
    private javax.swing.JTextField accountNumTF;
    private javax.swing.JLabel acountName;
    private javax.swing.JButton backButn;
    private javax.swing.JTextField balanceCurrency;
    private javax.swing.JTextField balanceTF;
    private javax.swing.JTextField bankName;
    private javax.swing.JTextField bankno;
    private javax.swing.JLabel cardNum;
    private javax.swing.JLabel currency;
    private javax.swing.JButton enterButn;
    private javax.swing.JTextField flowNumTF;
    private javax.swing.JLabel idNum;
    private javax.swing.JTextField idNumTF;
    private javax.swing.JLabel idType;
    private javax.swing.JTextField idTypeTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JLabel payeeAMT;
    private javax.swing.JLabel payeeAcct;
    private javax.swing.JTextField payeeAcctTF;
    private javax.swing.JTextField payeeAmtTF;
    private javax.swing.JTextField payeeCardNumTF;
    private javax.swing.JLabel payeeName;
    private javax.swing.JTextField payeeNameTF;
    private javax.swing.JPanel payeePanel;
    private javax.swing.JComboBox<String> payeecurrency;
    private javax.swing.JPanel payerPanel;
    private javax.swing.JPanel samebankTransfer;
    private javax.swing.JLabel title;
    private javax.swing.JPanel transaInfPanel;
    // End of variables declaration//GEN-END:variables
    
    public String getflowNum(){
        String result = null;
        String time = new SimpleDateFormat("HHmmss").format(Calendar.getInstance().getTime());
        String date = new SimpleDateFormat("yyMMdd").format(Calendar.getInstance().getTime());
        Random random = new Random();
        
        String num = String.valueOf(random.nextInt(1000));
        result = date + time + num;
        
        
        return result;
    }
}
