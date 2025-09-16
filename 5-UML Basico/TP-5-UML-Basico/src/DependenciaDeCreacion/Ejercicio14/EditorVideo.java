/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DependenciaDeCreacion.Ejercicio14;

/**
 *
 * @author Mauro
 */
public class EditorVideo {
    // Dependencia de creación: genera un objeto Render a partir de un Proyecto
    public Render exportar(String formato, Proyecto proyecto) {
        System.out.println("Exportando proyecto '" + proyecto + "' en formato " + formato);
        return new Render(formato, proyecto);
    }
}
