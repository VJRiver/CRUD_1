package forms;

import java.awt.Color;
import sql.Metodos_SQL;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
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
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
    private JButton btnLimpiar;
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
        btnLimpiar = new JButton();
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limpiarCurp();
                bloquear();
                btnLimpiar.setEnabled(false);
            }
        });
        btnLimpiar.setEnabled(false);
        
                
        setBackground(Color.WHITE);
        setLayout(null);
        
        pnl_Opciones = new JPanel();
        pnl_Datos = new JPanel();
                
        pnl_Datos.setBackground(new Color(32, 178, 170));
        
        pnl_Datos.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        pnl_Datos.setBounds(10, 176, 607, 462);
        add(pnl_Datos);
        pnl_Datos.setLayout(null);
             
        
        lbl_tituloTabla = new JLabel("Datos del Usuario");
        lbl_tituloTabla.setFont(new Font("Arial", Font.BOLD, 20));
        lbl_tituloTabla.setBounds(10, 24, 172, 20);
        pnl_Datos.add(lbl_tituloTabla);
        
        lbl_Paterno = new JLabel("Paterno:");
        lbl_Paterno.setFont(new Font("Arial", Font.BOLD, 17));
        lbl_Paterno.setBounds(10, 126, 68, 20);
        pnl_Datos.add(lbl_Paterno);
        
        lblMaterno = new JLabel("Materno:");
        lblMaterno.setFont(new Font("Arial", Font.BOLD, 17));
        lblMaterno.setBounds(10, 177, 73, 20);
        pnl_Datos.add(lblMaterno);
        
        lblDomicilio = new JLabel("Domicilio:");
        lblDomicilio.setFont(new Font("Arial", Font.BOLD, 17));
        lblDomicilio.setBounds(10, 227, 83, 20);
        pnl_Datos.add(lblDomicilio);
        
        lblFechaDeNacimiento = new JLabel("Año de Nacimiento:");
        lblFechaDeNacimiento.setFont(new Font("Arial", Font.BOLD, 17));
        lblFechaDeNacimiento.setBounds(10, 275, 157, 20);
        pnl_Datos.add(lblFechaDeNacimiento);
        
        lblArea = new JLabel("Area:");
        lblArea.setFont(new Font("Arial", Font.BOLD, 17));
        lblArea.setBounds(349, 126, 42, 20);
        pnl_Datos.add(lblArea);
        
        lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Arial", Font.BOLD, 17));
        lblPassword.setBounds(349, 176, 89, 20);
        pnl_Datos.add(lblPassword);
        
        lbl_show_paterno = new JLabel("---");
        lbl_show_paterno.setFont(new Font("Arial", Font.BOLD, 15));
        lbl_show_paterno.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_show_paterno.setBounds(166, 131, 157, 14);
        pnl_Datos.add(lbl_show_paterno);
        
        lbl_show_materno = new JLabel("---");
        lbl_show_materno.setFont(new Font("Arial", Font.BOLD, 15));
        lbl_show_materno.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_show_materno.setBounds(166, 182, 157, 14);
        pnl_Datos.add(lbl_show_materno);
        
        lbl_show_domicilio = new JLabel("---");
        lbl_show_domicilio.setFont(new Font("Arial", Font.BOLD, 15));
        lbl_show_domicilio.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_show_domicilio.setBounds(166, 232, 157, 14);
        pnl_Datos.add(lbl_show_domicilio);
        
        lbl_show_nacimiento = new JLabel("---");
        lbl_show_nacimiento.setFont(new Font("Arial", Font.BOLD, 15));
        lbl_show_nacimiento.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_show_nacimiento.setBounds(166, 280, 157, 14);
        pnl_Datos.add(lbl_show_nacimiento);
        
        lbl_show_area = new JLabel("---");
        lbl_show_area.setFont(new Font("Arial", Font.BOLD, 15));
        lbl_show_area.setHorizontalTextPosition(SwingConstants.CENTER);
        lbl_show_area.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_show_area.setBounds(441, 131, 137, 14);
        pnl_Datos.add(lbl_show_area);
        
        lbl_show_pass = new JLabel("---");
        lbl_show_pass.setFont(new Font("Arial", Font.PLAIN, 13));
        lbl_show_pass.setHorizontalTextPosition(SwingConstants.CENTER);
        lbl_show_pass.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_show_pass.setBounds(441, 181, 142, 14);
        pnl_Datos.add(lbl_show_pass);
        
        lbl_Nombre = new JLabel("Nombre:");
        lbl_Nombre.setFont(new Font("Arial", Font.BOLD, 17));
        lbl_Nombre.setBounds(10, 81, 68, 20);
        pnl_Datos.add(lbl_Nombre);
        
        lbl_show_nombre = new JLabel("---");
        lbl_show_nombre.setFont(new Font("Arial", Font.BOLD, 15));
        lbl_show_nombre.setHorizontalTextPosition(SwingConstants.CENTER);
        lbl_show_nombre.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_show_nombre.setBounds(162, 86, 161, 14);
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
        pnl_Opciones.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        pnl_Opciones.setLayout(null);
        pnl_Opciones.setBounds(625, 176, 174, 462);
        add(pnl_Opciones);
        
        
        btnEliminar.setBackground(Color.WHITE);
        BtnHover cambiaColorbtnCheck = new BtnHover(btnEliminar);
        btnEliminar.addMouseListener(cambiaColorbtnCheck);
                
        btnEliminar.setBounds(24, 59, 125, 101);
        pnl_Opciones.add(btnEliminar);
        
        lblEliminar = new JLabel("Eliminar Usuario");
        lblEliminar.setHorizontalTextPosition(SwingConstants.CENTER);
        lblEliminar.setHorizontalAlignment(SwingConstants.CENTER);
        lblEliminar.setFont(new Font("Arial", Font.BOLD, 16));
        lblEliminar.setBounds(17, 180, 140, 14);
        pnl_Opciones.add(lblEliminar);
        
        
        btnLimpiar.setIcon(new ImageIcon("C:\\Users\\Dell3020\\Desktop\\PROGRAMACION\\Java\\EclipseProjects\\com.proyectoCRUD\\src\\images\\borrar.png"));
        btnLimpiar.setBackground(Color.WHITE);
        btnLimpiar.setBounds(24, 227, 125, 101);
        pnl_Opciones.add(btnLimpiar);
        
        JLabel lblBorrar = new JLabel("Borrar");
        lblBorrar.setHorizontalAlignment(SwingConstants.CENTER);
        lblBorrar.setFont(new Font("Arial", Font.BOLD, 17));
        lblBorrar.setBounds(29, 355, 115, 14);
        pnl_Opciones.add(lblBorrar);
        
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
        lblCurpABuscar.setFont(new Font("Arial", Font.BOLD, 17));
        lblCurpABuscar.setBounds(10, 30, 206, 28);
        pnlEliminar.add(lblCurpABuscar);
        
        txtCurpAEliminar = new JTextField();
        txtCurpAEliminar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                validacion();
            }
            
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if(Character.isLetter(c)) {
                    Character.toUpperCase(c);
                }
                if(txtCurpAEliminar.getText().length() >= 18) {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        });
        txtCurpAEliminar.setFont(new Font("Arial", Font.PLAIN, 14));
        txtCurpAEliminar.setColumns(10);
        txtCurpAEliminar.setBounds(226, 34, 248, 23);
        pnlEliminar.add(txtCurpAEliminar);
        
        lblCheckIcon = new JLabel("...");
        lblCheckIcon.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblCheckIcon.setHorizontalAlignment(SwingConstants.CENTER);
        lblCheckIcon.setBounds(496, 28, 32, 32);
        pnlEliminar.add(lblCheckIcon);
        
        lblEncontradoONo = new JLabel(".......");
        lblEncontradoONo.setFont(new Font("Arial", Font.BOLD, 17));
        lblEncontradoONo.setHorizontalAlignment(SwingConstants.CENTER);
        lblEncontradoONo.setBounds(547, 30, 232, 23);
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
            UIManager.put("Label.disabledForeground", Color.GRAY);
            
            c.setEnabled(false);
            
            
        }
        
//        for(Component c: pnl_Opciones.getComponents()) {
//            c.setEnabled(false);
//        }
        btnEliminar.setEnabled(false);
            
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
    
    public void limpiarCurp() {
        txtCurpAEliminar.setText(null);
    }
    
    public void validacion() {
        String statusBusqueda = Metodos_SQL.buscaCurp(txtCurpAEliminar.getText());
        
        if(txtCurpAEliminar.getText().isEmpty()) {
            limpiar();
            lblEncontradoONo.setText("CURP debe tener 18 caracteres");
            bloquear();
            btnLimpiar.setEnabled(false);
            
            
        }else if(statusBusqueda.equals("No existe curp") || txtCurpAEliminar.getText().length() < 18) {
            limpiar();
            lblEncontradoONo.setText("<html><center><p>No Encontrado</html>");
            lblEncontradoONo.setBackground(Color.WHITE);
            lblCheckIcon.setText(null);
            lblCheckIcon.setIcon(tache);
            btnEliminar.setEnabled(false);
            bloquear();
            btnLimpiar.setEnabled(true);
            
        }else if(statusBusqueda.equals("Existe curp") && txtCurpAEliminar.getText().length() >= 18) {
            lblEncontradoONo.setText("<html><center><p>Encontrado</html>");
            lblCheckIcon.setText(null);
            lblCheckIcon.setIcon(check);
            desbloquear();
            llenarEtiquetas();
            btnLimpiar.setEnabled(true);
        }
    }
    
    public void llenarEtiquetas() {
        Metodos_SQL.setRsValues(txtCurpAEliminar.getText());
        String[] lblValues = Metodos_SQL.getValores();
        lbl_show_nombre.setText(lblValues[1]);
        lbl_show_paterno.setText(lblValues[2]);
        lbl_show_materno.setText(lblValues[3]);
        lbl_show_domicilio.setText(lblValues[4]);
        lbl_show_nacimiento.setText(lblValues[5]);
        lbl_show_area.setText(lblValues[6]);
        lbl_show_pass.setText(lblValues[7]);
        
    }
}





















