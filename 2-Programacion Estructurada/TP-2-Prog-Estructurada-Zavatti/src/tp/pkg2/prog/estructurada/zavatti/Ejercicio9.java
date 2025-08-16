package tp.pkg2.prog.estructurada.zavatti;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = input.nextDouble();

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = input.next().toLowerCase(); // lo paso a minúscula 

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }

    // Método a: calcular costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio = 0;
        if(zona.equals("nacional")){   //aca tambien se podria usar un switch en lugar de un if / else
            costoEnvio = peso * 5;
        } else if (zona.equals("internacional")){
            costoEnvio = peso * 10;
        }
        
        return costoEnvio;
    }

    // Método b: calcular total de compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}



