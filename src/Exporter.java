
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
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
public class Exporter {
    
    public void exportTable(JTable tblDisplay , File file)
    {
        FileWriter out = null;
        try {
            TableModel model = tblDisplay.getModel();
            out = new FileWriter(file);
            try (BufferedWriter bw = new BufferedWriter(out)) 
            {
                for(int i=0; i<model.getColumnCount(); i++)
                {
                    bw.write(model.getColumnName(i)+ ",");
                }
                
                for(int i=0; i<model.getRowCount(); i++)
                {
                    bw.write("\n");
                    for(int j=0; j<model.getColumnCount(); j++)
                    {
                        bw.write(model.getValueAt(i, j)+",");
                    }
                }
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Exporter.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Exporter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
