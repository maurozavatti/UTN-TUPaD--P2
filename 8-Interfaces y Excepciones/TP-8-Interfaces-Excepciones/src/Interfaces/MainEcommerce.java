package Interfaces;

public class MainEcommerce {
    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente("Mauro", "mauro@email.com");

            Pedido pedido = new Pedido(cliente);
            pedido.agregarProducto(new Producto("Mouse", 2500));
            pedido.agregarProducto(new Producto("Teclado", 4500));

            System.out.println(pedido);

            // Procesar pago con tarjeta
            PagoConDescuento pago = new TarjetaCredito("Mauro Zavatti");
            double totalConDescuento = pago.aplicarDescuento(pedido.calcularTotal());
            pago.procesarPago(totalConDescuento);

            // Cambiar estado del pedido
            pedido.cambiarEstado("Enviado");
            pedido.cambiarEstado("Entregado");

        } catch (PagoException e) {
            System.out.println("Error en el pago: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}
