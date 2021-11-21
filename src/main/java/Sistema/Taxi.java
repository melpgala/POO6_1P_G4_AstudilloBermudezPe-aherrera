/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

/**
 *
 * @author User
 */
public class Taxi extends Servicio {
    private int numeroPasajeros;
    
    
    
    protected int generarCodServicio(){
    codigo=(int)(Math.random()*(<99999-10000)+10000);
        
    
    }
    
}
