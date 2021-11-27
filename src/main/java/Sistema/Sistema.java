/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.util.ArrayList;
import java.util.Scanner;
import manejoArchivos.ManejoArchivos;

/**
 *
 * @author User
 */
public class Sistema {

  /**  private static ArrayList<Usuario> usuarios = new ArrayList();

    private static boolean iniciarSesion(Usuario u, String contrasenia) {
        if (usuarios.contains(u) && u.getContrasenia.equals(contrasenia)) {
            System.out.println("Usuario valido");
            return true;

        } else {
            System.out.println("Usuario invalido");
        }
    }

    private static void mostrarMenu(Usuario u) {
        System.out.println("---------------MENU---------------\n");

        System.out.println("Bienvenido");

        Cliente cPrueba = new Cliente();
        Conductor conPrueba = new Conductor();
        if ("cliente".equalsIgnoreCase(u.identificarUsuario())) {///cliente
            System.out.println("1. Solicitar servicio de taxi");
            System.out.println("2. Solicitar comida a domicilio");
            System.out.println("3. Solicitar entrega encomienda");
            System.out.println("4. Consultar servicios");
        } else if ("conductor".equalsIgnoreCase(u.indentificarUsuario)) {//conductor
            System.out.println("1. Consultar Servicio Asingnado");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese usuario: ");

        Usuario u = sc.nextLine();
        System.out.println("Ingrese contraseña: ");
        String contrasenia = sc.nextLine();
        
        iniciarSesion(u, contrasenia);
        mostrarMenu(u);

        String entrada = "";

        mostrarMenu(u);
        System.out.print("Ingrese opcion:");
        entrada = sc.nextLine();
        switch (entrada) {
            if("cliente".equalsIgnoreCase(u.indentificarUsuario)){
                case "1":
                //llamamos a metodo realizartest()
                u.solicitarTaxi();
                break;
            case "2":
                //mostramos mensaje de finalizacion
                u.solicitarDelivery();
                break;
            case "3":
                u.solicitarEncomienda();
                break;
            case "4":
                u.consultarServicios();
                break;
            default:
                //la opcion ingreada no esta dentro de las opciones del menu
                System.out.println("Opcion invalida");
                break;
        }else if ("conductor".equalsIgnoreCase(u.indentificarUsuario) {
                    switch (entrada) {
                        case "1":
                            u.consultarServicio();
                            break;
                        default:
                            System.out.println("Opcion invalida");
                            break;

                    }
                }

    }

}

}
**/
    static Scanner sc= new Scanner (System.in);
    /**
    *@author Astudillo Dante
    */
    /**
    *Metodo Static para iniciar Sesion, caso no estar registrado, pide los datos para crear cuenta
    *@return {String} tipo de Usuario: "C" or "R"
    *@param{String,String}
    *
    */
    
    
    private static String iniciarSesion(String User,String Contra ) {
        boolean x=true;
        String tipoUsuario="";
        while(x){
        
        Cliente cliente= new Cliente(User);
        String cli_cond=cliente.identificarUsuario(User,Contra);
        
        if (cli_cond.equals("C")){//si, tipo de cliente es igual cliente
            System.out.println("Usuario cliente encontrado");
            x=false;
            tipoUsuario=cli_cond;
            
            
        }else if(cli_cond.equals("R")){//ai tipo de conductor es igual a conductor
//            Conductor conductor=new Conductor(User);
            System.out.println("Usuario conductor encontrado");
            x=false;
            tipoUsuario=cli_cond;
            
            
            
        }
        else{// caso contrario que el usuario no este registrado y solo admitimos registrar clientes se crea una cuenta
            
            System.out.println("Ingrese Cedula");
            String cedula=sc.nextLine();
            System.out.println("Ingrese su nombre");
            String nombre=sc.nextLine();
            System.out.println("Ingrese se Apeliido");
            String apellido=sc.nextLine();
            System.out.println("Ingrese su Celular");
            String celular=sc.nextLine();
            System.out.println("Ingrese su numero de tarjeta");
            String numtarjeta=sc.nextLine();
            System.out.println("Ingrese su edad");
            String edad=sc.nextLine();
            System.out.println("Ingrese Cedula");
            
            cliente.Crearcuenta(cedula, nombre, apellido, User, Contra, celular, numtarjeta, edad);
            System.out.println("Cuenta Creada");
            }
        }
        return tipoUsuario;
    }   
    
  /**
  *@author AstudilloDante
  *Metodo para Mostrar menu una vez inicia sesion
  *@return {int} eleccion de las opciones propuestas
  *@param {String}
    */
    
    private static int mostrarMenu(String tipoUsuario) {
        
        if ("C".equalsIgnoreCase(tipoUsuario )) {///cliente
            System.out.println("1. Solicitar servicio de taxi");
            System.out.println("2. Solicitar comida a domicilio");
            System.out.println("3. Solicitar entrega encomienda");
            System.out.println("4. Consultar servicios");
        } else if ("R".equalsIgnoreCase(tipoUsuario)) {//conductor
            System.out.println("1. Consultar Servicio Asingnado");  
        
        }
        System.out.print("Ingrese opcion:");
        
        return sc.nextInt();
    }
    
    /**
    *@author Astudillo Dante
    *Metodo Main principal del Programa 
    */   
    

    public static void main(String[] args) {
        System.out.println("---------------MENU---------------\n");

        System.out.println("Bienvenido");
        
        System.out.println("Usuario: ");
        String User=sc.next() ;
        System.out.println("Contraseña: ");
        String Contra=sc.next();
        
        String tipo= iniciarSesion(User,Contra);
        
        int valor = mostrarMenu(tipo);
        
        if("C".equals(tipo)){
            Cliente c=new Cliente(User);
            switch (valor) {
            
                case 1:
                    //llamamos a metodo realizartest()
                    c.solicitarTaxi();
                    break;
                case 2:
                    //mostramos mensaje de finalizacion
                    c.solicitarDelivery();
                    break;
                case 3:
                    c.solicitarEncomienda();
                    break;
                case 4:
                    c.consultarServicio();
                    break;
                default:
                    //la opcion ingreada no esta dentro de las opciones del menu
                    System.out.println("Opcion invalida");
                    break;
            }
        }else if ("R".equals(tipo)) {
                ArrayList<String> datos=ManejoArchivos.LeeFichero("usuarios.txt");
                String cedula="";
                for(int i=0;i<datos.size();i++){
                    String usuario=datos.get(i).split(",")[3];
                    if(usuario.equals(User)){
                        cedula=datos.get(i).split(",")[0];
                        
                    }
                }
                Conductor c=new Conductor(cedula);
                    switch (valor) {
                        case 1:
                            c.consultarServicio();
                            break;
                        default:
                            System.out.println("Opcion invalida");
                            break;

                    }
                }

    }

}
