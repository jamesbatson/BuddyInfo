package buddyinfo;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Created by adambatson on 1/12/2017.
 */
public class BuddyInfoTest {

    private static String B1_NAME = "Adam Batson";
    private static String B1_NUM = "1234567899";

    private BuddyInfo b1;

    @Before
    public void setUp() {
        b1 = new BuddyInfo(B1_NAME, B1_NUM);
    }

    @Test
    public void testConstructor() {
        assertEquals(b1.getName(), B1_NAME);
        assertEquals(b1.getPhoneNumber(), B1_NUM);
    }

    @Test
    public void testSetName() {
        String newName = "Max";
        b1.setName(newName);
        assertEquals(b1.getName(), newName);
    }

    @Test
    public void testSetPhoneNumber() {
        String newNum = "14567899";
        b1.setPhoneNumber(newNum);
        assertEquals(b1.getPhoneNumber(), newNum);
    }

    @Test
    public void testEquals() {
        assertEquals(b1, new BuddyInfo(B1_NAME, B1_NUM));
        assertNotEquals(b1, new BuddyInfo("Max", "5"));
        assertNotEquals(b1, null);
        assertNotEquals(b1, "123");
    }

}