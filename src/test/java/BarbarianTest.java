
import characters.dwarvesbarbariansknights.Barbarian;
import characters.dwarvesbarbariansknights.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void setUp() {
        barbarian = new Barbarian("Bob", WeaponType.MACE);
    }

    @Test
    public void canGetBarbarianName()  {
        assertEquals("Bob", barbarian.getName());
    }

    @Test
    public void canGetBarbarianWeaponDamage() {
        assertEquals(12, barbarian.getWeaponType().getDamage());
    }

    @Test
    public void canGetWeaponDamage(){
        assertEquals(16.8, barbarian.attack(), 0.02);
    }

    @Test
    public void canGetArmourValue() {
        assertEquals(0.5, barbarian.getArmourValue(), 0.01);
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(1.4, barbarian.getAttackValue(), 0.01);
    }
}