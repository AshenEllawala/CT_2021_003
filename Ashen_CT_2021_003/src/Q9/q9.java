package Q9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double P,R,N;

        System.out.println("Enter the invest Dollars:");
        P = sc.nextInt();
        System.out.println("Enter the invest Rate:");
        R = sc.nextInt();
        System.out.println("Enter the investment Years");
        N = sc.nextInt();

        double A=P * Math.pow((1 + (R / 100)),N);//A is the interest with deposit money
        double interest=A-P;
        System.out.println("Amount after "+N+ " years:"+N+df.format(A));
        System.out.println("Total interest: "+df.format(interest));

    }
}
