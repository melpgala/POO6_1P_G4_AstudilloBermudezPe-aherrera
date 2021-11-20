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
    
    protected Usuario(String Usuarios,String Contrasenia);
    this.Usuarios=Usuarios;
    this.Contrasenia=Contrasenia;
    
    protected String getUsuarios();
        return Usuarios;
    
    protected String getContrasenia();
        return Contrasenia;
    
    protected String identificarUsusario(String Usuarios,String Contrasenia){
        ManejoArchivos usuarioC=new ManejoArchivos();
        Arraylist usuarioCl = usuarioC.LeeFichero(clientes.txt);

        for (i=0;i<usuarioCl.length;i++){
            String user =usuarioCl[i][3];
            String contra=usuarioCl[i][4];
            String tipoDU=ususarioCl[i][6];    
            if (Usuario.equals(User) and Contraseña.equals(contra)
                return tipoDU;
                break
    
         
        
            
                
        }
    }        
            
    
    
        
    
    
    
}
