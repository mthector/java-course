package exercises.ventas;

import java.util.ArrayList;

public class Orden {
    private ArrayList<Producto> productos;
    private static int contadorProductos = 0;

    public Orden() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        ++contadorProductos;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("----- Orden -----");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
        System.out.println("Total: $" + calcularTotal());
        System.out.println("-----------------");
    }
}

