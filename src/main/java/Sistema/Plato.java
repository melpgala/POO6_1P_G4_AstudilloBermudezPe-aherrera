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
public class Plato {
    private String nombrePlato;
    private double precioPlato;
    private int cantPlatos;
    
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
        double precioalcontado= cantPlatos*precioPlato;
            return precioalcontado;
    }
}
