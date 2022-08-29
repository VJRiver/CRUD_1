package sql;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import java.sql.PreparedStatement;
import java.sql.Connection;

public class Metodos_SQL {
    
    private static Connection con;
    private static PreparedStatement ps;
    private static ResultSet rs;
    
    
    public void guardarDatos(String curp, String nombre, String paterno, String materno, String domicilio, int year, String area, String pass) {
        
        try {
            con = Conexion_DB.conexion();
            
            String consulta = "INSERT INTO datos_usr VALUES(?,?,?,?,?,?,?,?)";
            
            ps = con.prepareStatement(consulta);
            ps.setString(1, curp);
            ps.setString(2, nombre);
            ps.setString(3, paterno);
            ps.setString(4, materno);
            ps.setString(5, domicilio);
            ps.setInt(6, year);
            ps.setString(7, area);
            ps.setString(8, pass);
            
            int i = ps.executeUpdate();
            
            con.close();
            
            JOptionPane.showMessageDialog(null, i + "Registros insertados.");
            
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar datos");
            e.printStackTrace();
        }finally {
            try {
                con.close();
            }catch(Exception ex) {
                ex.printStackTrace();
            }
        }
        }
        
        
    

}
