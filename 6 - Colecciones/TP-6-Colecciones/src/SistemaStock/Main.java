
package SistemaStock;

public class Main {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        // 1) Crear 5 productos y agregarlos
        inv.agregarProducto(new Producto("P001", "Leche entera 1L", 1200, 30, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P002", "Auriculares BT", 8500, 12, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P003", "Remera básica", 3500, 40, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("P004", "Tostadora", 22000, 8, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("P005", "Yerba 1Kg", 2800, 25, CategoriaProducto.ALIMENTOS));

        // 2) Listar todos los productos
        System.out.println("\n-- 2) Listado de productos --");
        inv.listarProductos();

        // 3) Buscar un producto por ID
        System.out.println("\n-- 3) Buscar producto por ID 'P003' --");
        Producto buscado = inv.buscarProductoPorId("P003");
        System.out.println(buscado != null ? buscado : "No encontrado");

        // 4) Filtrar por categoría
        System.out.println("\n-- 4) Filtrar por categoría ALIMENTOS --");
        inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS).forEach(System.out::println);

        // 5) Eliminar un producto por ID y listar restantes
        System.out.println("\n-- 5) Eliminar producto ID 'P002' --");
        boolean eliminado = inv.eliminarProducto("P002");
        System.out.println(eliminado ? "Eliminado OK" : "No se encontró el producto");
        System.out.println("Inventario tras eliminación:");
        inv.listarProductos();

        // 6) Actualizar stock de un producto existente
        System.out.println("\n-- 6) Actualizar stock de 'P001' a 50 --");
        boolean actualizado = inv.actualizarStock("P001", 50);
        System.out.println(actualizado ? "Stock actualizado" : "Producto no encontrado");
        System.out.println(inv.buscarProductoPorId("P001"));

        // 7) Mostrar total de stock disponible
        System.out.println("\n-- 7) Total de stock disponible --");
        System.out.println(inv.obtenerTotalStock());

        // 8) Producto con mayor stock
        System.out.println("\n-- 8) Producto con mayor stock --");
        Producto mayor = inv.obtenerProductoConMayorStock();
        System.out.println(mayor != null ? mayor : "Inventario vacío");

        // 9) Filtrar productos por precio entre $1000 y $3000
        System.out.println("\n-- 9) Productos con precio entre $1000 y $3000 --");
        inv.filtrarProductosPorPrecio(1000, 3000).forEach(System.out::println);

        // 10) Mostrar categorías disponibles con descripciones
        System.out.println("\n-- 10) Categorías disponibles --");
        inv.mostrarCategoriasDisponibles();
    }
}
