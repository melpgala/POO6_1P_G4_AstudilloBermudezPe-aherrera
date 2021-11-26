/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;
import Enums.tipoEncomienda;
import static Enums.tipoEncomienda.DOCUMENTOS;
import static Enums.tipoEncomienda.MEDICINA;
import static Enums.tipoEncomienda.EFECTIVO;
import static Enums.tipoServicio.DELIVERY;
import static Enums.tipoServicio.ENCOMIENDA;
import static Enums.tipoServicio.TAXI;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import manejoArchivos.ManejoArchivos;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Cliente extends Usuario{
    private int numtarjetaCredito;
    private String cedula;
    
    
    protected ArrayList <Servicio>ServiciosPedidos;
    Scanner sc = new Scanner(System.in);
    public Cliente(){
        
    }
    public Cliente(String Usuario){  

    ArrayList <String > clienteCL= ManejoArchivos.LeeFichero("Usuario.txt");
     for (int i=0 ; i < clienteCL.size();i++){
        NumtarjetaCredito = Integer.valueOf(clienteCL.get(i).split(",")[2]);
        Cedula = clienteCL.get(i).split(",")[0];
        String nombre =clienteCL.get(i).split(",")[1];
        String apellido=clienteCL.get(i).split(",")[2];
        Usuarios=Usuario;
        Contrasenia=clienteCL.get(i).split(",")[4];
        String Celular= clienteCL.get(i).split(",")[5];


        }
    }
    protected void  Crearcuenta(String Cedula, String nombre,String Apellido,String User,String Contrasenia, String celular,String numtarjeta,String edad){
        String linea=Cedula+","+nombre+","+Apellido+","+User+","+Contrasenia+","+celular ;
        String linea2=Cedula+","+edad+","+numtarjeta ;
        ManejoArchivos.EscribirArchivo("Usuario.txt",linea);
        ManejoArchivos.EscribirArchivo("Cliente",linea2 );
    }
    protected void setcedula(String a){
        
        Cedula=a;
    }
    protected void setnumtarjetaCredito(int a){
        NumtarjetaCredito=a;
    }
    protected String getcedula(){
        return Cedula;
    }
    protected int  getnumtarjetaCredito(){
        return NumtarjetaCredito;
    }
    
    protected void solicitarDelivery (){
        
        DateTimeFormatter fechaHora = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        int codigo = Servicio.generarCodServicio();
        ArrayList pedido =//objetoPedido.getPlatosComprados();
        Delivery servicioDelivery = new Delivery(DELIVERY,fechaHora, codigo, pedido);
    }
    @Override
    protected void consultarServicio(){
        //ver servicios asignados
        for(Servicio serv: ServiciosPedidos){
            System.out.println("Tipo: "+serv.getTipo());
            if(serv instanceof Delivery){
                System.out.println("Restaurante: ");//imprimir restaurante
                System.out.println("Pedido: "+((Delivery) serv).getPedido());  
            } else if (serv instanceof Encomienda){
                System.out.println("Tipo encomienda: "+((Encomienda) serv).getTipoE());
                System.out.println("Cantidad: "+((Encomienda) serv).getCantidadProductos());
            }else if (serv instanceof Taxi){
                System.out.println("Cantidad de pasajeros: "+((Taxi) serv).getNumeroPasajeros());
 
            }
            System.out.println("Fecha - Hora: "+serv.getFechaHora().format(LocalDateTime.now()));
            System.out.println("Desde: ");//ruta origen
            System.out.println("Hasta: ");//ruta destino 
            
        }
        
    }
    protected void solicitarTaxi(){
        System.out.println("Ingrese número de pasajeros: ");
        int numPasajeros = sc.nextInt();
        sc.nextLine();
        DateTimeFormatter fechaHora = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        int codigo = Servicio.generarCodServicio();
        Taxi serviciotaxi= new Taxi(TAXI, fechaHora, codigo,numPasajeros);
    }
    protected void solicitarEncomienda(){
        
        System.out.println("Ingrese cantidad de productos: ");
        int cantProd = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese tipo de encomienda: ");
        String tipoEncomienda= sc.nextLine();
        tipoEncomienda tipoE = null;
        switch (tipoEncomienda){
            case "DOCUMENTO":
                tipoE = DOCUMENTOS;
                break;
            case "MEDICINA":
                tipoE = MEDICINA;
                break;
            case "EFECTIVO":
                tipoE = EFECTIVO;
                break;
        }
        DateTimeFormatter fechaHora = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        int codigo = Servicio.generarCodServicio();
        Encomienda servicioEncomienda = new Encomienda(ENCOMIENDA, fechaHora, codigo, cantProd, tipoE);
    }
}
