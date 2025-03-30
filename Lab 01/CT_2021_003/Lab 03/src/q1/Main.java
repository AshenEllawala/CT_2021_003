package q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius: ");
        double celsius = scan.nextDouble();

        Temperature temp = new Temperature(celsius);
        System.out.println("Enter temperature in Fahrenheit: " + temp.getFahrenheit());

        System.out.println("Enter a temperature in Fahrenheit: ");
        double fahrenheit = scan.nextDouble();

        temp.setFahrenheit(fahrenheit);
        System.out.println("Enter temperature in Celsius: " + temp.getCelcius());


    }
}
