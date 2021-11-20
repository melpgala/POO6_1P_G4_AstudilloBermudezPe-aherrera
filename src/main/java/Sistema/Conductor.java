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
public class Conductor {
    private String user;
    private String nombre; //se bucan en usuarios.txt a partir de user
    private String apellido; //
    private int numCelular; //
    private String estado;
    private int licencia;
    private int codigoVehiculo;
    private Vehiculo veh;
    
    //leer archivo conductores.txt
    //user, licencia, estado, codigoVehiculo    
    private Conductor(){
        ManejoArchivos conductores = new ManejoArchivos();
        Arraylist conductores1 = conductores.LeeFichero("conductores.txt");
        for (i=0;i<conductores1.length;i++){
            this.user = conductores1[i][0];
            this.licencia = Integer.valueOf(conductores1[i][1]);
            this.estado = conductores1[i][2];
            int codigoVeh = Integer.valueOf(conductores1[i][3]);
        }
        
        this.veh = Vehiculo(codigoVeh);
        //this.user = ;
        //this.licencia = ;
        //this.estado = ;
        //this.codigoVehiculo = ;
        
    }
    
    private String getUser(){
        return user;
    }
    private String getEstado(){
        return estado;
    }
    private int getLicencia(){
        return licencia;
    }
    private int getCodigoVehiculo(){
        return codigoVehiculo;
    }
    

    
    @Override
    protected void consultarServicio(){
        //ver servicios asignados
        
    }
    
}
