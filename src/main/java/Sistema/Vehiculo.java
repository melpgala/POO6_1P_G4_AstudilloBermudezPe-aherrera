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

import java.util.ArrayList;
import manejoArchivos.ManejoArchivos;
public class Vehiculo {
    private int codigoVehiculo;
    private String placa;
    private String modelo;
    private String marca;    
    private String tipoVehiculo;
    
    //leer archivo vehiculos.txt
    //codigoVehiculo, placa, modelo, marca, tipoVehiculo
    
    private Vehiculo(){
        //ManejoArchivos vehiculos = new ManejoArchivos();
        ArrayList<String> vehiculos1 = ManejoArchivos.LeeFichero("vehiculos.txt");
        for (int i=0;i<vehiculos1.size();i++){
            this.codigoVehiculo = Integer.valueOf(vehiculos1.get(i).split(",")[0]);
            this.placa = vehiculos1.get(i).split(",")[1];
            this.modelo = vehiculos1.get(i).split(",")[2];
            this.marca = vehiculos1.get(i).split(",")[3];
            this.tipoVehiculo = vehiculos1.get(i).split(",")[4];
        }
        
        //this.codigoVehiculo = ;
        //this.placa = ;
        //this.maodelo = ;
        //this.marca = ;
        //this.tipoVehiculo = ;
        
    }
    private Vehiculo(int codV){
        //ManejoArchivos vehiculos = new ManejoArchivos();
        ArrayList<String> vehiculos1 = ManejoArchivos.LeeFichero("vehiculos.txt");
        for (int i=0;i<vehiculos1.size();i++){
            int codV1 = Integer.valueOf(vehiculos1.get(i).split(",")[1]);
            String placa1 = vehiculos1.get(i).split(",")[1];
            String modelo1 = vehiculos1.get(i).split(",")[2];
            String marca1 = vehiculos1.get(i).split(",")[3];
            String tipoVehiculo1 = vehiculos1.get(i).split(",")[4]
            if (codV==codV1){
                this.placa = placa1;
                this.modelo = modelo1;
                this.marca = marca1;
                this.tipoVehiculo = tipoVehiculo1;
            }
        }
    }
    public int getCodigoVehiculo(){
        return codigoVehiculo;
    }
    public String getPlaca(){
        return placa;
    }
    public String getModelo(){
        return modelo;
    }
    public String getMarca(){
        return marca;
    }
    public String getTipoVehiculo(){
        return tipoVehiculo;
    }
    
    
}
                
