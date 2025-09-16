/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relaciones1a1.Ejercicio7;

/**
 *
 * @author Mauro
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;       // agregación
    private Conductor conductor; // asociación bidireccional

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
        if (conductor != null) conductor.setVehiculo(this); // mantener bidireccionalidad
    }

    @Override
    public String toString() {
        return "Vehiculo{patente='" + patente + "', modelo='" + modelo +
                "', motor=" + motor +
                ", conductor=" + (conductor != null ? conductor.toString() : "sin conductor") +
                '}';
    }
}
