/*
 * Sistema contiene las clases del proyecto.
 */
package Sistema;
import java.util.Scanner;

/**
 * Esta clase contiene los métodos y atributos de una ruta.
 * @author Melanie Peñaherrera
 */
public class Ruta {
    private String origen;
    private String destino;
    private Scanner sc;
    
    /**
    * Método que devuelve el origen de la ruta.
    * @return Devuelve un String que indica el origen de la ruta.
    */
    protected String getOrigen(){
        return origen;
    }
    
    /**
    * Método que devuelve el destino de la ruta.
    * @return Devuelve un String que indica el destino de la ruta.
    */
    protected String getDestino(){
        return destino;
    }
    
    /**
    * Método constructor de la clase Ruta.
    * @author Melanie Peñeherrera
    */
    protected Ruta(){
        sc = new Scanner(System.in);
        System.out.println("Ingrese origen: ");
        origen = sc.nextLine();
        System.out.println("Ingrese destino: ");
        destino = sc.nextLine();
    }
    
}
