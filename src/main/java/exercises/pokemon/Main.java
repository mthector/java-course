package exercises.pokemon;

public class Main {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 10);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 12);
        PokemonPlanta bulbasaur = new PokemonPlanta("Bulbasaur", 11);

        System.out.println("--- Charmander ---");
        charmander.mostrarDatos();
        charmander.atacar();
        charmander.evolucionar();
        charmander.mostrarDatos();

        System.out.println("\n--- Squirtle ---");
        squirtle.mostrarDatos();
        squirtle.atacar();
        squirtle.evolucionar();
        squirtle.mostrarDatos();

        System.out.println("\n--- Bulbasaur ---");
        bulbasaur.mostrarDatos();
        bulbasaur.atacar();
        bulbasaur.evolucionar();
        bulbasaur.mostrarDatos();
    }
}
