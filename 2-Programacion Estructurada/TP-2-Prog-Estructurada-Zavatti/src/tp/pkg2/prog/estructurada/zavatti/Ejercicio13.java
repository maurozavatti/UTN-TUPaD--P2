package tp.pkg2.prog.estructurada.zavatti;

public class Ejercicio13 {

    public static void main(String[] args) {
        // a. Declarar e inicializar un array con precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Mostrar precios originales usando recursión
        System.out.println("Precios originales:");
        imprimirArrayRecursivo(precios, 0);

        // c. Modificar un precio específico (ej: el tercer elemento -> índice 2)
        precios[2] = 129.99;

        // d. Mostrar precios modificados usando recursión
        System.out.println("Precios modificados:");
        imprimirArrayRecursivo(precios, 0);
    }

    // Función recursiva para mostrar precios
    public static void imprimirArrayRecursivo(double[] array, int indice) {
        // Caso base: si llegamos al final, terminamos
        if (indice >= array.length) {
            return;
        }
        // Mostrar el valor en la posición actual
        System.out.println("Precio: $" + array[indice]);
        // Llamada recursiva al siguiente índice
        imprimirArrayRecursivo(array, indice + 1);
    }
}

