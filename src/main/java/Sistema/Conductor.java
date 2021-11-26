/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.util.ArrayList;
import manejoArchivos.ManejoArchivos;

/**
 *
 * @author User
 */
public class Conductor extends Usuario{
    //private String user;
    private String nombre; //se bucan en usuarios.txt a partir de user
    private String apellido; //
    private int numCelular; //
    private String estado;
    private int licencia;
    private int codigoVeh;
    private Vehiculo veh;
    
    
    //leer archivo conductores.txt
    //cedula, licencia, estado, codigoVehiculo    
    private Conductor(String cedula){        
        super();
       
        ArrayList <String> conductores1 = ManejoArchivos.LeeFichero("conductores.txt");
        String userCon="";
        for (int i=0;i<conductores1.size();i++){
            cedCon = conductores1.get(i).split(",")[0];
            if(cedCon.equals(cedula)){
                this.licencia = Integer.valueOf(conductores1.get(i).split(",")[1]);
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
            int numCel = Integer.valueOf(users1.get(i).split(",")[5]);
            if(ced1.equals(cedCon)){
                this.nombre = nom;
                this.apellido = apell;
                this.numCelular = numCel;
            }
        }
        
        this.veh = new Vehiculo(codigoVeh);
        //this.user = ;
        //this.licencia = ;
        //this.estado = ;
        //this.codigoVehiculo = ;
        
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getNumCelular(){
        return numCelular;
    }
    //private String getUser(){
        //return user;
    //}
    public String getEstado(){
        return estado;
    }
    public int getLicencia(){
        return licencia;
    }
    //private int getCodigoVehiculo(){
        //return codigoVehiculo;
    //}
    

    
    @Override
    protected void consultarServicio(){
        //ver servicios asignados
        
    }
    
}
