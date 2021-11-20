/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

/**
 *
 * @author User
 */
public class Usuario {
    protected String Usuarios;
    protected String Contrasenia;
    
    protected Usuario(){
    
        ManejoArchivos usuarioC=new ManejoArchivos();
        Arraylist usuarioCl = usuarioC.LeeFichero(Usuario.txt);

        for (i=0;i<usuarioCl.length;i++){
            this.Usuarios =usuarioCl[i].split(",")[3];
            this.Contraseña contra=usuarioCl[i].split(",")[4];
        }
    }
    protected String getUsuarios(){
        return Usuarios;
    }
    
    protected String getContrasenia(){
        return Contraseña;
    }
    protected String identificarUsusario(String Usuarios,String Contrasenia){
        ManejoArchivos usuarioC=new ManejoArchivos();
        Arraylist<String> usuarioCl = usuarioC.LeeFichero(Usuario.txt);

        for (int i=0;i<usuarioCl.length;i++){
            String user =usuarioCl[i].split(",")[3];
            String contra=usuarioCl[i].split(",")[4];
            String tipoDU=ususarioCl[i].split(",")[6];    
            if (Usuario.equals(User) && Contrasenia.equals(contra)){
                
                return tipoDU;
                break
            }
    
         
        
            
                
        }
           
            
    
    
        
    
    
    
}
