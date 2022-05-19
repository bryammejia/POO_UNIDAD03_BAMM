/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class Ventana030102 extends JFrame {

    private JPanel jPanel1;
    private List<JLabel> jLabelList;

    public Ventana030102(String title) {
        super(title);
        this.setSize(800, 600);
        this.setLocation(50, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }

    public void iniciarComponentes() {
        this.iniciarPanel();
        this.iniciarEtiquetas();
    }

    public void iniciarPanel() {
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.YELLOW);
        this.jPanel1.setBorder(BorderFactory.createTitledBorder("PANEL PRINCIPAL"));
        this.setLayout(new FlowLayout());
    }

    public void iniciarEtiquetas() {
        this.jLabelList = new ArrayList<>();
        
        this.jLabelList.add(new JLabel());
        this.jLabelList.get(0).setBackground(Color.ORANGE);
        this.jLabelList.get(0).setOpaque(true);
        this.jLabelList.get(0).setText("Electronica y automotizacion");
        this.jPanel1.add(this.jLabelList.get(0));
        var imagen1 = new ImageIcon("C:\\Users\\USER\\Pictures\\electronica_02.jpg");
        Icon imagenR = new ImageIcon(imagen1.getImage().getScaledInstance(80, 80, 80));
        this.jLabelList.get(0).setIcon(imagenR);
        
        this.jLabelList.add(new JLabel());
        this.jLabelList.get(1).setBackground(Color.BLUE);
        this.jLabelList.get(1).setOpaque(true);
        this.jLabelList.get(1).setText("COMPUTACION");
        this.jPanel1.add(this.jLabelList.get(1));
        var imagen2 = new ImageIcon("C:\\Users\\USER\\Pictures\\Libros-de-Computacion.jpg");
        Icon imagenR2 = new ImageIcon(imagen2.getImage().getScaledInstance(80, 80, 100));
        this.jLabelList.get(1).setIcon(imagenR2);
        
        this.jLabelList.add(new JLabel());
        this.jLabelList.get(2).setBackground(Color.CYAN);
        this.jLabelList.get(2).setOpaque(true);
        this.jLabelList.get(2).setText("Telecomunicaciones");
        this.jPanel1.add(this.jLabelList.get(2));
        var imagen3 = new ImageIcon("C:\\Users\\USER\\Pictures\\tecnologia de telecomunicaciones.jpg");
        Icon imagenR3 = new ImageIcon(imagen3.getImage().getScaledInstance(80, 80, 100));
        this.jLabelList.get(2).setIcon(imagenR3);
    }
}
