package Interfaces;


import java.util.ArrayList;
import java.util.List;

class Pedido implements Pagable {
    private List<Producto> productos;
    private String estado;
    private Notificable cliente; 

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("El estado de tu pedido cambió a: " + nuevoEstado);
    }

    @Override
    public String toString() {
        return "Pedido (" + estado + ") - Total: $" + calcularTotal();
    }
}

