
package tp.pkg2.prog.estructurada.zavatti;

import java.util.Scanner;


public class Ejercicio3 {
        public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        int edad; 
        String etapaVida = "";
        
        // Le pedimos al usuario que ingrese su edad.
        System.out.println("Ingrese su edad:");
        edad = Integer.parseInt(input.nextLine());
        
        if(edad < 12) {
            etapaVida = "Niño";
        } else if (edad >= 12 && edad <= 17) {
            etapaVida = "Adolescente";
        } else if (edad >= 18 && edad <= 59) {
            etapaVida = "Adulto";
        } else if (edad >= 60 ) {
            etapaVida = "Adulto mayor";
        } 
            
        System.out.println("Eres un " + etapaVida);
    }
}
