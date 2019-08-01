import characters.dwarvesbarbariansknights.Knight;
import characters.dwarvesbarbariansknights.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void setUp() {
        knight = new Knight("Bob", WeaponType.SWORD);
    }

    @Test
    public void canGetKnightName()  {
        assertEquals("Bob", knight.getName());
    }

    @Test
    public void canGetKnightWeaponDamage() {
        assertEquals(45, knight.getWeaponType().getDamage());
    }

    @Test
    public void canGetWeaponDamage(){
        assertEquals(54, knight.attack(), 0.02);
    }

    @Test
    public void canGetArmourValue() {
        assertEquals(0.6, knight.getArmourValue(), 0.01);
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(1.2, knight.getAttackValue(), 0.01);
    }
}
