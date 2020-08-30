
import java.awt.Font;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Inventory extends javax.swing.JFrame {

    /**
     * Creates new form AddItems
     */
    
    public Inventory() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        DisplayData();
        tblHeader();
        
    }
    
    private void tblHeader()
    {
        JTableHeader tHeader = tblDisplay.getTableHeader();
        tHeader.setFont(new Font("Tahome", Font.BOLD, 20));
        tHeader.setForeground(java.awt.Color.WHITE);
        tHeader.setBackground(java.awt.Color.DARK_GRAY);
    }
    
    private ArrayList<Item> fetchInventoryData()
    {
        ArrayList<Item> data = new ArrayList<>();
        
        String query = "SELECT * FROM INVENTORY ORDER BY PID";
        Statement st;
        try {
            DatabaseConnect db = new DatabaseConnect();
            st = db.conn.createStatement();
            ResultSet rs =  st.executeQuery(query);
            Item item;
            while(rs.next())
            {
                item = new Item(rs.getString("PID"), rs.getInt("QUANTITY"), rs.getInt("BREAKAGE"), rs.getInt("NET"));
                data.add(item);
            }
            st.close();
            
        } catch (SQLException ex) {
            System.out.println("Error in Fetching data");
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
        
    }
    
    private void DisplayData()
    {
        ArrayList<Item> data = fetchInventoryData();
        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
        Object[] row = new Object[4];
        
        for(int i=0; i<data.size(); i++)
        {
            row[0] = data.get(i).getPid();
            row[1] = data.get(i).getQuant();
            row[2] = data.get(i).getBreakage();
            row[3] = data.get(i).getNet();
            model.addRow(row);
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
        lblPid = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblBreakage = new javax.swing.JLabel();
        lblRate = new javax.swing.JLabel();
        txtPid = new javax.swing.JTextField();
        txtQuant = new javax.swing.JTextField();
        txtNet = new javax.swing.JTextField();
        txtBreak = new javax.swing.JTextField();
        btnExcel = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setText("INVENTORY");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));

        lblPid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPid.setText("Product ID");
        getContentPane().add(lblPid, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 100, -1));

        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQuantity.setText("Total Quantity");
        getContentPane().add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 129, 21));

        lblBreakage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBreakage.setText("Breakage");
        getContentPane().add(lblBreakage, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 129, -1));

        lblRate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRate.setText("Net Quantity");
        getContentPane().add(lblRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 89, 23));

        txtPid.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtPid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPidActionPerformed(evt);
            }
        });
        txtPid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPidKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPidKeyTyped(evt);
            }
        });
        getContentPane().add(txtPid, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 140, 30));

        txtQuant.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtQuant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantActionPerformed(evt);
            }
        });
        txtQuant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantKeyPressed(evt);
            }
        });
        getContentPane().add(txtQuant, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 135, 30));

        txtNet.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtNet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNetKeyPressed(evt);
            }
        });
        getContentPane().add(txtNet, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 130, 30));

        txtBreak.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtBreak.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBreakKeyPressed(evt);
            }
        });
        getContentPane().add(txtBreak, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 135, 30));

        btnExcel.setBackground(new java.awt.Color(0, 51, 51));
        btnExcel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        btnExcel.setForeground(new java.awt.Color(255, 255, 255));
        btnExcel.setText("Generate ExcelSheet");
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 270, 360, 40));

        btnUpdate.setBackground(new java.awt.Color(0, 102, 102));
        btnUpdate.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update Item");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 220, 170, 40));

        btnDelete.setBackground(new java.awt.Color(0, 102, 102));
        btnDelete.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete Item");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 220, 170, 40));

        tblDisplay.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pid", "Quantity", "Breakage", "Net Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplay.setRowHeight(20);
        tblDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDisplayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDisplay);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 1340, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPidActionPerformed

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        // TODO add your handling code here:
        String currentDir = System.getProperty("user.home") + "\\Desktop\\Inventory";
        
        Exporter exp = new Exporter();
        String tstamp = GenerateStamp();
        String path = currentDir + tstamp + ".csv";
        System.out.println("Path is " + path);
        exp.exportTable(tblDisplay, new File(path));
        JOptionPane.showMessageDialog(null, "Excel File created on Desktop.");
    }//GEN-LAST:event_btnExcelActionPerformed
    
    private String GenerateStamp()
    {
        Date dt = new Date();
        String stamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Timestamp(dt.getTime()));
        return stamp;
    }
    
    private void UpdateTableView()
    {
        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
        model.setRowCount(0);
        DisplayData();
        
    }
    
    private void txtPidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPidKeyTyped

    }//GEN-LAST:event_txtPidKeyTyped

    private void txtBreakKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBreakKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c))
        {    
            txtBreak.setEditable(false);
        } 
        else
        {
            txtBreak.setEditable(true);
        }
    }//GEN-LAST:event_txtBreakKeyPressed

    private void txtNetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNetKeyPressed
        // TODO add your handling code here:
        txtNet.setEditable(false);
    }//GEN-LAST:event_txtNetKeyPressed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int row = tblDisplay.getSelectedRow();
        if(row == -1)
        {
            JOptionPane.showMessageDialog(Inventory.this, "Please select a row!");
            return;
        }
            
        String value = tblDisplay.getModel().getValueAt(row, 0).toString();
        
        String sql = "UPDATE INVENTORY SET PID=?, QUANTITY=?, BREAKAGE=?, NET=? WHERE PID=?";
        try
        {
            int quant = Integer.parseInt(txtQuant.getText().trim());
            int damage = Integer.parseInt(txtBreak.getText().trim());
            int net = quant -  damage;
            if(!value.equals(txtPid.getText().trim()))
            {
                if(checkUpdate())
                {
                    JOptionPane.showMessageDialog(Inventory.this, "Product with Pid already exists!");
                    resetValues();
                    return;
                }
                updateSale(value,txtPid.getText().trim());
                updatePurchase(value,txtPid.getText().trim());
            }
            DatabaseConnect db = new DatabaseConnect();    
            PreparedStatement pst = db.conn.prepareStatement(sql);
            pst.setString(1, txtPid.getText().trim());
            pst.setInt(2, quant);
            pst.setInt(3, damage);
            pst.setInt(4, net);
            pst.setString(5, value);
            pst.executeUpdate();
            UpdateTableView();
            JOptionPane.showMessageDialog(null, "Inventory Updated Sucessfuly!");
            pst.close();
               
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
            }
        resetValues();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDisplayMouseClicked
        // TODO add your handling code here:
        int row = tblDisplay.getSelectedRow();
        TableModel model = tblDisplay.getModel();
        txtPid.setText(model.getValueAt(row, 0).toString());
        txtQuant.setText(model.getValueAt(row, 1).toString());
        txtBreak.setText(model.getValueAt(row, 2).toString());
        txtNet.setText(model.getValueAt(row, 3).toString());
        txtNet.setEditable(false);
        
        
    }//GEN-LAST:event_tblDisplayMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        if(tblDisplay.getSelectedRowCount() == 1)
        {
            int row = tblDisplay.getSelectedRow();
            String pid = tblDisplay.getModel().getValueAt(row, 0).toString();
            String sql = "DELETE FROM INVENTORY WHERE PID=?";
            try {
                DatabaseConnect db = new DatabaseConnect();
    
                PreparedStatement pst = db.conn.prepareStatement(sql);
                pst.setString(1, pid);
                pst.execute();
                UpdateTableView();
                resetValues();
                JOptionPane.showMessageDialog(null, "Deleted Successfully");
                pst.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Something went wrong!");
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else
        {
            if(tblDisplay.getRowCount() == 0)
            {
                JOptionPane.showMessageDialog(Inventory.this, "The table is Empty!");
            }
            else
            {
                JOptionPane.showMessageDialog(Inventory.this, "Please select a single row!");
               
            }
        }    
        resetValues();
              
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtPidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPidKeyPressed

    }//GEN-LAST:event_txtPidKeyPressed

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

    private void txtQuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantActionPerformed
    
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
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Inventory().setVisible(true);
        });
    }
    
    private boolean checkUpdate()
    {
        String sql = "SELECT * FROM INVENTORY WHERE PID = ?";
        try {
            DatabaseConnect db = new DatabaseConnect();
    
            PreparedStatement pst = db.conn.prepareStatement(sql);
            pst.setString(1, txtPid.getText().trim());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next())
            {
                pst.close();
                return true;
            }
            pst.close();
            
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    private void updateSale(String oldPid, String newPid)
    {
        String sql = "UPDATE SALES SET PID = ? WHERE PID = ?";
        try {
            DatabaseConnect db = new DatabaseConnect();
    
            PreparedStatement pst = db.conn.prepareStatement(sql);
            pst.setString(1, newPid);
            pst.setString(2, oldPid);
            pst.executeUpdate();
            pst.close();
            JOptionPane.showMessageDialog(null, "Item updated sales list!");
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void updatePurchase(String oldPid, String newPid)
    {
        String sql = "UPDATE PURCHASE SET PID = ? WHERE PID = ?";
        try {
            DatabaseConnect db = new DatabaseConnect();
    
            PreparedStatement pst = db.conn.prepareStatement(sql);
            pst.setString(1, newPid);
            pst.setString(2, oldPid);
            pst.executeUpdate();
            pst.close();
            JOptionPane.showMessageDialog(null, "Item updated in purchased list!");
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void resetValues()
    {
        txtPid.setText("");
        txtQuant.setText("");
        txtBreak.setText("");
        txtNet.setText("");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBreakage;
    private javax.swing.JLabel lblPid;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblRate;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JTextField txtBreak;
    private javax.swing.JTextField txtNet;
    private javax.swing.JTextField txtPid;
    private javax.swing.JTextField txtQuant;
    // End of variables declaration//GEN-END:variables
}