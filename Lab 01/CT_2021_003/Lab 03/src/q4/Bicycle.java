package q4;

public class Bicycle {
    private Owner owner;

    // Default constructor
    public Bicycle() {
        this.owner = new Owner(); // Initializes with default owner
    }

    // Parameterized constructor
    public Bicycle(String ownerName, String phoneNo) {
        this.owner = new Owner(ownerName, phoneNo);
    }

    // Getter and setter methods for owner
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}

