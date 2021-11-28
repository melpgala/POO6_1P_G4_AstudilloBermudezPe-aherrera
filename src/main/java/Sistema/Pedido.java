/*
 * Sistema contiene las clases del proyecto.
 */
package Sistema;
import java.util.ArrayList;

/**
 * Esta clase contiene los métodos y atributos de un pedido.
 * @author Melanie Peñaherrera
 * @author Dante Astudillo
 */
public class Pedido {
    private String nombreRestaurante;
    private ArrayList  <Plato> platosElegidos  = new ArrayList();
    
    /**
    * Método que devuelve un ArrayList de platos.
    * @return Devuelve un Arraylist de Platos.
    */
    public ArrayList <Plato> getPlatosElegidos(){
        return platosElegidos;
    }
    
    /**
    * Método que devuelve los nombres de los platos del pedido.
    * @return Devuelve un String con el nombre de todos los platos elegidos por el usuario.
    */
    public String getNombresPedido(){
        String pedido="";
        for (Plato p: platosElegidos){  //String x="amburgueza"
            pedido+= p.getNombrePlato(); // Plato x =new Plato(String amburgueza)
        }
        return pedido;// hambru ,papas,   
    }
    
    /**
    * Método que agrega un plato al ArrayList de platos elegidos.
    * @param p Un plato del pedido.
    */
    protected void agregarPlatos(Plato p){
        platosElegidos.add(p);
    }
}
