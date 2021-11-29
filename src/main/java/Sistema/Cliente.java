/*
 * Sistema contiene las clases proyecto.
 */
package Sistema;
import Enums.tipoEncomienda;
import static Enums.tipoEncomienda.DOCUMENTOS;
import static Enums.tipoEncomienda.MEDICINA;
import static Enums.tipoEncomienda.DINERO_EFECTIVO;
import Enums.tipoPago;
import static Enums.tipoServicio.DELIVERY;
import static Enums.tipoServicio.ENCOMIENDA;
import static Enums.tipoServicio.TAXI;
import java.time.LocalDateTime;
import java.util.ArrayList;
import manejoArchivos.ManejoArchivos;
import java.util.Scanner;

/**
 * Esta clase contiene los atributos y métodos de un cliente.
 * @author Dante Astudillo
 * @author Melanie Peñaherrera
 * @see Usuario
 */
public class Cliente extends Usuario{
    private String nombreApellido;
    private int numtarjetaCredito;
    private String cedula;
    private ArrayList <Servicio>ServiciosPedidos;
     Scanner sc = new Scanner(System.in);

    /**
    * Método constructor parametrizado de cliente.
    * @param Usuario Un tipo de Usuario.
    * @author Dante Astudillo
    */
    public Cliente(String Usuario){
    ArrayList <String > clienteCL = ManejoArchivos.LeeFichero("usuarios.txt");
     for (int i = 0 ; i < clienteCL.size() ; i++){
        this.numtarjetaCredito = Integer.valueOf(clienteCL.get(i).split(",")[2]);
        this.cedula = clienteCL.get(i).split(",")[0];
        this.Usuario = Usuario;
        Contrasenia = clienteCL.get(i).split(",")[4];
        this.nombreApellido = clienteCL.get(i).split(",")[1]+" "+clienteCL.get(i).split(",")[2];
        }
    }
    
    /**
    * Método que devuelve el nombre y el apellido del cliente.
    * @return Devuelve un String que indica el nombre y el apellido del cliente.
    */
    public String getNombreApellido(){
        return nombreApellido;
    }
    
    /**
    * Método para crear una cuenta de usuario y guardarlos en un archivo txt.
    * @param Cedula Cedula del usuario.
    * @param nombre Nombre del usuario.
    * @param Apellido Apellido del usuario.
    * @param User Nombre de usuario del usuario.
    * @param Contrasenia Contraseña creada por el usuario.
    * @param celular Número de celular del usuario.
    * @param numtarjeta Número de tarjeta de crédito del usuario
    * @param edad Edad del usuario.
    * @author Dante Astudillo
    */
    protected void  Crearcuenta(String Cedula, String nombre,String Apellido,String User,String Contrasenia, String celular,String numtarjeta,String edad){// creacion de cuenta  para cliente
        String linea = Cedula+","+nombre+","+Apellido+","+User+","+Contrasenia+","+celular ;
        String linea2 = Cedula+","+edad+","+numtarjeta ;
        ManejoArchivos.EscribirArchivo("usuarios.txt",linea);//se guarda los datos en un orden al archivo "  .txt"
        ManejoArchivos.EscribirArchivo("clientes.txt",linea2);
    }
    
    /**
    * Método que devuelve el número de cédula del cliente.
    * @return Devuelve un String que indica el número de cédula del cliente.
    */
    protected String getcedula(){
        return cedula;
    }
    
    /**
    * Método que devuelve el número de tarjeta de crédito del cliente.
    * @return Devuelve un int que indica el número de tarjeta de crédito del cliente.
    */
    protected int  getnumtarjetaCredito(){
        return numtarjetaCredito;
    }
    
    /**
    * Método que crea un servicio de delivery de comida.
    * @author Melanie Peñaherrera
    * @author Dante Astudillo 
    */
    protected Delivery solicitarDelivery (){
        LocalDateTime fechaHora = LocalDateTime.now();
        int codigo = Servicio.generarCodServicio();
        int codigoPedido= Servicio.generarCodPedido
        double valorTotalPagar = 0;
        Pedido pedido = new Pedido();
        System.out.println("Bienvenido!! Elija un restaurante: ");
        ArrayList<String> listaRestaurante = ManejoArchivos.LeeFichero("restaurantes.txt");
        ArrayList<String> listaCodigo = new ArrayList();
        ArrayList<String> nombresRestaurantes = new ArrayList();
        int i = 0;
        for(String cadena : listaRestaurante){
            listaCodigo.add(cadena.split(",")[0]);
            System.out.println(i+".- "+cadena.split(",")[1]);// 1.-KFC
            nombresRestaurantes.add(cadena.split(",")[1]);
            i++;
        }
        System.out.println("Elija un numero: ");
        int numero = sc.nextInt();
        sc.nextLine();
        String nomRestaurante=nombresRestaurantes.get(numero);
        Restaurante restaurante=new Restaurante(listaCodigo.get(numero));
        boolean continuar = true;
        while(continuar){
            for (int o = 0 ; o<restaurante.getListadoPlatosDisponibles().size() ;o++){
                String nombreplatillo=restaurante.getListadoPlatosDisponibles().get(o);
                System.out.println(o+".- "+nombreplatillo);// 1.-Ambogueza
            }
            System.out.println("Elija el platillo: ");
            int indicelistaplatillo = sc.nextInt();
            sc.nextLine();
            String nombrePlato = restaurante.getListadoPlatosDisponibles().get(indicelistaplatillo);//
            Double precioPlato = restaurante.getListadoPreciosPlatos().get(indicelistaplatillo);
            Plato plato = new Plato(nombrePlato,precioPlato);
            valorTotalPagar += plato.precioxPlatos();
            pedido.agregarPlatos(plato);
            System.out.println("Desea continuar? (Si/No)");
            String confirmar = sc.nextLine();
            if("no".equalsIgnoreCase(confirmar)){
                continuar = false;
            } 
        }
        Delivery servicioDelivery = new Delivery(DELIVERY,fechaHora, codigo, pedido,codigoPedido);
        servicioDelivery.getPedido().setNombreRestaurante(nomRestaurante);
        servicioDelivery.getPedido.setCodigoRestaurant(listaCodigo.get(numero);)
        tipoPago tipoDePago = Pago.elegirTipoPago();
        servicioDelivery.calcularValorPagar(valorTotalPagar,tipoDePago);
        
        return serivicioDelivery;
    }
    
    /**
    * Método sobrescrito que muestra todos los servicios pedidos.
    * @author Melanie Peñaherrera
    */
    @Override
    protected void consultarServicio(){
        //ver servicios 
        for(Servicio serv : ServiciosPedidos){
            System.out.println("Tipo: "+serv.getTipo());
            if(serv instanceof Delivery){
                System.out.println("Restaurante: "+((Delivery) serv).getPedido().getNombreRestaurante());//imprimir restaurante
                System.out.println("Pedido: "+((Delivery) serv).getPedido().getNombresPedido());  
            } else if (serv instanceof Encomienda){
                System.out.println("Tipo encomienda: "+((Encomienda) serv).getTipoE());
                System.out.println("Cantidad: "+((Encomienda) serv).getCantidadProductos());
            }else if (serv instanceof Taxi){
                System.out.println("Cantidad de pasajeros: "+((Taxi) serv).getNumeroPasajeros());
            }
            System.out.println("Fecha - Hora: "+serv.getFechaHora());
            System.out.println("Desde: "+serv.getRuta().getOrigen());//ruta origen
            System.out.println("Hasta: "+serv.getRuta().getDestino());//ruta destino  
        }
    }
    
    /**
    * Método que crea un servicio de taxi.
    * @author Melanie Peñaherrera
    */
    protected Taxi solicitarTaxi(){
        System.out.println("Ingrese número de pasajeros: ");
        int numPasajeros = sc.nextInt();
        sc.nextLine();
        LocalDateTime fechaHora = LocalDateTime.now();//fecha y hora actual
        int codigo = Servicio.generarCodServicio();
        Taxi servicioTaxi = new Taxi(TAXI, fechaHora, codigo,numPasajeros);
        tipoPago tipoDePago = Pago.elegirTipoPago();
        servicioTaxi.calcularValorPagar(tipoDePago);
        return servicioTaxi;
    }
    /**
    * Método que crea un servicio de entrega de encomiendas.
    * @author Melanie Peñaherrera
    */
    protected void solicitarEncomienda(){
        System.out.println("Ingrese cantidad de productos: ");
        int cantProd = sc.nextInt();
        sc.nextLine();
        System.out.println("1.- DOCUMENTO\n2.- MEDICINA\n3.- DINERO_EFECTIVO \nIngrese tipo de encomienda : ");
        String tipoEncomienda = sc.nextLine();
        tipoEncomienda tipoE = null;
        switch (tipoEncomienda){
            case "1":
                tipoE = DOCUMENTOS;
                break;
            case "2":
                tipoE = MEDICINA;
                break;
            case "3":
                tipoE = DINERO_EFECTIVO;
                break;
        }
        LocalDateTime fechaHora = LocalDateTime.now();
        int codigo = Servicio.generarCodServicio();
        Encomienda servicioEncomienda = new Encomienda(ENCOMIENDA, fechaHora, codigo, cantProd, tipoE);
        tipoPago tipoDePago = Pago.elegirTipoPago();
        servicioEncomienda.calcularValorPagar(tipoDePago);
    }
}
