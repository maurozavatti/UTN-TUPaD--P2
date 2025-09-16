/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relaciones1a1.Ejercicio9;

/**
 *
 * @author Mauro
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;       // asociación unidireccional
    private Profesional profesional; // asociación unidireccional

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        return "CitaMedica{fecha='" + fecha + "', hora='" + hora +
                "', paciente=" + paciente +
                ", profesional=" + profesional + "}";
    }
}
