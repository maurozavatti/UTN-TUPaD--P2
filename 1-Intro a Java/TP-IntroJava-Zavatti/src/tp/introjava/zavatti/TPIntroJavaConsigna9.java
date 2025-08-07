/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.introjava.zavatti;

import java.util.Scanner;

/**
 *
 * @author Mauro
 */
public class TPIntroJavaConsigna9 {
    public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa tu nombre: "); 
    // String nombre = scanner.nextInt(); // ERROR 
    String nombre = scanner.nextLine(); // CORRECTO
    System.out.println("Hola, " + nombre); 
    }
}
