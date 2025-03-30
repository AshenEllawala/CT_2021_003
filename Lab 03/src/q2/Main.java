package q2;

import q1.Temperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temerature in Farenheit: ");
        double Farenheit = sc.nextDouble();

        Temperature temp = new Temperature(Farenheit);
        temp.setFahrenheit(temp.getFahrenheit());

        System.out.println("Equivalent Temperature in Celcius: "+ temp.getFahrenheit());

    }
}
