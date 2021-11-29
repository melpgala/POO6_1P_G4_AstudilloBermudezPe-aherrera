/**
 * Contiene las clases del proyecto
 */
package Sistema;
import Enums.tipoEncomienda;
import Enums.tipoServicio;
import java.time.LocalDateTime;

/**
 * Esta clase contiene los atributos y métodos de una encomienda.
 * @author Alex Bermudez
 */
public class Encomienda extends Servicio{
    private int cantidadProductos;
    private tipoEncomienda tipoE;
    
    /**
    * Método que devuelve la cantidad de productos de una encomienda.
    * @return Devuelve un int que indica la cantidad de productos de una encomienda.
    */
    protected int getCantidadProductos(){
        return cantidadProductos;
    }
    
    /**
    * Método que devuelve el tipo de encomienda.
    * @return Devuelve un tipoEncomienda que indica el tipo de encomienda.
    */
    protected tipoEncomienda getTipoE(){
        return tipoE;
    }  
    
    /**
    * Método constructor parametrizado de Encomienda.
    * @param tipoS Tipo de servicio.
    * @param fechaHora Fecha y hora actual en la que se realizo la encomienda.
    * @param codigo Codigo de servicio. 
    * @param cantProd Cantidad de productos de la encomienda.
    * @param tipoE Tipo de encomienda.
    * @author Alex Bermudez
    */
    public Encomienda(tipoServicio tipoS, LocalDateTime fechaHora, int codigo, int cantProd, tipoEncomienda tipoE){
        super(tipoS, fechaHora, codigo);       
        this.cantidadProductos = cantProd;
        this.tipoE = tipoE;
    }
    
    /**
    * Método que devuelve una cadena con la información a agregar en los archivos txt de un objeto encomienda.
    * @param cl Cliente del servicio de encomienda.
    * @param co Conductor del servicio de encomienda.
    * @return Devuelve un String que indica la información a agregar en los archivos txt de un objeto encomienda.
    * @author Alex Bermudez
    */
    @Override
    public String toString(Cliente cl, Conductor co){
        return super.getCodigo()+","+cl.getNombreApellido()+","+co.getNombreApellido()+","+super.getRuta().getOrigen()+","+super.getRuta().getDestino()+","+super.getFechaHora()+","+this.getTipoE()+","+this.getCantidadProductos()+","+super.getTipoPago()+","+super.getValorapagar();
    }
    
}
