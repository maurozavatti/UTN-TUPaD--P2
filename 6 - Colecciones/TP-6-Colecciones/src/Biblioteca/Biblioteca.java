
package Biblioteca;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // COMPOSICIÓN: la biblioteca crea el Libro y lo guarda internamente
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("(No hay libros en la biblioteca)");
            return;
        }
        libros.forEach(Libro::mostrarInfo);
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) return l;
        }
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        return libros.removeIf(l -> l.getIsbn().equalsIgnoreCase(isbn));
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        return libros.stream()
                .filter(l -> l.getAnioPublicacion() == anio)
                .collect(Collectors.toList());
    }

    public void mostrarAutoresDisponibles() {
        if (libros.isEmpty()) {
            System.out.println("(No hay autores: la biblioteca no tiene libros)");
            return;
        }
        // Set para evitar autores repetidos manteniendo orden de aparición
        Set<Autor> autores = new LinkedHashSet<>();
        for (Libro l : libros) autores.add(l.getAutor());
        autores.forEach(Autor::mostrarInfo);
    }

    @Override
    public String toString() {
        return "Biblioteca{nombre='" + nombre + "', libros=" + libros.size() + "}";
    }
}
