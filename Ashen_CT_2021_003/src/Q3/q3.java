package Q3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        double celcius, fahrenheit;
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in Celcius:");
        celcius = sc.nextDouble();

        fahrenheit = (1.8*celcius)+32;
        System.out.println("After converting to Fahrenheit: "+df.format(fahrenheit));
    }
}
