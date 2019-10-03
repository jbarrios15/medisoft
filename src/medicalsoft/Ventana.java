/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsoft;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Ventana extends JFrame {
    
    public String vec[]=new String[3];
    public String name;

    Container cp = getContentPane();   



    public Ventana() throws HeadlessException {

        super("Ventana 1");        
        
        this.init();

    }
    
    public void init(){
         this.configInit();
        this.setVisible(true);  
        this.PedirArray();
        this.addlabels();
    }
    
    
    public void configInit(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cp.setLayout(new FlowLayout());
    }
    
    
    
    
    public void addlabels(){

        JLabel labelNombre = new JLabel(vec[0]);
        cp.add(labelNombre);
        JLabel labelNombre1 = new JLabel(vec[1]);
        cp.add(labelNombre1); 
        JLabel labelNombre2 = new JLabel(vec[2]);
        cp.add(labelNombre2); 

    }
    
    
    public void PedirArray(){
    for (int i = 0; i < 3; i++) {
            vec[i]=JOptionPane.showInputDialog("Ingrese nombre en posicion "+i);
        }
}
}
