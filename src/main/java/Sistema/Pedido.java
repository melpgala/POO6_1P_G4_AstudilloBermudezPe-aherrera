/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;
import java.util.ArrayList;

/**
 *
 * @author mgpala
 * @Astudillo Dante
 */
public class Pedido {
    ArrayList  <Plato> platosElegidos  = new ArrayList();// {}
     
    public ArrayList <Plato> getPlatosElegidos(){
        return platosElegidos;
    }
    /**
    *@return {String} pedido, devuelve un String del nombre de todos los platos escojidos por el usuario
    *
    */
    public String getNombresPedido(){
        
        String pedido="";
        for (Plato p: platosElegidos){  //String x="amburgueza"
            pedido+= p.getNombrePlato(); // Plato x =new Plato(String amburgueza)
        }
        return pedido;// hambru ,papas, 
        
    }
     /**
    *param {plato} p, agregar los objetos Plato en el arraylist<plato> platosElegidos
    *
    */
    
    protected void agregarPlatos(Plato p){
        platosElegidos.add(p);
    }
}
