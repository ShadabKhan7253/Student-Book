
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shadab Khan
 */
public class DBConnect {
    public static Connection getConnection(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","");
        return conn;
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Connection Failed","Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
