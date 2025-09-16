/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DependenciaDeUso.Ejercicio11;

/**
 *
 * @author Mauro
 */
public class Reproductor {
    // Dependencia de uso: recibe Cancion como parámetro
    void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.titulo 
            + " de " + cancion.artista.nombre);
    }
}
