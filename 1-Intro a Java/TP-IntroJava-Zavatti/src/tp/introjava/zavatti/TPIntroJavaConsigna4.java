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
public class TPIntroJavaConsigna4 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String nombre;
        int edad;
        
        System.out.println("Ingresa tu nombre: ");
        nombre = input.nextLine();
        
        System.out.println("Ingresa tu edad: ");
        edad = input.nextInt();
        
        System.out.println(nombre + " tiene " + edad + " años");
        
        
        
    }
}
