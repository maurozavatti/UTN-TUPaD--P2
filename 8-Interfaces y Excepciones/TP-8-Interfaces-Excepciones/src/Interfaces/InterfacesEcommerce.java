package Interfaces;


interface Pagable {
    double calcularTotal();
}


interface Pago {
    void procesarPago(double monto) throws Exception;
}


interface PagoConDescuento extends Pago {
    double aplicarDescuento(double monto);
}


interface Notificable {
    void notificar(String mensaje);
}

