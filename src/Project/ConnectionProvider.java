/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;


/**
 *
 * @author Shree
 */
public class ConnectionProvider {
    public static Connection getConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6524116", "sql6524116", "Nt8Fh5LmLu");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JAVA_OOP", "root", "root");
            System.out.println("Connected !!! \n" + con);
            return con;
        }catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
}
