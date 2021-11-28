/*
 * Sistema contiene las clases del proyecto.
 */
package Sistema;
import java.util.ArrayList;
import manejoArchivos.ManejoArchivos;

/**
 * Esta clase es abstracta y contiene los métodos y atributos de un usuario.
 * @author melpgala
 * @author AstudilloDante
 */
public abstract class Usuario {
    /**
     * Atributo Usuario de la clase abstracta Usuario
     */
    protected String Usuario;
    /**
     * Atributo Contrasenia de la clase abstracta Usuario
     */
    protected String Contrasenia;
    
    /**
    * Método que devuelve el usuario.
    * @return Devuelve un String que indica el usuario.
    */
    protected String getUsuarios(){
        return Usuario;
    }
   
 
    /**
    * Método que identifica que tipo de usuario es.
    * @param Usuarios Nombre de usuario 
    * @param Contrasenia Contraseña del usuario
    * @return Devuelve el tipo de usuario; "C" cliente y "R" conductor.
    */
    protected String identificarUsuario(String Usuarios,String Contrasenia){
        ArrayList <String> usuarioCl = ManejoArchivos.LeeFichero("usuarios.txt");
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
    
    /**
    * Método abstracto para consultar un servicio.
    */
    protected abstract void consultarServicio();

}
