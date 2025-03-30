package q4;

public class Main {
    public static void main(String[] args) {
        // Creating a Bicycle with default owner
        Bicycle bike1 = new Bicycle();
        System.out.println("Bike1 Owner: " + bike1.getOwner().getOwnerName());
        System.out.println("Bike1 Phone: " + bike1.getOwner().getPhoneNo());

        // Creating a Bicycle with specific owner details
        Bicycle bike2 = new Bicycle("Alice Johnson", "123-456-7890");
        System.out.println("Bike2 Owner: " + bike2.getOwner().getOwnerName());
        System.out.println("Bike2 Phone: " + bike2.getOwner().getPhoneNo());

        // Updating the owner information
        bike1.getOwner().setOwnerName("Bob Smith");
        bike1.getOwner().setPhoneNo("098-765-4321");
        System.out.println("Updated Bike1 Owner: " + bike1.getOwner().getOwnerName());
        System.out.println("Updated Bike1 Phone: " + bike1.getOwner().getPhoneNo());
    }
}


