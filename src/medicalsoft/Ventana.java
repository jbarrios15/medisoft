/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsoft;

import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Ventana extends JFrame {
    
    public String vec[]=new String[2];
    public String name;

    Container cp = getContentPane();   



    public Ventana() throws HeadlessException {

        super("Ventana 1");        
        
        this.init();

    }
    
    public void init(){
        this.configInit();
          
        this.PedirArray();
        //this.addlabels("Nombre");
        //vec[0]="jose";
        //vec[1]="katya";
        //this.addlabels("Hola");
        //this.addlabels(vec[0]);
        this.addletrero(CENTER);
        this.MostrarArray();
        this.setVisible(true);
        
        this.agregarbotones();
    }
    public void MostrarArray(){
        for (int i = 0; i < 2; i++) {
             this.addlabels(vec[i]+", ");
        }
    }
    public void configInit(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cp.setLayout(new FlowLayout());
        
        
        
    }
    
    
    public void addletrero(String letrero){
        JLabel labelNombre = new JLabel(letrero);
        
        cp.add(labelNombre);
        labelNombre.setText("Nombres: ");
    }
    
    public void addlabels(String textLabel){

        JLabel labelNombre = new JLabel(textLabel);
        cp.setLocation(200,200);
        cp.add(labelNombre);
        labelNombre.setLayout(null);

    }
    
    public void agregarbotones(){
       JButton salir = new JButton("salir");
       cp.add("North", salir);
		
    }
    
    
    
    public void PedirArray(){
    for (int i = 0; i < 2; i++) {
            vec[i]=JOptionPane.showInputDialog("Ingrese Nombre de paciente "+i);
        }
    
    
}
}
