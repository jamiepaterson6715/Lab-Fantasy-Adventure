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

    public void canGetWeaponDamage(){
        assertEquals(54, knight.attack(), 0.02);
    }

}
