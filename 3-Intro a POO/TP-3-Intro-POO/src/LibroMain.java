
public class LibroMain {
    public static void main(String[] args) {
        Libro libro = new Libro();
        
        libro.setTitulo("El Quijote");
        libro.setAutor("Miguel de Cervantes");
        libro.setAnioPublicacion(1605);
        
        
        libro.mostrarInfo();
        
        
        // le paso un año invalido
        libro.setAnioPublicacion(1200);
        
        //le paso un año valido
        libro.setAnioPublicacion(2005);
        
        System.out.println("\nInformación final del libro:");
        libro.mostrarInfo();
        
    }
}
