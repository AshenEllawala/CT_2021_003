package Q6;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {

        int year,age;
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the year born : ");
        year = sc.nextInt();

        int currentyear= LocalDate.now().getYear();
        age=currentyear-year;

        System.out.println("You were Born in "+ year + " and will be (are) " + age +" years. ");
    }
}
