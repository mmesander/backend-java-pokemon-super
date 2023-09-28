package src;

public abstract class Pokemon {
    // Variables
    private String name;
    private double height;
    private double weight;
    private String sound;
    private String food;
    private String ability;
    private String weakness;


    // Constructor

    public Pokemon(String name, double height, double weight, String sound, String food, String ability, String weakness) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.sound = sound;
        this.food = food;
        this.ability = ability;
        this.weakness = weakness;
    }


    // Methods
    public void weight() {
        System.out.println(name + " weighs: " + weight + "kg;");
    }

    public void height() {
        System.out.println(name + " height is: " + height + "m;");
    }

    public void speaks() {
        System.out.println(name + " says: " + sound + ";");
    }

    public void eats() {
        System.out.println(name + " eats: " + food + ";");
    }

    public abstract void ability();

    public abstract void weakness();


    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }
}
