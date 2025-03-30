// Corrected BandAccount class
public class BandAccount {
    private String acc_num;
    private double balance;

    // Constructor
    public BandAccount() {
        this.acc_num = "0000";
        this.balance = 0.0;
    }

    // Getter for account number
    public String getAccNum() {
        return acc_num;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for account number
    public void setAccNum(String acc_num) {
        this.acc_num = acc_num;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}



    
    

