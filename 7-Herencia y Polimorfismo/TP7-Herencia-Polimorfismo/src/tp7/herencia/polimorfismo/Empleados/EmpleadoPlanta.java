package tp7.herencia.polimorfismo.Empleados;

public class EmpleadoPlanta extends Empleado {
    private double sueldoMensual;

    public EmpleadoPlanta(String nombre, double sueldoMensual) {
        super(nombre);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo() {
        return sueldoMensual;
    }
}
