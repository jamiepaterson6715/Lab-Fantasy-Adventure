package characters.dwarvesbarbariansknights;

public enum WeaponType {

    SWORD(45),
    MORNINGSTAR(34),
    MACE(12),
    HALBEARD(23),
    HAMMER(54);

    private final int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }


}
