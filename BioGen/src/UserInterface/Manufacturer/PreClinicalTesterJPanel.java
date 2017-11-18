/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Manufacturer;

import Business.EnterprisePackage.Enterprise;
import Business.EnterprisePackage.ManufacturerEnterprise;
import Business.UserAccountPackage.UserAccount;
import Business.WorkRequestPackage.ForTestingByManuToPreclinical;
import Business.WorkRequestPackage.WorkRequest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rishabh
 */
public class PreClinicalTesterJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount userAccount;
    ManufacturerEnterprise manufacturerEnterprise;
    /**
     * Creates new form PreClinicalManagerJPanel
     */
    public PreClinicalTesterJPanel(JPanel userProcessContainer,Enterprise Enterprise,UserAccount userAccount) 
    {
        initComponents();
        this.manufacturerEnterprise=(ManufacturerEnterprise)Enterprise;
        this.userAccount=userAccount;
         ((DefaultTableModel) tblDrugTestingRequests.getModel()).setRowCount(0);
        for (WorkRequest wr : manufacturerEnterprise.getPreClinicalTesterOrgnization().getWorkQueue().getWorkRequestQueue()) {

            if(wr instanceof ForTestingByManuToPreclinical)
            {
            Object row[] = new Object[7];
            row[0] = (ForTestingByManuToPreclinical) wr;
            row[1] = wr.getSender();
            row[2] = wr.getReceiver();
            row[3] = wr.getStatus();
            row[4] = (((ForTestingByManuToPreclinical) wr).getDrug());
            row[5] = wr.getSendingDate();
            row[6] = wr.getReceivingDate();

            ((DefaultTableModel) tblDrugTestingRequests.getModel()).addRow(row);
            }
        }
        
        Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("MMM/dd/yyyy");
        String dateNow = formatter.format(currentDate.getTime());
        lblDate.setText(dateNow);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDrugTestingRequests = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtAssignToMe = new javax.swing.JButton();
        btnTest = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(211, 248, 207));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDrugTestingRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "WR", "Title 2", "Title 3", "Title 4", "ddf", "nullsd", "nullsdf"
            }
        ));
        jScrollPane1.setViewportView(tblDrugTestingRequests);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 630, 120));

        jLabel1.setText("Drug testing requests from Manufacturer");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        txtAssignToMe.setText("Assign To Me");
        txtAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAssignToMeActionPerformed(evt);
            }
        });
        jPanel1.add(txtAssignToMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 100, 30));

        btnTest.setText("Test");
        btnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestActionPerformed(evt);
            }
        });
        jPanel1.add(btnTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 100, 30));

        lblDate.setText("jLabel2");
        jPanel1.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAssignToMeActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDrugTestingRequests.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "select row");
            return;
        }

        WorkRequest wr1 = (WorkRequest) tblDrugTestingRequests.getValueAt(selectedRow, 0);

        if (((ForTestingByManuToPreclinical) wr1).getStatus().equals(WorkRequest.Recieve) || ((ForTestingByManuToPreclinical) wr1).getStatus().equals(WorkRequest.Done)) {
            JOptionPane.showMessageDialog(null, "Already Assigned");
            return;
        }

        wr1.setStatus(WorkRequest.Recieve);
        wr1.setReceiver(userAccount);
        wr1.setReceivingDate(lblDate.getText());

        
    }//GEN-LAST:event_txtAssignToMeActionPerformed

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JTable tblDrugTestingRequests;
    private javax.swing.JButton txtAssignToMe;
    // End of variables declaration//GEN-END:variables
}
