package tp.pkg2.prog.estructurada.zavatti;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        if (!input.hasNextDouble()) {
            System.out.println("Precio inválido.");
            input.close();
            return;
        }
        double precio = input.nextDouble();

        if (precio < 0) {
            System.out.println("El precio no puede ser negativo.");
            input.close();
            return;
        }

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String categoria = input.next().trim().toUpperCase();

        double descuento;
        switch (categoria) {
            case "A":
                descuento = 0.10;
                break;
            case "B":
                descuento = 0.15;
                break;
            case "C":
                descuento = 0.20;
                break;
            default:
                System.out.println("Categoría no válida. Use A, B o C.");
                input.close();
                return;
        }

        double montoDescuento = precio * descuento;
        double precioFinal = precio - montoDescuento;

        System.out.printf("Precio original: %.2f%n", precio);
        System.out.printf("Descuento aplicado: %d%%%n", (int) (descuento * 100));
        System.out.printf("Precio final: %.2f%n", precioFinal);

        input.close();
    }
}


