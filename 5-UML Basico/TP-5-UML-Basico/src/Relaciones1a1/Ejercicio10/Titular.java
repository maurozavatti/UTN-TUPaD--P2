/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relaciones1a1.Ejercicio10;

/**
 *
 * @author Mauro
 */
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; // asociación bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    @Override
    public String toString() {
        return "Titular{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}
