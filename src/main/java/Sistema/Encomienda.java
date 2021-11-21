/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;
import Enums.tipoEncomienda;
import Enums.tipoServicio;
import java.util.Date;

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
    
    private Encomienda(tipoServicio tipoS, Date fecha, String horadePartida, int codigo, int cantProd, tipoEncomienda tipoE){
        super(tipoS, fecha, horadePartida, codigo);       
        this.cantidadProductos = cantProd;
        this.tipoE = tipoE;
    }
    
}
