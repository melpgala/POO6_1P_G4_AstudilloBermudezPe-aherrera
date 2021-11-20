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
import java.util.Scanner;
public class Ruta {
    private String origen;
    private String destino;
    private Scanner sc;
    
    private Ruta(){
        sc = new Scanner(System.in);
        System.out.println("Ingrese origen: ");
        origen = sc.nextLine();
        System.out.println("Ingrese destino: ");
        destino = sc.nextLine();
    }
}
