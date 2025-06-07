package Q2;

import java.util.Scanner;

public class DisplayDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int digit = sc.nextInt();
        int count=0;

        if (digit == 0) {
            return ;
        }


        //Check the Digits
        while (digit > 0) {
            count++ ;
            digit/=10;
        }
        System.out.println("The digits are " + count);


    }
}
