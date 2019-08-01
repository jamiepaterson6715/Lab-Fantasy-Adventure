package characters.dwarvesbarbariansknights;

public class Knight extends DBK {

    private double armourValue;
    private int attackValue;

    public Knight(String name, WeaponType weaponType) {
        super(name, weaponType);
        this.armourValue = 0.6;
        this.attackValue = 80;
    }

    public int attack() {
        return this.attackValue;
    }

}

