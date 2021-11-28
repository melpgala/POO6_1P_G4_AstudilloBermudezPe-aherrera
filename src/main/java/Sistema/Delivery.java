/*
 * Sistema contiene las clases del proyecto.
 */
package Sistema;

import Enums.tipoServicio;
import java.time.LocalDateTime;


/**
 * Delivery contiene los métodos y atributos de un delivery de comida.
 * @author Alex Bermudez
 * @author Melanie Peñaherrera
 */
public class Delivery extends Servicio {
    Pedido pedido;
    
    /**
    * Método constructor parametrizado de Delivery.
    * @author Alex Bermudez
    */
    public Delivery(tipoServicio tipo, LocalDateTime fechaHora, int codigo, Pedido pedido) {
        super(tipo, fechaHora, codigo);
        this.pedido = pedido;
    }
    /**
    * Método que devuelve el pedido del delivery.
    * @return Devuelve un objeto Pedido del delivery.
    */
    public Pedido getPedido(){
        return pedido;
    }
}
