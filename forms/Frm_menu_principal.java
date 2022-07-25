package CRUD_1.forms;

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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 695, 501);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(102, 153, 153));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(11, 9, 175, 446);
        
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Men\u00FA del sistema");
        lblNewLabel.setBounds(14, 10, 147, 14);
        lblNewLabel.setFont(new Font("Lucida Console", Font.BOLD, 14));
        panel.add(lblNewLabel);
        
        JToggleButton tglbtnNewToggleButton = new JToggleButton("Alta Usuario");
        
        tglbtnNewToggleButton.setFont(new Font("Lucida Console", Font.BOLD, 11));
        tglbtnNewToggleButton.setForeground(new Color(102, 153, 51));
        tglbtnNewToggleButton.setIcon(new ImageIcon("C:\\Users\\BV Atizap\u00E1n\\OneDrive\\Escritorio\\Prgr\\Java\\Eclipse\\com.company.CRUD_1\\src\\CRUD_1\\images\\alta_usuarios.png"));
        tglbtnNewToggleButton.setBackground(new Color(204, 204, 255));
        tglbtnNewToggleButton.setBounds(10, 52, 151, 48);
        panel.add(tglbtnNewToggleButton);
        
        JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("Alta Usuario");
        tglbtnNewToggleButton_1.setForeground(new Color(153, 153, 0));
        tglbtnNewToggleButton_1.setFont(new Font("Lucida Console", Font.BOLD, 11));
        tglbtnNewToggleButton_1.setBackground(new Color(204, 204, 255));
        tglbtnNewToggleButton_1.setBounds(14, 110, 147, 48);
        panel.add(tglbtnNewToggleButton_1);
        
        JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("Alta Usuario");
        tglbtnNewToggleButton_2.setForeground(new Color(153, 153, 0));
        tglbtnNewToggleButton_2.setFont(new Font("Lucida Console", Font.BOLD, 11));
        tglbtnNewToggleButton_2.setBackground(new Color(204, 204, 255));
        tglbtnNewToggleButton_2.setBounds(14, 168, 147, 48);
        panel.add(tglbtnNewToggleButton_2);
        
        JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("Alta Usuario");
        tglbtnNewToggleButton_3.setForeground(new Color(153, 153, 0));
        tglbtnNewToggleButton_3.setFont(new Font("Lucida Console", Font.BOLD, 11));
        tglbtnNewToggleButton_3.setBackground(new Color(204, 204, 255));
        tglbtnNewToggleButton_3.setBounds(14, 226, 147, 48);
        panel.add(tglbtnNewToggleButton_3);
        
        JToggleButton tglbtnNewToggleButton_3_1 = new JToggleButton("Alta Usuario");
        tglbtnNewToggleButton_3_1.setForeground(new Color(153, 153, 0));
        tglbtnNewToggleButton_3_1.setFont(new Font("Lucida Console", Font.BOLD, 11));
        tglbtnNewToggleButton_3_1.setBackground(new Color(204, 204, 255));
        tglbtnNewToggleButton_3_1.setBounds(14, 284, 147, 48);
        panel.add(tglbtnNewToggleButton_3_1);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(102, 153, 153));
        panel_1.setBounds(196, 9, 476, 445);
        contentPane.add(panel_1);
    }
}
