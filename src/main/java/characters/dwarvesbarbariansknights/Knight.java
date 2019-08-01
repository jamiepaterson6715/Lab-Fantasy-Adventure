package characters.dwarvesbarbariansknights;

public class Knight extends DBK {

    private double armourValue;
    private double attackValue;

    public Knight(String name, WeaponType weaponType) {
        super(name, weaponType);
        this.armourValue = 0.6;
        this.attackValue = 1.2;
    }

    public double attack() {
        return this.attackValue * this.getWeaponType().getDamage();
    }

    public double getArmourValue() {
        return armourValue;
    }

    public double getAttackValue() {
        return attackValue;
    }


}

