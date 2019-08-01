import characters.wizardswarlocks.Warlock;
import characters.wizardswarlocks.CreatureType;
import characters.wizardswarlocks.SpellType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;


    @Before
    public void setUp() {
        warlock = new Warlock("Brian", SpellType.ICESTRIKE, CreatureType.SPRITE);
    }

    @Test
    public void canGetName() {
        assertEquals("Brian", warlock.getName());
    }

    @Test
    public void canGetCreatureType() {
        assertEquals(CreatureType.SPRITE, warlock.getCreatureType());
    }

    @Test
    public void canGetSpellType() {
        assertEquals(SpellType.ICESTRIKE, warlock.getSpellType());
    }

    @Test
    public void canGetCreatureModifier() {
        assertEquals(1, warlock.getCreatureModifier(), 0.1);
    }

    @Test
    public void canGetSpellModifier() {
        assertEquals(2, warlock.getSpellModifier(), 0.01);
    }

    @Test
    public void getTotalSpellDamage() {
        assertEquals(36, warlock.castSpell(), 0.01);
    }


}
