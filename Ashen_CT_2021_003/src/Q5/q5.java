package Q6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

        double farhenheit,celsius;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.#");

        System.out.println("Enter the Temperature in Fahrenheit:");
        farhenheit = sc.nextDouble();

        celsius = (5.0/9)*(farhenheit-32);
        System.out.println("Temperature in Celsius: "+df.format(celsius));
    }
}
