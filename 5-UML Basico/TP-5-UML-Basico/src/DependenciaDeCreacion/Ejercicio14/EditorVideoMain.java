/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DependenciaDeCreacion.Ejercicio14;

/**
 *
 * @author Mauro
 */
public class EditorVideoMain {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Documental Naturaleza", 120);

        EditorVideo editor = new EditorVideo();
        Render render = editor.exportar("MP4", proyecto);

        System.out.println(render);
    }
}
