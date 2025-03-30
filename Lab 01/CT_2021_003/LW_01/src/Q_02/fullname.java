package Q_02;
import javax.swing.JFrame;
import java.util.Scanner;

public class fullname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        String fullName = firstName + " " + lastName;

        JFrame frame = new JFrame(fullName);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        scanner.close();
    }

}
