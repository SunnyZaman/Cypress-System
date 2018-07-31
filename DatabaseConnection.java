/**
 * Cypress System
 * Database COnnection
 * Forming a connection with the database
 */
import java.sql.*;
import javax.swing.*;
//DatabaseConnection
public class DatabaseConnection {
    Connection conn = null;
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:CypressSystem.sqlite");
        return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        return null;
        }
    }
}
