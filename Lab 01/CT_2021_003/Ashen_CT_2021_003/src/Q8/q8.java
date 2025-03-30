package Q8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        final double PI=3.14;
        double r,volume;

        System.out.println("Enter the radius of a sphere in centimeters:");
        r = sc.nextDouble();

        double R=Math.pow(r,3);

        volume=(4/3)*(PI*R);
        System.out.println("Volume of a sphere: "+df.format(volume));
    }
}
