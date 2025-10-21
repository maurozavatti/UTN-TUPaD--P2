package Interfaces;

class TarjetaCredito implements PagoConDescuento {
    private String titular;

    public TarjetaCredito(String titular) {
        this.titular = titular;
    }

    @Override
    public double aplicarDescuento(double monto) {
        // 10% de descuento
        return monto * 0.9;
    }

    @Override
    public void procesarPago(double monto) throws PagoException {
        if (monto <= 0) {
            throw new PagoException("El monto debe ser mayor que 0.");
        }
        System.out.println("Pago de $" + monto + " procesado con Tarjeta de " + titular);
    }
}