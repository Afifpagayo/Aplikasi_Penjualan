package KONEKSI;

import java.sql.Connection;
import java.sql.DriverManager;

public class koneksilogin 
{
 public static Connection db_appmotor()
    {
        String url = "jdbc:mysql://localhost:3306/db_appmotor";
        String user = "root";
        String pass = "";
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,user,pass);
            return conn;
            
        } 
        catch (Exception e) 
        {
            System.err.println(e + "Koneksi Gagal (Koneksi.Classkoneksi)");
            return null;
        }
    }   
}
