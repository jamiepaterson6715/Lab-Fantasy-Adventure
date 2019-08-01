package characters.cleric;

public enum HealingToolType {

    HERBS(20),
    POTION(30),
    HOLYWATER(40);

    private final int healingPower;

    HealingToolType(int healingPower, int stock) {
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }


}
