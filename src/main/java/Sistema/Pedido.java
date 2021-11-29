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
    private String CodigoDeRestaurante;
    
    /**
    * Método que devuelve el nombre del restaurante al que se hizo el pedido.
    * @return Devuelve un String que indica el nombre del restaurante al que se hizo el pedido.
    */
    public String getNombreRestaurante(){
        return nombreRestaurante;
    }
    
    /**
    * Método que cambia el nombre del restaurante al que se hizo el pedido.
    * @param nombreRestaurante Nombre del restaurante al que se hizo el pedido.
    */
    public void setNombreRestaurante(String nombreRestaurante){
        this.nombreRestaurante = nombreRestaurante;
    }
    
    /**
    * Método que cambia el codigo del restaurante al que se hizo el pedido.
    * @param Codigorestaurante Codigo del restaurante al que se hizo el pedido.
    */
    public void  setCodigoDeRestaurant(String Codigorestaurante){
        this.CodigoDeRestaurante = Codigorestaurante;
    }
    
    /**
    * Método que devuelve el código del restaurante al que se hizo el pedido.
    * @return Devuelve un String que indica el codigo del restaurante al que se hizo el pedido.
    */
    public String getCodigoDeRestaurant(){
        return CodigoDeRestaurante;
    }
    
    /**
    * Método que devuelve los nombres de los platos del pedido.
    * @return Devuelve un String con el nombre de todos los platos elegidos por el usuario.
    */
    public String getNombresPedido(){
        String pedido="";
        for (Plato p: platosElegidos){  //String x="amburgueza"
            pedido+= "--"+p.getNombrePlato(); // Plato x =new Plato(String amburgueza)
        }
        return pedido;// hambru ,papas,   
    }
    
    /**
    * Método que devuelve el precio de los platos del pedido.
    * @return Devuelve un String que indica el precio de los platos del pedido.
    */
    public double getPrecioPlato(){
        double precioplato=0.0;
        for (Plato p: platosElegidos){  //
            precioplato+= p.getPrecioPlato();
        }
        return precioplato;
    }
    
    /**
    * Método que agrega un plato al ArrayList de platos elegidos.
    * @param p Un plato del pedido.
    */
    protected void agregarPlatos(Plato p){
        platosElegidos.add(p);
    }
    
    
}
