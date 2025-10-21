
package Excepciones;

// EdadInvalida usa esta clase
public class TestEdadInvalida {
    public static void main(String[] args) {
        try {
            validarEdad(-5);
        } catch (EdadInvalidaException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120 años.");
        } else {
            System.out.println("Edad válida: " + edad);
        }
    }
}
