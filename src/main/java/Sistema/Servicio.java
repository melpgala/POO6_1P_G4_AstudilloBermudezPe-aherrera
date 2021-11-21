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
    private tipoServicio tipoS;
    private Date fecha;
    private String horadePartida;
    protected boolean aceptarServicio;
    private int codigo;
    
    protected Servicio(tipoServicio tipoS, Date fecha, String horadePartida, boolean aceptarServicio, int codigo){
        this.tipo = tipo;
        this.fecha = fecha;
        this.horadePartida = horadePartida;
        this.aceptarCodigo = aceptarCodigo;
        this.codigo = codigo;
        
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
    
    protected int generarCodServicio(){
    codigo=(int)(Math.random()*(<99999-10000)+10000);
        
    
    }
}
