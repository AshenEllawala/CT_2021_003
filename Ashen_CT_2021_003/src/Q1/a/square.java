package Q1.a;

import java.text.DecimalFormat;
import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        double B,A,C;
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of A: ");
        A=sc.nextInt();

        System.out.println("Enter the value of B: ");
        B=sc.nextInt();

        System.out.println("Enter the value of C: ");
        C=sc.nextInt();

        System.out.println(df.format(Math.sqrt(Math.pow(B,2)+4*A*C)));
    }

}
