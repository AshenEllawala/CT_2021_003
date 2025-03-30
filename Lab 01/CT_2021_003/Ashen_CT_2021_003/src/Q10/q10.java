package Q10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double loan_Amount, Annual_intrest_rate,loan_period;
        final int months_in_year=12;

        System.out.println("Enter the loan amount: ");
        loan_Amount = sc.nextDouble();
        System.out.println("Enter the Annual interest rate: ");
        Annual_intrest_rate = sc.nextDouble();
        System.out.println("Enter the loan period in Months: ");
        loan_period = sc.nextDouble();

        //monthly intrestrate
        double monthly_interest = Annual_intrest_rate/100/months_in_year;


        //number of payements
        double numberofpayemnts=loan_period*months_in_year;
        System.out.println("The Numebr of Payemnts is:  " + df.format(numberofpayemnts));

        //monthly paymnet
        double monthly_payment= (loan_Amount*monthly_interest)/(1-Math.pow(1/(1+Annual_intrest_rate),numberofpayemnts));
        System.out.println("The Monthly Payment is: " + df.format(monthly_payment));

        //total payemnt
        double total_payment=monthly_payment*numberofpayemnts;
        System.out.println("The total payment is: " + df.format(total_payment));
    }
}
