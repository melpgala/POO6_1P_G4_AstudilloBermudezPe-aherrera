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
public class Vehiculo {
    private int codigoVehiculo;
    private String placa;
    private String modelo;
    private String marca;    
    private String tipoVehiculo;
    
    //leer archivo vehiculos.txt
    //codigoVehiculo, placa, modelo, marca, tipoVehiculo
    
    private Vehiculo(){
        ManejoArchivos vehiculos = new ManejoArchivos();
        Arraylist vehiculos1 = vehiculos.LeeFichero("vehiculos.txt");
        for (i=0;i<vehiculos1.length;i++){
            this.codigoVehiculo = vehiculos1[i][0];
            this.placa = vehiculos1[i][1];
            this.modelo = vehiculos1[i][2];
            this.marca = vehiculos1[i][3];
            this.tipoVehiculo = vehiculos1[i][4]
        }
        
        //this.codigoVehiculo = ;
        //this.placa = ;
        //this.maodelo = ;
        //this.marca = ;
        //this.tipoVehiculo = ;
        
    }
    private Vehiculo(int codV){
        ManejoArchivos vehiculos = new ManejoArchivos();
        Arraylist vehiculos1 = vehiculos.LeeFichero("vehiculos.txt");
        for (i=0;i<vehiculos1.length;i++){
            int codV1 = Integer.valueOf(vehiculos1[i][1]);
            String placa1 = vehiculos1[i][1];
            String modelo1 = vehiculos1[i][2];
            String marca1 = vehiculos1[i][3];
            String tipoVehiculo1 = vehiculos1[i][4]
            if (codV.equals(codV1){
                this.placa = placa1;
                this.modelo = modelo1;
                this.marca = marca1;
                this.tipoVehiculo = tipoVehiculo1;
            }
        }
    }
}
