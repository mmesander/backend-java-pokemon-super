package src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pokemon> pokemons = new ArrayList<>();

        pokemons.add(new ElectricPokemon("Pikachu", 0.4, 6.0, "pika pika", "mouse food", "static", "ground", 20, 75));
        pokemons.add(new ElectricPokemon("Zapdos", 1.6, 52.6, "zap zap", "bird food", "pressure", "ice and rock", 80, 160));
        pokemons.add(new FirePokemon("Charizard", 1.7, 90.5, "char char", "dragon food", "blaze", "water, electric and rock", 200, 800));
        pokemons.add(new FirePokemon("Arcanine", 1.9, 155.0, "ar ar", "tiger food", "flash fire", "water, ground and rock", 60, 215));

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
            }
            pokemon.weakness();
            System.out.println("-------------------------------------");
        }


    }
}
