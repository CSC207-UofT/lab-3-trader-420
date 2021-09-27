/*
 * This file contains sample JUnit test cases for Human.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class HumanTest {
    Human h;

    @Before
    public void setUp() throws Exception {
        h = new Human();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("I love UofT", h.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        h.upgradeSpeed();
        assertEquals(200, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        h.downgradeSpeed();
        assertEquals(0, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, h.getPrice());
    }

}