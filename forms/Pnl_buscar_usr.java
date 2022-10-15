package forms;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.UUID;
import sql.Conexion_DB;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableColumn;

import sql.Metodos_SQL;

import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Pnl_buscar_usr extends JPanel {
    private static final long serialVersionUID = 1L;
    private JTextField txtCurp;
    private JTable tblDatos;
    private DefaultTableModel modelo;
    private Icon iconoBorrar;
    private JPanel pnlBusqueda;
    private JLabel lblSearchIcon;
    private JLabel lblSearchResult;
    private JScrollPane scrollPnlDatos;
    private ResultSet rs;
    private Connection con;
    private Icon tache;
    private Icon check;
    
    /**
     * Create the panel.
     */
    public Pnl_buscar_usr() {

        setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lbl_titulo_buscar = new JLabel("Buscar Usuario");
        lbl_titulo_buscar.setFont(new Font("Linux Libertine G", Font.BOLD, 36));
        lbl_titulo_buscar.setBounds(10, 11, 261, 27);
        add(lbl_titulo_buscar);
        TitledBorder borde = new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Inserte datos del usuario", TitledBorder.LEADING, TitledBorder.TOP, new Font("Arial", Font.BOLD, 20), new Color(0,0,128));

        // Btn cambia color cuando el mouse pasa por encima
        
        new ImageIcon("src\\images\\checkmark.png");
        
        iconoBorrar = new ImageIcon("src\\images\\borrar.png");
        
        pnlBusqueda = new JPanel();
        pnlBusqueda.setBorder(new TitledBorder(null, "B\u00FAsqueda Aproximada", TitledBorder.LEADING, TitledBorder.TOP, new Font("Arial", Font.BOLD, 16), new Color(0, 0, 128)));
        pnlBusqueda.setBackground(new Color(32,178,170));
        pnlBusqueda.setBounds(10, 49, 794, 94);
        add(pnlBusqueda);
        pnlBusqueda.setLayout(null);
        
        JLabel lblSearchTitle = new JLabel("Escriba CURP a buscar");
        lblSearchTitle.setForeground(new Color(0, 0, 0));
        lblSearchTitle.setFont(new Font("Arial", Font.BOLD, 14));
        lblSearchTitle.setBounds(10, 40, 171, 14);
        pnlBusqueda.add(lblSearchTitle);
                
        modelo = new DefaultTableModel();
        modelo.addColumn("Curp");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Año Nac");
        modelo.addColumn("Area");
        modelo.addColumn("Password");
                
        tache = new ImageIcon(getClass().getResource("/images/tache_rojo_chico.png"));
        check = new ImageIcon(getClass().getResource("/images/check_verde_chico.png"));
        
        txtCurp = new JTextField();
        txtCurp.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                validacion();
            }
        });
        txtCurp.setFont(new Font("Arial", Font.BOLD, 15));
        txtCurp.setBounds(180, 38, 220, 20);
        pnlBusqueda.add(txtCurp);
        txtCurp.setColumns(10);
        
        lblSearchIcon = new JLabel("---");
        lblSearchIcon.setHorizontalAlignment(SwingConstants.CENTER);
        lblSearchIcon.setBounds(410, 32, 32, 32);
        pnlBusqueda.add(lblSearchIcon);
        
        lblSearchResult = new JLabel("----");
        lblSearchResult.setFont(new Font("Arial", Font.BOLD, 15));
        lblSearchResult.setHorizontalAlignment(SwingConstants.CENTER);
        lblSearchResult.setBounds(452, 41, 250, 17);
        pnlBusqueda.add(lblSearchResult);
        
        scrollPnlDatos = new JScrollPane();
        scrollPnlDatos.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Datos encontrados", TitledBorder.LEADING, TitledBorder.TOP, new Font("Arial", Font.BOLD, 18), new Color(0, 0, 128)));
        scrollPnlDatos.setBounds(10, 153, 794, 484);
        scrollPnlDatos.setBackground(new Color(38, 178, 170));
        
        tblDatos = new JTable();
        tblDatos.setModel(modelo);
        tblDatos.getColumn("Curp").setPreferredWidth(120);
        tblDatos.getColumn("Año Nac").setPreferredWidth(40);
        add(scrollPnlDatos);
        scrollPnlDatos.setColumnHeaderView(tblDatos);
    }
    
    public void validacion() {
        String resultado = Metodos_SQL.busquedaAprox(txtCurp.getText());
        
        if(resultado.equals("Hay resultados")) {
            try {
                 
                con = Conexion_DB.conexion();
                String consultaAprox = "SELECT * from datos_usr WHERE curp LIKE ?";
                
                PreparedStatement ps = con.prepareStatement(consultaAprox);
                ps.setString(1, txtCurp.getText());
                rs = ps.executeQuery();
                while(rs.next()) {
                    Object[] registro = new Object[8];
                    for(int i = 0; i < 8; i++) {
                        registro[i] = rs.getObject(i+1);
                    }
                    modelo.addRow(registro);
                }
                
                lblSearchResult.setText("Registros encontrados");
                lblSearchIcon.setText("");
                lblSearchIcon.setIcon(check);
                con.close();
                
            }catch(Exception ex) {
                ex.printStackTrace();
            }finally {
                try {
                    con.close();
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        }else {
            lblSearchResult.setText("No hay coincidencias");
            lblSearchIcon.setIcon(tache);
        }
    }
   
}




























