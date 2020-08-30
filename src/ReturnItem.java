import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class ReturnItem extends javax.swing.JFrame {

    /**
     * Creates new form ReturnItem
     */
    public ReturnItem() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtQuant = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRate = new javax.swing.JTextField();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setText("Return Form");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Pid");

        txtPid.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Quantity");

        txtQuant.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtQuant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Rate");

        txtRate.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRateKeyPressed(evt);
            }
        });

        btnReturn.setBackground(new java.awt.Color(0, 102, 102));
        btnReturn.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setText("Return Item");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(542, 542, 542))
            .addGroup(layout.createSequentialGroup()
                .addGap(541, 541, 541)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtQuant)
                    .addComponent(txtPid)
                    .addComponent(txtRate)
                    .addComponent(btnReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(399, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        if(validateProductInfo())
        {
            if(checkInventory())
            {
                updateInventory();
                updateSales();
                JOptionPane.showMessageDialog(null, "Product Returned Successfully!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Product Not found in Inventory!");
               
            }
            resetForm();
        }
    }//GEN-LAST:event_btnReturnActionPerformed

    private void txtQuantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c))
        {    
            txtQuant.setEditable(false);
        } 
        else
        {
            txtQuant.setEditable(true);
        }
    }//GEN-LAST:event_txtQuantKeyPressed

    private void txtRateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRateKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c))
        {    
            txtRate.setEditable(false);
        } 
        else
        {
            txtRate.setEditable(true);
        }
    }//GEN-LAST:event_txtRateKeyPressed
    
    private void resetForm()
    {
        txtPid.setText("");
        txtQuant.setText("");
        txtRate.setText("");
    }
    
    private boolean checkInventory() {
        try {
            DatabaseConnect db = new DatabaseConnect();
            String sql = "SELECT * FROM INVENTORY WHERE PID=?";
            PreparedStatement pst = db.conn.prepareStatement(sql);
            pst.setString(1, txtPid.getText().trim());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                pst.close();
                return true;
            }
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(ReturnItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    private void updateInventory()
    {
        int quant = 0, damage = 0;

        try 
        {
            String sql = "SELECT * FROM INVENTORY WHERE PID=?";
            DatabaseConnect db = new DatabaseConnect();
            PreparedStatement pst = db.conn.prepareStatement(sql);
            pst.setString(1, txtPid.getText().trim());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                quant = rs.getInt("QUANTITY");
                damage = rs.getInt("BREAKAGE");
            }
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(ReturnItem.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "UPDATE INVENTORY SET PID=?, QUANTITY=?, BREAKAGE=?, NET=? WHERE PID=?";
        try 
        {
            quant += Integer.parseInt(txtQuant.getText().trim());
            
            int net = quant - damage;

            DatabaseConnect db = new DatabaseConnect();
            PreparedStatement pst = db.conn.prepareStatement(sql);
            pst.setString(1, txtPid.getText().trim());
            pst.setInt(2, quant);
            pst.setInt(3, damage);
            pst.setInt(4, net);
            pst.setString(5, txtPid.getText().trim());
            pst.executeUpdate();
            pst.close();

        } catch (SQLException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(ReturnItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void updateSales()
    {
        String sql = "INSERT INTO SALES (PID, DATE, QUANTITY, RATE, TOTAL) VALUES (?,?,?,?,?)";
        String pattern = "yyyy-MM-dd HH:mm:ss";
        Date dt = new Date();
        String stamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Timestamp(dt.getTime()));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime localDateTime = LocalDateTime.from(formatter.parse(stamp));
        Timestamp tstamp = Timestamp.valueOf(localDateTime);

        try 
        {
            DatabaseConnect db = new DatabaseConnect();
            int total = Integer.parseInt(txtQuant.getText().trim()) * Integer.parseInt(txtRate.getText().trim()) * (-1);
            PreparedStatement pst = db.conn.prepareStatement(sql);
            pst.setString(1, txtPid.getText().trim());
            pst.setTimestamp(2, tstamp);
            pst.setInt(3, Integer.parseInt(txtQuant.getText().trim()));
            pst.setInt(4, Integer.parseInt(txtRate.getText().trim()));
            pst.setInt(5, total);

            pst.executeUpdate();
            pst.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(ReturnItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private boolean validateProductInfo()
    {
        if(txtPid.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter a Product id");
            return false;
        }
        if(txtQuant.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter some Quantity");
            return false;
        }
        if(txtRate.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter a rate of return");
            return false;
        }
        return true;
    }
    
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
            java.util.logging.Logger.getLogger(ReturnItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ReturnItem().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtPid;
    private javax.swing.JTextField txtQuant;
    private javax.swing.JTextField txtRate;
    // End of variables declaration//GEN-END:variables
}
