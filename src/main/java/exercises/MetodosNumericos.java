package exercises;

import java.util.Scanner;

public class MetodosNumericos {
    // Método recursivo para calcular el factorial
    public static long factorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursivo(n - 1);
        }
    }

    // Método iterativo para calcular el factorial
    public static long factorialIterativo(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero para calcular su factorial: ");
        int numero = scanner.nextInt();

        // Validación opcional (número no negativo)
        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            long resultadoRecursivo = factorialRecursivo(numero);
            long resultadoIterativo = factorialIterativo(numero);

            System.out.println("Factorial recursivo de " + numero + " es: " + resultadoRecursivo);
            System.out.println("Factorial iterativo de " + numero + " es: " + resultadoIterativo);
        }

        scanner.close();
    }
}