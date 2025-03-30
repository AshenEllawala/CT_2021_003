public class Main {
    public static void main(String[] args) {
        BandAccount myAccount = new BandAccount();

        // Print default values
        System.out.println(myAccount.getAccNum());  // Expected: 0000
        System.out.println(myAccount.getBalance()); // Expected: 0.0

        // Update account number and balance
        myAccount.setAccNum("1234560");
        myAccount.setBalance(200);

        // Print updated values
        System.out.println(myAccount.getAccNum());  // Expected: 1234560
        System.out.println(myAccount.getBalance()); // Expected: 200.0
    }
}
