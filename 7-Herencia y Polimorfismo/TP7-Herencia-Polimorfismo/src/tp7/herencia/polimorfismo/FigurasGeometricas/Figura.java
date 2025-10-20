
package tp7.herencia.polimorfismo.FigurasGeometricas;

abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto 
    public abstract double calcularArea();

    public void mostrarArea() {
        System.out.println("El área del " + nombre + " es: " + calcularArea());
    }
}
