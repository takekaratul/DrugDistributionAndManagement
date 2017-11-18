/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Manufacturer;

import Business.DrugPackage.Drug;
import Business.EnterprisePackage.ManufacturerEnterprise;
import Business.UserAccountPackage.UserAccount;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author Atul
 */
public class CreateDrugJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount userAccount;
    ManufacturerEnterprise manufacturerEnterprise;
    /**
     * Creates new form CreateDrugJPanel
     */
    

    CreateDrugJPanel(JPanel userProcessContainer, ManufacturerEnterprise manufacturerEnterprise, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.manufacturerEnterprise = manufacturerEnterprise;

        Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("MMM/dd/yyyy");
        String dateNow = formatter.format(currentDate.getTime());
        lblDate.setText(dateNow);
        
        cmbxApprovedDrugs.removeAllItems();
        for(Drug d: manufacturerEnterprise.getDrugDirectory().getDrugDirectory())
        {
            cmbxApprovedDrugs.addItem(d);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnCreateDrug = new javax.swing.JButton();
        lbll = new javax.swing.JLabel();
        txtNumberOfStrips = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtExpiryDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        cmbxApprovedDrugs = new javax.swing.JComboBox();

        jPanel1.setPreferredSize(new java.awt.Dimension(1030, 585));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreateDrug.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCreateDrug.setText("Add Drugs");
        btnCreateDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDrugActionPerformed(evt);
            }
        });
        jPanel3.add(btnCreateDrug, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        lbll.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbll.setText("Number Of Units");
        jPanel3.add(lbll, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));
        jPanel3.add(txtNumberOfStrips, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 140, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Drug Name");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 122, -1, -1));
        jPanel3.add(txtExpiryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 140, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("(years)");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, 20));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, 1030, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Create Drug");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 110, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Expires In");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 160, -1, -1));

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel3.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        cmbxApprovedDrugs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cmbxApprovedDrugs, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 140, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDrugActionPerformed

        if (txtExpiryDate.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Some fields are Empty");
            return;
        }

        int numberOfUnits;
        try {
            numberOfUnits = Integer.parseInt(txtNumberOfStrips.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Number of Units should be an Integer");
            return;
        }

        

        
        Drug d =(Drug)cmbxApprovedDrugs.getSelectedItem();
        for(Drug drug: manufacturerEnterprise.getDrugDirectory().getDrugDirectory())
            if(d.equals(drug))
            {
                drug.setNoOfUnits(drug.getNoOfUnits()+numberOfUnits);
            }
        

        JOptionPane.showMessageDialog(null, "Drug " + d.getDrugName() + " added Succsessfully");

        txtExpiryDate.setText("");
        txtNumberOfStrips.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateDrugActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnCreateDrug;
    private javax.swing.JComboBox cmbxApprovedDrugs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lbll;
    private javax.swing.JTextField txtExpiryDate;
    private javax.swing.JTextField txtNumberOfStrips;
    // End of variables declaration//GEN-END:variables
}