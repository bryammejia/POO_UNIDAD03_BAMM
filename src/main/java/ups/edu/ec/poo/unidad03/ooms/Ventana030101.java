/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.poo.unidad03.ooms;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class Ventana030101 extends JFrame {

    public Ventana030101(String title, int w, int h) {
        super(title);
        this.setSize(w, h);

    }
    
    public Ventana030101(int w, int h){
        var dimension = new Dimension(w,h);
        this.setSize(dimension);
        
    }
}
