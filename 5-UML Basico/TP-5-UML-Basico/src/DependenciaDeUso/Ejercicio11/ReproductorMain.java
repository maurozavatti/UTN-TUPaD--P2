/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DependenciaDeUso.Ejercicio11;

/**
 *
 * @author Mauro
 */
public class ReproductorMain {
    public static void main(String[] args) {
        Artista artista = new Artista();
        artista.nombre = "Babasonicos";
        artista.genero = "Rock alternativo";

        Cancion cancion = new Cancion();
        cancion.titulo = "Posecion del Tercer Tipo";
        cancion.artista = artista;

        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
    }
}
