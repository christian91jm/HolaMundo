/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada= new Scanner(System.in);
        String nombre;
        System.out.println("Introduce tu nombre en mayusculas:");
        nombre=entrada.next();
        System.out.println("Hola Mundo! Me llamo: "+nombre);
        System.out.println("Adios");
    }
    
}
