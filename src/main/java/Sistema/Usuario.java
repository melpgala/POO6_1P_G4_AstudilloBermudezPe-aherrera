/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;
import java.util.ArrayList;
import manejoArchivos.ManejoArchivos;

/**
 *
 * @author User
 */
public class Usuario {
    protected String Usuarios;
    protected String Contrasenia;
    
    protected Usuario(){
    
        
        ArrayList<String> usuarioCl = ManejoArchivos.LeeFichero("Usuario.txt");

        for (int i=0;i<usuarioCl.length;i++){
            this.Usuarios =usuarioCl.get(i).split(",")[3];
            this.Contraseña contra=usuarioCl.get(i).split(",")[4];
        }
    }
    protected String getUsuarios(){
        return Usuarios;
    }
    
    protected String getContrasenia(){
        return Contraseña;
    }
    protected String identificarUsusario(String Usuarios,String Contrasenia){
        
        ArrayList<String> usuarioCl = ManejoArchivos.LeeFichero(Usuario.txt);
        String tipoDU1="";
        for (int i=0;i<usuarioCl.length;i++){
            String user =usuarioCl.get(i).split(",")[3];
            String contra=usuarioCl.get(i).split(",")[4];
            String tipoDU=ususarioCl.get(i).split(",")[6];    
            if (Usuarios.equals(user) && Contrasenia.equals(contra)){
                
                tipoDU1= tipoDU;
                
            }
    
         
        
            
                
        }
        return tipoDU1;
            
    
    
        
    
    
    
}
