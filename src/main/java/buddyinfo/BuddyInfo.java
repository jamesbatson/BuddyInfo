package buddyinfo;

import javax.persistence.*;

/**
 * Created by adambatson on 2/7/2017.
 */
@Entity
public class BuddyInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String phoneNumber;

    public AddressBook getBook() {
        return book;
    }

    @ManyToOne
    private AddressBook book;

    protected BuddyInfo() {}

    public BuddyInfo(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {return id;}

    @Override
    public String toString() {
        return "Name: " + name + "\nPhone Number: " + phoneNumber + "\n";
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof BuddyInfo) {
            BuddyInfo b = (BuddyInfo) other;
            return name.equals(b.name) && phoneNumber.equals(b.phoneNumber);
        } return false;
    }

    public static void main(String[] args) {
        System.out.println("It LIIIIVES!");
    }
}
