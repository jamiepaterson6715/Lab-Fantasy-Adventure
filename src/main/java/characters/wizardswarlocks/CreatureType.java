package characters.wizardswarlocks;

public enum CreatureType {

    DRAGON(10),
    SPRITE(2),
    UNICORN(5),
    BOGLE(8);

    private final int protectiveCapacity;

    CreatureType(int protectiveCapacity) {
        this.protectiveCapacity = protectiveCapacity;
    }

    public int getProtectiveCapacity() {
        return protectiveCapacity;
    }
}
