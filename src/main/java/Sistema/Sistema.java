/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.util.ArrayList;
import java.util.Scanner;

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
    
    
    
    
    private static String iniciarSesion(String User,String Contra ) {
        boolean x=true;
        String va="";
        while(x){
        
        Cliente cliente= new Cliente(User);
        String cli_cond=cliente.identificarUsuario(User,Contra);
        
        if (cli_cond.equals("C")){
            System.out.println("Usuario cliente encontrado");
            x=false;
            va=cli_cond;
            
            
        }else if(cli_cond.equals("R")){
//            Conductor conductor=new Conductor(User);
            System.out.println("Usuario conductor concedido");
            x=false;
            va=cli_cond;
            
            
            
        }
        else{
            
            for (int i=0; i<8;i++)
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
            System.out.println("Cuenta Creada, vuelva a ingresar su usuario y contraseña");
            return null;
            
//        ArrayList <String> usuarioCl = ManejoArchivos.LeeFichero("Usuario.txt");
//        
//        boolean tipoDU1 = false;
//        for (int i=0;i<usuarioCl.size();i++){
//            String user =usuarioCl.get(i).split(",")[3];
//            String contra=usuarioCl.get(i).split(",")[4];
//            String tipoDU=usuarioCl.get(i).split(",")[6];    
//            if (User.equals(user) && Contra.equals(contra)){
//                System.out.println("Usuario encontrado");
//
//                
//            }else {
//                CuentaNueva(User,Contra);
//        }
//        return tipoDU1;
            
            }
        
        }
        return va;
    
    }   
    private static int mostrarMenu(String C) {
        System.out.println("---------------MENU---------------\n");

        System.out.println("Bienvenido");
        
        if ("C".equalsIgnoreCase(C )) {///cliente
            System.out.println("1. Solicitar servicio de taxi");
            System.out.println("2. Solicitar comida a domicilio");
            System.out.println("3. Solicitar entrega encomienda");
            System.out.println("4. Consultar servicios");
        } else if ("R".equalsIgnoreCase(C)) {//conductor
            System.out.println("1. Consultar Servicio Asingnado");
        
            
        
        }
        return sc.nextInt();
    }
    
        
        
        
    

    public static void main(String[] args) {
        System.out.println("Usuario: ");
        String User=sc.next() ;
        System.out.println("Contraseña; ");
        String Contra=sc.next();
        
        String tipo= iniciarSesion(User,Contra );
        
        

        
        
        int valor =mostrarMenu(tipo);
        
        System.out.print("Ingrese opcion:");
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
                    c.consultarServicios();
                    break;
                default:
                    //la opcion ingreada no esta dentro de las opciones del menu
                    System.out.println("Opcion invalida");
                    break;
            }
        }else if ("R".equalsIgnoreCase(tipo)) {
                Conductor c=new Conductor(User);
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
