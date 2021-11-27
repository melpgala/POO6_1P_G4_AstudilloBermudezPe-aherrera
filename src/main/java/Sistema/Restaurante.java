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
    
    
    ArrayList listadoPlatosDisponibles= new ArrayList();
    
    private int listadeplatos(int codigo){
        ArrayList<String> listaplatos= ManejoArchivos.LeerInformacion("menus.txt");
        int enumerar=0;
        for (int i=0;i<listaPlatos.size();i++){
            if (codigo.equals(listaPlatos.get(i).split(",")[0])){                
                System.out.println(enumerar +".- "+ listaPlatos.get(i).split(",")[1]);
                enumerar++
            }
            
        
        }
    
    }
    
    
}
