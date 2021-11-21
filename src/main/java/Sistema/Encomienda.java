/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;
import Enums.tipoEncomienda;

/**
 *
 * @author User
 */
public class Encomienda extends Servicio{
    int cantidadProductos;
    tipoEncomienda tipoE;
    
    privat Encomienda(tipoServicio tipoS, Date fecha, String horadePartida, boolean aceptarServicio, int codigo, int cantProd, tipoEncomienda tipoE){
        super(tipo, fecha, horadePartida, aceptarServicio, codigo);       
        this.cantidadProductos = cantProd;
        this.tipoE = tipoE;
    }
    
   
    
}
