/**
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
     private Pedido pedido;
     private int codigoPedido;
    
    /**
    * Método constructor parametrizado de Delivery.
    * @param tipo Tipo de servicio.
    * @param fechaHora Fecha y hora actual en la que pidió el servicio.
    * @param codigo Codigo por el servicio.
    * @param pedido Pedido de servicio Delivery.
    * @param codigoPedido Código del pedido.
    * @author Alex Bermudez
    */
    public Delivery(tipoServicio tipo, LocalDateTime fechaHora, int codigo, Pedido pedido, int codigoPedido) {
        super(tipo, fechaHora, codigo);
        this.pedido = pedido;
        this.codigoPedido = codigoPedido;
    }
    /**
    * Método que devuelve el pedido del delivery.
    * @return Devuelve un objeto Pedido del delivery.
    */
    public Pedido getPedido(){
        return pedido;
    }
    
    /**
    * Método que devuelve el código del pedido.
    * @return Devuelve un int que indica el código del pedido.
    */
    public int getCodigoPedido(){
         return codigoPedido;
    }
    
    /**
    * Método que devuelve una cadena con la información a agregar en los archivos txt de un objeto delivery.
    * @param cl Cliente del servicio de delivery.
    * @param co Conductor del servicio de delivery.
    * @return Devuelve un String que indica la información a agregar en los archivos txt de un objeto delivery.
    * @author Alex Bermudez
    */
    @Override
    public String toString(Cliente cl,Conductor co){
        return super.getCodigo()+","+cl.getNombreApellido()+","+co.getNombreApellido()+","+super.getRuta().getOrigen()+","+super.getRuta().getDestino()+","+super.getFechaHora()+","+this.getCodigoPedido()+","+super.getTipoPago()+","+super.getValorapagar();
    }
     
    /**
    * Método que devuelve una cadena con la información a agregar en los archivos txt de un objeto delivery.
    * @author Alex Bermudez
    * @return Devuelve un String que indica la información a agregar en los archivos txt de un objeto delivery 
    */
    public String toStringPedido(){
         return this.getCodigoPedido()+","+this.getPedido().getCodigoDeRestaurante()+","+this.getPedido().getNombresPedido()+","+super.getValorapagar();
    }
}
