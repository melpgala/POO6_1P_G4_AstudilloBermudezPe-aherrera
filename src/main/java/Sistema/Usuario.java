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
 * @author melpgala
 * @author AstudilloDante
 */
public abstract class Usuario {
    protected String Usuario;
    protected String Contrasenia;
    
   
    

//        ArrayList <String> usuarioCl = ManejoArchivos.LeeFichero("Usuario.txt");
//
//        for (int i=0;i<usuarioCl.size();i++){
//            this.Usuarios =usuarioCl.get(i).split(",")[3];
//            this.Contrasenia =usuarioCl.get(i).split(",")[4];
//        }
    
    protected String getUsuarios(){
        return Usuario;
    }
    
    protected String getContrasenia(){
        return Contrasenia;
    }
    /**
    *@return {String} tipoDU1, returno el tipo de usuario "C" cliente y "R" conductor
    *@param{String} Usuarios, el nickname del usuario 
    *@param{String} Contrasenia, contraseña del usuario
    *
    */
    
    protected String identificarUsuario(String Usuarios,String Contrasenia){
 
        ArrayList <String> usuarioCl = ManejoArchivos.LeeFichero("Usuario.txt");
        
        String tipoDU1="";
        for (int i=0;i<usuarioCl.size();i++){
            String user =usuarioCl.get(i).split(",")[3];
            String contra=usuarioCl.get(i).split(",")[4];
            String tipoDU=usuarioCl.get(i).split(",")[6];    
            if (Usuarios.equals(user) && Contrasenia.equals(contra)){
                
                tipoDU1=tipoDU;
                
            }
        }
        return tipoDU1;
    }
    protected abstract void consultarServicio();

}
