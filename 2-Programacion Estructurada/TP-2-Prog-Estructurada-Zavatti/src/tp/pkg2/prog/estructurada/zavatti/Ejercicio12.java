
package tp.pkg2.prog.estructurada.zavatti;

public class Ejercicio12 {
        public static void main(String[] args) {
        // Declaramos el array de precios y le asignamos valores a cada posicion
        double[] precioProducto = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // Mostramos los precios originales recorriendo el array con un for-each
        System.out.println("Precios originales: ");
        for(double precio : precioProducto){
            System.out.println("Precio: " + precio);
        }
        
        //  Modificamos el precio de la posicion 4
        precioProducto[4] = 129.99;
        
        // Mostramos los precios modificados recorriendo el array con un for-each
        System.out.println("Precios modificados: ");
        for(double precio : precioProducto){
            System.out.println("Precio: " + precio);
        }
    }
}
