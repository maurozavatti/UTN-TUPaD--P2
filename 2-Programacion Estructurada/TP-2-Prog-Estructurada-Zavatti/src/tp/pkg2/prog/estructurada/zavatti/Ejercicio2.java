
package tp.pkg2.prog.estructurada.zavatti;

import java.util.Scanner;


public class Ejercicio2 {
    
        public static void main(String[] args) {
        // Declaramos input para leer los datos
        Scanner input = new Scanner(System.in);
        
        // Declaramos variables
        int numUno, numDos, numTres, mayor;
        
        // Le pedimos los numeros al usuario
        System.out.println("Ingrese 3 numeros");
        System.out.println("Primer numero: ");
        numUno = Integer.parseInt(input.nextLine()); 
        System.out.println("Segundo numero: ");
        numDos = Integer.parseInt(input.nextLine()); 
        System.out.println("Tercer numero: ");
        numTres = Integer.parseInt(input.nextLine()); 
        
        mayor = numUno; // Iniciliamos mayor igualandolo a numUno

        if (numDos > mayor) { // Vericamos si numDos es mayor se guarda su valor
            mayor = numDos;
        } 
        if (numTres > mayor) { // En el caso que num3 sea mayor se guarda su valor 
            mayor = numTres;
        }
        
        // Mostramos al mayor
        System.out.println("El mayor es: " + mayor);
}
        
}