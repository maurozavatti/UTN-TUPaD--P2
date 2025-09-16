/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relaciones1a1.Ejercicio5;

/**
 *
 * @author Mauro
 */
public class ComputadoraMain {
     public static void main(String[] args) {
        Propietario propietario = new Propietario("Mauro Zavatti", "40545665");

        Computadora compu = new Computadora(
                "Lenovo",
                "SN123456789",
                "B450M-A",
                "AMD B450",
                propietario
        );

        System.out.println(compu);
        System.out.println("La computadora pertenece a: " + propietario.getNombre());
        System.out.println("Placa madre: " + compu.getPlacaMadre().getModelo());
    }
}
