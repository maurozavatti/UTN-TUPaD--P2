/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relaciones1a1.Ejercicio6;

/**
 *
 * @author Mauro
 */
public class ReservaMain {
        public static void main(String[] args) {
        Cliente cliente = new Cliente("Mauro Zavatti", "3412345678");
        Mesa mesa = new Mesa(5, 4);

        Reserva reserva = new Reserva("2025-09-15", "21:00", cliente, mesa);

        System.out.println(reserva);
        System.out.println("Reserva a nombre de: " + reserva.getCliente().getNombre());
    }
}
