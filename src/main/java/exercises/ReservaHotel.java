package exercises;

import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar información al usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el número de días de estancia: ");
        int dias = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("¿Desea un cuarto con vista al mar? (si/no): ");
        String vistaAlMar = scanner.nextLine().toLowerCase();

        // Tarifas
        double tarifaSinVista = 150.50;
        double tarifaConVista = 190.50;
        double costoTotal;

        boolean conVista = vistaAlMar.equals("si");

        // Calcular el costo total
        if (conVista) {
            costoTotal = dias * tarifaConVista;
        } else {
            costoTotal = dias * tarifaSinVista;
        }

        // Mostrar la información
        System.out.println("\n--- Detalles de la Reserva ---");
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Días de estadía: " + dias);
        System.out.println("Cuarto con vista al mar: " + (conVista ? "Sí" : "No"));
        System.out.printf("Costo total: $%.2f\n", costoTotal);

        scanner.close();
    }
}

