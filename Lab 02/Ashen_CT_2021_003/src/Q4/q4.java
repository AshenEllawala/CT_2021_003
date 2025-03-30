package Q4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {

        double weight,calories;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Enter the Weight in Pounds: ");
        weight = sc.nextDouble();

        calories = weight * 19;

        System.out.println("The need of Calories for Body: "+df.format(calories));
    }
}
