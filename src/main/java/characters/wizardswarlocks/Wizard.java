package characters.wizardswarlocks;

public class Wizard extends WW {

    private double creatureModifier;
    private double spellModifier;

    public Wizard(String name, SpellType spellType, CreatureType creatureType) {
        super(name, spellType, creatureType);
        this.creatureModifier = 2.0;
        this.spellModifier = 1.0;
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
