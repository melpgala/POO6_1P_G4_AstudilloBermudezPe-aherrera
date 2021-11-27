/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Plato {
    private String nombrePlato;
    private double precioPlato;
    private int cantPlatos;
    
    Scanner sc = new Scanner(System.in);
    
    public Plato(String nombrePlato, double precioPlato){
        this.nombrePlato = nombrePlato;
        this.precioPlato = precioPlato;
    }
    
    public String getNombrePlato(){
        return nombrePlato;
    }
    public double getPrecioPlato(){
        return precioPlato;
    }
    
    protected double precioxPlatos(){
        System.out.println("Ingrese que cantidad desea de este mismo plato: ");
        cantPlatos = sc.nextInt();
        sc.nextLine();
        double precioalcontado= cantPlatos*precioPlato;
        return precioalcontado;
    }
}
