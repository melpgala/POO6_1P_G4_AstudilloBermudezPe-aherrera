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
public class Pedido {
    ArrayList  <Platos> platosComprados  = new ArrayList();
    
    protected ArrayList <Platos> getPlatosComprados(){
        return platosComprados;
    }
    
    protected void agregarPlatos(){
        
        // metodo switch para elegir un plato del menu que se muestra
        System.out.println("Ingrese Plato:");   
    }
}
