/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Manufacturer;

import Business.DrugPackage.Drug;
import Business.EcoSystem;
import Business.EmployeePackage.Employee;
import Business.EnterprisePackage.Enterprise;
import Business.EnterprisePackage.FDAEnterprise;
import Business.EnterprisePackage.ManufacturerEnterprise;
import Business.NetworkPackage.Network;
import Business.OrganizationPackage.Organization;
import Business.RolePackage.DrugManagerRole;
import Business.RolePackage.PreClinicalTesterRole;
import Business.RolePackage.SalesManagerRole;
import Business.UserAccountPackage.UserAccount;
import Business.WorkRequestPackage.ForLicenceByManuWorkRequest;
import Business.WorkRequestPackage.WorkRequest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Atul
 */
public class ManufacturerAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManufacturerAdminJPanel
     */
    JPanel userProcessContainer;
    ManufacturerEnterprise manufacturerEnterprise;
    UserAccount account;

    public ManufacturerAdminJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account) {
        initComponents();
        this.account=account;
        this.manufacturerEnterprise=(ManufacturerEnterprise)enterprise;
        this.userProcessContainer=userProcessContainer;
        lblLicense.setText(manufacturerEnterprise.getLicence());
        lblName.setText("Welcome : " + account.getEmployee().getFirstName());
        cmbRole.removeAllItems();
        cmbRole.addItem(Organization.Type.DrugManager);
        cmbRole.addItem(Organization.Type.SalesManager);
        cmbRole.addItem(Organization.Type.PreClinicalTester);
        
        lblLicense.setText(manufacturerEnterprise.getLicence());

        Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("MMM/dd/yyyy");
        String dateNow = formatter.format(currentDate.getTime());
        lblDate.setText(dateNow);
        
        Refresh();
    }

    public void Refresh() {
        if (manufacturerEnterprise.getLicence().equals(Enterprise.LicNotIssued) || manufacturerEnterprise.getLicence().equals(Enterprise.LicUnderProcess)) {
            btnCreateManager.setEnabled(false);
            txtFirstName.setEditable(false);
            txtLastName.setEditable(false);
            txtPassword.setEditable(false);
            txtUsername.setEditable(false);
            cmbRole.setEnabled(false);
        }
        if (manufacturerEnterprise.getLicence().equals(Enterprise.LicNotIssued)) {
            btnApplyForLicense.setEnabled(true);
        }
        
        if (manufacturerEnterprise.getLicence().equals(Enterprise.LicApproved)) {
            btnApplyForLicense.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbRole = new javax.swing.JComboBox();
        btnCreateManager = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        btnApplyForLicense = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblLicense = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Manufacturer Admin Workarea");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("First Name");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Last Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Username");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Password");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Role");

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRoleActionPerformed(evt);
            }
        });

        btnCreateManager.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCreateManager.setText("Create Manager");
        btnCreateManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateManagerActionPerformed(evt);
            }
        });

        lblName.setText("jLabel2");

        btnApplyForLicense.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnApplyForLicense.setText("Apply for License");
        btnApplyForLicense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyForLicenseActionPerformed(evt);
            }
        });

        lblDate.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 130, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addComponent(lblDate)
                        .addGap(19, 19, 19))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblLicense))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnApplyForLicense))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblName)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(317, 325, Short.MAX_VALUE)
                    .addComponent(btnCreateManager)
                    .addGap(0, 36, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblDate))
                .addGap(10, 10, 10)
                .addComponent(lblName)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addComponent(lblLicense)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApplyForLicense)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 323, Short.MAX_VALUE)
                    .addComponent(btnCreateManager)
                    .addGap(0, 104, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 301, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRoleActionPerformed

    private void btnCreateManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateManagerActionPerformed

        if (txtFirstName.getText().equals("") || txtLastName.getText().equals("") || txtUsername.getText().equals("") || txtPassword.getText().equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Some Field is Empty");
            return;
        }


            if (cmbRole.getSelectedItem().toString().equals("Drug Manager Organization") )
            {
                Employee e = manufacturerEnterprise.getDrugManagerOrganization().getEmployeeDirectory().createEmployee(txtFirstName.getText(), txtLastName.getText());
                UserAccount u = manufacturerEnterprise.getDrugManagerOrganization().getUserAccountDirectory().createUserAccount(txtUsername.getText(), txtPassword.getText(), e, new DrugManagerRole());
                JOptionPane.showMessageDialog(null, "Drug Manager Created Successfull");
                
                
                
            }
            
            
            if (cmbRole.getSelectedItem().toString().equals("Sales Manager Organization") )
            {
                Employee e = manufacturerEnterprise.getSalesManagerOrganization().getEmployeeDirectory().createEmployee(txtFirstName.getText(), txtLastName.getText());
                UserAccount u = manufacturerEnterprise.getSalesManagerOrganization().getUserAccountDirectory().createUserAccount(txtUsername.getText(), txtPassword.getText(), e, new SalesManagerRole());
                JOptionPane.showMessageDialog(null, "Sales Manager Created Successfull");
            }
            
            
            if (cmbRole.getSelectedItem().toString().equals("PreClinical Tester Organization") )
            {
                Employee e = manufacturerEnterprise.getPreClinicalTesterOrgnization().getEmployeeDirectory().createEmployee(txtFirstName.getText(), txtLastName.getText());
                UserAccount u = manufacturerEnterprise.getPreClinicalTesterOrgnization().getUserAccountDirectory().createUserAccount(txtUsername.getText(), txtPassword.getText(), e, new PreClinicalTesterRole());
                JOptionPane.showMessageDialog(null, "PreClinical tester Created Successfull");
            }

        txtFirstName.setText("");
        txtLastName.setText("");
        txtPassword.setText("");
        txtUsername.setText("");      
    }//GEN-LAST:event_btnCreateManagerActionPerformed

    private void btnApplyForLicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyForLicenseActionPerformed
        // TODO add your handling code here:
        
        ForLicenceByManuWorkRequest wr = new ForLicenceByManuWorkRequest();
        wr.setManufacturerEnterprise(manufacturerEnterprise);
        wr.setSender(account);
        wr.setSendingDate(lblDate.getText());
        wr.setStatus(WorkRequest.UnderPro);
        EcoSystem ecoSystem = EcoSystem.getInstance();
        for(Network network:ecoSystem.getNetworkList())
        {
            if(network.getEnterprisedirectory().getEnterpriseDirectory().contains(manufacturerEnterprise))
            {
                for (Enterprise e : network.getEnterprisedirectory().getEnterpriseDirectory()) 
                {
                    if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.FDA) ) 
                    {
                        ((FDAEnterprise) e).getFdaOrganization().getWorkQueue().getWorkRequestQueue().add(wr);
                        manufacturerEnterprise.setLicence(Enterprise.LicUnderProcess);
                        btnApplyForLicense.setEnabled(false);
                    }
                }
            }
        }

    }//GEN-LAST:event_btnApplyForLicenseActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApplyForLicense;
    private javax.swing.JButton btnCreateManager;
    private javax.swing.JComboBox cmbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblLicense;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
