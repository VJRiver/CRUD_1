package forms;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
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

import sql.Metodos_SQL;

import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Pnl_modificar_usr extends JPanel {
    private static final long serialVersionUID = 1L;
    private JTextField txtPassMod;
    private JTextField txtCurpABuscar;
    private JLabel lbl_titulo_modificar;
    private JPanel pnl_Datos;
    private JPanel pnl_Opciones;
    private JLabel lbl_tituloTabla;
    private JLabel lbl_Paterno;
    private JLabel lblMaterno;
    private JLabel lblDomicilio;
    private JLabel lblFechaDeNacimiento;
    private JLabel lblArea;
    private JLabel lblPassword;
    private JLabel lblIconoEncontrado;
    private JLabel lblEncontrado;
    private JTextField txt_PaternoMod;
    private JTextField txt_MaternoMod;
    private JTextField txt_DomicilioMod;
    private JComboBox<String> comboNacimientoMod;
    private JComboBox<String> combo_AreaTrabajoMod;
    private JButton btn_RandomMod;
    private JButton btnActualizar;
    private JButton btnBorrar;
    private JLabel lbl_random_password;
    private JSeparator separaModificar;
    private JLabel lblBusquedaCurp;
    private ImageIcon verde = new ImageIcon(getClass().getResource("/images/check_verde_chico.png"));
    private ImageIcon rojo = new ImageIcon(getClass().getResource("/images/tache_rojo_chico.png"));
    private Icon actualizar;
    private Icon actualizarGif;
    private JTextField txtNombre;


    public Pnl_modificar_usr() {

        setBackground(Color.WHITE);
        setLayout(null);

        lbl_titulo_modificar = new JLabel("Modificar Usuario");
        lbl_titulo_modificar.setFont(new Font("Linux Biolinum G", Font.BOLD, 34));
        lbl_titulo_modificar.setBounds(168, 11, 283, 27);
        add(lbl_titulo_modificar);

        pnl_Datos = new JPanel();
        pnl_Datos.setBackground(new Color(32, 178, 170));
        TitledBorder borde = new TitledBorder(
                new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
                "Inserte datos del usuario", TitledBorder.LEADING, TitledBorder.TOP, new Font("Arial", Font.BOLD, 20),
                new Color(0, 0, 0));

        pnl_Datos.setBorder(borde);
        pnl_Datos.setBounds(8, 55, 607, 583);
        add(pnl_Datos);
        pnl_Datos.setLayout(null);

        lbl_tituloTabla = new JLabel("Datos del Usuario");
        lbl_tituloTabla.setFont(new Font("Arial", Font.BOLD, 17));
        lbl_tituloTabla.setBounds(10, 138, 148, 14);
        pnl_Datos.add(lbl_tituloTabla);

        lbl_Paterno = new JLabel("Paterno:");
        lbl_Paterno.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lbl_Paterno.setBounds(10, 239, 68, 20);
        pnl_Datos.add(lbl_Paterno);

        lblMaterno = new JLabel("Materno:");
        lblMaterno.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblMaterno.setBounds(10, 290, 68, 20);
        pnl_Datos.add(lblMaterno);

        lblDomicilio = new JLabel("Domicilio:");
        lblDomicilio.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblDomicilio.setBounds(10, 340, 83, 20);
        pnl_Datos.add(lblDomicilio);

        lblFechaDeNacimiento = new JLabel("Año de Nacimiento:");
        lblFechaDeNacimiento.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblFechaDeNacimiento.setBounds(10, 388, 157, 20);
        pnl_Datos.add(lblFechaDeNacimiento);

        lblArea = new JLabel("Area:");
        lblArea.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblArea.setBounds(337, 187, 42, 20);
        pnl_Datos.add(lblArea);

        lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lblPassword.setBounds(337, 238, 73, 20);
        pnl_Datos.add(lblPassword);

        txt_PaternoMod = new JTextField();
        txt_PaternoMod.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                compruebaCampos();
            }
        });
        txt_PaternoMod.setFont(new Font("Arial", Font.PLAIN, 12));
        txt_PaternoMod.setBounds(83, 239, 164, 20);
        pnl_Datos.add(txt_PaternoMod);

        txt_MaternoMod = new JTextField();
        txt_MaternoMod.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                compruebaCampos();
            }
        });
        txt_MaternoMod.setFont(new Font("Arial", Font.PLAIN, 12));
        txt_MaternoMod.setBounds(83, 290, 164, 20);
        pnl_Datos.add(txt_MaternoMod);

        txt_DomicilioMod = new JTextField();
        txt_DomicilioMod.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                compruebaCampos();
            }
        });
        txt_DomicilioMod.setFont(new Font("Arial", Font.PLAIN, 12));
        txt_DomicilioMod.setBounds(83, 340, 235, 20);
        pnl_Datos.add(txt_DomicilioMod);

        comboNacimientoMod = new JComboBox<String>();
        combo_AreaTrabajoMod = new JComboBox<String>();
        
        // RELLENA LOS COMBOS

        rellenarCombos();
        
        comboNacimientoMod.setFont(new Font("Arial", Font.BOLD, 16));
        comboNacimientoMod.setBounds(150, 389, 196, 20);
        
        combo_AreaTrabajoMod.setFont(new Font("Arial", Font.BOLD, 16));
        combo_AreaTrabajoMod.setBounds(408, 187, 189, 20);
        
        comboNacimientoMod.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                compruebaCampos();
            }
        });
        
        
        combo_AreaTrabajoMod.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                compruebaCampos();
            }
        });
        
        pnl_Datos.add(comboNacimientoMod);
        pnl_Datos.add(combo_AreaTrabajoMod);

        txtPassMod = new JTextField();
        txtPassMod.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                compruebaCampos();
            }
        });
        txtPassMod.setFont(new Font("Arial", Font.PLAIN, 12));
        txtPassMod.setColumns(10);
        txtPassMod.setBounds(415, 240, 182, 20);
        pnl_Datos.add(txtPassMod);

        btn_RandomMod = new JButton((Icon) null);

        // ********** GENERA PASSWORD ALEATORIO ***************

        btn_RandomMod.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generaPass();
                compruebaCampos();
            }
        });

        btn_RandomMod.setBounds(459, 288, 112, 68);
        ImageIcon dados = new ImageIcon("src\\images\\dice.png");
        btn_RandomMod.setIcon(dados);
        pnl_Datos.add(btn_RandomMod);

        lbl_random_password = new JLabel("<html><center>Generar Contraseña Aleatoria<br>(Opcional)</html>",
                SwingConstants.CENTER);
        lbl_random_password.setFont(new Font("Arial Narrow", Font.BOLD, 15));
        lbl_random_password.setBounds(415, 359, 182, 50);
        pnl_Datos.add(lbl_random_password);

        separaModificar = new JSeparator();
        separaModificar.setBounds(10, 101, 587, 14);
        pnl_Datos.add(separaModificar);

        lblBusquedaCurp = new JLabel("Inserte CURP para modificar datos");
        lblBusquedaCurp.setFont(new Font("Arial Narrow", Font.BOLD, 16));
        lblBusquedaCurp.setBounds(10, 50, 217, 20);
        pnl_Datos.add(lblBusquedaCurp);

        txtCurpABuscar = new JTextField();
        txtCurpABuscar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                validacion();
            }

            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                    e.setKeyChar(Character.toUpperCase(c));
                }
                if (txtCurpABuscar.getText().length() >= 18) {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }

            }
        });

        lblBusquedaCurp.setLabelFor(txtCurpABuscar);
        txtCurpABuscar.setBounds(229, 52, 182, 20);
        pnl_Datos.add(txtCurpABuscar);
        txtCurpABuscar.setColumns(10);
        

        lblIconoEncontrado = new JLabel("***");
        lblIconoEncontrado.setBounds(425, 45, 35, 34);
        pnl_Datos.add(lblIconoEncontrado);

        lblEncontrado = new JLabel("New label");
        lblEncontrado.setFont(new Font("Arial", Font.BOLD, 17));
        lblEncontrado.setBounds(470, 51, 127, 19);
        pnl_Datos.add(lblEncontrado);

        JLabel lbl_Nombre = new JLabel("Nombre:");
        lbl_Nombre.setFont(new Font("Arial Narrow", Font.BOLD, 17));
        lbl_Nombre.setBounds(10, 187, 68, 20);
        pnl_Datos.add(lbl_Nombre);

        txtNombre = new JTextField();
        txtNombre.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                compruebaCampos();
            }
        });
        txtNombre.setFont(new Font("Arial", Font.PLAIN, 12));
        txtNombre.setBounds(83, 187, 164, 20);
        pnl_Datos.add(txtNombre);

        // *********************** SEGUNDO PANEL, "OPCIONES"
        // *****************************************************

        pnl_Opciones = new JPanel();
        pnl_Opciones.setAlignmentX(Component.LEFT_ALIGNMENT);
        pnl_Opciones.setBackground(new Color(32, 178, 170));
        pnl_Opciones.setBorder(new TitledBorder(null, "Opciones", TitledBorder.LEADING, TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 20), null));
        pnl_Opciones.setLayout(null);
        pnl_Opciones.setBounds(625, 55, 174, 583);
        add(pnl_Opciones);

        // ImageIcon iconoCheck = new
        // ImageIcon(getClass().getResource("src/images/checkGrande.png"));
        actualizar = new ImageIcon("src\\images\\checkGrande.png");
        actualizarGif = new ImageIcon("src\\images\\actualizar2.gif");
        btnActualizar = new JButton(actualizar);

        btnActualizar.setBounds(24, 59, 125, 74);
        btnActualizar.setEnabled(false);

        btnActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                modificar();
                txtCurpABuscar.setText("");
                deshabilitar();
                deshabilitaBorrar();

            }
        });

        pnl_Opciones.add(btnActualizar);

        // Actualiza datos

        Icon iconoBorrar = new ImageIcon("src\\images\\borrar.png");
        btnBorrar = new JButton(iconoBorrar);
        btnBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limpiarFormulario();
                deshabilitaBorrar();
                
            }
        });

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

        deshabilitar();
        
    }

    public void generaPass() {

        String randPass1 = UUID.randomUUID().toString().toUpperCase().substring(0, 6);
        String randPass2 = UUID.randomUUID().toString().toLowerCase().substring(0, 6);
        txtPassMod.setText(randPass1 + randPass2);

    }

    public boolean validacion() {

        boolean valido = false;

        String curpStatus = Metodos_SQL.buscaCurp(txtCurpABuscar.getText());

        // Si el textfield está vacio

        if (txtCurpABuscar.getText().isEmpty()) {

            limpiarSubFormulario();
            lblEncontrado.setText("");
            lblIconoEncontrado.setText("");
            lblIconoEncontrado.setIcon(null);
            btnActualizar.setEnabled(false);
            deshabilitar();

        }

        // Si el textfield no está vacío pero tiene menos de 18 caracs

        else if (curpStatus.equals("No existe curp") || (txtCurpABuscar.getText().length() < 18)) {

            // Etiqueta e ícono que indican si existe curp, texto indica que no existe,
            // etiqueta se pone verde
            limpiarSubFormulario();
            lblEncontrado.setText("<html><center><p>No Encontrado</html>");
            lblEncontrado.setBackground(Color.WHITE);
            lblIconoEncontrado.setIcon(rojo);
            btnActualizar.setEnabled(false);
            deshabilitar();

        }

        // Si el textfield ya tiene los 18 caracts y el curp se encontró

        else if (curpStatus.equals("Existe curp") && (txtCurpABuscar.getText().length() >= 18)) {
            lblEncontrado.setText("<html><center><p>Encontrado</html>");
            lblIconoEncontrado.setIcon(verde);
            // btnActualizar.setEnabled(true);

            Metodos_SQL.setRsValues(txtCurpABuscar.getText());

            String[] datosAModificar = Metodos_SQL.getValores();

            txtNombre.setText(datosAModificar[1]);
            txt_PaternoMod.setText(datosAModificar[2]);
            txt_MaternoMod.setText(datosAModificar[3]);
            txt_DomicilioMod.setText(datosAModificar[4]);
            comboNacimientoMod.setSelectedItem(datosAModificar[5]);
            combo_AreaTrabajoMod.setSelectedItem(datosAModificar[6]);
            txtPassMod.setText(datosAModificar[7]);
            habilitar();
            valido = true;
        }

        return valido;
    }

    public void limpiarFormulario() {
        txtCurpABuscar.setText("");
        limpiarSubFormulario();

    }

    public void limpiarSubFormulario() {
        txtPassMod.setText("");
        lblIconoEncontrado.setText("");
        lblIconoEncontrado.setIcon(null);
        lblEncontrado.setText(null);
        txtNombre.setText(null);
        txt_PaternoMod.setText("");
        txt_MaternoMod.setText("");
        txt_DomicilioMod.setText("");
        comboNacimientoMod.setSelectedIndex(0);
        combo_AreaTrabajoMod.setSelectedIndex(0);
        btnActualizar.setEnabled(false);
    }

    public void rellenarCombos() {

        combo_AreaTrabajoMod.addItem("Elegir Area");
        combo_AreaTrabajoMod.addItem("Recursos Humanos");
        combo_AreaTrabajoMod.addItem("Contabilidad");
        combo_AreaTrabajoMod.addItem("Sistemas");
        combo_AreaTrabajoMod.addItem("Operaciones");

        comboNacimientoMod.addItem("Elegir año Nacimiento");

        for (int i = (Calendar.getInstance().get(Calendar.YEAR) - 17); i >= (Calendar.getInstance().get(Calendar.YEAR)
                - 120); i--) {
            comboNacimientoMod.addItem(Integer.toString(i));
        }

    }

    public void modificar() {
        String ID = txtCurpABuscar.getText();
        String name = txtNombre.getText();
        String first = txt_PaternoMod.getText();
        String last = txt_MaternoMod.getText();
        String address = txt_DomicilioMod.getText();
        int year = Integer.parseInt((String) comboNacimientoMod.getSelectedItem());
        String area = (String) combo_AreaTrabajoMod.getSelectedItem();
        String pass = txtPassMod.getText();
        Metodos_SQL.modificar(ID, name, first, last, address, year, area, pass);
    }

    public void deshabilitar() {
        
        txtCurpABuscar.requestFocusInWindow();
        txtNombre.setEnabled(false);
        txtNombre.setBackground(Color.LIGHT_GRAY);
        txt_PaternoMod.setEnabled(false);
        txt_PaternoMod.setBackground(Color.LIGHT_GRAY);
        txt_MaternoMod.setEnabled(false);
        txt_MaternoMod.setBackground(Color.LIGHT_GRAY);
        txt_DomicilioMod.setEnabled(false);
        txt_DomicilioMod.setBackground(Color.LIGHT_GRAY);
        comboNacimientoMod.setEnabled(false);
        combo_AreaTrabajoMod.setEnabled(false);
        txtPassMod.setEnabled(false);
        txtPassMod.setBackground(Color.LIGHT_GRAY);
        btn_RandomMod.setEnabled(false);

        for (Component c : pnl_Opciones.getComponents()) {
            c.setEnabled(false);
        }

    }

    public void habilitar() {

        txtNombre.setEnabled(true);
        txtNombre.setBackground(Color.white);
        txt_PaternoMod.setEnabled(true);
        txt_PaternoMod.setBackground(Color.white);
        txt_MaternoMod.setEnabled(true);
        txt_MaternoMod.setBackground(Color.white);
        txt_DomicilioMod.setEnabled(true);
        txt_DomicilioMod.setBackground(Color.white);
        comboNacimientoMod.setEnabled(true);
        combo_AreaTrabajoMod.setEnabled(true);
        txtPassMod.setEnabled(true);
        txtPassMod.setBackground(Color.white);
        btn_RandomMod.setEnabled(true);

        for (Component c : pnl_Opciones.getComponents()) {
            c.setEnabled(true);

        }

    }

    public void compruebaCampos() {
        

        if (txtNombre.getText().isEmpty() || txt_PaternoMod.getText().isEmpty() || txt_MaternoMod.getText().isEmpty() || txt_DomicilioMod.getText().isEmpty() || txtPassMod.getText().isEmpty() || combo_AreaTrabajoMod.getSelectedItem().equals("Elegir Area")
                || comboNacimientoMod.getSelectedItem().equals("Elegir año Nacimiento")) {
            btnActualizar.setEnabled(false);
        } else {
            btnActualizar.setEnabled(true);
        }

        
    }
    
    public void deshabilitaBorrar() {
        if (txtNombre.getText().isEmpty() && txt_PaternoMod.getText().isEmpty() && txt_MaternoMod.getText().isEmpty() && txt_DomicilioMod.getText().isEmpty() && txtPassMod.getText().isEmpty() && combo_AreaTrabajoMod.getSelectedItem().equals("Elegir Area")
                && comboNacimientoMod.getSelectedItem().equals("Elegir año Nacimiento")) {
            btnBorrar.setEnabled(false);
            deshabilitar();
        }else {
            btnBorrar.setEnabled(true);
        }
    }
    
    public void posicionaCursor() {
        txtCurpABuscar.requestFocusInWindow();
    }

}












