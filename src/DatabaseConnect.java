
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
class DatabaseConnect 
{
    private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    private static final String JDBC_URL = "jdbc:derby:HTH;create=true";
   
    Connection conn;
    public DatabaseConnect() throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        try {
          
            //Class.forName(DRIVER).newInstance();
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            this.conn = DriverManager.getConnection(JDBC_URL);
            
            System.out.println("Connection Established!");
        } catch (SQLException ex) 
        {
            Logger.getLogger(DatabaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setupDb()
    {
        try {
            if (!doesTableExists("inventory", this.conn)) 
            {
                createTables();
                insertInTables();
            }
            printAll();
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void createTables()
    {
        try {
            conn.createStatement().execute("create table INVENTORY(PID VARCHAR(30) not null primary key,QUANTITY BIGINT not null,BREAKAGE BIGINT not null,NET BIGINT not null)");
            conn.createStatement().execute("create table PURCHASE\n" +
                                            "(\n" +
                                            "	PID VARCHAR(30) not null,\n" +
                                            "	DATE TIMESTAMP not null,\n" +
                                            "	QUANTITY BIGINT not null,\n" +
                                            "	RATE BIGINT not null,\n" +  
                                            "	TOTAL BIGINT not null,\n" +
                                            "	primary key (PID, DATE)\n" + 
                                            ")");
            conn.createStatement().execute("create table SALES\n" +
                                           "(\n" +
                                           "    PID VARCHAR(30) not null,\n" +
                                           "	DATE TIMESTAMP not null,\n" +
                                           "	QUANTITY BIGINT not null,\n" +
                                           "	RATE BIGINT not null,\n" +
                                           "	TOTAL BIGINT not null,\n" +
                                           "	primary key (PID, DATE)\n" +
                                           ")");

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void insertInTables()
    {
        String pid = "German";
        int quant = 200, damage = 10;
        int net = quant - damage;
        String sql = "INSERT INTO INVENTORY (PID,QUANTITY,BREAKAGE,NET) VALUES (?,?,?,?)";
        try {
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setString(1, pid);
            pst.setInt(2, quant);
            pst.setInt(3, damage);
            pst.setInt(4, net);

            pst.execute();
        }catch (SQLException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void printAll()
    {
        try {
            Statement st = this.conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM INVENTORY");
            while(rs.next())
            {
                System.out.println(rs.getString("PID") + " " + rs.getInt("QUANTITY"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    boolean doesTableExists(String tableName, Connection conn)throws SQLException 
    {
        DatabaseMetaData meta = conn.getMetaData();
        ResultSet result = meta.getTables(null, null, tableName.toUpperCase(), null);
 
        return result.next();
    }
    
}