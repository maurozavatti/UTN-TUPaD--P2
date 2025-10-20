package tp7.herencia.polimorfismo.Empleados;


import java.util.ArrayList;


public class EmpleadosMain {
    public static void main(String[] args) {

        // Crear lista de empleados
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Mauro", 250000));
        empleados.add(new EmpleadoTemporal("Valentina", 80, 1800));
        empleados.add(new EmpleadoPlanta("Francisco", 300000));
        empleados.add(new EmpleadoTemporal("Rodrigo", 60, 1500));

        // Mostrar sueldos usando polimorfismo
        for (Empleado e : empleados) {
            e.mostrarSueldo();

            // Clasificar con instanceof
            if (e instanceof EmpleadoPlanta) {
                System.out.println("→ Es un empleado de planta.\n");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("→ Es un empleado temporal.\n");
            }
        }
    }
}

