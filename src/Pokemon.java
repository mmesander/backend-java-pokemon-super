package src;

public class Pokemon {
    private String name;
    private int weight;
    private int hp;
    private String attack;
    private String food;

    public Pokemon(String name, int weight, int hp, String attack, String food){
        this.name = name;
        this.weight = weight;
        this.hp = hp;
        this.attack = attack;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
