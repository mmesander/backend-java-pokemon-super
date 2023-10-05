package src;

public class WaterPokemon extends Pokemon {
    // Variables
    private int surf;
    private int hydroCanon;


    // Constructor
    public WaterPokemon(String name, double height, double weight, String sound, String food, String ability, String weakness, int surf, int hydroCanon) {
        super(name, height, weight, sound, food, ability, weakness);
        this.surf = surf;
        this.hydroCanon = hydroCanon;
    }


    // Methods
    public void surf() {
        System.out.println(getName() + " does " + surf + " damage with surf;");
    }

    public void hydroCanon(){
        System.out.println(getName() + " does " + hydroCanon + " damage with hydro canon;");
    }

    @Override
    public void ability() {
        System.out.println("An water Pokémon like " + getName() + " uses his " + getAbility() + " for water damage;");
    }

    @Override
    public void weakness() {
        System.out.println("The weakness of an water Pokémon like " + getName() + " is: " + getWeakness() + ".");
    }


    // Getters & Setters
    public int getSurf() {
        return surf;
    }

    public void setSurf(int surf) {
        this.surf = surf;
    }

    public int getHydroCanon() {
        return hydroCanon;
    }

    public void setHydroCanon(int hydroCanon) {
        this.hydroCanon = hydroCanon;
    }
}
