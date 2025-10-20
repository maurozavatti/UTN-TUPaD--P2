
package tp7.herencia.polimorfismo.FigurasGeometricas;


public class FGeoMain {
    public static void main(String[] args) {
        // Array 
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo(5.0);
        figuras[1] = new Rectangulo(4.0, 6.0);
        figuras[2] = new Circulo(2.5);

        
        for (Figura f : figuras) {
            f.mostrarArea();  // Cada figura usa su propio método calcularArea()
        }
}
}