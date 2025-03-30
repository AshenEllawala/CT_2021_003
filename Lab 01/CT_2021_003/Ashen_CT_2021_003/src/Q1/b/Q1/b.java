package Q1.b.Q1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double X,Y,Z,result;

        System.out.println("Enter the value of X: ");
        X = sc.nextDouble();

        System.out.println("Enter the value of Y:");
        Y = sc.nextDouble();

        Z = 4*Math.pow(Y,3);
        result = Math.sqrt(X+Z);

        System.out.println("The Square root is:" +df.format(result));



        System.out.println();
    }
}
