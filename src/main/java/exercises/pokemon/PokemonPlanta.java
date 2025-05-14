package exercises.pokemon;

public class PokemonPlanta extends Pokemon {

    public PokemonPlanta(String nombre, int nivel) {
        super(nombre, nivel, "Planta");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " usa látigo cepa.");
    }

    @Override
    public void evolucionar() {
        System.out.println(nombre + " está evolucionando...");
        nombre = "Ivysaur";
        nivel += 5;
        System.out.println("¡Tu Pokémon ha evolucionado a " + nombre + "!");
    }
}
