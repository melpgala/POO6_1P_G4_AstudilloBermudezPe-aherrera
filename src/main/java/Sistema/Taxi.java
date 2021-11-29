/*
 * Sistema contiene las clases del proyecto.
 */
package Sistema;
import Enums.tipoServicio;
import java.time.LocalDateTime;


/**
 * Esta clase contiene los métodos y atributos de un taxi.
 * @author Melanie Peñaherrera
 * @author Alex Bermudez
 */
public class Taxi extends Servicio {
    private int numeroPasajeros;
    
    /**
    * Método que devuelve el número de pasajeros que tomaran el taxi.
    * @return Devuelve un int que indica el número de pasajeros que tomaran el taxi.
    */
    protected int getNumeroPasajeros(){
        return numeroPasajeros;
    }
    
    /**
    * Método constructor parametrizado de la clase Taxi.
    * @param tipo Tipo de servicio.
    * @param fechaHora Fecha y hora en la que se pidio el servicio.
    * @param codigo Código por el servicio.
    * @param numeroPasajeros Número de pasajeros que tomaran el taxi.
    * @author Melanie Peñaherrera
    */
    public Taxi(tipoServicio tipo, LocalDateTime fechaHora, int codigo, int numeroPasajeros) {
        super(tipo, fechaHora, codigo);
        this.numeroPasajeros = numeroPasajeros;
    }      
    
    /**
    * Método que devuelve una cadena con la información a agregar en los archivos text de un objeto taxi.
    * @param cl Cliente del servicio de taxi
    * @param co Conductor del servicio de taxi.
    * @return Devuelve un String que indica la información a agregar en los archivos text de un objeto taxi.
    * @author Alex Bermudez
    */
    public String toString(Cliente cl, Conductor co){        
        return super.getCodigo()+","+cl.getNombreApellido()+","+co.getNombreApellido()+","+super.getRuta().getOrigen()+","+super.getRuta().getDestino()+","+super.getFechaHora()+","+this.getNumeroPasajeros()+","+super.getTipoPago()+","+super.getValorapagar();
    }
}
