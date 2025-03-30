package Q_09;

import java.util.Scanner;

public class sumofchar {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a sentence :");
        String sentence=scanner.nextLine();

        int length= sentence.length();

        char firstchar=sentence.charAt(0);
        char lastchar=sentence.charAt(length -1);

        System.out.println(length);
        System.out.println(firstchar);
        System.out.println(lastchar);

        scanner.close();
    }
}
