/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sistema;
import Enums.tipoPago;
import Enums.tipoServicio;
import java.time.LocalDateTime;
import java.util.ArrayList;
import manejoArchivos.ManejoArchivos;
import Sistema.Ruta;

/**
 *
 * @author User
 */
public class Servicio {
    private tipoServicio tipoS;
    private LocalDateTime fechaHora;
    private int codigo;
    private String rutaServicio
    
    protected Servicio(tipoServicio tipoS, LocalDateTime fechaHora, int codigo){
        this.tipoS = tipoS;
        this.fechaHora = fechaHora;
        this.codigo = codigo;
        this.rutaServicio = Ruta();
        
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
    
    
    protected String buscarConductor(){
        ArrayList <String> conductores = ManejoArchivos.LeeFichero("conductores.txt");
        String conductorAsignado ="";
        for(String conductor : conductores){
            String estadoCond = conductor.split(",")[2];
            int codVehiculo = Integer.valueOf(conductor.split(",")[3]);
            if (estadoCond == "D" ){
                Vehiculo veh = new Vehiculo(codVehiculo);
                String tipo = veh.getTipoVehiculo();
                switch(this.tipoS){
                    case TAXI:
                        if (tipo.equals("A")){
                            conductorAsignado = conductor;
                        }
                        break;
                    case DELIVERY:
                        if (tipo.equals("M")){
                            conductorAsignado = conductor;
                        }
                        break;
                    case ENCOMIENDA:
                        if (tipo.equals("M")){
                            conductorAsignado = conductor;
                        }
                        break;
                } 
            }
        } 
        return conductorAsignado;
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
