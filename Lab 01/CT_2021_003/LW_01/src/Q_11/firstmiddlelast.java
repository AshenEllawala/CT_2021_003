package Q_11;

import java.util.Scanner;

public class firstmiddlelast {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first name :");
        String firstname = scan.nextLine();

        System.out.print("Enter the middle name :");
        String middlename = scan.nextLine();

        System.out.print("Enter the last name :");
        String lastname = scan.nextLine();

        System.out.print(lastname+", "+firstname+" "+middlename.charAt(0)+".");
    }
}
