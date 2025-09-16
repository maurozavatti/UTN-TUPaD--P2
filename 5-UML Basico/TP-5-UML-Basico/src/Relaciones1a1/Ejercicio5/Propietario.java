/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relaciones1a1.Ejercicio5;

/**
 *
 * @author Mauro
 */
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; // asociación bidireccional

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public Computadora getComputadora() { return computadora; }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public String toString() {
        return "Propietario{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}
