package exercises;

import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int numeroSecreto = rand.nextInt(10) + 1; // número entre 1 y 10
        int intentosMaximos = 3;
        int intentos = 0;
        boolean adivinado = false;

        System.out.println("¡Bienvenido al juego de adivinanzas!");
        System.out.println("Adivina el número entre 1 y 10. Solo tienes 3 intentos.");

        while (intentos < intentosMaximos && !adivinado) {
            System.out.print("Intento " + (intentos + 1) + ": Ingresa tu número: ");
            int intento = scanner.nextInt();
            intentos++;

            if (intento == numeroSecreto) {
                System.out.println("¡Felicidades! Adivinaste el número secreto en " + intentos + " intentos.");
                adivinado = true;
            } else if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else {
                System.out.println("El número secreto es menor.");
            }
        }

        if (!adivinado) {
            System.out.println("Se acabaron los intentos. El número secreto era: " + numeroSecreto);
        }
    }
}
