package forms;

import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

import javax.swing.border.TitledBorder;

import sql.Metodos_SQL;

import javax.swing.border.EtchedBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import java.awt.Component;
import javax.swing.SwingConstants;

public class Pnl_alta extends JPanel {
    JButton btn_Random;
    private JTextField txt_password_alta;

    /**
     * Create the panel.
     */
    public Pnl_alta() {
        setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lbl_titulo_alta = new JLabel("Alta Usuario");
        lbl_titulo_alta.setFont(new Font("Linux Biolinum G", Font.BOLD, 34));
        lbl_titulo_alta.setBounds(210, 11, 205, 27);
        add(lbl_titulo_alta);
        
        JPanel pnl_Datos = new JPanel();
        pnl_Datos.setBackground(new Color(32, 178, 170));
        TitledBorder borde = new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Inserte datos del usuario", TitledBorder.LEADING, TitledBorder.TOP, new Font("Arial", Font.BOLD, 20), new Color(0, 0, 0));
        
        pnl_Datos.setBorder(borde);
        pnl_Datos.setBounds(10, 55, 607, 583);
        add(pnl_Datos);
        pnl_Datos.setLayout(null);
        
        JLabel lbl_Curp = new JLabel("CURP:");
        lbl_Curp.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lbl_Curp.setBounds(10, 96, 53, 20);
        pnl_Datos.add(lbl_Curp);
        
        JLabel lbl_Nombre = new JLabel("Nombre:");
        lbl_Nombre.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lbl_Nombre.setBounds(10, 145, 68, 20);
        pnl_Datos.add(lbl_Nombre);
        
        JLabel lbl_Paterno = new JLabel("Paterno:");
        lbl_Paterno.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lbl_Paterno.setBounds(10, 199, 68, 20);
        pnl_Datos.add(lbl_Paterno);
        
        JLabel lblMaterno = new JLabel("Materno:");
        lblMaterno.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblMaterno.setBounds(10, 250, 68, 20);
        pnl_Datos.add(lblMaterno);
        
        JLabel lblDomicilio = new JLabel("Domicilio:");
        lblDomicilio.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblDomicilio.setBounds(10, 300, 83, 20);
        pnl_Datos.add(lblDomicilio);
        
        JLabel lblFechaDeNacimiento = new JLabel("Año de Nacimiento:");
        lblFechaDeNacimiento.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblFechaDeNacimiento.setBounds(10, 348, 157, 20);
        pnl_Datos.add(lblFechaDeNacimiento);
        
        JLabel lblArea = new JLabel("Area:");
        lblArea.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblArea.setBounds(349, 199, 42, 20);
        pnl_Datos.add(lblArea);
        
        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblPassword.setBounds(349, 249, 73, 20);
        pnl_Datos.add(lblPassword);
        
        JTextArea txt_Curp = new JTextArea();
        txt_Curp.setFont(new Font("Monospaced", Font.BOLD, 16));
        txt_Curp.setBounds(83, 96, 164, 20);
        pnl_Datos.add(txt_Curp);
        
        JTextArea txt_Nombre = new JTextArea();
        txt_Nombre.setFont(new Font("Monospaced", Font.BOLD, 16));
        txt_Nombre.setBounds(83, 145, 164, 20);
        pnl_Datos.add(txt_Nombre);
        
        JTextArea txt_Paterno = new JTextArea();
        txt_Paterno.setFont(new Font("Monospaced", Font.BOLD, 16));
        txt_Paterno.setBounds(83, 199, 164, 20);
        pnl_Datos.add(txt_Paterno);
        
        JTextArea txt_Materno = new JTextArea();
        txt_Materno.setFont(new Font("Monospaced", Font.BOLD, 16));
        txt_Materno.setBounds(83, 250, 164, 20);
        pnl_Datos.add(txt_Materno);
        
        JTextArea txt_Domicilio = new JTextArea();
        txt_Domicilio.setFont(new Font("Monospaced", Font.BOLD, 16));
        txt_Domicilio.setBounds(83, 300, 235, 20);
        pnl_Datos.add(txt_Domicilio);
        
        JComboBox<String> comboNacimiento = new JComboBox<String>();
        comboNacimiento.addItem("Elegir año");
        for(int i = Calendar.getInstance().get(Calendar.YEAR); i >= (Calendar.getInstance().get(Calendar.YEAR) - 120); i-- ) {
            comboNacimiento.addItem(String.valueOf(i));
        }
        
        comboNacimiento.setFont(new Font("Arial", Font.BOLD, 16));
        comboNacimiento.setBounds(166, 349, 148, 20);
        pnl_Datos.add(comboNacimiento);
        
        JComboBox<String> combo_AreaTrabajo = new JComboBox<String>();
        combo_AreaTrabajo.setFont(new Font("Arial", Font.BOLD, 16));
        combo_AreaTrabajo.setBounds(389, 201, 182, 20);
        combo_AreaTrabajo.addItem("Elegir Area");
        combo_AreaTrabajo.addItem("Recursos Humanos");
        combo_AreaTrabajo.addItem("Contabilidad");
        combo_AreaTrabajo.addItem("Sistemas");
        combo_AreaTrabajo.addItem("Operacion");
        pnl_Datos.add(combo_AreaTrabajo);
        
        Icon iconoRandom = new ImageIcon("src\\images\\dice.png");
        btn_Random = new JButton(iconoRandom);
        
        
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
       
        BtnHover cambiaBtnColor = new BtnHover(btn_Random);
        
        btn_Random.addMouseListener(cambiaBtnColor);
        
        btn_Random.setBounds(414, 300, 112, 68);
        
        btn_Random.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                generaPass();
                
            }
        });
        
        pnl_Datos.add(btn_Random);
        
        JSeparator separator = new JSeparator();
        separator.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        separator.setBounds(339, 181, 258, 2);
        pnl_Datos.add(separator);
        
        JLabel lbl_longitud = new JLabel("Nombre:");
        lbl_longitud.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lbl_longitud.setBounds(339, 88, 247, 36);
        pnl_Datos.add(lbl_longitud);
        
        JLabel lbl_validez = new JLabel("Nombre:");
        lbl_validez.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lbl_validez.setBounds(339, 136, 247, 38);
        pnl_Datos.add(lbl_validez);
        
        JLabel lbl_random_password = new JLabel("<html><center>Generar Contraseña Aleatoria<br>(Opcional)</html>", SwingConstants.CENTER);
        lbl_random_password.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_random_password.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lbl_random_password.setBounds(349, 393, 217, 58);
        pnl_Datos.add(lbl_random_password);
        
        txt_password_alta = new JTextField();
        txt_password_alta.setBounds(425, 252, 172, 20);
        pnl_Datos.add(txt_password_alta);
        txt_password_alta.setColumns(10);
        
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
       
        /*
         *  ********************************************************************* ALTA DE NUEVOS USUARIOS ***************************************
         */
        
        
        btnCheck.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String identif;
                String name;
                String mater;
                String pater;
                String address;
                int year;
                String area;
                String pass;
                
                identif = txt_Curp.getText();
                name = txt_Nombre.getText();
                mater = txt_Materno.getText();
                pater = txt_Paterno.getText();
                address = txt_Domicilio.getText();
                year = Integer.parseInt((String)comboNacimiento.getSelectedItem());
                area = (String)combo_AreaTrabajo.getSelectedItem();
                pass = txt_password_alta.getText();
                
                Metodos_SQL altaUsuario = new Metodos_SQL();
                altaUsuario.guardarDatos(identif, name, pater, mater, address, year, area, pass);
                
            }
        });
        
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
    
 // Crea password aleatorio, lo pega en el textfield sobre el botón
    
    public void generaPass() {
        
        String randPass1 = UUID.randomUUID().toString().toUpperCase().substring(0,6);
        String randPass2 = UUID.randomUUID().toString().toLowerCase().substring(0,6);
        txt_password_alta.setText(randPass1 + randPass2);
        
    }
}



















