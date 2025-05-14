package exercises;

import java.util.Scanner;

public class CasaDeLosEspejos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar edad
        System.out.print("¿Cuántos años tienes?: ");
        int edad = scanner.nextInt();

        // Limpiar el buffer
        scanner.nextLine();

        // Preguntar si le da miedo la oscuridad
        System.out.print("¿Te da miedo la oscuridad? (si/no): ");
        String miedoOscuridad = scanner.nextLine().toLowerCase();

        // Evaluar condiciones
        boolean tieneMiedo = miedoOscuridad.equals("si");

        // Aplicando lógica inversa con el operador NOT
        if (!(edad <= 10 || tieneMiedo)) {
            System.out.println("¡Puedes entrar a la casa de los espejos!");
        } else {
            System.out.println("No puedes entrar a la casa de los espejos.");
        }

        scanner.close();
    }
}

