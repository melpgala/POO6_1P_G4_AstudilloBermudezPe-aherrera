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
public class Conductor extends Usuario{
    //private String user;
    private String nombre; //se bucan en usuarios.txt a partir de user
    private String apellido; //
    private int numCelular; //
    private String estado;
    private int licencia;
    //private int codigoVehiculo;
    private Vehiculo veh;
    
    
    //leer archivo conductores.txt
    //user, licencia, estado, codigoVehiculo    
    private Conductor(String Usuarios){        
        super(Usuarios);
        
        ManejoArchivos conductores = new ManejoArchivos();
        Arraylist conductores1 = conductores.LeeFichero("conductores.txt");
        for (int i=0;i<conductores1.size();i++){
            String userCon = conductores1[i].split(",")[0];
            if(userCon.equals(Usuarios)){
                this.licencia = Integer.valueOf(conductores1[i].split(",")[1]);
                this.estado = conductores1[i].split(",")[2];
                int codigoVeh = Integer.valueOf(conductores1[i].split(",")[3]);
            }
        }
        
        //leer archivo usuarios.txt
        //cedula, nombre, apellido, user, contraseña, celular, tipoUsuario
        ManejoArchivos users = new ManejoArchivos();
        Arraylist users1 = users.LeeFichero("usuarios.txt");
        for (i=0;i<users1.size();i++){
            String nom = users1[i].split(",")[1];
            String apell = users1[i].split(",")[2];
            String use1 = users1[i].split(",")[3];
            int numCel = Integer.valueOf(users1[i].split(",")[5]);
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
    private String getNombre(){
        return nombre;
    }
    private String getApellido(){
        return apellido;
    }
    private int getNumCelular(){
        reuturn numCelular;
    }
    //private String getUser(){
        //return user;
    //}
    private String getEstado(){
        return estado;
    }
    private int getLicencia(){
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
