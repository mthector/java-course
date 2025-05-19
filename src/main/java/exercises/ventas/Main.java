package exercises.ventas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear productos disponibles
        ArrayList<Producto> catalogo = new ArrayList<>();
        catalogo.add(new Producto("Laptop", 1500.00));
        catalogo.add(new Producto("Audífonos", 300.00));
        catalogo.add(new Producto("Teclado", 450.00));
        catalogo.add(new Producto("Mouse", 200.00));
        catalogo.add(new Producto("Monitor", 800.00));

        boolean sistemaActivo = true;

        while (sistemaActivo) {
            Orden orden = new Orden();
            boolean ordenActiva = true;

            while (ordenActiva) {
                System.out.println("\n--- Catálogo de Productos ---");
                for (Producto producto : catalogo) {
                    System.out.println(producto.getIdProducto() + ". " + producto.getNombre() + " - $" + producto.getPrecio());
                }

                System.out.print("Ingrese el número del producto a agregar (0 para terminar orden): ");
                int opcion = scanner.nextInt();

                if (opcion == 0) {
                    ordenActiva = false;
                } else {
                    Producto seleccionado = null;
                    for (Producto producto : catalogo) {
                        if (producto.getIdProducto() == opcion) {
                            seleccionado = producto;
                            break;
                        }
                    }

                    if (seleccionado != null) {
                        orden.agregarProducto(seleccionado);
                        System.out.println("Producto agregado: " + seleccionado.getNombre());
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                }
            }

            orden.mostrarOrden();

            System.out.print("¿Deseas crear otra orden? (s/n): ");
            String respuesta = scanner.next();

            if (!respuesta.equalsIgnoreCase("s")) {
                sistemaActivo = false;
                System.out.println("Saliendo del sistema. ¡Gracias por tu compra!");
            }
        }

        scanner.close();

        System.out.println("Tienes en total " + Orden.getContadorProductos() + " Productos");
    }
}


