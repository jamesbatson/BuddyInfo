package buddyinfotest;

import buddyinfo.AddressBook;
import buddyinfo.BuddyInfo;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by adambatson on 1/12/2017.
 */
public class AddressBookTest {

    private AddressBook book;
    private BuddyInfo b1;
    private BuddyInfo b2;

    @Before
    public void setUp() {
        book = new AddressBook();
        b1 = new BuddyInfo("adam", "123");
        b2 = new BuddyInfo("max", "555");
        book.addBuddy(b1);
        book.addBuddy(b2);
    }

    @Test
    public void testAddBuddy() {
        book.addBuddy(new BuddyInfo("Adam", "123456789"));
        assertEquals(3, book.getBuddies().size());
    }

    @Test
    public void testEquals() {
        AddressBook other = new AddressBook();
        other.addBuddy(b1);
        other.addBuddy(b2);
        assertEquals(book, other);
    }

    @Test
    public void testGetBuddies() {
        ArrayList<BuddyInfo> other = new ArrayList<BuddyInfo>();
        other.add(b1);
        other.add(b2);
        assertEquals(other, book.getBuddies());
    }

}