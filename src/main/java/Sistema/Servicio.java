/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;
import Enums.tipoServicio;
import java.util.Date;

/**
 *
 * @author User
 */
public class Servicio {
    private tipoServicio tipo;
    private Date fecha;
    private String horadePartida;
    protected boolean aceptarServicio;
    private int codigo;
    
    protected void escojerServicio(){
    
    
    }
    protected void buscarConductor(){
    }
    private double calcularValorPagar(tipoPago tp){
        
        Ruta rutaorigendestino= new Ruta();
        rutaorigendestino.Ruta();
        double numAleatorio =Math.random()*10;
        double valorapagar= 0;
        if (tp.equals(tipoPago.Efectivo)){
            valorapagar=numAleatorio;
        }else if (tp.equals(tipoPago.Tarjeta)){
            valorapagar=numAleatorio*1.1;
        }
        
        return valorPagar; //double
    }
}
