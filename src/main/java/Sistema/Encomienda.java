/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;
import Enums.tipoEncomienda;
import Enums.tipoServicio;
import java.time.LocalDateTime;


/**
 *
 * @author User
 */
public class Encomienda extends Servicio{
    int cantidadProductos;
    tipoEncomienda tipoE;
    
    protected int getCantidadProductos(){
        return cantidadProductos;
    }
    protected tipoEncomienda getTipoE(){
        return tipoE;
    }
    
    public Encomienda(tipoServicio tipoS, LocalDateTime fechaHora, int codigo, int cantProd, tipoEncomienda tipoE){
        super(tipoS, fechaHora, codigo);       
        this.cantidadProductos = cantProd;
        this.tipoE = tipoE;
    }
    
}
