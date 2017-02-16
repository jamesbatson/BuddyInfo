package buddyinfo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by adambatson on 2/7/2017.
 */
@Entity
public class AddressBook {

    private String title;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<BuddyInfo>();
    }

    public List<BuddyInfo> getBuddies() { return buddies; }

    public void addBuddy(BuddyInfo b) { buddies.add(b); }

    public void removeBuddy(BuddyInfo b) { buddies.remove(b); }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof AddressBook) {
            AddressBook book = (AddressBook) other;
            return buddies.equals(book.getBuddies());
        }
        return false;
    }


    public Long getId(){return id;}
}
