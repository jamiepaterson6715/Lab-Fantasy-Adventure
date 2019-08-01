import characters.wizardswarlocks.CreatureType;
import characters.wizardswarlocks.SpellType;
import characters.wizardswarlocks.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;


    @Before
    public void setUp() {
        wizard = new Wizard("Bob", SpellType.FIREBALL, CreatureType.UNICORN);
    }

    @Test
    public void canGetName() {
        assertEquals("Bob", wizard.getName());
    }

    @Test
    public void canGetCreatureType() {
        assertEquals(CreatureType.UNICORN, wizard.getCreatureType());
    }

    @Test
    public void canGetSpellType() {
        assertEquals(SpellType.FIREBALL, wizard.getSpellType());
    }

    @Test
    public void canGetCreatureModifier() {
        assertEquals(2, wizard.getCreatureModifier(), 0.1);
    }

    @Test
    public void canGetSpellModifier() {
        assertEquals(1, wizard.getSpellModifier(), 0.01);
    }

    @Test
    public void getTotalSpellDamage() {
        assertEquals(12, wizard.castSpell(), 0.01);
    }


}
