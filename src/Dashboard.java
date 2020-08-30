
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDisplay = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSell = new javax.swing.JButton();
        btnSummary = new javax.swing.JButton();
        btnPurchaseSummary = new javax.swing.JButton();
        btnSalesSummary = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(200, 239, 182));
        setForeground(new java.awt.Color(255, 102, 102));
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDisplay.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblDisplay.setText("INVENTORY MANAGEMENT SYSTEM");
        getContentPane().add(lblDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, 44));

        btnAdd.setBackground(new java.awt.Color(0, 102, 102));
        btnAdd.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("View Inventory");
        btnAdd.setBorder(null);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 277, 50));

        btnUpdate.setBackground(new java.awt.Color(0, 51, 51));
        btnUpdate.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Purchase Item");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 277, 50));

        btnSell.setBackground(new java.awt.Color(0, 102, 102));
        btnSell.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        btnSell.setForeground(new java.awt.Color(255, 255, 255));
        btnSell.setText("Sell Item");
        btnSell.setBorder(null);
        btnSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellActionPerformed(evt);
            }
        });
        getContentPane().add(btnSell, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 277, 50));

        btnSummary.setBackground(new java.awt.Color(0, 102, 102));
        btnSummary.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        btnSummary.setForeground(new java.awt.Color(255, 255, 255));
        btnSummary.setText("Business Summary");
        btnSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSummaryActionPerformed(evt);
            }
        });
        getContentPane().add(btnSummary, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 620, 60));

        btnPurchaseSummary.setBackground(new java.awt.Color(0, 102, 102));
        btnPurchaseSummary.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        btnPurchaseSummary.setForeground(new java.awt.Color(255, 255, 255));
        btnPurchaseSummary.setText("Generate Purchase Summary");
        btnPurchaseSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseSummaryActionPerformed(evt);
            }
        });
        getContentPane().add(btnPurchaseSummary, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 620, 60));

        btnSalesSummary.setBackground(new java.awt.Color(0, 51, 51));
        btnSalesSummary.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        btnSalesSummary.setForeground(new java.awt.Color(255, 255, 255));
        btnSalesSummary.setText("Generate Sales Summary");
        btnSalesSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesSummaryActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalesSummary, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 620, 60));

        btnReturn.setBackground(new java.awt.Color(0, 51, 51));
        btnReturn.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setText("Return Item");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 277, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        new PurchaseItem().setVisible(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        new Inventory().setVisible(true);
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellActionPerformed
        // TODO add your handling code here:
        new SellForm().setVisible(true);
    }//GEN-LAST:event_btnSellActionPerformed

    private void btnSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSummaryActionPerformed
        // TODO add your handling code here
        new BusinessSummary().setVisible(true);
    }//GEN-LAST:event_btnSummaryActionPerformed

    private void btnPurchaseSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseSummaryActionPerformed
        try {
            // TODO add your handling code here:
            new Purchase().setVisible(true);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPurchaseSummaryActionPerformed

    private void btnSalesSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesSummaryActionPerformed
        // TODO add your handling code here:
        new Sales().setVisible(true);
    }//GEN-LAST:event_btnSalesSummaryActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        new ReturnItem().setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
            */
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                    } else {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            //</editor-fold>
            
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(() -> {
                new Dashboard().setVisible(true);
            });
            
            DatabaseConnect db = new DatabaseConnect();
            db.setupDb();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnPurchaseSummary;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSalesSummary;
    private javax.swing.JButton btnSell;
    private javax.swing.JButton btnSummary;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblDisplay;
    // End of variables declaration//GEN-END:variables
}
