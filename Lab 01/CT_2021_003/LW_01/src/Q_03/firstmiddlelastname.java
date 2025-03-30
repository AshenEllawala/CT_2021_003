package Q_03;

import javax.swing.*;
import java.util.Scanner;

public class firstmiddlelastname {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your middle name: ");
        String middlename = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastname = scanner.nextLine();

        String formattedname= firstName +" "+ middlename.charAt(0) +". "+lastname;

        JFrame frame = new JFrame(formattedname);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        scanner.close();
    }
}
