package q3;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Power of 10 : /n From (6,9,12,15,18,21,30,100");
        int power = sc.nextInt();

        String name = "";


        switch (power) {
            case 6:
                name="MILLION";
                break;
            case 9:
                name="BILLION";
                break;
            case 12:
                name="TRILLION";
                break;
            case 15:
                name="QUADLION";
                break;
            case 18:
                name="Quintillion";
                break;
            case 21:
                name="Sextillion";
                break;
            case 30:
                name="Nonillion";
                break;
            case 100:
                name="Googol";
                break;
            default:
                System.out.println("Invalid Power Number"); 
                break;
        }

        System.out.println("The Power of 10 of give you equal to = "+ name);

    }
}
