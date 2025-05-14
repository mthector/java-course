package exercises.pokemon;

public class PokemonAgua extends Pokemon {

    public PokemonAgua(String nombre, int nivel) {
        super(nombre, nivel, "Agua");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " usa pistola de agua.");
    }

    @Override
    public void evolucionar() {
        System.out.println(nombre + " está evolucionando...");
        nombre = "Wartortle";
        nivel += 5;
        System.out.println("¡Tu Pokémon ha evolucionado a " + nombre + "!");
    }
}
