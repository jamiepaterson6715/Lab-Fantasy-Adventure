package characters.wizardswarlocks;

import characters.Player;

public abstract class WW extends Player {

    private SpellType spellType;
    private CreatureType creatureType;

    public WW(String name, SpellType spellType, CreatureType creatureType) {
        super(name);
        this.spellType = spellType;
        this.creatureType = creatureType;
    }

    public SpellType getSpellType() {
        return spellType;
    }

    public CreatureType getCreatureType() {
        return creatureType;
    }

    public abstract void castSpell();
}
