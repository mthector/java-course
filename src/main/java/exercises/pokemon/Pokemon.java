package exercises.pokemon;

public class Pokemon {
    protected String nombre;
    protected int nivel;
    protected String tipo;

    public Pokemon(String nombre, int nivel, String tipo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.tipo = tipo;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Tipo: " + tipo);
    }

    public void atacar() {
        System.out.println(nombre + " realiza un ataque básico.");
    }

    public void evolucionar() {
        System.out.println(nombre + " está evolucionando...");
        // Este método será sobrescrito en las subclases
    }
}
