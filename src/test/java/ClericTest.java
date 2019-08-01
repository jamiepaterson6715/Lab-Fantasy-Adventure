import characters.cleric.Cleric;
import characters.cleric.HealingToolType;
import characters.wizardswarlocks.CreatureType;
import characters.wizardswarlocks.SpellType;
import characters.wizardswarlocks.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public void setUp() {
        cleric = new Cleric("Bibo", HealingToolType.HERBS);
    }
    @Test
    public void hasName() {
        assertEquals("Bibo", cleric.getName());
    }

    @Test
    public void herbStockStartsAtFour() {
        assertEquals(4, cleric.getHerbStock());
    }

    @Test
    public void potionStockStartsAtFour() {
        assertEquals(2, cleric.getPotionStock());
    }

    @Test
    public void holyWaterStockStartsAtFour() {
        assertEquals(1, cleric.getHolyWaterStock());
    }

    @Test
    public void herbsHaveHealingPower() {
        assertEquals(20, cleric.getHealingToolType().getHealingPower());
    }

    @Test
    public void healingReducesStockCount() {
        cleric.heal(cleric);
        assertEquals(3, cleric.getHerbStock());
    }

    @Test
    public void canHealPlayerWithHerbs() {
        cleric.heal(cleric);
        assertEquals(120, cleric.getHealth());
    }

    @Test
    public void canHealPlayerWithPotions() {
        Cleric cleric2 = new Cleric("Greg", HealingToolType.POTION);
        cleric2.heal(cleric);
        assertEquals(130, cleric.getHealth());
    }

    @Test
    public void clericWithHolyWaterCanHealWizard() {
        Wizard wizard = new Wizard("Harry", SpellType.FIREBALL, CreatureType.UNICORN);
        Cleric cleric3 = new Cleric("B", HealingToolType.HOLYWATER);
        cleric3.heal(wizard);
        assertEquals(140, wizard.getHealth());
    }

}
