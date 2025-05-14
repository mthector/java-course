package exercises;

import java.util.Scanner;

public class ContadorImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el rango de números
        System.out.print("Ingresa el número inicial del rango: ");
        int inicio = scanner.nextInt();

        System.out.print("Ingresa el número final del rango: ");
        int fin = scanner.nextInt();

        int contador = 0;

        // Recorremos el rango y contamos los impares
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 != 0) {
                contador++;
            }
        }

        System.out.println("Cantidad de números impares en el rango: " + contador);
    }
}
