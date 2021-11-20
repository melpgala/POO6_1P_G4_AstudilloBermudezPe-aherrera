/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Cliente extends Usuario{
    private int numtarjetaCredito;
    private String cedula;
    
    protected ArrayList ServiciosPedidos;
    
    private Cliente(){
        manejoArchivos cliente=new manejoArchivos();
        Arraylist<String> clienteCL=cliente.LeeFichero(cliente.txt);
         for (i=0;i<usuarioCl.length;i++){
            this.numtarjetaCredito =usuarioCl[i].split(",")[2];
            this.edad=usuarioCl[i].split(",")[1];
            this.cedula=ususarioCl[i][0];    
            
    
    }
    
    protected void solicitarDelivery (){
        
        Delivery serviciodeilivery = new Delivery();
    }
    protected void consultarServicios(){
    //aqui va lo de consultar servicio
    }
    protected void solicitarTaxi(){
        Taxi serviciotaxi= new Taxi();
    }
    protected void Encomientda(){
        Encomienda servicioencomienda =new Encomienda();
        
    }
}
