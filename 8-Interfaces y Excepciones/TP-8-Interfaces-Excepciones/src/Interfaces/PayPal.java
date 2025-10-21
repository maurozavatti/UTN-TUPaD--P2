package Interfaces;

class PayPal implements PagoConDescuento {
    private String usuario;

    public PayPal(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public double aplicarDescuento(double monto) {
        // 5% de descuento
        return monto * 0.95;
    }

    @Override
    public void procesarPago(double monto) throws PagoException {
        if (monto <= 0) {
            throw new PagoException("El monto debe ser mayor que 0.");
        }
        System.out.println("Pago de $" + monto + " procesado vía PayPal (" + usuario + ")");
    }
}