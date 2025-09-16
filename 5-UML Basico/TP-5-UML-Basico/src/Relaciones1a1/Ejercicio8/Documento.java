/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relaciones1a1.Ejercicio8;

/**
 *
 * @author Mauro
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; // composición

    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario); // composición
    }

    @Override
    public String toString() {
        return "Documento{titulo='" + titulo + "', contenido='" + contenido +
                "', firmaDigital=" + firmaDigital + "}";
    }
}
