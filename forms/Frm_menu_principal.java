// Este paquete es para la compu del gpo:
//package CRUD_1.forms;

// Este paquete es para la PC de casa
package forms;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Point;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalToggleButtonUI;

public class Frm_menu_principal extends JFrame {
    
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    // ************************************* BOTONES **************************************************
    JToggleButton btn_Alta = new JToggleButton("Alta Usuario", new ImageIcon("C:\\Users\\Dell3020\\Desktop\\PROGRAMACION\\Java\\EclipseProjects\\com.proyectoCRUD\\src\\images\\alta_usuarios.png"), false);
    JToggleButton btn_Modificar = new JToggleButton("Modificar Usuario");
    JToggleButton btn_Eliminar = new JToggleButton("Eliminar Usuario");
    JToggleButton btn_Buscar = new JToggleButton("Buscar Usuario");
    
    
    private JPanel contentPane;
    
    // **************************************************************************** 1.- No instanciar aquí, solamente declarar. Instanciar 
    // dentro del constructor, e inicializarlo con un CardLayout
    JPanel pnl_vista_principal;
    
    // ************************************************************************* 3.- Quitamos la declaración de CardLayout vista de aquí, la hacemos 
    // dentro del actionPerformed del btn_alta, y ahí le asignamos el Layout de pnl_vista_principal, haciendo el correspondiente casting a 
    // CardLayout
    
    Pnl_alta panel_alta_vista = new Pnl_alta();
    
        
    /*
     * *************************************** NUEVOS PANELES *************************************************************************************
     */
    
    // ****************** Panel Modificación ***************************************************
    
    Pnl_modificar_usr panel_modificar = new Pnl_modificar_usr();
    
    
    // ****************** Panel Eliminación *******************************************************
    
    Pnl_eliminar_usr panel_eliminar = new Pnl_eliminar_usr();
    
    // ****************** Panel Búsqueda **********************************************************
    
    Pnl_buscar_usr panel_buscar = new Pnl_buscar_usr();
    
    
    
    
    
    

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
        
        
        getContentPane().setLayout(new GridLayout());
       
        setTitle("____________________________________Sistema CRUD básico");
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell3020\\Desktop\\PROGRAMACION\\Java\\EclipseProjects\\com.proyectoCRUD\\src\\images\\home.png"));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1090, 721);

        setExtendedState(MAXIMIZED_VERT);
       
        
        contentPane = new JPanel();
        contentPane.setBackground(new Color(102, 153, 153));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        setVisible(true);
        
        JPanel panel_Menu = new JPanel();
        panel_Menu.setBounds(5, 18, 188, 650);
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
        
       // Cambia el color del botón a blanco cuando es presionado
        btn_Alta.setUI(new MetalToggleButtonUI() {
            protected Color getSelectColor() {
                return Color.WHITE;
            }
        });
        btn_Alta.setVerticalTextPosition(SwingConstants.TOP);
        btn_Alta.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        btn_Alta.setAlignmentX(Component.RIGHT_ALIGNMENT);
        btn_Alta.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_Alta.setVerticalAlignment(SwingConstants.TOP);
        
        btn_Alta.setFont(new Font("Lucida Console", Font.BOLD, 11));
        btn_Alta.setForeground(Color.BLACK);
        btn_Alta.setIcon(new ImageIcon("C:\\Users\\Dell3020\\Desktop\\PROGRAMACION\\Java\\EclipseProjects\\com.proyectoCRUD\\src\\images\\alta_usuarios.png"));
        btn_Alta.setBackground(UIManager.getColor("Button.background"));
        btn_Alta.setBounds(12, 76, 167, 74);
        panel_Menu.add(btn_Alta);
        
        
     // Cambia el color del botón a blanco cuando es presionado
        btn_Modificar.setUI(new MetalToggleButtonUI() {
            protected Color getSelectColor() {
                return Color.WHITE;
            }
        });
        btn_Modificar.setVerticalTextPosition(SwingConstants.TOP);
        btn_Modificar.setIcon(new ImageIcon("C:\\Users\\Dell3020\\Desktop\\PROGRAMACION\\Java\\EclipseProjects\\com.proyectoCRUD\\src\\images\\modificar_usuario.png"));
        btn_Modificar.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_Modificar.setVerticalAlignment(SwingConstants.TOP);
        btn_Modificar.setForeground(Color.BLACK);
        btn_Modificar.setFont(new Font("Lucida Console", Font.BOLD, 11));
        btn_Modificar.setBackground(UIManager.getColor("Button.background"));
        btn_Modificar.setBounds(11, 163, 167, 80);
        panel_Menu.add(btn_Modificar);
        
        
     // Cambia el color del botón a blanco cuando es presionado
        btn_Eliminar.setUI(new MetalToggleButtonUI() {
            protected Color getSelectColor() {
                return Color.WHITE;
            }
        });
        btn_Eliminar.setVerticalTextPosition(SwingConstants.TOP);
        btn_Eliminar.setIcon(new ImageIcon("C:\\Users\\Dell3020\\Desktop\\PROGRAMACION\\Java\\EclipseProjects\\com.proyectoCRUD\\src\\images\\baja_usuarios.png"));
        btn_Eliminar.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_Eliminar.setVerticalAlignment(SwingConstants.TOP);
        btn_Eliminar.setForeground(Color.BLACK);
        btn_Eliminar.setFont(new Font("Lucida Console", Font.BOLD, 11));
        btn_Eliminar.setBackground(UIManager.getColor("Button.background"));
        btn_Eliminar.setBounds(12, 257, 166, 74);
        panel_Menu.add(btn_Eliminar);
        
     // Cambia el color del botón a blanco cuando es presionado
        btn_Buscar.setUI(new MetalToggleButtonUI() {
            protected Color getSelectColor() {
                return Color.WHITE;
            }
        });
        btn_Buscar.setVerticalTextPosition(SwingConstants.TOP);
        btn_Buscar.setIcon(new ImageIcon("C:\\Users\\Dell3020\\Desktop\\PROGRAMACION\\Java\\EclipseProjects\\com.proyectoCRUD\\src\\images\\busqueda_usuario.png"));
        btn_Buscar.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_Buscar.setVerticalAlignment(SwingConstants.TOP);
        btn_Buscar.setForeground(Color.BLACK);
        btn_Buscar.setFont(new Font("Lucida Console", Font.BOLD, 11));
        btn_Buscar.setBackground(UIManager.getColor("Button.background"));
        btn_Buscar.setBounds(12, 342, 166, 74);
        panel_Menu.add(btn_Buscar);
        
        JButton btn_Salir = new JButton("Salir");
        btn_Salir.setIcon(new ImageIcon("C:\\Users\\Dell3020\\Desktop\\PROGRAMACION\\Java\\EclipseProjects\\com.proyectoCRUD\\src\\images\\busqueda_usuario.png"));
        btn_Salir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btn_Salir.setFont(new Font("Lucida Console", Font.BOLD, 12));
        btn_Salir.setVerticalTextPosition(SwingConstants.TOP);
        btn_Salir.setVerticalAlignment(SwingConstants.TOP);
        btn_Salir.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_Salir.setBounds(49, 523, 89, 80);
        panel_Menu.add(btn_Salir);
        
        
        // *********************************************** 2.- Aquí instanciamos pnl_vista_principal y le pasamos un Layout tipo CardLayout
        pnl_vista_principal =  new JPanel(new CardLayout(10, 10));
        pnl_vista_principal.setSize(832, 665);
        pnl_vista_principal.setLocation(new Point(203, 11));
        pnl_vista_principal.setBackground(new Color(102, 153, 153));
        contentPane.add(pnl_vista_principal);
        
        /*
         * Cargamos el panel para dar de alta a los empleados
         */
           
        btn_Alta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                
                    try {
                       
            //  *********************************************** 4.- Declaramos la variable tipo CardLayout "vista", le asignamos el Layout de
            //  pnl_vista_principal, previo casting a CardLayout
                        
                        if(btn_Alta.isSelected()) {
                           CardLayout vista = (CardLayout) pnl_vista_principal.getLayout();
        
                           pnl_vista_principal.add(panel_alta_vista, "alta");
                           vista.show(pnl_vista_principal, "alta");
                           SwingUtilities.updateComponentTreeUI(pnl_vista_principal);
                           repaint();
                           
                           btn_Eliminar.setSelected(false);
                           
                           btn_Buscar.setSelected(false);
                           
                           btn_Modificar.setSelected(false);
                           
                           
                           btn_Buscar.setSelected(false);
                           
                           
                           // REINICIA TODOS LOS CAMPOS QUE HAYAN TENIDO INFORMACIÓN PREVIAMENTE CADA VEZ QUE ABRIMOS ESTE LAYOUT:
                           panel_alta_vista.limpiar();
                           
                           
                        } else {
                            pnl_vista_principal.removeAll();
                            SwingUtilities.updateComponentTreeUI(pnl_vista_principal);
                            repaint();
                            
                        }
                     
                   }catch(Exception ex) {
                       System.out.println(ex.getStackTrace());
                       
                   }
            }
        });
        
           
        
        /*
         * Cargamos panel modificar
         */
        btn_Modificar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                try {
                    if(btn_Modificar.isSelected()) {
                       CardLayout vista = (CardLayout) pnl_vista_principal.getLayout();
                       pnl_vista_principal.add(panel_modificar, "modificar");
                       panel_modificar.limpiarFormulario();
                       vista.show(pnl_vista_principal, "modificar");
                       SwingUtilities.updateComponentTreeUI(pnl_vista_principal);
                       repaint();
                       
                       panel_modificar.posicionaCursor();
                       btn_Alta.setSelected(false);
                       
                       btn_Buscar.setSelected(false);
                       
                       btn_Eliminar.setSelected(false);
                       
                       
                       
                       
                    }else {
                        pnl_vista_principal.removeAll();
                        SwingUtilities.updateComponentTreeUI(pnl_vista_principal);
                        repaint();
                    }
                                                                 
                   }catch(Exception ex) {
                               System.out.println(ex.getStackTrace());
                   }
                }
                
            
          });
        
        
        /*
         * Cargamos panel eliminar
         */
        btn_Eliminar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                try {
                    
                   if(btn_Eliminar.isSelected()) {
                       CardLayout vista = (CardLayout) pnl_vista_principal.getLayout();
                       pnl_vista_principal.add(panel_eliminar, "eliminar");
                       vista.show(pnl_vista_principal, "eliminar");
                       SwingUtilities.updateComponentTreeUI(pnl_vista_principal);
                       repaint();
                       
                       // hacer que cuando presionemos este botón, los demás se levanten
                       
                       btn_Alta.setSelected(false);
                       btn_Buscar.setSelected(false);
                       btn_Modificar.setSelected(false);
                     
                       
                       
                       
                   
                   }else {
                       pnl_vista_principal.removeAll();
                       SwingUtilities.updateComponentTreeUI(pnl_vista_principal);
                       repaint();
                   }
                                                                 
                   }catch(Exception ex) {
                               System.out.println(ex.getStackTrace());
                   }
                }
                
            
          });
        
        
        
        /*
         * Cargamos panel buscar
         */
        btn_Buscar.addActionListener(new ActionListener() {
            
            
            @Override
            public void actionPerformed(ActionEvent e) { 
                try {
                                      
                   if(btn_Buscar.isSelected()) {
                       CardLayout vista = (CardLayout) pnl_vista_principal.getLayout();
                       pnl_vista_principal.add(panel_buscar, "buscar");
                       vista.show(pnl_vista_principal, "buscar");
                       SwingUtilities.updateComponentTreeUI(pnl_vista_principal);
                       repaint();
                       
                       btn_Alta.setSelected(false);
                      
                       btn_Eliminar.setSelected(false);
                       
                       btn_Modificar.setSelected(false);
                       
                       
                       
                   }else {
                       pnl_vista_principal.removeAll();
                       SwingUtilities.updateComponentTreeUI(pnl_vista_principal);
                       repaint();
                   }
                   
               }catch(Exception ex) {
                           System.out.println(ex.getStackTrace());
               }
            }
                
            
          });
        
        
    }

    
}

















