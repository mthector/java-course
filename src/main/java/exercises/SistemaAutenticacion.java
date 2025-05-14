package exercises;

import java.util.Scanner;

public class SistemaAutenticacion {
    // Constantes con los valores correctos
    public static final String USUARIO_CORRECTO = "admin";
    public static final String PASSWORD_CORRECTO = "1234";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar usuario y contraseña
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        // Comparar y mostrar resultado
        boolean autenticado = usuario.equals(USUARIO_CORRECTO) && password.equals(PASSWORD_CORRECTO);
        System.out.println(autenticado); // Imprime true o false
    }
}
