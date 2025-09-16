/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relaciones1a1.Ejercicio10;

/**
 *
 * @author Mauro
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; // composición
    private Titular titular;                // asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion); // composición
        this.titular = titular;
        if (titular != null) titular.setCuenta(this);     // mantener bidireccionalidad
    }

    @Override
    public String toString() {
        return "CuentaBancaria{cbu='" + cbu + "', saldo=" + saldo +
                ", claveSeguridad=" + claveSeguridad +
                ", titular=" + (titular != null ? titular.toString() : "sin titular") +
                '}';
    }
}
