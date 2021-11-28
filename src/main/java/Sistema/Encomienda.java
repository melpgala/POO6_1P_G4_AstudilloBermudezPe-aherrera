/*
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
    int cantidadProductos;
    tipoEncomienda tipoE;
    
    /**
    * Método que devuelve la cantidad de productos de una encomienda.
    * @return Devuelve la cantidad de productos de una encomienda.
    */
    protected int getCantidadProductos(){
        return cantidadProductos;
    }
    
    /**
    * Método que devuelve el tipo de encomienda.
    * @return Devuelve el tipo de encomienda.
    */
    protected tipoEncomienda getTipoE(){
        return tipoE;
    }
    
    
    /**
    * Método constructor parametrizado.
    * @tipoS Tipo de servicio.
    * @fechaHora Fecha y hora actual en la que se realizo la encomienda.
    * @codigo Codigo de servicio. 
    * @cantProd Cantidad de productos de la encomienda.
    * @tipoE Tipo de encomienda.
    * @author Alex Bermudez
    */
    public Encomienda(tipoServicio tipoS, LocalDateTime fechaHora, int codigo, int cantProd, tipoEncomienda tipoE){
        super(tipoS, fechaHora, codigo);       
        this.cantidadProductos = cantProd;
        this.tipoE = tipoE;
    }
    
}
