
package db;
import java.sql.*;


import javax.swing.JOptionPane;

public class DbConnect {

    public static Connection con;
    public static Statement st;
   static{    
            try
            {
                //Class.forName("com.mysql.jdbc.cj.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdb","root","Kumar60@");
                st=con.createStatement();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }   
    
}
