
package tp7.herencia.polimorfismo.Empleados;

public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto (debe implementarse en las subclases)
    public abstract double calcularSueldo();

    public void mostrarSueldo() {
        System.out.println(nombre + " gana $" + calcularSueldo());
    }
}