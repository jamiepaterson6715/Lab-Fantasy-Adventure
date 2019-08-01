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
        
    }

}
