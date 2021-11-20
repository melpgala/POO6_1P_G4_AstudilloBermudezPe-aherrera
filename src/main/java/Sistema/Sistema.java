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
public class Sistema {
    private static ArrayList<Usuario> usuarios = new ArrayList();

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
    public static void main (String [] args){
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
