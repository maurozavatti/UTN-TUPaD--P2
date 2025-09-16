/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relaciones1a1.Ejercicio10;

/**
 *
 * @author Mauro
 */
public class CuentaBancariaMain {
    public static void main(String[] args) {
        Titular titular = new Titular("Mauro Zavatti", "40545665");

        CuentaBancaria cuenta = new CuentaBancaria(
                "1234567890001112223334",
                150000.50,
                "SEG-98765",
                "2025-09-15",
                titular
        );

        System.out.println(cuenta);
        System.out.println("La cuenta de " + titular + " es: " + titular.getCuenta());
    }
}
