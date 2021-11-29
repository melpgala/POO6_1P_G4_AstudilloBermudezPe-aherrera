/*
 * Sistema contiene las clases del proyecto.
 */

package Sistema;
import Enums.tipoPago;
import Enums.tipoServicio;
import java.time.LocalDateTime;
import java.util.ArrayList;
import manejoArchivos.ManejoArchivos;
import java.util.Scanner;

/**
 * Esta clase contiene los métodos y atributos de un servicio.
 * @author Alex Bermudez
 * @author Melanie Peñaherrera
 * @author Dante Astudillo
 */
public class Servicio {
    private tipoServicio tipoS;
    private LocalDateTime fechaHora;
    private int codigoServicio;
    private Ruta ruta;
    private Double valorapagar;
    private tipoPago tipoP;
    
    Scanner sc = new Scanner(System.in);
    
    /**
    * Método que devuelve la ruta del servicio.
    * @return Devuelve una Ruta que indica el origen y destino del servicio.
    * @author Dante Astudillo 
    * @author Alex Bermudez
    * @author Melanie Peñaherrera
    */
    public Ruta getRuta(){
        return ruta;
    }
    
    /**
    * Método constructor parametrizado de la clase Servicio.
    * @param tipoS Tipo de servicio.
    * @param fechaHora Fecha y hora actual en la que se pidió el servicio.
    * @param codigo Codigo del servicio.
    */
    protected Servicio(tipoServicio tipoS, LocalDateTime fechaHora, int codigo){
        this.tipoS = tipoS;
        this.fechaHora = fechaHora;
        this.codigoServicio = codigo;
        Ruta ruta = new Ruta();   
        this.ruta = ruta;
    }
    
    /**
    * Método que devuelve el tipo del servicio.
    * @return Devuelve un tipoServicio que indica el tipo de servicio.
    */
    protected tipoServicio getTipo(){
        return tipoS;
    }
    
    /**
    * Método que devuelve la fecha y hora en la que se pidió el servicio.
    * @return Devuelve un LocalDateTime que indica la fecha y hora en la que se pidio el servico.
    */
    protected LocalDateTime getFechaHora(){
        return fechaHora;
    }
    
    /**
    * Método que devuelve el código del servicio.
    * @return Devuelve un int que representa el código del servicio.
    */
    protected int getCodigo(){
        return codigo;
    }
    
    /**
    *Metodo que devuelve el codigo del servicio.
    *@return {int} Devuelve un Double que representa el valor total a apgar
    */
    protected int getValorapagar(){
        return valorapagar;
        }
    
    /**
    * Método que devuelve el tipo de pago del servicio.
    * @return Devuelve un tipoPago que indica el tipo de pago del servicio.
    */
    protected tipoPago getTipoPago(){
        return tipoP;
    }
   
    /**
    * Método que cambia el tipo de pado del servicio
    * @param tipoP Tipo de pago del servicio.
    */
    protected void setTipoPago(tipoPago tipoP){
        this.tipoP = tipoP;
    }
    
    /**
    * Método que devuelve la cédula de un conductor que cumpla los requisitos para realizar el servicio.
    * @return Devuelve un String que indica la cédula del conductor que cumpla los requisitos para realizar el servicio.
    * @author Melanie Peñaherrera
    * @author Alex Bermudez
    */
    protected String buscarConductor(){
        ArrayList <String> conductores = ManejoArchivos.LeeFichero("conductores.txt");
        String cedConductorAsignado ="";
        for(String conductor : conductores){
            String estadoCond = conductor.split(",")[2];
            int codVehiculo = Integer.valueOf(conductor.split(",")[3]);
            if (estadoCond == "D" ){
                Vehiculo veh = new Vehiculo(codVehiculo);
                String tipo = veh.getTipoVehiculo();
                switch(this.tipoS){
                    case TAXI:
                        if (tipo.equals("A")){
                            cedConductorAsignado = conductor.split(",")[0];
                        }
                        break;
                    case DELIVERY:
                        if (tipo.equals("M")){
                            cedConductorAsignado = conductor.split(",")[0];
                        }
                        break;
                    case ENCOMIENDA:
                        if (tipo.equals("M")){
                            cedConductorAsignado = conductor.split(",")[0];
                        }
                        break;
                } 
            }
        } 
        return cedConductorAsignado;
    }
    
    /**
    * Método que cálcula y muestra el valor a pagar de un servicio.
    * @param tp Tipo de pago que realizara.
    */
    protected void calcularValorPagar(tipoPago tp){
        double numAleatorio =Math.random()*10;
        double valorTotalPagar= 0;
        if (tp.equals(tipoPago.EFECTIVO)){
            valorTotalPagar=numAleatorio;
        }else if (tp.equals(tipoPago.TARJETA)){
            valorTotalPagar=numAleatorio*1.1;
        
        }
        this.valorapagar=valorTotalPagar;
    }
    
    /**
    * Método que cálcula y muestra el valor a pagar de un servicio.
    * @param valorTotalPagar Valor total a pagar por los platos.
    * @param tp Tipo de pago que realizara.
    */
    protected void calcularValorPagar(double valorTotalPagar,tipoPago tp){
        double precioEntrega =Math.random()*5;
        if (tp.equals(tipoPago.EFECTIVO)){
            valorTotalPagar+=precioEntrega;
        }else if (tp.equals(tipoPago.TARJETA)){
            valorTotalPagar=(valorTotalPagar+precioEntrega)*1.1;
        }
       this.valorapagar=valorTotalPagar;
    }
    
    /**
    * Método estatico que generaa un código por el servicio.
    * @return Devuelve un int que indica el código por el servicio.
    */
    protected static int generarCodServicio(){
    int cod=(int)(Math.random()*(99999-10000)+10000);
        return cod;
    }
    
    /**
    * Método estatico que genera un código por el pedido.
    * @return Devuelve un int que indica el código por el pedido.
    */
    protected static int generarCodPedido(){
    int codP=(int)(Math.random()*(9999-1000)+1000);
        return codP;
    }
    
    /**
    * Método que genera un String - Método vacio hecho para que sus clases hijas lo hereden
    * @return Devuelve un String vacio.
    */
    public String toString(){
        return ".";
    }
}
