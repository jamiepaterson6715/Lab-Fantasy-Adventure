package characters.dwarvesbarbariansknights;

public class Barbarian extends DBK {

    private double armourValue;
    private double attackValue;

    public Barbarian (String name, WeaponType weaponType) {
        super(name, weaponType);
        this.armourValue = 0.5;
        this.attackValue = 1.4;
    }

    public double attack() {
        return this.attackValue * this.weaponType.getDamage();
    }

    public double getArmourValue() {
        return armourValue;
    }

    public double getAttackValue() {
        return attackValue;
    }


}
