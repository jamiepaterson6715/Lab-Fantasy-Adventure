
import characters.dwarvesbarbariansknights.Dwarf;
import characters.dwarvesbarbariansknights.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {


    Dwarf dwarf;

    @Before
    public void setUp() {
        dwarf = new Dwarf("Bob", WeaponType.HAMMER);
    }

    @Test
    public void canGetdwarfName()  {
        assertEquals("Bob", dwarf.getName());
    }

    @Test
    public void canGetdwarfWeaponDamage() {
        assertEquals(54, dwarf.weaponType.getDamage());
    }

    @Test
    public void canGetWeaponDamage(){
        assertEquals(54, dwarf.attack(), 0.02);
    }

    @Test
    public void canGetArmourValue() {
        assertEquals(0.4, dwarf.getArmourValue(), 0.01);
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(1.0, dwarf.getAttackValue(), 0.01);
    }

}
