package characters.wizardswarlocks;

public class Warlock extends WW {

    private double creatureModifier;
    private double spellModifier;

    public Warlock(String name, SpellType spellType, CreatureType creatureType) {
        super(name, spellType, creatureType);
        this.creatureModifier = 1.0;
        this.spellModifier = 2.0;
    }

    public double getCreatureModifier() {
        return creatureModifier;
    }

    public double getSpellModifier() {
        return spellModifier;
    }

    public double castSpell() {
        return this.spellModifier * this.getSpellType().getDamage();
    }
}
