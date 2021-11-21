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
public class Delivery extends Servicio {
    String pedido;
    
    public Delivery(tipoServicio tipo, Date fecha, String horadePartida, boolean aceptarServicio, int codigo, String pedido) {
        super(tipo, fecha, horadePartida, aceptarServicio, codigo);
        this.pedido = pedido;
    }

    
    protected double calcularValorPagar(tipoPago tp){
        
        double valorPagar = 0;
        // calculo de valor a pagar
        return ; //double
    }
}
