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
    protected ArrayList ServiciosPedidos;
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
