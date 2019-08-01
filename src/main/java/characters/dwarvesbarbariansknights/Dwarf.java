package characters.dwarvesbarbariansknights;

public class Dwarf extends DBK{

    private double armourValue;
    private double attackValue;

    public Dwarf(String name, WeaponType weaponType) {
        super(name, weaponType);
        this.armourValue = 0.4;
        this.attackValue = 1.0;
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
