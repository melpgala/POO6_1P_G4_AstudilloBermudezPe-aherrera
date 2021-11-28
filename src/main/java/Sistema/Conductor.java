/*
 * Sistema contiene las clases del proyecto.
 */
package Sistema;

import java.util.ArrayList;
import manejoArchivos.ManejoArchivos;

/**
 * Esta clase contiene los atributos y métodos de un conductor.
 * @author Melanie Peñaherrera
 * @author Alex Bermudez
 * @see Usuario
 */
public class Conductor extends Usuario{
    private String nombre; 
    private String apellido; 
    private String estado;
    private int codigoVeh;
    private Vehiculo veh;
    
    /**
    * Método que devuelve el nombre y apellido del conductor.
    * return Devuelve un String con el nombre y apellido del conductor.
    */
    public String getNombreApellido(){
        return nombre+" "+apellido;
    }
    
    //leer archivo conductores.txt
    //user, licencia, estado, codigoVehiculo   
    /**
    * Método constructor parametrizado de conductor.
    * @param cedula Cedula del conductor.
    * @author Alex Bermudez
    */
    public Conductor(String cedula){        
        ArrayList <String> conductores1 = ManejoArchivos.LeeFichero("conductores.txt");
        String cedConductor="";
        for (int i=0;i<conductores1.size();i++){
            cedConductor = conductores1.get(i).split(",")[0];
            if(cedConductor.equals(cedula)){
                //this.licencia = Integer.valueOf(conductores1.get(i).split(",")[1]);
                this.estado = conductores1.get(i).split(",")[2];
                codigoVeh = Integer.valueOf(conductores1.get(i).split(",")[3]);
            }
        }
        //leer archivo usuarios.txt
        //cedula, nombre, apellido, user, contraseña, celular, tipoUsuario
        ArrayList <String> users1 = ManejoArchivos.LeeFichero("usuarios.txt");
        for (int i=0;i<users1.size();i++){
            String nom = users1.get(i).split(",")[1];
            String apell = users1.get(i).split(",")[2];
            String ced1 = users1.get(i).split(",")[0];
            //String numCel = users1.get(i).split(",")[5];
            if(ced1.equals(cedConductor)){
                this.nombre = nom;
                this.apellido = apell;                                
                //this.numCelular = numCel;
            }
        }
        this.veh = new Vehiculo(codigoVeh); 
    }
   
    
    /**
    * Método que permite consultar el servicio asignado al conductor.
    * @author Alex Bermudez
    * @author Melanie Peñaherrera
    */
    @Override
    protected void consultarServicio(){ //  conductor.consultarServico()
        ArrayList <String> listaDelivery = ManejoArchivos.LeeFichero("delivery.txt");
        ArrayList <String> listaTaxi = ManejoArchivos.LeeFichero("viajes.txt");
        ArrayList <String> listaEncomiendas = ManejoArchivos.LeeFichero("encomiendas.txt");
        String nombreApellidoConductor = this.getNombreApellido();
        String datosConductor = "";
        for (String datos : listaDelivery){
            datosConductor=datos.split(",")[2];
            if (nombreApellidoConductor.equals(datosConductor)){
                
            }
            
        }
        
        System.out.println("Usted tiene asignado el servicio de ");
        System.out.println("Fecha - Hora: ");
        System.out.println("Desde: ");//ruta origen
        System.out.println("Hasta: ");//ruta destino 
        System.out.println("Diríjase al sitio para");
        

    }
}
