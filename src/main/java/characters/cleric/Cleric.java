package characters.cleric;

import characters.Player;

public class Cleric extends Player {

    private HealingToolType healingToolType;
    private int potionStock;
    private int holyWaterStock;
    private int herbStock;

    public Cleric(String name, HealingToolType healingToolType) {
        super(name);
        this.healingToolType = healingToolType;
        this.holyWaterStock = 1;
        this.herbStock = 4;
        this.potionStock = 2;
    }

    public int attack() {
        return 5;
    }


    public HealingToolType getHealingToolType() {
        return healingToolType;
    }

    public int getPotionStock() {
        return potionStock;
    }

    public int getHolyWaterStock() {
        return holyWaterStock;
    }

    public int getHerbStock() {
        return herbStock;
    }

    public void heal(Player player) {
        if (this.healingToolType == HealingToolType.HERBS) {
            if (this.herbStock > 0) {
                player.setHealth(player.getHealth() + this.healingToolType.getHealingPower());
                this.herbStock -= 1;
            }
        } else if (this.healingToolType == HealingToolType.POTION) {
            if (this.potionStock > 0) {
                player.setHealth(player.getHealth() + this.healingToolType.getHealingPower());
                this.potionStock -= 1;
            }
        } else {
            if (this.holyWaterStock > 0) {
                player.setHealth(player.getHealth() + this.healingToolType.getHealingPower());
                this.holyWaterStock -= 1;
            }
        }
    }
}