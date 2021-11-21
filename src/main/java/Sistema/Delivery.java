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
    
    public Delivery(tipoServicio tipo, Date fecha, String horadePartida, int codigo, String pedido) {
        super(tipo, fecha, horadePartida, codigo);
        this.pedido = pedido;
    }
    
    public tipoServicio getTipo(){
        return tipo;
    }
    public Date getFecha(){
        return fecha;
    }
    public String getHoraDePartida(){
        return horadePartida;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getPedido(){
        return pedido;
    }
    

    
    protected double calcularValorPagar(tipoPago tp){
        
        double valorPagar = 0;
        // calculo de valor a pagar
        return ; //double
    }
}
