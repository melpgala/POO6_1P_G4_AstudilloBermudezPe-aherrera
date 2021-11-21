/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Enums.tipoPago;
import Enums.tipoServicio;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author User
 */
public class Delivery extends Servicio {
    String pedido;
    
    public Delivery(tipoServicio tipo, DateTimeFormatter fechaHora, int codigo, String pedido) {
        super(tipo, fechaHora, codigo);
        this.pedido = pedido;
    }
    
    protected String getPedido(){
        return pedido;
    }

    
    protected double calcularValorPagar(tipoPago tp){
        
        double valorPagar = 0;
        // calculo de valor a pagar
        return valorPagar;
    }
}
