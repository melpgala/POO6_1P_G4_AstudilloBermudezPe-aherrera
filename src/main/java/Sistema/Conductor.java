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
    private String nombre; //se bucan en usuarios.txt a partir de user
    private String apellido; //
    private String numCelular; //
    private String estado;
    private int licencia;
    private int codigoVeh;
    private Vehiculo veh;
    
    
    //leer archivo conductores.txt
    //user, licencia, estado, codigoVehiculo    
    public Conductor(String cedula){        

        ArrayList <String> conductores1 = ManejoArchivos.LeeFichero("conductores.txt");
        String cedConductor="";
        for (int i=0;i<conductores1.size();i++){
            cedConductor = conductores1.get(i).split(",")[0];
            if(cedConductor.equals(cedula)){
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
            String numCel = users1.get(i).split(",")[5];
            if(ced1.equals(cedConductor)){
                this.nombre = nom;
                this.apellido = apell;
                this.numCelular = numCel;
            }
        }
        this.veh = new Vehiculo(codigoVeh); 
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getNumCelular(){
        return numCelular;
    }
    
    public String getEstado(){
        return estado;
    }
    public int getLicencia(){
        return licencia;
    }

    
    @Override
    protected void consultarServicio(){
        //ver servicios asignados
        
    }
    
}
