/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Restaurante {
    
    
    ArrayList<String> listadoPlatosDisponibles= new ArrayList();
    public Restaurante(int codigo){
        
        for (int i=0;i<listaPlatos.size();i++){
            if (codigo.equals(listaPlatos.get(i).split(",")[0])){                
               listadoPlatosDisponibles.add(listaPlatos.get(i).split(",")[1])
                
            }
            
        
        }
    
    }
    
    private int listadeplatos(int codigo){
        ArrayList<String> listaplatos= ManejoArchivos.LeerInformacion("menus.txt");
        
        
    
    }
    
    
}
