/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;
import java.util.ArrayList;
import manejoArchivos.ManejoArchivos;

/**
 *
 * @author User
 */
public class Cliente extends Usuario{
    private int numtarjetaCredito;
    private String cedula;

    
    protected ArrayList ServiciosPedidos;
    
    private Cliente(){
        

        ArrayList <String > clienteCL= ManejoArchivos.LeeFichero("cliente.txt");
         for (int i=0 ; i < clienteCL.size();i++){
            this.numtarjetaCredito = Integer.valueOf(clienteCL.get(i).split(",")[2]);
            this.cedula = clienteCL.get(i).split(",")[0];    
        }
    }
    
    protected void solicitarDelivery (){
        
        Delivery serviciodeilivery = new Delivery();
    }
    @Override
    protected void consultarServicio(){
        //ver servicios asignados
        
    }
    protected void solicitarTaxi(){
        Taxi serviciotaxi= new Taxi();
    }
    protected void Encomientda(){
        Encomienda servicioencomienda =new Encomienda();
        
    }
}
