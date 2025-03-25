package Q1.c.q1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class c {
    public static void main(String[] args) {

        double x,y,product;
        DecimalFormat df = new DecimalFormat("0.00");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for x:");
        x = sc.nextDouble();

        System.out.println("Enter value for y:");
        y = sc.nextDouble();

        product = x*y;
        double cuberoot=Math.cbrt(product);

        System.out.println("Cuberoot is: "+df.format(cuberoot));



    }
}
