package Q1.d.Q1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class d {
    public static void main(String[] args) {

        double r;
        final double PI=3.14;
        DecimalFormat df = new DecimalFormat("0.00");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of a circle: ");
        r = sc.nextDouble();

        double area= PI*r*r;
        System.out.println("The area of a circle is "+area);




    }
}
