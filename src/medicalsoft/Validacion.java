/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsoft;

/**
 *
 * @author estudiante
 */
public class Validacion {
   
    
    
    public boolean ValidarrEmail(String email){
        String correo = email;
        int longitud = correo.length();
        for(char i = 0; i < longitud; i++)
    {
    char valor;
    
        valor = email.charAt(i);
        if(valor == '@' && i == 0){
        System.out.println("El correo esta mal");
        break;
        }
    	if(valor == '@')
    	{
    	System.out.println("Escribistes perfectamente el correo");
    	break;
    	}
    	else if(i == longitud-1){
    	 System.out.println("El correo esta mal");	
    	 break;
    		
    	}
    }
        return true;
    }
    public boolean ValidarCelular(){
        
        return true;
    }
    public boolean ValidarFijo(){
        return true;
    }
}
