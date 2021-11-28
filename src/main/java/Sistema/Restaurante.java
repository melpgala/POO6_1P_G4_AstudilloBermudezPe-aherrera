/*
 * Sistema contiene las clases del proyecto.
 */
package Sistema;
import java.util.ArrayList;
import manejoArchivos.ManejoArchivos;

/**
 * Esta clase contiene los métodos y atributos de un restaurante.
 * @author Dante Astudillo
 */
public class Restaurante {
    
    private ArrayList<Double> listadoPreciosPlatos;
    private ArrayList<String> listadoPlatosDisponibles;
    
    /**
    * Método que devuelve el listado de precios de los platos disponibles.
    * @return Devuelve un ArrayList <double> que indica el listado de precios de los platos disponibles.
    */
    public ArrayList<Double> getListadoPreciosPlatos(){
        return listadoPreciosPlatos;
    }
    
    /**
    * Método que devuelve un listado de platos dispibles.
    * @return Devuelve un ArrayList <String> que indica el listado de platos disponibles.
    */
    public ArrayList<String> getListadoPlatosDisponibles(){
        return listadoPlatosDisponibles;
    }
    
    /**
    *
    * Método constructor parametrizado de la clase Restaurante.
    * @param codigo Código del restaurante elegido por el cliente.
    * @author Dante Astudillo
    */
    
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
