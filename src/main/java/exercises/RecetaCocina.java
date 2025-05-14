package exercises;

import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar información al usuario
        System.out.print("Nombre de la receta: ");
        String nombreReceta = scanner.nextLine();

        System.out.print("Ingredientes principales: ");
        String ingredientes = scanner.nextLine();

        System.out.print("Tiempo de preparación (min): ");
        int tiempoPreparacion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Dificultad (Fácil, Media o Alta): ");
        String dificultad = scanner.nextLine();

        // Imprimir la receta
        System.out.println("\n=== Receta de Cocina ===");
        System.out.println("Nombre: " + nombreReceta);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Tiempo de preparación: " + tiempoPreparacion + " min");
        System.out.println("Dificultad: " + dificultad);
    }
}

