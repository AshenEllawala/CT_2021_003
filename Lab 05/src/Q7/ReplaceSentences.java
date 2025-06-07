package Q7;

import java.util.Scanner;

public class ReplaceSentences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the word to be replaced: ");
        String oldWord = scanner.nextLine();
        System.out.print("Enter the replacement word: ");
        String newWord = scanner.nextLine();
        String replacedSentence = sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
        System.out.println("Updated sentence: " + replacedSentence);

        scanner.close();
    }
}
