
package tp.pkg2.prog.estructurada.zavatti;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        // Declaramos input para leer los datos
        Scanner input = new Scanner(System.in);
        int anio; 
        
        // Le pedimos el valor al usuario
        System.out.println("Ingrese un año para verficar si es bisiesto");
        anio = Integer.parseInt(input.nextLine());
        
        // Verificamos en el condicional para anio bisiesto.
        if((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)){
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
    }
    
}
