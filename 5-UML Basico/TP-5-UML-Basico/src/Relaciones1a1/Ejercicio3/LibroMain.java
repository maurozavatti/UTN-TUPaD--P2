/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relaciones1a1.Ejercicio3;

/**
 *
 * @author Mauro
 */
public class LibroMain {
        public static void main(String[] args) {
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiana");
        Editorial editorial1 = new Editorial("Sudamericana", "Buenos Aires");

        Libro libro1 = new Libro("Cien Años de Soledad", "978-987-1138", autor1, editorial1);

        System.out.println(libro1);
    }
}
