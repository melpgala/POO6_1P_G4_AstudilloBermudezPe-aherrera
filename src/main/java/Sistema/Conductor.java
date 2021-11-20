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
    //user, licencia, estado, codigoVehiculo    
    private Conductor(String Usuarios){        
        super();
        
        //ManejoArchivos conductores = new ManejoArchivos();
        ArrayList<String> conductores1 = ManejoArchivos.LeeFichero("conductores.txt");
        String userCon = "";
        for (int i=0;i<conductores1.size();i++){
            String userCon = conductores1.get(i).split(",")[0];
            if(userCon.equals(Usuarios)){
                this.licencia = Integer.valueOf(conductores1.get(i).split(",")[1]);
                this.estado = conductores1.get(i).split(",")[2];
                int codigoVeh = Integer.valueOf(conductores1.get(i).split(",")[3]);
            }
        }
        
        //leer archivo usuarios.txt
        //cedula, nombre, apellido, user, contraseña, celular, tipoUsuario
        //ManejoArchivos users = new ManejoArchivos();
        ArrayList<String> users1 = ManejoArchivos.LeeFichero("usuarios.txt");
        for (i=0;i<users1.size();i++){
            String nom = users1.get(i).split(",")[1];
            String apell = users1.get(i).split(",")[2];
            String use1 = users1.get(i).split(",")[3];
            int numCel = Integer.valueOf(users1.get(i).split(",")[5]);
            if(use1.equals(userCon)){
                this.nombre = nom;
                this.apellido = apell;
                this.numCelular = numCel;
            }
        }
        
        this.veh = Vehiculo(codigoVeh);
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
        reuturn numCelular;
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
