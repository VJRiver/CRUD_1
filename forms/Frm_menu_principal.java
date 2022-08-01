// Este paquete es para la compu del gpo
//package CRUD_1.forms;

// Este paquete es para la PC de casa
package forms;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JToggleButton;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import java.awt.Toolkit;

public class Frm_menu_principal extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Frm_menu_principal frame = new Frm_menu_principal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Frm_menu_principal() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell3020\\Desktop\\PROGRAMACION\\Java\\EclipseProjects\\com.proyectoCRUD\\src\\images\\home.png"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 695, 501);
        setExtendedState(MAXIMIZED_BOTH);   
        
        contentPane = new JPanel();
        contentPane.setBackground(new Color(102, 153, 153));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        
        JPanel panel_Menu = new JPanel();
        panel_Menu.setBounds(12, 11, 190, 440);
        panel_Menu.setBorder(new LineBorder(new Color(0, 0, 0), 5));
        panel_Menu.setBackground(new Color(255, 255, 255));
        
        
        contentPane.add(panel_Menu);
        
        panel_Menu.setLayout(null);
        
        JLabel lbl_Titulo = new JLabel("Men\u00FA del sistema");
        lbl_Titulo.setHorizontalTextPosition(SwingConstants.CENTER);
        lbl_Titulo.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_Titulo.setBounds(13, 21, 165, 14);
        lbl_Titulo.setFont(new Font("Lucida Console", Font.BOLD, 15));
        panel_Menu.add(lbl_Titulo);
        
        JToggleButton btn_Alta = new JToggleButton("Alta Usuario");
        btn_Alta.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_Alta.setVerticalAlignment(SwingConstants.TOP);
        
        btn_Alta.setFont(new Font("Lucida Console", Font.BOLD, 11));
        btn_Alta.setForeground(Color.BLACK);
        btn_Alta.setIcon(new ImageIcon("C:\\Users\\BV Atizap\u00E1n\\OneDrive\\Escritorio\\Prgr\\Java\\Eclipse\\com.company.CRUD_1\\src\\CRUD_1\\images\\alta_usuarios.png"));
        btn_Alta.setBackground(new Color(204, 204, 255));
        btn_Alta.setBounds(13, 63, 167, 63);
        panel_Menu.add(btn_Alta);
        
        JToggleButton btn_Modificar = new JToggleButton("Modificar Usuario");
        btn_Modificar.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_Modificar.setVerticalAlignment(SwingConstants.TOP);
        btn_Modificar.setForeground(Color.BLACK);
        btn_Modificar.setFont(new Font("Lucida Console", Font.BOLD, 11));
        btn_Modificar.setBackground(new Color(204, 204, 255));
        btn_Modificar.setBounds(14, 141, 167, 64);
        panel_Menu.add(btn_Modificar);
        
        JToggleButton btn_Eliminar = new JToggleButton("Eliminar Usuario");
        btn_Eliminar.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_Eliminar.setVerticalAlignment(SwingConstants.TOP);
        btn_Eliminar.setForeground(Color.BLACK);
        btn_Eliminar.setFont(new Font("Lucida Console", Font.BOLD, 11));
        btn_Eliminar.setBackground(new Color(204, 204, 255));
        btn_Eliminar.setBounds(13, 219, 166, 62);
        panel_Menu.add(btn_Eliminar);
        
        JToggleButton btn_Buscar = new JToggleButton("Buscar Usuario");
        btn_Buscar.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_Buscar.setVerticalAlignment(SwingConstants.TOP);
        btn_Buscar.setForeground(Color.BLACK);
        btn_Buscar.setFont(new Font("Lucida Console", Font.BOLD, 11));
        btn_Buscar.setBackground(new Color(204, 204, 255));
        btn_Buscar.setBounds(13, 294, 166, 60);
        panel_Menu.add(btn_Buscar);
        
        JButton btn_Salir = new JButton("Salir");
        btn_Salir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btn_Salir.setFont(new Font("Lucida Console", Font.BOLD, 12));
        btn_Salir.setVerticalTextPosition(SwingConstants.TOP);
        btn_Salir.setVerticalAlignment(SwingConstants.TOP);
        btn_Salir.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_Salir.setBounds(53, 366, 89, 63);
        panel_Menu.add(btn_Salir);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(206, 12, 461, 438);
        panel_1.setBackground(new Color(102, 153, 153));
        contentPane.add(panel_1);
    }
}
