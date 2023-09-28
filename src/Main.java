package src;

public class Main {
    public static void main(String[] args) {
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 0.4, 6.0, "pika pika", "mouse food", "static", "ground", 20, 75);

        System.out.println("\nHere is all the information about " + pikachu.getName().toUpperCase() + ":");
        pikachu.weight();
        pikachu.height();
        pikachu.speaks();
        pikachu.eats();
        pikachu.ability();
        pikachu.voltTackle();
        pikachu.electroBall();
        pikachu.weakness();
        System.out.println("------------------------------------------");
    }
}
