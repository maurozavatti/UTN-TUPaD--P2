/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relaciones1a1.Ejercicio7;

/**
 *
 * @author Mauro
 */
public class VehiculoMain {
    public static void main(String[] args) {
        Motor motor = new Motor("Nafta", "SN-12345");
        Conductor conductor = new Conductor("Mauro Zavatti", "LIC-98765");

        Vehiculo vehiculo = new Vehiculo("AB123CD", "Toyota Corolla", motor, conductor);

        System.out.println(vehiculo);
        System.out.println("El vehículo de " + conductor.toString() + " es: " + conductor.getVehiculo());
    }
}
