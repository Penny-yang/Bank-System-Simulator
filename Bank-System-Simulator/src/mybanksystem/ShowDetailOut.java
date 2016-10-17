/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybanksystem;

/**
 *
 * @author yangp
 */
public class ShowDetailOut extends javax.swing.JFrame {

    /**
     * Creates new form ShowDetailOut
     */
    public ShowDetailOut() {
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

        showDetailPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        otherbank = new javax.swing.JPanel();
        payeeacctNum = new javax.swing.JLabel();
        payeeAcctName = new javax.swing.JLabel();
        payeeBankNo = new javax.swing.JLabel();
        payeeBankName = new javax.swing.JLabel();
        payeeAcctNumTF = new javax.swing.JTextField();
        payeeAcctNameTF = new javax.swing.JTextField();
        payeeBankNoTF = new javax.swing.JTextField();
        payeeBankNameTF = new javax.swing.JTextField();
        flowNum = new javax.swing.JLabel();
        flowNumTF = new javax.swing.JTextField();
        date = new javax.swing.JLabel();
        dataTF = new javax.swing.JTextField();
        ourbank = new javax.swing.JPanel();
        payeeAcctNum = new javax.swing.JLabel();
        payerAcctName = new javax.swing.JLabel();
        payerAcctNumTF = new javax.swing.JTextField();
        payerBankNo = new javax.swing.JLabel();
        payerBankName = new javax.swing.JLabel();
        payerBankNameTF = new javax.swing.JTextField();
        payerBankNoTF = new javax.swing.JTextField();
        payerAcctNameTF = new javax.swing.JTextField();
        amount = new javax.swing.JLabel();
        amountTF = new javax.swing.JTextField();
        currency = new javax.swing.JLabel();
        currencyTF = new javax.swing.JTextField();
        rm = new javax.swing.JLabel();
        rmTF = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dealingTellerTF = new javax.swing.JTextField();
        reviewTellerTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Outward Transaction Details");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        showDetailPanel.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setText("Transaction Details");

        otherbank.setBackground(new java.awt.Color(255, 255, 255));
        otherbank.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), "Other Bank Information"));
        otherbank.setEnabled(false);

        payeeacctNum.setText("Payee Account Num:");

        payeeAcctName.setText("Payee Account Name:");

        payeeBankNo.setText("Payee Bank No:");

        payeeBankName.setText("Payee Bank Name:");

        payeeAcctNumTF.setEnabled(false);

        payeeAcctNameTF.setEnabled(false);

        payeeBankNoTF.setEnabled(false);

        payeeBankNameTF.setEnabled(false);

        flowNum.setText("Flow Num:");

        flowNumTF.setEnabled(false);

        date.setText("Transaction Date:");

        dataTF.setEnabled(false);

        javax.swing.GroupLayout otherbankLayout = new javax.swing.GroupLayout(otherbank);
        otherbank.setLayout(otherbankLayout);
        otherbankLayout.setHorizontalGroup(
            otherbankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherbankLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(otherbankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(payeeacctNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payeeAcctName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payeeBankNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payeeBankName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otherbankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(payeeAcctNameTF)
                    .addComponent(payeeAcctNumTF)
                    .addComponent(payeeBankNoTF)
                    .addComponent(payeeBankNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(otherbankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(flowNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otherbankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(flowNumTF)
                    .addComponent(dataTF, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addContainerGap())
        );
        otherbankLayout.setVerticalGroup(
            otherbankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherbankLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(otherbankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(payeeacctNum)
                    .addGroup(otherbankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(payeeAcctNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(date)
                        .addComponent(dataTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otherbankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payeeAcctName)
                    .addComponent(payeeAcctNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flowNum)
                    .addComponent(flowNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otherbankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payeeBankNo)
                    .addComponent(payeeBankNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otherbankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payeeBankName)
                    .addComponent(payeeBankNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ourbank.setBackground(new java.awt.Color(255, 255, 255));
        ourbank.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), "Our Bank Information"));
        ourbank.setEnabled(false);
        ourbank.setLayout(null);

        payeeAcctNum.setText("Payer Account Num:");
        ourbank.add(payeeAcctNum);
        payeeAcctNum.setBounds(20, 40, 146, 20);

        payerAcctName.setText("Payer Account Name:");
        ourbank.add(payerAcctName);
        payerAcctName.setBounds(20, 80, 160, 20);

        payerAcctNumTF.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        payerAcctNumTF.setEnabled(false);
        payerAcctNumTF.setSelectionColor(new java.awt.Color(0, 255, 0));
        ourbank.add(payerAcctNumTF);
        payerAcctNumTF.setBounds(190, 40, 180, 26);

        payerBankNo.setText("Payer Bank No:");
        ourbank.add(payerBankNo);
        payerBankNo.setBounds(20, 120, 150, 20);

        payerBankName.setText("Payer Bank Name:");
        ourbank.add(payerBankName);
        payerBankName.setBounds(20, 160, 140, 20);

        payerBankNameTF.setEnabled(false);
        ourbank.add(payerBankNameTF);
        payerBankNameTF.setBounds(190, 160, 180, 26);

        payerBankNoTF.setEnabled(false);
        ourbank.add(payerBankNoTF);
        payerBankNoTF.setBounds(190, 120, 180, 26);

        payerAcctNameTF.setEnabled(false);
        ourbank.add(payerAcctNameTF);
        payerAcctNameTF.setBounds(190, 80, 180, 26);

        amount.setText("Transaction AMT:");
        ourbank.add(amount);
        amount.setBounds(410, 50, 130, 20);

        amountTF.setEnabled(false);
        ourbank.add(amountTF);
        amountTF.setBounds(520, 50, 150, 26);

        currency.setText("Currency:");
        ourbank.add(currency);
        currency.setBounds(410, 90, 120, 20);

        currencyTF.setEnabled(false);
        ourbank.add(currencyTF);
        currencyTF.setBounds(520, 90, 150, 26);

        rm.setText("RM#:");
        ourbank.add(rm);
        rm.setBounds(410, 130, 125, 20);

        rmTF.setEnabled(false);
        ourbank.add(rmTF);
        rmTF.setBounds(520, 130, 152, 26);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), "Teller Information"));
        jPanel1.setEnabled(false);

        jLabel1.setText("Dealing Teller :");

        jLabel2.setText("Review Teller:");

        dealingTellerTF.setEnabled(false);

        reviewTellerTF.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dealingTellerTF)
                    .addComponent(reviewTellerTF, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dealingTellerTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reviewTellerTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton1.setText("OK");

        javax.swing.GroupLayout showDetailPanelLayout = new javax.swing.GroupLayout(showDetailPanel);
        showDetailPanel.setLayout(showDetailPanelLayout);
        showDetailPanelLayout.setHorizontalGroup(
            showDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showDetailPanelLayout.createSequentialGroup()
                .addGroup(showDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(showDetailPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ourbank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(showDetailPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(otherbank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(showDetailPanelLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(showDetailPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showDetailPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        showDetailPanelLayout.setVerticalGroup(
            showDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showDetailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(32, 32, 32)
                .addComponent(ourbank, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otherbank, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(showDetailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(showDetailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ShowDetailOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowDetailOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowDetailOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowDetailOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowDetailOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amount;
    private javax.swing.JTextField amountTF;
    private javax.swing.JLabel currency;
    private javax.swing.JTextField currencyTF;
    private javax.swing.JTextField dataTF;
    private javax.swing.JLabel date;
    private javax.swing.JTextField dealingTellerTF;
    private javax.swing.JLabel flowNum;
    private javax.swing.JTextField flowNumTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel otherbank;
    private javax.swing.JPanel ourbank;
    private javax.swing.JLabel payeeAcctName;
    private javax.swing.JTextField payeeAcctNameTF;
    private javax.swing.JLabel payeeAcctNum;
    private javax.swing.JTextField payeeAcctNumTF;
    private javax.swing.JLabel payeeBankName;
    private javax.swing.JTextField payeeBankNameTF;
    private javax.swing.JLabel payeeBankNo;
    private javax.swing.JTextField payeeBankNoTF;
    private javax.swing.JLabel payeeacctNum;
    private javax.swing.JLabel payerAcctName;
    private javax.swing.JTextField payerAcctNameTF;
    private javax.swing.JTextField payerAcctNumTF;
    private javax.swing.JLabel payerBankName;
    private javax.swing.JTextField payerBankNameTF;
    private javax.swing.JLabel payerBankNo;
    private javax.swing.JTextField payerBankNoTF;
    private javax.swing.JTextField reviewTellerTF;
    private javax.swing.JLabel rm;
    private javax.swing.JTextField rmTF;
    private javax.swing.JPanel showDetailPanel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
