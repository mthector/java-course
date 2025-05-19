package exercises.bombilla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bombilla bombilla = new Bombilla(60, "Blanco");

        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== MENÚ BOMBILLA ===");
            System.out.println("1. Encender bombilla");
            System.out.println("2. Apagar bombilla");
            System.out.println("3. Ver estado");
            System.out.println("4. Cambiar potencia");
            System.out.println("5. Ver potencia");
            System.out.println("6. Cambiar color");
            System.out.println("7. Ver color");
            System.out.println("8. Recargar horas");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = input.nextInt();
            input.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> bombilla.encender();
                case 2 -> bombilla.apagar();
                case 3 -> bombilla.ver_estado();
                case 4 -> {
                    System.out.print("Nueva potencia: ");
                    int nueva = input.nextInt();
                    bombilla.cambia_potencia(nueva);
                }
                case 5 -> bombilla.ver_potencia();
                case 6 -> {
                    System.out.print("Nuevo color: ");
                    String color = input.nextLine();
                    bombilla.cambia_color(color);
                }
                case 7 -> bombilla.ver_color();
                case 8 -> bombilla.recargar();
                case 9 -> {
                    salir = true;
                    System.out.println("👋 Saliendo del programa...");
                }
                default -> System.out.println("❗ Opción no válida.");
            }
        }

        input.close();
    }
}

