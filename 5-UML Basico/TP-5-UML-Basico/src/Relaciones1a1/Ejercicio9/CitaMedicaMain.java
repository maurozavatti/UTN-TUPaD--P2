/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relaciones1a1.Ejercicio9;

/**
 *
 * @author Mauro
 */
public class CitaMedicaMain {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Mauro Zavatti", "OSDE");
        Profesional profesional = new Profesional("Dra. Laura Pérez", "Cardiología");

        CitaMedica cita = new CitaMedica("2025-09-20", "15:30", paciente, profesional);

        System.out.println(cita);
    }
}
