package src;

public class ElectricPokemon extends Pokemon {
    // Variables
    private int voltTackle;
    private int electroBall;


    // Constructor
    public ElectricPokemon(String name, double height, double weight, String sound, String food, String ability, String weakness, int voltTackle, int electroBall) {
        super(name, height, weight, sound, food, ability, weakness);
        this.voltTackle = voltTackle;
        this.electroBall = electroBall;
    }

    // Methods
    public void voltTackle() {
        System.out.println(getName() + " does " + voltTackle + " damage with volt tackle;");
    }

    public void electroBall() {
        System.out.println(getName() + " does " + electroBall + " damage with electro ball;");
    }

    @Override
    public void ability() {
        System.out.println("An electric Pokémon like " + getName() + " uses his " + getAbility() + " for electric damage;");
    }

    @Override
    public void weakness() {
        System.out.println("The weakness of an electric Pokémon like " + getName() + " is: " + getWeakness() + ".");
    }

    // Getters & Setters
    public int getVoltTackle() {
        return voltTackle;
    }

    public void setVoltTackle(int voltTackle) {
        this.voltTackle = voltTackle;
    }

    public int getElectroBall() {
        return electroBall;
    }

    public void setElectroBall(int electroBall) {
        this.electroBall = electroBall;
    }
}
