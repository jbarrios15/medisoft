/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsoft;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author estudiante
 */
public class Validacion extends Persona {

    public Validacion(String nom, String ape, String fech,String tel) {
        super(nom, ape, fech, tel);
    }
   
    
    
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
        Pattern p=Pattern.compile("[3]");
 
        // Buscamos las coincidencias el el primer caracter del numero de telefono
        Matcher matcher=p.matcher(telefono.substring(0,1));
 
        if(matcher.matches())
        {
            System.out.println("El telefono empieza por 3");
        }else{
            System.out.println("El telefono NO empieza por 3");
        }
        return true;
    }
    public boolean ValidarFijo(){
        return true;
    }
}
