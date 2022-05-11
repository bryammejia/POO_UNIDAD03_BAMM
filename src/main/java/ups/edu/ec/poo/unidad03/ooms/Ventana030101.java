/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.poo.unidad03.ooms;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class Ventana030101 extends JFrame {

    private final ArrayList<JPanel> jPanelList = new ArrayList<>();

    public Ventana030101(String title, int w, int h) {
        super(title);
        this.setSize(w, h);
        var p = new Point(600, 700);
        this.setLocation(p);
        this.iniciarComponentes();
        this.setContentPane(this.jPanelList.get(0));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public Ventana030101(int w, int h) {
        var dimension = new Dimension(w, h);
        this.setSize(dimension);
    }

    public void iniciarComponentes() {

        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setBackground(Color.WHITE);
        this.jPanelList.get(0).setBorder(BorderFactory.createTitledBorder("Panel 0"));
        this.jPanelList.get(1).setBackground(Color.BLACK);
        this.jPanelList.get(2).setBackground(Color.GREEN);
        this.jPanelList.get(3).setBackground(Color.RED);
        this.jPanelList.get(4).setBackground(Color.BLUE);
        this.jPanelList.get(5).setBackground(Color.PINK);
        this.jPanelList.get(6).setBackground(Color.CYAN);
        this.jPanelList.get(7).setBackground(Color.MAGENTA);
        this.jPanelList.get(8).setBackground(Color.YELLOW);
        this.jPanelList.get(9).setBackground(Color.DARK_GRAY);

        this.jPanelList.get(0).setLayout(new FlowLayout());
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(0).add(this.jPanelList.get(6));
        this.jPanelList.get(0).add(this.jPanelList.get(8));
        this.jPanelList.get(0).add(this.jPanelList.get(7));
        this.jPanelList.get(0).add(this.jPanelList.get(9));

    }

}
