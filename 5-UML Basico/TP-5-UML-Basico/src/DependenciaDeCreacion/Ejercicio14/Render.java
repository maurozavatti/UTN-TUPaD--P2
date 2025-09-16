/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DependenciaDeCreacion.Ejercicio14;

/**
 *
 * @author Mauro
 */
public class Render {
    private String formato;
    private Proyecto proyecto; // asociación unidireccional

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "Render{formato='" + formato + "', proyecto=" + proyecto + "}";
    }
}
