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
import javax.swing.JTable;

public class Pnl_buscar_usr extends JPanel {
    private JTable tbl_buscar;
    /**
     * Create the panel.
     */
    public Pnl_buscar_usr() {

        setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lbl_titulo_buscar = new JLabel("Buscar Usuario");
        lbl_titulo_buscar.setFont(new Font("Linux Biolinum G", Font.BOLD, 34));
        lbl_titulo_buscar.setBounds(171, 11, 244, 27);
        add(lbl_titulo_buscar);
        
        JPanel pnl_Datos = new JPanel();
        pnl_Datos.setBackground(new Color(32, 178, 170));
        TitledBorder borde = new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Inserte datos del usuario", TitledBorder.LEADING, TitledBorder.TOP, new Font("Arial", Font.BOLD, 20), new Color(0, 0, 0));
        
        pnl_Datos.setBorder(borde);
        pnl_Datos.setBounds(10, 55, 607, 583);
        add(pnl_Datos);
        pnl_Datos.setLayout(null);
        
        JLabel lbl_tabla_buscar = new JLabel("Datos de usuario");
        lbl_tabla_buscar.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lbl_tabla_buscar.setBounds(10, 95, 118, 20);
        pnl_Datos.add(lbl_tabla_buscar);
        
        tbl_buscar = new JTable();
        lbl_tabla_buscar.setLabelFor(tbl_buscar);
        tbl_buscar.setBounds(596, 126, -581, 405);
        pnl_Datos.add(tbl_buscar);

        
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
        JButton btnBorrar = new JButton(iconoBorrar);
        
        // Cambiamos color del boton al pasar ratón encima
        
        BtnHover cambiaColorbtnBorrar = new BtnHover(btnBorrar);
        btnBorrar.addMouseListener(cambiaColorbtnBorrar);
        
        // btnBorrar.setBackground(Color.WHITE);
        btnBorrar.setBounds(24, 196, 125, 74);
        pnl_Opciones.add(btnBorrar);
        
        JLabel lblGuardar = new JLabel("Guardar");
        lblGuardar.setFont(new Font("Arial", Font.BOLD, 14));
        lblGuardar.setBounds(53, 144, 73, 14);
        pnl_Opciones.add(lblGuardar);
        
        JLabel lblBorrar = new JLabel("Borrar");
        lblBorrar.setFont(new Font("Arial", Font.BOLD, 14));
        lblBorrar.setBounds(53, 281, 50, 14);
        pnl_Opciones.add(lblBorrar);
    }
}

