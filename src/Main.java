package src;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pokemon> pokemons = new ArrayList<>();

        pokemons.add(new ElectricPokemon("Pikachu", 0.4, 6.0, "pika pika", "mouse food", "static", "ground", 20, 75));
        pokemons.add(new ElectricPokemon("Zapdos", 1.6, 52.6, "zap zap", "bird food", "pressure", "ice and rock", 80, 160));
        pokemons.add(new FirePokemon("Charizard", 1.7, 90.5, "char char", "dragon food", "blaze", "water, electric and rock", 200, 800));
        pokemons.add(new FirePokemon("Arcanine", 1.9, 155.0, "ar ar", "tiger food", "flash fire", "water, ground and rock", 60, 215));
        pokemons.add(new WaterPokemon("Blastoise", 1.6, 85.5, "blas blas", "turtle food", "torrent", "grass and electric", 160, 320));
        pokemons.add(new WaterPokemon("Psyduck", 0.8, 19.6, "psy psy", "duck food", "cloud nine", "grass and electric", 20, 160));
        pokemons.add(new GrassPokemon("Venusaur", 2.0, 100, "venu venu", "pad food", "overgrow", "fire, psychic, flying and ice", 125, 415));
        pokemons.add(new GrassPokemon("Exeggutor", 2.0, 120.0, "exegu exegu", "tree food", "chlorophyll", "ghost, fire, ice, dark and poison", 85, 215));

        for (Pokemon pokemon : pokemons) {
            System.out.println("\nHere is all the information about " + pokemon.getName().toUpperCase() + ":");
            pokemon.weight();
            pokemon.height();
            pokemon.speaks();
            pokemon.eats();
            pokemon.ability();
            if (pokemon instanceof ElectricPokemon) {
                ((ElectricPokemon) pokemon).electroBall();
                ((ElectricPokemon) pokemon).voltTackle();
            } else if (pokemon instanceof FirePokemon) {
                ((FirePokemon) pokemon).flameThrower();
                ((FirePokemon) pokemon).pyroBall();
            } else if (pokemon instanceof WaterPokemon) {
                ((WaterPokemon) pokemon).surf();
                ((WaterPokemon) pokemon).hydroCanon();
            } else if (pokemon instanceof GrassPokemon) {
                ((GrassPokemon) pokemon).leafBlade();
                ((GrassPokemon) pokemon).leafStorm();
            }
            pokemon.weakness();
            System.out.println("-------------------------------------");
        }
    }
}
