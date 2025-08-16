package tp.pkg2.prog.estructurada.zavatti;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int sumaPares = 0;

        System.out.print("Ingrese un número (0 para terminar): ");
        numero = input.nextInt();

        // mientras no se ingrese 0 sigue pidiendo números
        while (numero != 0) {
            if (numero % 2 == 0) {  // si es par
                sumaPares += numero;
            }

            System.out.print("Ingrese un número (0 para terminar): ");
            numero = input.nextInt();
        }

        System.out.println("La suma de los números pares es: " + sumaPares);

        input.close();
    }
}

