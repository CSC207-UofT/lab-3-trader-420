import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PigTest {
    Pig h;

    @Before
    public void setUp() throws Exception {
        h = new Pig();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("heeeer!", h.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(30, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        h.upgradeSpeed();
        assertEquals(40, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        h.downgradeSpeed();
        assertEquals(20, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(99, h.getPrice());
    }

}
