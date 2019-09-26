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
public class MedicalSoft extends Validacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Medico PrimerMedico=new Medico("Jose","Barrios");
        //PrimerMedico.nombres="Jose";
       // System.out.println(PrimerMedico.getNombres());
        //System.out.println(PrimerMedico.apellidos);
        
        Medico medico1=new Medico("Jose","Barrios","15-11-2000","300");
        medico1.setNombres("Jose");
        medico1.setApellidos("Barrios");
        medico1.setFecha_nacimiento("15/11/2000");
        medico1.setEmail("jbarrios@gmail.com");
        
        System.out.println("Tu edad es: "+medico1.GetEdad()+" años \n"
                + "El medico es: "+medico1.getFullname());
        
        Validacion f=new Validacion("Jose","Barrios","15-11-2000","300");
        medico1.setTelefono("3000");
        medico1.setCelular("4000");
        f.ValidarCelular();
        f.ValidarTelefono();
        Arreglo r=new Arreglo();
    }

    public MedicalSoft(String nom, String ape, String fech, String tel) {
        super(nom, ape, fech, tel);
    }
    
    
    
        
    
}
