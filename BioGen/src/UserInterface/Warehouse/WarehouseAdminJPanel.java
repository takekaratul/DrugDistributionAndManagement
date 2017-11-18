/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Warehouse;

import Business.DrugPackage.Drug;
import Business.EcoSystem;
import Business.EmployeePackage.Employee;
import Business.EnterprisePackage.Enterprise;
import Business.EnterprisePackage.LicenseEnterprise;
import Business.EnterprisePackage.WarehouseEnterprise;
import Business.NetworkPackage.Network;
import Business.OrganizationPackage.Organization;
import Business.RolePackage.InventoryManagerRole;
import Business.RolePackage.WarehouseManagerRole;
import Business.UserAccountPackage.UserAccount;
import Business.WorkRequestPackage.AddDrugToYourDirectory;
import Business.WorkRequestPackage.ForLicenceByWareHWorkRequest;
import Business.WorkRequestPackage.WorkRequest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Atul
 */
public class WarehouseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WarehouseAdminJPanel
     */
    JPanel userProcessContainer;
    WarehouseEnterprise warehouseEnterprise;
    UserAccount account;

    public WarehouseAdminJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account) {
        initComponents();
        this.account=account;
        this.warehouseEnterprise=(WarehouseEnterprise) enterprise;
        this.userProcessContainer=userProcessContainer;
        
        lblName.setText("Welcome : " + account.getEmployee().getFirstName());
        
        comboBoxRole.removeAllItems();
        comboBoxRole.addItem(Organization.Type.WarehouseManager);
        comboBoxRole.addItem(Organization.Type.InventoryManager);


        lblLicence.setText(warehouseEnterprise.getLicence());

        Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("MMM/dd/yyyy");
        String dateNow = formatter.format(currentDate.getTime());
        lblDate.setText(dateNow);

        Refresh();
    }
public void Refresh() {
    
    for(WorkRequest wr : warehouseEnterprise.getWorkQueue().getWorkRequestQueue())
        {
            AddDrugToYourDirectory w=(AddDrugToYourDirectory)wr;
            if(!(w.getStatus().equals(WorkRequest.Done)))
                        {
                            
                                Object row[] = new Object[2];
                                row[0] = w.getDrugName();
                                row[1] = w;
                                

                                ((DefaultTableModel) tblAddtoDrugDirectory.getModel()).addRow(row);
                            
                        }
        }
    
        if (warehouseEnterprise.getLicence().equals(Enterprise.LicNotIssued) || warehouseEnterprise.getLicence().equals(Enterprise.LicUnderProcess)) {
            btnCreateManager.setEnabled(false);
            txtFirstName.setEditable(false);
            txtLastName.setEditable(false);
            txtPassword.setEditable(false);
            txtUsername.setEditable(false);
            comboBoxRole.setEnabled(false);
        }
        if (warehouseEnterprise.getLicence().equals(Enterprise.LicNotIssued)) {
            btnApplyForLicence.setEnabled(true);
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

        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCreateManager = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboBoxRole = new javax.swing.JComboBox();
        lblDate = new javax.swing.JLabel();
        btnApplyForLicence = new javax.swing.JButton();
        lblLicence = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAddtoDrugDirectory = new javax.swing.JTable();
        btnAddtoDirectory = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("WareHouse Admin Workarea");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Username");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Role");

        btnCreateManager.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCreateManager.setText("Create Manager");
        btnCreateManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateManagerActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Last Name");

        lblName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("First Name");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Password");

        comboBoxRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxRoleActionPerformed(evt);
            }
        });

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnApplyForLicence.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnApplyForLicence.setText("Apply For Licence");
        btnApplyForLicence.setEnabled(false);
        btnApplyForLicence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyForLicenceActionPerformed(evt);
            }
        });

        lblLicence.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLicence.setForeground(new java.awt.Color(255, 0, 0));

        tblAddtoDrugDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug", "wr"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAddtoDrugDirectory);
        if (tblAddtoDrugDirectory.getColumnModel().getColumnCount() > 0) {
            tblAddtoDrugDirectory.getColumnModel().getColumn(0).setResizable(false);
        }

        btnAddtoDirectory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddtoDirectory.setText("Add to Directory");
        btnAddtoDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtoDirectoryActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("New released Drugs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAddtoDirectory)
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(85, 85, 85)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnApplyForLicence)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(191, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(55, 55, 55)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(55, 55, 55)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(59, 59, 59)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(61, 61, 61)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(90, 90, 90)
                            .addComponent(comboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnCreateManager, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblLicence, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 510, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel2)))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btnAddtoDirectory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApplyForLicence, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 109, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(17, 17, 17)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(comboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(60, 60, 60)
                    .addComponent(btnCreateManager)
                    .addGap(75, 75, 75)
                    .addComponent(lblLicence, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateManagerActionPerformed

        if (txtFirstName.getText().equals("") || txtLastName.getText().equals("") || txtUsername.getText().equals("") || txtPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Some Field is Empty");
            return;
        }

        if (comboBoxRole.getSelectedItem().toString().equals("Warehouse Manager Organization")) {
            Employee wm = warehouseEnterprise.getWarehouseManagerOrganization().getEmployeeDirectory().createEmployee(txtFirstName.getText(), txtLastName.getText());
            

            UserAccount u = warehouseEnterprise.getWarehouseManagerOrganization().getUserAccountDirectory().createUserAccount(txtUsername.getText(), txtPassword.getText(), wm, new WarehouseManagerRole());
            
            JOptionPane.showMessageDialog(null, "WareHouse Manager Created Successfull");
        }

        if (comboBoxRole.getSelectedItem().toString().equals("Inventory Manager Organization")) {
            Employee im = warehouseEnterprise.getInventoryManagerOrganization().getEmployeeDirectory().createEmployee(txtFirstName.getText(), txtLastName.getText());
            

            UserAccount u = warehouseEnterprise.getInventoryManagerOrganization().getUserAccountDirectory().createUserAccount(txtUsername.getText(), txtPassword.getText(), im, new InventoryManagerRole());
           
            JOptionPane.showMessageDialog(null, "Inventory Manager Created Successfull");
        }
        txtFirstName.setText("");
        txtLastName.setText("");
        txtPassword.setText("");
        txtUsername.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateManagerActionPerformed

    private void comboBoxRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxRoleActionPerformed

    private void btnApplyForLicenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyForLicenceActionPerformed

        ForLicenceByWareHWorkRequest wr = new ForLicenceByWareHWorkRequest();
        wr.setWareHouseEnterprise(warehouseEnterprise);
        wr.setSender(account);
        wr.setSendingDate(lblDate.getText());
        wr.setStatus(WorkRequest.UnderPro);

        EcoSystem ecoSystem = EcoSystem.getInstance();
    for(Network network: ecoSystem.getNetworkList())
        for (Enterprise e : network.getEnterprisedirectory().getEnterpriseDirectory()) {
            if ((e.getEnterpriseType().equals(Enterprise.EnterpriseType.License))) {
                ((LicenseEnterprise) e).getWorkQueue().getWorkRequestQueue().add(wr);
                warehouseEnterprise.setLicence(Enterprise.LicUnderProcess);
                btnApplyForLicence.setEnabled(false);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnApplyForLicenceActionPerformed

    private void btnAddtoDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtoDirectoryActionPerformed
        // TODO add your handling code here:
       int selectedRow = tblAddtoDrugDirectory.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "select row");
            return;
        }

        String d = (String) tblAddtoDrugDirectory.getValueAt(selectedRow, 0);
        warehouseEnterprise.getAllApprovedDrugs().add(d);
        
        AddDrugToYourDirectory wr = (AddDrugToYourDirectory) tblAddtoDrugDirectory.getValueAt(selectedRow, 1);
        wr.setStatus(WorkRequest.Done);
        

                
    }//GEN-LAST:event_btnAddtoDirectoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddtoDirectory;
    private javax.swing.JButton btnApplyForLicence;
    private javax.swing.JButton btnCreateManager;
    private javax.swing.JComboBox comboBoxRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblLicence;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblAddtoDrugDirectory;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
