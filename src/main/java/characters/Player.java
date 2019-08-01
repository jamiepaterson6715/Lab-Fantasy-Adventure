package characters;

public abstract class Player {

    private int health;
    private String name;

    public Player(String name) {
        this.health = 100;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
}
