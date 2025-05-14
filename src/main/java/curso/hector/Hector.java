package curso.hector;

import java.util.Scanner;
public class Hector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el nombre
        System.out.print("¿Cómo te llamas? ");
        String nombre = scanner.nextLine();

        // Pedir la edad
        System.out.print("¿Cuántos años tienes? ");
        int edad = scanner.nextInt();

        // Mostrar mensaje personalizado
        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años. ¡Bienvenido a Java!");

        scanner.close();
    }
}
