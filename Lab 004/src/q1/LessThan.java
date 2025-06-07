package q1;

import java.util.Scanner;

public class LessThan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input the inputs
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int c = sc.nextInt();

        //find the smallest number
        if (a <b && a <c){
            System.out.println("Smaller number is: " + a);
        }
        else if (b <a && b <c){
            System.out.println("Smaller number is: " + b);
        }
        else{
            System.out.println("Smaller number is: " + c);
        }
    }

}
