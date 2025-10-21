package Interfaces;

// Excepción personalizada
class PagoException extends Exception {
    public PagoException(String mensaje) {
        super(mensaje);
    }
}
