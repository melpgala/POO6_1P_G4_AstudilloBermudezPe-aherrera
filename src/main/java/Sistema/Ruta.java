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
import java.util.Scanner;
public class Ruta {
    private String origen;
    private String destino;
    private Scanner sc;
    protected Ruta(String origen, String destino){
        this.origen=origen;
        this.destino=destino;
    
    }
    
    protected String getOrigen(){
        return origen;
    }
    
    protected String getDestino(){
        return destino;
    }
    
}
