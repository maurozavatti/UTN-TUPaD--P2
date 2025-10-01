
package Biblioteca;

import java.util.List;

public class Main {
     public static void main(String[] args) {
        // 1) Creamos una biblioteca
        Biblioteca biblio = new Biblioteca("Biblioteca Central");

        // 2) Crear al menos tres autores
        Autor a1 = new Autor("A001", "Julio Cortázar", "Argentina");
        Autor a2 = new Autor("A002", "Ursula K. Le Guin", "Estados Unidos");
        Autor a3 = new Autor("A003", "Gabriel García Márquez", "Colombia");

        // 3) Agregar 5 libros asociados a alguno de los Autores a la biblioteca
        biblio.agregarLibro("ISBN-001", "Rayuela", 1963, a1);
        biblio.agregarLibro("ISBN-002", "Bestiario", 1951, a1);
        biblio.agregarLibro("ISBN-003", "Los desposeídos", 1974, a2);
        biblio.agregarLibro("ISBN-004", "La mano izquierda de la oscuridad", 1969, a2);
        biblio.agregarLibro("ISBN-005", "Cien años de soledad", 1967, a3);

        // 4) Listar todos los libros con su información y la del autor
        System.out.println("\n-- 4) Listado de libros --");
        biblio.listarLibros();

        // 5) Buscar un libro por su ISBN y mostrar su información
        System.out.println("\n-- 5) Buscar por ISBN 'ISBN-003' --");
        Libro buscado = biblio.buscarLibroPorIsbn("ISBN-003");
        System.out.println(buscado != null ? buscado : "No encontrado");

        // 6) Filtrar y mostrar los libros publicados en un año específico
        System.out.println("\n-- 6) Libros de 1969 --");
        List<Libro> de1969 = biblio.filtrarLibrosPorAnio(1969);
        if (de1969.isEmpty()) System.out.println("(Sin resultados)");
        else de1969.forEach(System.out::println);

        // 7) Eliminar un libro por su ISBN y listar los libros restantes
        System.out.println("\n-- 7) Eliminar ISBN 'ISBN-002' --");
        boolean eliminado = biblio.eliminarLibro("ISBN-002");
        System.out.println(eliminado ? "Eliminado OK" : "No se encontró el libro");
        System.out.println("Libros restantes:");
        biblio.listarLibros();

        // 8) Mostrar la cantidad total de libros en la biblioteca
        System.out.println("\n-- 8) Cantidad total de libros --");
        System.out.println(biblio.obtenerCantidadLibros());

        // 9) Listar todos los autores de los libros disponibles en la biblioteca
        System.out.println("\n-- 9) Autores disponibles --");
        biblio.mostrarAutoresDisponibles();
    }
}
