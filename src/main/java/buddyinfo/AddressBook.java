package buddyinfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adambatson on 2/7/2017.
 */
public class AddressBook {

    private List<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<BuddyInfo>();
    }

    public List<BuddyInfo> getBuddies() { return buddies; }

    public void addBuddy(BuddyInfo b) { buddies.add(b); }

    public void removerBuddy(BuddyInfo b) { buddies.remove(b); }

    @Override
    public boolean equals(Object other) {
        if(other instanceof AddressBook) {
            AddressBook book = (AddressBook) other;
            return buddies.equals(book.getBuddies());
        }
        return false;
    }

}
