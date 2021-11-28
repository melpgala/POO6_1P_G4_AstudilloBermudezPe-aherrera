/*
 * Sistema contiene las clases del proyecto.
 */
package Sistema;
import Enums.tipoPago;
import static Enums.tipoPago.EFECTIVO;
import static Enums.tipoPago.TARJETA;
import java.util.Scanner;
/*
 * Esta clase contiene los métodos y atributos de un pago.
 * @author Melanie Peñaherrera
 */
public class Pago {
    Cliente cliente;
    tipoPago tipo;
    Servicio servicio;

    /**
    * Método estatico que devuelve el tipo de pago.
    * @return Devuelve un tipoPago que indica el tipo de pago.
    * @author Melanie Peñaherrera
    */
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
    
    /**
    * Método que
    * @param b Booleano que indica si confirma o no el servicio
    */
    public void confirmarServicio(boolean b){
        
    }
}
