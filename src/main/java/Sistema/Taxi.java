/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Enums.tipoServicio;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author User
 */
public class Taxi extends Servicio {
    private int numeroPasajeros;
    
    protected int getNumeroPasajeros(){
        return numeroPasajeros;
    }
    
    public Taxi(tipoServicio tipo, DateTimeFormatter fechaHora, String horadePartida, int codigo, int numeroPasajeros) {
        super(tipo, fechaHora, codigo);
        this.numeroPasajeros = numeroPasajeros;
    }    
    
}
