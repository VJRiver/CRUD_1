package forms;

import java.awt.Color;
import sql.Metodos_SQL;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Pnl_eliminar_usr extends JPanel {
    private static final long serialVersionUID = 1L;
    
    private JTextField txtCurpAEliminar;
    private JPanel pnl_Datos;
    private JLabel lbl_tituloTabla;
    private JLabel lbl_Paterno;
    private JLabel lblMaterno;
    private JLabel lblDomicilio;
    private JLabel lblFechaDeNacimiento;
    private JLabel lblArea;
    private JLabel lblPassword;
    private JLabel lbl_show_paterno;
    private JLabel lbl_show_materno;
    private JLabel lbl_show_domicilio;
    private JLabel lbl_show_nacimiento;
    private JLabel lbl_show_area;
    private JLabel lbl_show_pass;
    private JLabel lblEliminar;
    private JButton btnEliminar;
    private JPanel pnl_Opciones;
    private JLabel lbl_titulo_eliminar;
    private JPanel pnlEliminar;
    private JLabel lblCurpABuscar;
    private JLabel lblCheckIcon;
    private JLabel lblEncontradoONo;
    private JLabel lbl_show_nombre;
    private JLabel lbl_Nombre;
    private ImageIcon tache;
    private ImageIcon check;
    
    public Pnl_eliminar_usr() {
        
        btnEliminar = new JButton();

        
                
        setBackground(Color.WHITE);
        setLayout(null);
        
        pnl_Opciones = new JPanel();
        pnl_Datos = new JPanel();
                
        pnl_Datos.setBackground(new Color(32, 178, 170));
        
        pnl_Datos.setBorder(new TitledBorder(null, "Datos del usuario", TitledBorder.LEADING, TitledBorder.TOP, new Font("Arial", Font.BOLD, 20), null));
        pnl_Datos.setBounds(10, 176, 607, 462);
        add(pnl_Datos);
        pnl_Datos.setLayout(null);
             
        
        lbl_tituloTabla = new JLabel("Datos del Usuario");
        lbl_tituloTabla.setFont(new Font("Arial", Font.BOLD, 14));
        lbl_tituloTabla.setBounds(10, 30, 137, 14);
        pnl_Datos.add(lbl_tituloTabla);
        
        lbl_Paterno = new JLabel("Paterno:");
        lbl_Paterno.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lbl_Paterno.setBounds(10, 126, 68, 20);
        pnl_Datos.add(lbl_Paterno);
        
        lblMaterno = new JLabel("Materno:");
        lblMaterno.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblMaterno.setBounds(10, 177, 68, 20);
        pnl_Datos.add(lblMaterno);
        
        lblDomicilio = new JLabel("Domicilio:");
        lblDomicilio.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblDomicilio.setBounds(10, 227, 83, 20);
        pnl_Datos.add(lblDomicilio);
        
        lblFechaDeNacimiento = new JLabel("Año de Nacimiento:");
        lblFechaDeNacimiento.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblFechaDeNacimiento.setBounds(10, 275, 157, 20);
        pnl_Datos.add(lblFechaDeNacimiento);
        
        lblArea = new JLabel("Area:");
        lblArea.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblArea.setBounds(349, 126, 42, 20);
        pnl_Datos.add(lblArea);
        
        lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblPassword.setBounds(349, 176, 73, 20);
        pnl_Datos.add(lblPassword);
        
        lbl_show_paterno = new JLabel("---");
        lbl_show_paterno.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_show_paterno.setBounds(166, 131, 157, 14);
        pnl_Datos.add(lbl_show_paterno);
        
        lbl_show_materno = new JLabel("---");
        lbl_show_materno.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_show_materno.setBounds(166, 182, 157, 14);
        pnl_Datos.add(lbl_show_materno);
        
        lbl_show_domicilio = new JLabel("---");
        lbl_show_domicilio.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_show_domicilio.setBounds(166, 232, 157, 14);
        pnl_Datos.add(lbl_show_domicilio);
        
        lbl_show_nacimiento = new JLabel("---");
        lbl_show_nacimiento.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_show_nacimiento.setBounds(166, 280, 157, 14);
        pnl_Datos.add(lbl_show_nacimiento);
        
        lbl_show_area = new JLabel("---");
        lbl_show_area.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_show_area.setBounds(436, 131, 142, 14);
        pnl_Datos.add(lbl_show_area);
        
        lbl_show_pass = new JLabel("---");
        lbl_show_pass.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_show_pass.setBounds(436, 181, 147, 14);
        pnl_Datos.add(lbl_show_pass);
        
        lbl_Nombre = new JLabel("Nombre:");
        lbl_Nombre.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lbl_Nombre.setBounds(10, 81, 68, 20);
        pnl_Datos.add(lbl_Nombre);
        
        lbl_show_nombre = new JLabel("---");
        lbl_show_nombre.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_show_nombre.setBounds(142, 86, 157, 14);
        pnl_Datos.add(lbl_show_nombre);

        
        // Btn cambia color cuando el mouse pasa por encima
        
        class BtnHover extends MouseAdapter{
            
            JButton btn;
            Border raisedBorder = BorderFactory.createRaisedBevelBorder();
            Border simpleBorder = BorderFactory.createLineBorder(Color.GRAY);
            
            public BtnHover(JButton btn) {
                this.btn = btn;
                
                
            }
            
            public void mouseEntered(MouseEvent me) {
                btn.setBorder(raisedBorder);
            }
            
            public void mouseExited(MouseEvent me) {
               
                btn.setBorder(simpleBorder);
               
            }
            
        }
        
        
        pnl_Opciones.setAlignmentX(Component.LEFT_ALIGNMENT);
        pnl_Opciones.setBackground(new Color(32, 178, 170));
        pnl_Opciones.setBorder(new TitledBorder(null, "Opciones", TitledBorder.LEADING, TitledBorder.TOP, new Font("Arial", Font.BOLD, 20), null));
        pnl_Opciones.setLayout(null);
        pnl_Opciones.setBounds(625, 176, 174, 462);
        add(pnl_Opciones);
        
        
        btnEliminar.setBackground(Color.WHITE);
        BtnHover cambiaColorbtnCheck = new BtnHover(btnEliminar);
        btnEliminar.addMouseListener(cambiaColorbtnCheck);
                
        btnEliminar.setBounds(24, 59, 125, 101);
        pnl_Opciones.add(btnEliminar);
        
        lblEliminar = new JLabel("Eliminar Usuario");
        lblEliminar.setFont(new Font("Arial", Font.BOLD, 14));
        lblEliminar.setBounds(29, 180, 115, 14);
        pnl_Opciones.add(lblEliminar);
        
        lbl_titulo_eliminar = new JLabel("Eliminar Usuario");
        lbl_titulo_eliminar.setFont(new Font("Linux Biolinum G", Font.BOLD, 34));
        lbl_titulo_eliminar.setBounds(182, 11, 270, 27);
        add(lbl_titulo_eliminar);
        
        pnlEliminar = new JPanel();
        pnlEliminar.setLayout(null);
        pnlEliminar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        pnlEliminar.setBackground(new Color(32, 178, 170));
        pnlEliminar.setBounds(10, 76, 789, 86);
        add(pnlEliminar);
        
        lblCurpABuscar = new JLabel("Inserte CURP a eliminar:");
        lblCurpABuscar.setFont(new Font("Arial", Font.BOLD, 16));
        lblCurpABuscar.setBounds(10, 30, 194, 28);
        pnlEliminar.add(lblCurpABuscar);
        
        txtCurpAEliminar = new JTextField();
        txtCurpAEliminar.setFont(new Font("Arial", Font.PLAIN, 14));
        txtCurpAEliminar.setColumns(10);
        txtCurpAEliminar.setBounds(203, 32, 248, 23);
        pnlEliminar.add(txtCurpAEliminar);
        
        lblCheckIcon = new JLabel("...");
        lblCheckIcon.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblCheckIcon.setHorizontalAlignment(SwingConstants.CENTER);
        lblCheckIcon.setBounds(471, 25, 32, 32);
        pnlEliminar.add(lblCheckIcon);
        
        lblEncontradoONo = new JLabel(".......");
        lblEncontradoONo.setFont(new Font("Arial", Font.BOLD, 15));
        lblEncontradoONo.setHorizontalAlignment(SwingConstants.CENTER);
        lblEncontradoONo.setBounds(527, 30, 252, 23);
        pnlEliminar.add(lblEncontradoONo);
        
        tache = new ImageIcon(getClass().getResource("/images/tache_rojo_chico.png"));
        check = new ImageIcon(getClass().getResource("/images/check_verde_chico.png"));
        
     // Bloqueamos componentes de paneles datos y opciones al iniciar el módulo,
        // hasta que se encuentre el CURP en el cuadro de búsqueda
        bloquear();
        
        setPng();
    }
    
    public void setGif(){
        ImageIcon gifShown;
        gifShown = new ImageIcon(getClass().getResource("/images/salir_gif.png"));
        Icon setThis = new ImageIcon(gifShown.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        btnEliminar.setIcon(setThis);
    }
    
    public void setPng() {
        ImageIcon pngShown;
        pngShown = new ImageIcon(getClass().getResource("/images/salir_gif_static.png"));
        Icon setThisPng = new ImageIcon(pngShown.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        btnEliminar.setIcon(setThisPng);
    } 
    
    public void bloquear() {
        for(Component c:
            pnl_Datos.getComponents()) {
            c.setEnabled(false);
        }
        
        for(Component c: pnl_Opciones.getComponents()) {
            c.setEnabled(false);
        }
            
    }
    
    public void desbloquear() {
        for(Component c:
            pnl_Datos.getComponents()) {
            c.setEnabled(true);
        }
        
        for(Component c: pnl_Opciones.getComponents()) {
            c.setEnabled(true);
        }
    }
    
    public void limpiar() {
        lbl_show_paterno.setText("");
        lbl_show_materno.setText("");
        lbl_show_area.setText("");
        lbl_show_domicilio.setText("");
        lbl_show_nacimiento.setText("");
        lbl_show_pass.setText("");
        lbl_show_nombre.setText("");
    }
    
    public void validacion() {
        String statusBusqueda = Metodos_SQL.buscaCurp(txtCurpAEliminar.getText());
        
        if(txtCurpAEliminar.getText().isEmpty()) {
            limpiar();
            lblEncontradoONo.setText("CURP debe tener 18 caracteres");
            lblCheckIcon.setIcon(check);
        }
    }
}





















