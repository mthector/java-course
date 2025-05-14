package exercises;

import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar calificación
        System.out.print("Ingrese la calificación (0-10): ");
        double calificacion = scanner.nextDouble();

        // Convertimos a entero para usar en switch
        int califEntero = (int) calificacion;

        // Validación
        if (califEntero < 0 || califEntero > 10) {
            System.out.println("Calificación inválida. Debe estar entre 0 y 10.");
            return;
        }

        // Evaluar con switch
        switch (califEntero) {
            case 10:
            case 9:
                System.out.println("Calificación: A");
                break;
            case 8:
                System.out.println("Calificación: B");
                break;
            case 7:
                System.out.println("Calificación: C");
                break;
            case 6:
                System.out.println("Calificación: D");
                break;
            case 5:
                System.out.println("Calificación: E");
                break;
            default: // 0-4
                System.out.println("Calificación: F");
                break;
        }
    }
}