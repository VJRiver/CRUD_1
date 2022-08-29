package forms;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.UUID;

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

public class Pnl_eliminar_usr extends JPanel {
    /**
     * Create the panel.
     */
    public Pnl_eliminar_usr() {

        setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel pnl_Datos = new JPanel();
        pnl_Datos.setBackground(new Color(32, 178, 170));
        TitledBorder borde = new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Inserte datos del usuario", TitledBorder.LEADING, TitledBorder.TOP, new Font("Arial", Font.BOLD, 20), new Color(0, 0, 0));
        
        pnl_Datos.setBorder(borde);
        pnl_Datos.setBounds(10, 55, 607, 583);
        add(pnl_Datos);
        pnl_Datos.setLayout(null);
        
        JLabel lbl_tituloTabla = new JLabel("Datos del Usuario");
        lbl_tituloTabla.setFont(new Font("Arial", Font.BOLD, 14));
        lbl_tituloTabla.setBounds(10, 91, 137, 14);
        pnl_Datos.add(lbl_tituloTabla);
        
        JLabel lbl_Paterno = new JLabel("Paterno:");
        lbl_Paterno.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lbl_Paterno.setBounds(10, 136, 68, 20);
        pnl_Datos.add(lbl_Paterno);
        
        JLabel lblMaterno = new JLabel("Materno:");
        lblMaterno.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblMaterno.setBounds(10, 187, 68, 20);
        pnl_Datos.add(lblMaterno);
        
        JLabel lblDomicilio = new JLabel("Domicilio:");
        lblDomicilio.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblDomicilio.setBounds(10, 237, 83, 20);
        pnl_Datos.add(lblDomicilio);
        
        JLabel lblFechaDeNacimiento = new JLabel("Año de Nacimiento:");
        lblFechaDeNacimiento.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblFechaDeNacimiento.setBounds(10, 285, 157, 20);
        pnl_Datos.add(lblFechaDeNacimiento);
        
        JLabel lblArea = new JLabel("Area:");
        lblArea.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblArea.setBounds(349, 136, 42, 20);
        pnl_Datos.add(lblArea);
        
        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblPassword.setBounds(349, 186, 73, 20);
        pnl_Datos.add(lblPassword);
        
        JLabel lbl_show_paterno = new JLabel("---");
        lbl_show_paterno.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_show_paterno.setBounds(166, 141, 46, 14);
        pnl_Datos.add(lbl_show_paterno);
        
        JLabel lbl_show_materno = new JLabel("---");
        lbl_show_materno.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_show_materno.setBounds(166, 192, 46, 14);
        pnl_Datos.add(lbl_show_materno);
        
        JLabel lbl_show_domicilio = new JLabel("---");
        lbl_show_domicilio.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_show_domicilio.setBounds(166, 242, 46, 14);
        pnl_Datos.add(lbl_show_domicilio);
        
        JLabel lbl_show_nacimiento = new JLabel("---");
        lbl_show_nacimiento.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_show_nacimiento.setBounds(166, 290, 46, 14);
        pnl_Datos.add(lbl_show_nacimiento);
        
        JLabel lbl_show_area = new JLabel("---");
        lbl_show_area.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_show_area.setBounds(436, 141, 46, 14);
        pnl_Datos.add(lbl_show_area);
        
        JLabel lbl_show_pass = new JLabel("---");
        lbl_show_pass.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_show_pass.setBounds(436, 191, 46, 14);
        pnl_Datos.add(lbl_show_pass);

        
        Icon iconoRandom = new ImageIcon("src\\images\\dice.png");
        
        
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
               // btn.setBackground(Color.LIGHT_GRAY);
            }
            
        }
        
        JPanel pnl_Opciones = new JPanel();
        pnl_Opciones.setAlignmentX(Component.LEFT_ALIGNMENT);
        pnl_Opciones.setBackground(new Color(32, 178, 170));
        pnl_Opciones.setBorder(new TitledBorder(null, "Opciones", TitledBorder.LEADING, TitledBorder.TOP, new Font("Arial", Font.BOLD, 20), null));
        pnl_Opciones.setLayout(null);
        pnl_Opciones.setBounds(625, 55, 174, 583);
        add(pnl_Opciones);
        
        //ImageIcon iconoCheck = new ImageIcon(getClass().getResource("src/images/checkGrande.png"));
        Icon checkIcon = new ImageIcon("src\\images\\checkmark.png"); 
        JButton btnCheck = new JButton(checkIcon);
        
        // Tratamos de cambiar color del boton al pasar ratón encima. No cambia, supongo que la imagen cubre todo el botón.
        
        BtnHover cambiaColorbtnCheck = new BtnHover(btnCheck);
        btnCheck.addMouseListener(cambiaColorbtnCheck);
                
        btnCheck.setBounds(24, 59, 125, 74);
        pnl_Opciones.add(btnCheck);
        
        Icon iconoBorrar = new ImageIcon("src\\images\\borrar.png");
        
        JLabel lblEliminar = new JLabel("Eliminar");
        lblEliminar.setFont(new Font("Arial", Font.BOLD, 14));
        lblEliminar.setBounds(51, 151, 73, 14);
        pnl_Opciones.add(lblEliminar);
        
        JLabel lbl_titulo_eliminar = new JLabel("Eliminar Usuario");
        lbl_titulo_eliminar.setFont(new Font("Linux Biolinum G", Font.BOLD, 34));
        lbl_titulo_eliminar.setBounds(182, 11, 270, 27);
        add(lbl_titulo_eliminar);
    }
}
