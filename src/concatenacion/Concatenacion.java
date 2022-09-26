/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatenacion;

import java.util.Scanner;

/**
 *
 * @author Martín
 */
public class Concatenacion {
    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre="";
        String apellido="";
        System.out.print("Cual es su nombre:  ");
        nombre = entrada.nextLine();
        System.out.println("Cual es su apellido:");
        apellido = entrada.nextLine();
        
        System.out.println(nombre+" "+apellido);
    }
    
}
