package exercises;

import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas notas vas a introducir? ");
        int cantidadNotas = scanner.nextInt();

        double[] notas = new double[cantidadNotas];
        double suma = 0;

        // Leer notas y guardarlas en el array
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Introduce la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            suma += notas[i];
        }

        // Calcular el promedio usando notas.length
        double promedio = suma / notas.length;
        System.out.println("El promedio de las notas es: " + promedio);
    }
}