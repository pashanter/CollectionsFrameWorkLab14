public class Player {
    public String name;
    public int id;
    public int strength;

    public Player(String name, int id, int strength) {
        this.name = name;
        this.id = id;
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public String getName() {
        return name;
    }
}
