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
public class Restaurante {
    
    private ArrayList<Double> listadoPreciosPlatos;
    private ArrayList<String> listadoPlatosDisponibles;
    
    public ArrayList<Double> getListadoPreciosPlatos(){
        return listadoPreciosPlatos;
    }
    public ArrayList<String> getListadoPlatosDisponibles(){
        return listadoPlatosDisponibles;
    }
    
    
    public Restaurante(String codigo){
        ArrayList<String> listaPlatos= ManejoArchivos.LeeFichero("menus.txt");
        for (int i=0;i<listaPlatos.size();i++){
            if (codigo.equals(listaPlatos.get(i).split(",")[0])){                
               listadoPlatosDisponibles.add(listaPlatos.get(i).split(",")[1]);
               listadoPreciosPlatos.add(Double.valueOf(listaPlatos.get(i).split(",")[2]));
            }
        }
    }
    
  
}
