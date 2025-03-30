package Q_06;

import javax.swing.*;
import java.util.Scanner;

public class userframewindow {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);


        System.out.print("Enter the width of the frame: ");
        int width = scanner.nextInt();

        System.out.print("Enter the height of the frame: ");
        int height = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter the title of the frame: ");
        String title = scanner.nextLine();

        JFrame frame = new JFrame(title);
        frame.setSize(width, height );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        scanner.close();
    }
}
