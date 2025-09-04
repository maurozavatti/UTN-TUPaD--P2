package tp.pkg4.poo;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    private static int contadorId = 1;

    // Constructor con todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor con nombre y puesto (ID automático y salario por defecto)
    public Empleado(String nombre, String puesto) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000; // valor por defecto
        totalEmpleados++;
    }

    // Sobrecarga actualizarSalario con porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    // Sobrecarga actualizarSalario con monto fijo
    public void actualizarSalario(int monto) {
        this.salario += monto;
    }

    // Método estático
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }
}

