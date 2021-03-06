/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypanels;

import com.mysql.jdbc.Connection;
import mybanksystem.CancelAcctConfirm;
import java.awt.Component;
import java.awt.Container;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mybanksystem.MySqlConnect;
import mybanksystem.QueryAcctInfo;
/**
 *
 * @author yangp
 */
public class CancelAcct extends javax.swing.JPanel {
     String query = null;
     boolean case1,case2,case3;
    

    /**
     * Creates new form CancelAcct
     */
    public CancelAcct() {
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

        cancelAcctPanel = new javax.swing.JPanel();
        queryPanel = new javax.swing.JPanel();
        acctNumL = new javax.swing.JLabel();
        cardNumL = new javax.swing.JLabel();
        accountNumTF = new javax.swing.JTextField();
        cardNumTF = new javax.swing.JTextField();
        queryButn = new javax.swing.JButton();
        resultPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        title = new javax.swing.JLabel();
        detailButn = new javax.swing.JButton();
        deleteButn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        cancelAcctPanel.setBackground(new java.awt.Color(255, 255, 255));
        cancelAcctPanel.setLayout(null);

        queryPanel.setBackground(new java.awt.Color(255, 255, 255));
        queryPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        queryPanel.setLayout(null);

        acctNumL.setText("Account Num:");
        queryPanel.add(acctNumL);
        acctNumL.setBounds(30, 27, 110, 20);

        cardNumL.setText("Card Num:");
        queryPanel.add(cardNumL);
        cardNumL.setBounds(30, 70, 110, 20);
        queryPanel.add(accountNumTF);
        accountNumTF.setBounds(160, 30, 270, 26);
        queryPanel.add(cardNumTF);
        cardNumTF.setBounds(160, 70, 270, 26);

        queryButn.setText("Search");
        queryButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryButnActionPerformed(evt);
            }
        });
        queryPanel.add(queryButn);
        queryButn.setBounds(330, 110, 100, 29);

        cancelAcctPanel.add(queryPanel);
        queryPanel.setBounds(30, 110, 490, 160);

        resultPanel.setBackground(new java.awt.Color(255, 255, 255));
        resultPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                " Acct  Num", " Card  Num", " Name", " Card  Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(153, 153, 153));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
        );

        cancelAcctPanel.add(resultPanel);
        resultPanel.setBounds(30, 270, 490, 230);

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setText("Cancel an Account");
        cancelAcctPanel.add(title);
        title.setBounds(150, 30, 240, 29);

        detailButn.setText("Show Detail");
        detailButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailButnActionPerformed(evt);
            }
        });
        cancelAcctPanel.add(detailButn);
        detailButn.setBounds(250, 510, 130, 29);

        deleteButn.setText("Delete Acct");
        deleteButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButnActionPerformed(evt);
            }
        });
        cancelAcctPanel.add(deleteButn);
        deleteButn.setBounds(393, 510, 130, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelAcctPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelAcctPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
//       CancelAcctConfirm canAcc = new CancelAcctConfirm(this);
//       canAcc.setVisible(true);
//       
//       setEnableRec(cancelAcctPanel,false);
    }//GEN-LAST:event_tableMouseClicked

    private void queryButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryButnActionPerformed
        
        clearTable(table);
        
        try{
             Connection con = MySqlConnect.ConnectDB(); 
            if((!accountNumTF.getText().equals("")) && (! cardNumTF.getText().equals(""))){
              query = "select acctNo,acctName,acctType,cardNo,cardType, applicantIDType,applicantIDNum,applicantPhone,applicantAddress from acctinfo\n" +
                            "where acctNo = ? and cardNo = ? ";
              case1 = true;
              
            }
            else if((!accountNumTF.getText().equals("")) && ( cardNumTF.getText().equals(""))){
                 query = "select acctNo,acctName,acctType,cardNo,cardType, applicantIDType,applicantIDNum,applicantPhone,applicantAddress from acctinfo\n" +
                            "where acctNo = ? ";
                 case2 = true;
            }
            else if((accountNumTF.getText().equals("")) && ( ! cardNumTF.getText().equals(""))){
                 query = "select acctNo,acctName,acctType,cardNo,cardType, applicantIDType,applicantIDNum,applicantPhone,applicantAddress from acctinfo\n" +
                            "where cardNo = ? ";
                 case3 = true;
            }
             PreparedStatement st = con.prepareStatement(query);
             if(case1){
                st.setString(1, accountNumTF.getText());
                st.setString(2, cardNumTF.getText());
                case1 = false;
             }
             if(case2){
                 st.setString(1, accountNumTF.getText());
                 case2 = false;
             }
             if(case3){
                 st.setString(1, cardNumTF.getText());
                case3 = false;
             }
             ResultSet result  = st.executeQuery();

          
             int i=0;
             if(result.next()){
                 do{
                    Object acctNums = result.getString("acctNo");
                    Object cardNums = result.getString("cardNo");
                    Object acctNames = result.getString("acctName");
                    Object cardTypes = result.getString("cardType");
                 
                 
                    table.getModel().setValueAt(acctNums, i, 0);
                    table.getModel().setValueAt(cardNums, i, 1);
                    table.getModel().setValueAt(acctNames, i, 2);
                    table.getModel().setValueAt(cardTypes, i, 3);
                    i++;
                }while(result.next());
             }else{         
                JOptionPane.showMessageDialog(null, "There is no qualified record ! ");
            }
             
             
            
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Transaction is failed! \n" + ex);
        }
       
    }//GEN-LAST:event_queryButnActionPerformed

    private void detailButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailButnActionPerformed
            QueryAcctInfo detail = new QueryAcctInfo(this);
            detail.setVisible(true);
            setEnableRec(cancelAcctPanel,false);  
    }//GEN-LAST:event_detailButnActionPerformed

    private void deleteButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButnActionPerformed
       CancelAcctConfirm canAcc = new CancelAcctConfirm(this);
       canAcc.setVisible(true);
       
       setEnableRec(cancelAcctPanel,false);      
    }//GEN-LAST:event_deleteButnActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountNumTF;
    private javax.swing.JLabel acctNumL;
    private javax.swing.JPanel cancelAcctPanel;
    private javax.swing.JLabel cardNumL;
    private javax.swing.JTextField cardNumTF;
    private javax.swing.JButton deleteButn;
    private javax.swing.JButton detailButn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton queryButn;
    private javax.swing.JPanel queryPanel;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JTable table;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

  public javax.swing.JTextField getacctNum(){
      return this.accountNumTF;
  }
  public javax.swing.JTextField getcardNum(){
      return this.cardNumTF;
  }
  public javax.swing.JPanel getmainpanel(){
      return this.cancelAcctPanel;
  }
  public javax.swing.JTable gettable(){
      return this.table;
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
  public static void clearTable(final JTable table) {
   for (int i = 0; i < table.getRowCount(); i++)
      for(int j = 0; j < table.getColumnCount(); j++) {
          table.setValueAt("", i, j);
      }
   }
  
  
  
}




