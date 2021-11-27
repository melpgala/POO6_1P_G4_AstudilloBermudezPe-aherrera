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
    ArrayList  <Plato> platosElegidos  = new ArrayList();// {}
    
    public ArrayList <Plato> getPlatosElegidos(){
        return platosElegidos;
    }
    
    public String getNombresPedido(){
        
        String pedido="";
        for (Plato p: platosElegidos){  //String x="amburgueza"
            pedido+= p.getNombrePlato(); // Plato x =new Plato(String amburgueza)
        }
        return pedido;// hambru ,papas, 
        
    }
    
    protected void agregarPlatos(Plato p){
        platosElegidos.add(p);
    }
}
