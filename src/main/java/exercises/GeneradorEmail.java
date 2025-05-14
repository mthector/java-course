package exercises;

public class GeneradorEmail {
    public static void main(String[] args) {
        // Datos de entrada
        String nombreCompleto = "Ubaldo Acosta Soto";
        String empresa = "Global Mentoring";
        String dominio = "com.mx";

        // Generar el email
        // Paso 1: convertir nombre a minúsculas y reemplazar espacios por puntos
        String nombreEmail = nombreCompleto.toLowerCase().replace(" ", ".");

        // Paso 2: quitar espacios y convertir el nombre de la empresa a minúsculas
        String empresaEmail = empresa.toLowerCase().replace(" ", "");

        // Paso 3: concatenar todo
        String email = nombreEmail + "@" + empresaEmail + "." + dominio;

        // Mostrar resultado
        System.out.println("Email generado: " + email);
    }
}

