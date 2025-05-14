package exercises.pokemon;

public class PokemonFuego extends Pokemon {

    public PokemonFuego(String nombre, int nivel) {
        super(nombre, nivel, "Fuego");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " lanza una llamarada.");
    }

    @Override
    public void evolucionar() {
        System.out.println(nombre + " está evolucionando...");
        nombre = "Charmeleon";
        nivel += 5;
        System.out.println("¡Tu Pokémon ha evolucionado a " + nombre + "!");
    }
}