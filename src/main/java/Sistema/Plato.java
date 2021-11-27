/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;
import java.util.Scanner;

/**
 *
 * @author Astudillo Dante
 */
public class Plato {
    private String nombrePlato;
    private double precioPlato;
    private int cantPlatos;
    
    Scanner sc = new Scanner(System.in);
    /**
    *
    * @author Astudillo Dante
    * Representa un Platillo del menu
    * @constructor
    * @param{String} nombre del platillo
    * @param{String} precio del platillo en 1 unidad
    */
    public Plato(String nombrePlato, double precioPlato){//creacion del objeto plato para cada platillo del menu
        this.nombrePlato = nombrePlato;
        this.precioPlato = precioPlato;
    }
    /**
    * Metodo que devuelve el nombre del plato
    * @return {String} Retorna el nombre del plato 
    */
    
    public String getNombrePlato(){
        return nombrePlato;
    }
    
    /**
    * Metodo que devuelve el precio del plato
    * @return {String} Retorna el precio del plato 
    */
    
    public double getPrecioPlato(){
        return precioPlato;
    }
    /**
    * 
    * Metodo que maneja el precio del plato multiplicado por n veces elejido por el cliente
    * @return{Double} retorna el precio al contado 
    *
    */
    
    protected double precioxPlatos(){
        System.out.println("Ingrese que cantidad desea de este mismo plato: ");
        cantPlatos = sc.nextInt();
        sc.nextLine();
        double precioalcontado= cantPlatos*precioPlato;
        return precioalcontado;
    }
}
