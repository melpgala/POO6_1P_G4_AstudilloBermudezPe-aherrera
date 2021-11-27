/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sistema;
import Enums.tipoPago;
import Enums.tipoServicio;
import java.time.LocalDateTime;

/**
 *
 * @author User
 */
public class Servicio {
    private tipoServicio tipoS;
    private LocalDateTime fechaHora;
    protected boolean aceptarServicio;
    private int codigo;
    
    protected Servicio(tipoServicio tipoS, LocalDateTime fechaHora, int codigo){
        this.tipoS = tipoS;
        this.fechaHora = fechaHora;
        this.codigo = codigo;
        
    }
    protected tipoServicio getTipo(){
        return tipoS;
    }
    protected LocalDateTime getFechaHora(){
        return fechaHora;
    }
    protected int getCodigo(){
        return codigo;
    }
    
    
    protected void buscarConductor(){
    }
    private double calcularValorPagar(tipoPago tp){
        double numAleatorio =Math.random()*10;
        double valorPagar= 0;
        if (tp.equals(tipoPago.EFECTIVO)){
            valorPagar=numAleatorio;
        }else if (tp.equals(tipoPago.TARJETA)){
            valorPagar=numAleatorio*1.1;
        }
        
        return valorPagar; //double
    }
    
    protected static int generarCodServicio(){
    int cod=(int)(Math.random()*(99999-10000)+10000);
        return cod;
    
    }
}
