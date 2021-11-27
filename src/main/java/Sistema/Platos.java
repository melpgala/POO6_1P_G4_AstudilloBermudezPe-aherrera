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
public class Platos {
    String nombrePlato;
    double precioPlato;
    int cantPlatos;
    public Platos(int codigo,String plato){
        ArrayList<String> listaplatos= ManejoArchivos.LeerInformacion("menus.txt");
        for (int i=0;i<listaPlatos.size();i++){
            if (plato.equals(listaPlatos.get(i).split(",")[1])&&codigo.equals(listaPlatos.get(i).split(",")[0])){
               nombrePlato=plato;
               precioPlato=listaPlatos.get(i).split(",")[2]; 
            }   
    }
    
    protected double precioxPlatos(){
        precioalcontado= cantPlatos*precioPlato;
            returno precioalcontado;
    }
    
}
