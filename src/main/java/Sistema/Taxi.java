/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Enums.tipoServicio;
import java.util.Date;

/**
 *
 * @author User
 */
public class Taxi extends Servicio {
    private int numeroPasajeros;
    
    protected int getNumeroPasajeros(){
        return numeroPasajeros;
    }
    
    public Taxi(tipoServicio tipo, Date fecha, String horadePartida, int codigo, int numeroPasajeros) {
        super(tipo, fecha, horadePartida, codigo);
        this.numeroPasajeros = numeroPasajeros;
    }    
    
}
