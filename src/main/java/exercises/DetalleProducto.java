package exercises;

public class DetalleProducto {
    public static void main(String[] args) {
        // Declaración de variables con valores iniciales (prueba)
        String nombreProducto = "Laptop Gamer";
        double precio = 18999.99;
        int cantidadDisponible = 15;
        boolean disponibleParaVenta = true;

        // Imprimir valores iniciales
        System.out.println("=== Detalle del Producto (Inicial) ===");
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad disponible: " + cantidadDisponible);
        System.out.println("¿Disponible para venta?: " + (disponibleParaVenta ? "Sí" : "No"));

        // Modificar valores con nuevos datos
        nombreProducto = "Smartphone";
        precio = 7499.50;
        cantidadDisponible = 30;
        disponibleParaVenta = false;

        // Imprimir valores modificados
        System.out.println("\n=== Detalle del Producto (Modificado) ===");
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad disponible: " + cantidadDisponible);
        System.out.println("¿Disponible para venta?: " + (disponibleParaVenta ? "Sí" : "No"));
    }
}

