/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Pago {
    Cliente cliente;
    tipoPago tipo;
    Servicio servicio;
    
    public static tipoPago elegirTipoPago(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Efectivo \n2. Tarjeta \nIngrese que tipo de pago va a realizar: ");
        String tp = sc.nextLine();
        tipoPago tipoPago = null;
        switch(tp){
            case "1":
                tipoPago = EFECTIVO;
                break;
            case "2":
                tipoPago = TARJETA;
                break;
        }
        return tipoPago;
    }
}
