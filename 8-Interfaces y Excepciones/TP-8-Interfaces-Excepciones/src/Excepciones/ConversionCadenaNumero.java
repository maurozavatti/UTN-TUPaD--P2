
package Excepciones;

import java.util.Scanner;

public class ConversionCadenaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número en texto: ");
        String entrada = sc.nextLine();

        try {
            int numero = Integer.parseInt(entrada); // puede lanzar NumberFormatException
            System.out.println("Número convertido correctamente: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: el texto ingresado no es un número válido.");
        }
    }
}

