package exercises.persona;

public class PruebaPersona {
    public static void main(String[] args) {
        // Crear objeto Persona
        Persona persona1 = new Persona("Ubaldo", "Soto");

        // Mostrar nombre completo
        System.out.println("Nombre completo: " + persona1.getInformacionCompleta());

        // Modificar datos
        persona1.setNombre("Carlos");
        persona1.setApellido("Ramírez");

        // Verificar cambios
        System.out.println("Nombre actualizado: " + persona1.getInformacionCompleta());
    }
}

