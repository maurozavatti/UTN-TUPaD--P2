/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relaciones1a1.Ejercicio8;

/**
 *
 * @author Mauro
 */
public class DocumentoMain {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Mauro Zavatti", "mauro@mail.com");

        Documento doc = new Documento(
                "Contrato de Servicio",
                "Contenido del contrato...",
                "HASH123ABC",
                "2025-09-15",
                usuario
        );

        System.out.println(doc);
    }
}
