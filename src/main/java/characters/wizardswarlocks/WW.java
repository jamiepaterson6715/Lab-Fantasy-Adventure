package characters.wizardswarlocks;

import characters.Player;

public class WW extends Player {

    public SpellType spellType;
    public CreatureType creatureType;

    public WW(String name, SpellType spellType, CreatureType creatureType) {
        super(name);
        this.spellType = spellType;
        this.creatureType = creatureType;
    }
}
