package sql;
import java.sql.*;

import javax.swing.JOptionPane;

public class Conexion_DB {
    
    private static String url = "jdbc:mysql://localhost:3306/db_crud";
    private static String user = "root";
    private static String pass = "";
    
    public static Connection conexion() {
        

        Connection con = null;
        
        try {
            
            con = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
            
            
        }catch(Exception e) {
            System.out.println("No se puede conectar");
            e.printStackTrace();
        }
        
        return con;
        
    }
    
    /*public static void main(String[] args) {
        conexion();
    }*/

}















