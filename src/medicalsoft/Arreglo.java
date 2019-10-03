 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsoft;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;





public class Arreglo extends JFrame{

    
    
    public Arreglo() {
        
        setSize(400,400);
        String vec[]=new String[3];
        for (int i = 0; i < 3; i++) {
            vec[i]=JOptionPane.showInputDialog("Ingrese nombre en posicion "+i);
        }
        JLabel eti=new JLabel("Hola");
        eti.setText(vec[0]+", "+vec[1]+", "+vec[2]);
        add(eti);
        eti.setLayout(null);
        setVisible(true);
        
    }

    
    public static void main(String[] args)  {
      
//        Arreglo r=new Arreglo();
        Ventana t=new Ventana();
        
    }
    
    
    
    
    
    
}