package characters.wizardswarlocks;

public enum SpellType {

    FIREBALL(12),
    LIGHTNING(20),
    ICESTRIKE(18);

    private final int damage;

    SpellType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
