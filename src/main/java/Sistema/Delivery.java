/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Enums.tipoServicio;
import java.time.LocalDateTime;


/**
 *
 * @author User
 */
public class Delivery extends Servicio {
    Pedido pedido;
    
    public Delivery(tipoServicio tipo, LocalDateTime fechaHora, int codigo, Pedido pedido) {
        super(tipo, fechaHora, codigo);
        this.pedido = pedido;
    }
    public Pedido getPedido(){
        return pedido;
    }
}
