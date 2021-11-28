/*
 * Sistema contiene las clases del proyecto.
 */
package Sistema;
import java.util.Scanner;

/**
 * Esta clase contiene los métodos y atributos de un plato.
 * @author Astudillo Dante
 */
public class Plato {
    private String nombrePlato;
    private double precioPlato;
    private int cantPlatos;
    
    private Scanner sc;
    sc = new Scanner(System.in);
    /**
    * Método constructor parametrizado de la clase plato.
    * @param nombrePlato Nombre del platillo
    * @param precioPlato Precio del platillo por unidad.
    * @author Astudillo Dante
    */
    public Plato(String nombrePlato, double precioPlato){//creacion del objeto plato para cada platillo del menu
        this.nombrePlato = nombrePlato;
        this.precioPlato = precioPlato;
    }
    /**
    * Metodo que devuelve el nombre del plato.
    * @return Devuelve un String que indica el nombre del plato.
    */
    public String getNombrePlato(){
        return nombrePlato;
    }
    
    /**
    * Metodo que devuelve el precio del plato.
    * @return Devuelve un double que indica el precio del plato.
    */
    public double getPrecioPlato(){
        return precioPlato;
    }
    
    /**
    * Metodo que devuelve el precio del plato multiplicado por n veces cantidad elegida por el cliente.
    * @return Devuelve un double que indica el precio de los platos al contado.
    */
    protected double precioxPlatos(){
        System.out.println("Ingrese que cantidad desea de este mismo plato: ");
        cantPlatos = sc.nextInt();
        sc.nextLine();
        double precioalcontado= cantPlatos*precioPlato;
        return precioalcontado;
    }
}
