package Q2;

import java.nio.DoubleBuffer;
import java.text.DecimalFormat;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

        double cm,feet,inches;
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value in CM :");
        cm = sc.nextDouble();

        //1inch= 2.54cm
        inches= cm/2.54;
        feet= cm/30.48;

        System.out.println("After convert, Inches:"+df.format(inches));
        System.out.println("After convert, Feets:"+df.format(feet));
    }
}
