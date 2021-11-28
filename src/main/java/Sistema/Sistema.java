/*
 * Sistema contiene las clases del proyecto.
 */
package Sistema;

import java.util.ArrayList;
import java.util.Scanner;
import manejoArchivos.ManejoArchivos;

/**
 * Esta clase contiene los métodos y atributos del sistema principal.
 * @author Melanie Peñaherrera
 * @author Dante Astudillo 
 */
public class Sistema {
    static Scanner sc= new Scanner (System.in);
  
    /**
    * Método Static para iniciar Sesion; caso no estar registrado, pide los datos para crear cuenta
    * @param User Usuario.
    * @param Contra Contraseña del usuario.
    * @return Devuelve un String que representa el tipo de usuario que inició sesión.
    * @author Dante Astudillo
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
    * Método que muestra el menu dependiendo del tipo de usuario.
    * @param tipoUsuario Tipo de usuario.
    * @return Devuelve in int que indica la eleccion de las opciones del menu.
    * @author Melanie Peñaherrera
    * @author Dante Astudillo
    */
    private static int mostrarMenu(String tipoUsuario) { 
        if ("C".equalsIgnoreCase(tipoUsuario )) {///cliente
            System.out.println("1. Solicitar servicio de taxi");
            System.out.println("2. Solicitar comida a domicilio");
            System.out.println("3. Solicitar entrega encomienda");
            System.out.println("4. Consultar servicios");
            System.out.println("4. Salir");
        } else if ("R".equalsIgnoreCase(tipoUsuario)) {//conductor
            System.out.println("1. Consultar Servicio Asignado");
            System.out.println("2. Salir");
        }
        System.out.print("Ingrese opcion:"); 
        Int valor sc.nextInt();
          if("C".equals(tipo)){
            Cliente c=new Cliente(User);
            switch (valor) {
                case 1:
                    c.solicitarTaxi();
                    break;
                case 2:
                    c.solicitarDelivery();
                    break;
                case 3:
                    c.solicitarEncomienda();
                    break;
                case 4:
                    c.consultarServicio();
                    break;
                case 5:
                  System.out.println("Ha salido exitosamente");
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
                        case 2:
                            System.out.println("Ha salido exitosamente");
                            break;
                        default:
                            System.out.println("Opcion invalida");
                            break;
                    }
                }
    
    }
    
    /**
    * Método static Main principal del Programa 
    * @param args Codigo que ejecutara el programa principal.
    * @author Dante Astudillo
    * @author Melanie Peñaherrera
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
      
}}
