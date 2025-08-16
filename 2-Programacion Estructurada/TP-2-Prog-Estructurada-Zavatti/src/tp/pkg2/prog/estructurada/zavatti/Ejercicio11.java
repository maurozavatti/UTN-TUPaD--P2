package tp.pkg2.prog.estructurada.zavatti;

import java.util.Scanner;

public class Ejercicio11 {

    // Variable global (estática)
    static double DESCUENTO_ESPECIAL = 0.10; // 10%

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();

        // Llamar al método
        calcularDescuentoEspecial(precio);
    }

    // Método que calcula el descuento usando la variable global
    public static void calcularDescuentoEspecial(double precio) {
        // Variable local
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;

        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}



