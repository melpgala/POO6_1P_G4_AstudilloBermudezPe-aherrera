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
    
    public Taxi(tipoServicio tipo, Date fecha, String horadePartida, boolean aceptarServicio, int codigo, int numeroPasajeros) {
        super(tipo, fecha, horadePartida, aceptarServicio, codigo);
        this.numeroPasajeros = numeroPasajeros;
    }    
    
}
