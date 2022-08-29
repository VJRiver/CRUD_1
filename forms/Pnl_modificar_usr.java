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
import javax.swing.table.JTableHeader;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Dimension;

public class Pnl_modificar_usr extends JPanel {
    private JTextField textField;
    /**
     * Create the panel.
     */
    public Pnl_modificar_usr() {

        setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lbl_titulo_modificar = new JLabel("Modificar Usuario");
        lbl_titulo_modificar.setFont(new Font("Linux Biolinum G", Font.BOLD, 34));
        lbl_titulo_modificar.setBounds(168, 11, 283, 27);
        add(lbl_titulo_modificar);
        
        JPanel pnl_Datos = new JPanel();
        pnl_Datos.setBackground(new Color(32, 178, 170));
        TitledBorder borde = new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Inserte datos del usuario", TitledBorder.LEADING, TitledBorder.TOP, new Font("Arial", Font.BOLD, 20), new Color(0, 0, 0));
        
        pnl_Datos.setBorder(borde);
        pnl_Datos.setBounds(10, 55, 607, 583);
        add(pnl_Datos);
        pnl_Datos.setLayout(null);
        
        JLabel lbl_tituloTabla = new JLabel("Datos del Usuario");
        lbl_tituloTabla.setFont(new Font("Arial", Font.BOLD, 14));
        lbl_tituloTabla.setBounds(10, 62, 137, 14);
        pnl_Datos.add(lbl_tituloTabla);
        
        JLabel lbl_Paterno = new JLabel("Paterno:");
        lbl_Paterno.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lbl_Paterno.setBounds(10, 111, 68, 20);
        pnl_Datos.add(lbl_Paterno);
        
        JLabel lblMaterno = new JLabel("Materno:");
        lblMaterno.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblMaterno.setBounds(10, 162, 68, 20);
        pnl_Datos.add(lblMaterno);
        
        JLabel lblDomicilio = new JLabel("Domicilio:");
        lblDomicilio.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblDomicilio.setBounds(10, 212, 83, 20);
        pnl_Datos.add(lblDomicilio);
        
        JLabel lblFechaDeNacimiento = new JLabel("Año de Nacimiento:");
        lblFechaDeNacimiento.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblFechaDeNacimiento.setBounds(10, 260, 157, 20);
        pnl_Datos.add(lblFechaDeNacimiento);
        
        JLabel lblArea = new JLabel("Area:");
        lblArea.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblArea.setBounds(349, 111, 42, 20);
        pnl_Datos.add(lblArea);
        
        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblPassword.setBounds(349, 161, 73, 20);
        pnl_Datos.add(lblPassword);
        
        JTextArea txt_Paterno = new JTextArea();
        txt_Paterno.setFont(new Font("Monospaced", Font.BOLD, 16));
        txt_Paterno.setBounds(83, 111, 164, 20);
        pnl_Datos.add(txt_Paterno);
        
        JTextArea txt_Materno = new JTextArea();
        txt_Materno.setFont(new Font("Monospaced", Font.BOLD, 16));
        txt_Materno.setBounds(83, 162, 164, 20);
        pnl_Datos.add(txt_Materno);
        
        JTextArea txt_Domicilio = new JTextArea();
        txt_Domicilio.setFont(new Font("Monospaced", Font.BOLD, 16));
        txt_Domicilio.setBounds(83, 212, 235, 20);
        pnl_Datos.add(txt_Domicilio);
        
        JComboBox<String> comboNacimiento = new JComboBox<String>();
        comboNacimiento.setFont(new Font("Arial", Font.BOLD, 16));
        comboNacimiento.setBounds(166, 261, 148, 20);
        pnl_Datos.add(comboNacimiento);
        
        JComboBox<String> combo_AreaTrabajo = new JComboBox<String>();
        combo_AreaTrabajo.setFont(new Font("Arial", Font.BOLD, 16));
        combo_AreaTrabajo.setBounds(415, 111, 182, 20);
        pnl_Datos.add(combo_AreaTrabajo);
        
        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(425, 164, 172, 20);
        pnl_Datos.add(textField);
        
        JButton btn_Random = new JButton((Icon) null);
        btn_Random.setBounds(414, 212, 112, 68);
        pnl_Datos.add(btn_Random);
        
        JLabel lbl_random_password = new JLabel("<html><center>Generar Contraseña Aleatoria<br>(Opcional)</html>", SwingConstants.CENTER);
        lbl_random_password.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lbl_random_password.setBounds(349, 305, 217, 58);
        pnl_Datos.add(lbl_random_password);
        

        
        
        // *********************** SEGUNDO PANEL, "OPCIONES" **************************************************************
        
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
        
        btnCheck.setBounds(24, 59, 125, 74);
        pnl_Opciones.add(btnCheck);
        
        Icon iconoBorrar = new ImageIcon("src\\images\\borrar.png");
        JButton btnBorrar = new JButton(iconoBorrar);
        
        // btnBorrar.setBackground(Color.WHITE);
        btnBorrar.setBounds(24, 196, 125, 74);
        pnl_Opciones.add(btnBorrar);
        
        JLabel lblGuardar = new JLabel("Actualizar");
        lblGuardar.setFont(new Font("Arial", Font.BOLD, 14));
        lblGuardar.setBounds(49, 144, 75, 14);
        pnl_Opciones.add(lblGuardar);
        
        JLabel lblBorrar = new JLabel("Borrar");
        lblBorrar.setFont(new Font("Arial", Font.BOLD, 14));
        lblBorrar.setBounds(62, 281, 50, 14);
        pnl_Opciones.add(lblBorrar);
    }
}
