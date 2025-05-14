package exercises;

public class DetallePersona {
    public static void main(String[] args) {
        // Declaración de variables con sus respectivos tipos de datos
        String nombreCompleto = "Juan Pérez";
        int edad = 28;
        double altura = 1.75; // en metros
        String paisOrigen = "México";
        char estadoCivil = 'S'; // 'C' = Casado, 'S' = Soltero

        // Mostrar la información
        System.out.println("=== Detalle de la Persona ===");
        System.out.println("Nombre Completo: " + nombreCompleto);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("País de Origen: " + paisOrigen);
        System.out.println("Estado Civil: " + (estadoCivil == 'C' ? "Casado" : "Soltero"));
    }
}

