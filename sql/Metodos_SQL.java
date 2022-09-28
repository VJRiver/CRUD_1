package sql;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import java.sql.Statement;

import java.sql.PreparedStatement;
import java.sql.Connection;

public class Metodos_SQL {
    
    private static Connection con;
    private static PreparedStatement ps;
    private static ResultSet rs = null;
    private boolean guardado = false;
    private static String[] valores = new String[8];
    
    public static void setRsValues(String curp) {

         try {
            con = Conexion_DB.conexion();
            String consulta = "SELECT * FROM datos_usr WHERE curp = ?";
            ps = con.prepareStatement(consulta);
            ps.setString(1, curp);
            
            rs = ps.executeQuery();
            
            
            while(rs.next()) {
                for(int i = 1; i < 9; i++) {
                    valores[i - 1] = rs.getString(i);
                }
            }
        
        con.close();
                        
        }catch(Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se puede recuperar ResultSet");
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                
                e.printStackTrace();
            }
        }
    }
    

    public static String[] getValores() {
        return valores;
    }
    
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
            
            JOptionPane.showMessageDialog(null, i + " registro insertado.");
            
            guardado = true;
            
            
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar datos");
            e.printStackTrace();
            guardado = false;
            
        }finally {
            try {
                con.close();
            }catch(Exception ex) {
                ex.printStackTrace();
            }
        }
        }
    
    public static String buscaCurp(String curp) {
        
        String mensaje = null;
                
        
        
        try {
           con = Conexion_DB.conexion();
           String consulta = "SELECT curp from datos_usr WHERE curp = ?";
            ps = con.prepareStatement(consulta);
            ps.setString(1, curp);
            rs = ps.executeQuery();
            
            if(rs.next()) {
                
                mensaje = "Existe curp";
                
            }else {
                mensaje = "No existe curp";
               
            }
            
            
        } catch (SQLException e) {
            
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                
                e.printStackTrace();
            }
        }
        
        return mensaje;
    }
    
    public boolean getResultado() {
        return guardado;
    }
        
    public static void modificar(String curp, String nombre, String paterno, String materno, String domicilio, int year, String area, String pass) {
        
        String sentencia = "UPDATE datos_usr SET nombre = ?, paterno = ?, materno = ?, domicilio = ?, nacimiento = ?, area = ?, password = ? WHERE curp = ?";
        try {
            
            con = Conexion_DB.conexion();
            PreparedStatement pstmt = con.prepareStatement(sentencia);
            pstmt.setString(1, nombre);
            
            pstmt.setString(2, paterno);
            pstmt.setString(3, materno);
            pstmt.setString(4, domicilio);
            pstmt.setInt(5, year);
            pstmt.setString(6, area);
            pstmt.setString(7, pass);
            pstmt.setString(8, curp);
            
            int actualizado = pstmt.executeUpdate();
            
            if(actualizado > 0) {
                JOptionPane.showMessageDialog(null, "Información actualizada");
            }else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la información");
            }
            
            con.close();
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    public static void eliminar(String curp) {
        String sentenciaBorrar = "DELETE FROM datos_usr WHERE curp=?";
        try {
            con = Conexion_DB.conexion();
            PreparedStatement ps = con.prepareStatement(sentenciaBorrar);
            ps.setString(1, curp);
            
            int borrado = ps.executeUpdate();
            
            if(borrado > 0) {
                JOptionPane.showMessageDialog(null, "El registro con CURP " + curp + " ha sido eliminado de la base de datos");
            }else {
                JOptionPane.showMessageDialog(null, "Error: No se pudo eliminar registro");
            }
            
            con.close();
        }catch(Exception e) {
            System.out.println("No se pudo eliminar registro");
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




































