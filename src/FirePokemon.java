package src;

public class FirePokemon extends Pokemon {
    // Variables
    private int flameThrower;
    private int pyroBall;


    // Constructor
    public FirePokemon(String name, double height, double weight, String sound, String food, String ability, String weakness, int flameThrower, int pyroBall) {
        super(name, height, weight, sound, food, ability, weakness);
        this.flameThrower = flameThrower;
        this.pyroBall = pyroBall;
    }


    // Methods
    public void flameThrower() {
        System.out.println(getName() + " does " + flameThrower + " damage with flame thrower;");
    }

    public void pyroBall() {
        System.out.println(getName() + " does " + pyroBall + " damage with pyro ball;");
    }

    @Override
    public void ability() {
        System.out.println("An fire Pokémon like " + getName() + " uses his " + getAbility() + " for fire damage;");
    }

    @Override
    public void weakness() {
        System.out.println("The weakness of an fire Pokémon like " + getName() + " is: " + getWeakness() + ".");
    }


    // Getters & Setters
    public int getFlameThrower() {
        return flameThrower;
    }

    public void setFlameThrower(int flameThrower) {
        this.flameThrower = flameThrower;
    }

    public int getPyroBall() {
        return pyroBall;
    }

    public void setPyroBall(int pyroBall) {
        this.pyroBall = pyroBall;
    }
}
