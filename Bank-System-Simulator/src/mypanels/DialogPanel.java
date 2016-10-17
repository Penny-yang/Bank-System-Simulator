/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypanels;

/**
 *
 * @author yangp
 */
public class DialogPanel extends javax.swing.JPanel {

    /**
     * Creates new form AuthorizeDialog
     */
    public DialogPanel() {
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

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        managerL = new javax.swing.JLabel();
        managerCB = new javax.swing.JComboBox<>();
        passwordTF = new javax.swing.JTextField();
        passwordL = new javax.swing.JLabel();

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        jPanel1.setLayout(null);

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setText("Please authorize this transaction!");
        jPanel1.add(title);
        title.setBounds(40, 30, 359, 40);

        managerL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        managerL.setText("Please choose manager: ");
        jPanel1.add(managerL);
        managerL.setBounds(40, 100, 210, 22);

        managerCB.setFont(managerCB.getFont().deriveFont(managerCB.getFont().getSize()+1f));
        managerCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BR80201001 - David", "BR80201022 - James", "BR80201033 - Justin" }));
        managerCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerCBActionPerformed(evt);
            }
        });
        jPanel1.add(managerCB);
        managerCB.setBounds(250, 100, 180, 27);

        passwordTF.setFont(passwordTF.getFont().deriveFont(passwordTF.getFont().getSize()+1f));
        passwordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTFActionPerformed(evt);
            }
        });
        jPanel1.add(passwordTF);
        passwordTF.setBounds(250, 140, 180, 27);

        passwordL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordL.setText("Please enter password:");
        jPanel1.add(passwordL);
        passwordL.setBounds(40, 140, 190, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTFActionPerformed

    private void managerCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_managerCBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> managerCB;
    private javax.swing.JLabel managerL;
    private javax.swing.JLabel passwordL;
    private javax.swing.JTextField passwordTF;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
    public javax.swing.JComboBox<String> getID(){
        return managerCB;
    }
    public javax.swing.JTextField getPassword(){
        return passwordTF;
    }
}