/*
 * Sistema contiene las clases del proyecto.
 */
package Sistema;
import java.util.ArrayList;
import manejoArchivos.ManejoArchivos;

/**
 * Esta clase contiene los métodos y atributos de un vehiculo.
 * @author Alex Bermudez
 * @author Melanie Peñaherrera
 */
public class Vehiculo {
    private int codigoVehiculo;
    private String placa;
    private String modelo;
    private String marca;    
    private String tipoVehiculo; //A auto - M moto
    
    //leer archivo vehiculos.txt
    //codigoVehiculo, placa, modelo, marca, tipoVehiculo
    /**
    * Método constructor de la clase Vehiculo.
    * @author Alex Bermudez
    */
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
    }
    
    /**
    * Método constructor parametrizado de vehiculo.
    * @param codV Código del vehiculo.
    * @author Alex Bermudez
    */
    protected Vehiculo(int codV){
        //ManejoArchivos vehiculos = new ManejoArchivos();
        ArrayList<String> vehiculos1 = ManejoArchivos.LeeFichero("vehiculos.txt");
        for (int i=0;i<vehiculos1.size();i++){
            int codV1 = Integer.valueOf(vehiculos1.get(i).split(",")[1]);
            String placa1 = vehiculos1.get(i).split(",")[1];
            String modelo1 = vehiculos1.get(i).split(",")[2];
            String marca1 = vehiculos1.get(i).split(",")[3];
            String tipoVehiculo1 = vehiculos1.get(i).split(",")[4];
            if (codV==codV1){
                this.placa = placa1;
                this.modelo = modelo1;
                this.marca = marca1;
                this.tipoVehiculo = tipoVehiculo1;
            }
        }
    }
    
    /**
    * Método que devuelve el código del vehiculo.
    * @return Devuelve un int que indica el código del vehiculo.
    */
    public int getCodigoVehiculo(){
        return codigoVehiculo;
    }
    
    /**
    * Método que devuelve el número de placa.
    * @return Devuelve un String que indica el número de placa.
    */
    public String getPlaca(){
        return placa;
    }
    
    /**
    * Método que devuelve el modelo del vehiculo.
    * @return Devuelveun String que indica el modelo del vehiculo.
    */
    public String getModelo(){
        return modelo;
    }
    
    /**
    * Método que devuelve la marca del vehiculo.
    * @return Devuelve un String que indica la marca del vehiculo.
    */
    public String getMarca(){
        return marca;
    }
      
    /**
    * Método que devuelve el tipo del vehiculo.
    * @return Devuelve un String que indica el tipo de vehiculo.
    */
    public String getTipoVehiculo(){
        return tipoVehiculo;
    }
 
}
