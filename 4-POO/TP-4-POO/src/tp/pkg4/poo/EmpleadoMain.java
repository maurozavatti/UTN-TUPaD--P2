package tp.pkg4.poo;



public class EmpleadoMain {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(100, "Ana", "Gerente", 80000);
        Empleado e2 = new Empleado("Luis", "Programador");
        Empleado e3 = new Empleado("Carla", "Diseñadora");

        e2.actualizarSalario(10);   // aumento 10%
        e3.actualizarSalario(5000); // aumento fijo

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
    }
}

