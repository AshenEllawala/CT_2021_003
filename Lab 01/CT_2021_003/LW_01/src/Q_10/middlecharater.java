package Q_10;

import java.util.Scanner;

public class middlecharater {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the odd-length word: ");
        String word = scanner.nextLine();


        if (word.length() % 2 == 0) {
            System.out.print("word is not an odd-length");
            return;
        }

        int middleindex = word.length() / 2;
        char middlechar = word.charAt(middleindex);

        System.out.println(middlechar);

        scanner.close();
    }
}
