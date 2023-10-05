package src;

public class GrassPokemon extends Pokemon {
    // Variables
    private int leafBlade;
    private int leafStorm;


    // Constructor
    public GrassPokemon(String name, double height, double weight, String sound, String food, String ability, String weakness, int leafBlade, int leafStorm) {
        super(name, height, weight, sound, food, ability, weakness);
        this.leafBlade = leafBlade;
        this.leafStorm = leafStorm;
    }


    // Methods
    public void leafBlade() {
        System.out.println(getName() + " does " + leafBlade + " damage with leaf blade;");
    }

    public void leafStorm(){
        System.out.println(getName() + " does " + leafStorm + " damage with leaf storm;");
    }

    @Override
    public void ability() {
        System.out.println("An grass Pokémon like " + getName() + " uses his " + getAbility() + " for grass damage;");
    }

    @Override
    public void weakness() {
        System.out.println("The weakness of an grass Pokémon like " + getName() + " is: " + getWeakness() + ".");
    }


    // Getters & Setters
    public int getLeafBlade() {
        return leafBlade;
    }

    public void setLeafBlade(int leafBlade) {
        this.leafBlade = leafBlade;
    }

    public int getLeafStorm() {
        return leafStorm;
    }

    public void setLeafStorm(int leafStorm) {
        this.leafStorm = leafStorm;
    }
}
