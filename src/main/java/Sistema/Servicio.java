/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sistema;
import Enums.tipoPago;
import Enums.tipoServicio;
import java.util.Date;

/**
 *
 * @author User
 */
public class Servicio {
    private tipoServicio tipoS;
    private Date fecha;
    private String horaDePartida;
    protected boolean aceptarServicio;
    private int codigo;
    
    protected Servicio(tipoServicio tipoS, Date fecha, String horaDePartida, int codigo){
        this.tipoS = tipoS;
        this.fecha = fecha;
        this.horaDePartida = horaDePartida;
        this.codigo = codigo;
        
    }
    protected tipoServicio getTipo(){
        return tipoS;
    }
    protected Date getFecha(){
        return fecha;
    }
    protected String getHoraDePartida(){
        return horaDePartida;
    }
    protected int getCodigo(){
        return codigo;
    }
    
    
    protected void buscarConductor(){
    }
    private double calcularValorPagar(tipoPago tp){
        double numAleatorio =Math.random()*10;
        double valorPagar= 0;
        if (tp.equals(tipoPago.Efectivo)){
            valorPagar=numAleatorio;
        }else if (tp.equals(tipoPago.Tarjeta)){
            valorPagar=numAleatorio*1.1;
        }
        
        return valorPagar; //double
    }
    
    protected int generarCodServicio(){
    codigo=(int)(Math.random()*(99999-10000)+10000);
        return codigo;
    
    }
}
