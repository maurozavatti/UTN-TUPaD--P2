/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relaciones1a1.Ejercicio4;

import java.time.LocalDate;
/**
 *
 * @author Mauro
 */
public class TarjetaDeCreditoMain {
        public static void main(String[] args) {
        Banco banco = new Banco("Banco Nación", "30-12345678-9");
        Cliente cliente = new Cliente("Mauro Zavatti", "40545665");

        TarjetaDeCredito tarjeta = new TarjetaDeCredito(
                "1234-5678-9876-5432",
                LocalDate.of(2027, 5, 31),
                cliente,
                banco
        );

        System.out.println(tarjeta);
        System.out.println("La tarjeta de " + cliente.getNombre() + " pertenece a: " + cliente.getTarjeta().getNumero());
    }
}
