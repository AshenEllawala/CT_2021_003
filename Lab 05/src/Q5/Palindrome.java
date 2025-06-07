package Q5;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();

        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(cleanedInput).reverse().toString();

        if (cleanedInput.equals(reversed)) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is NOT a palindrome.");
        }
        scanner.close();
    }
}
