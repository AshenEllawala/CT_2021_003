package Q7;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.pow;

public class q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double weight,height,bmi;

        System.out.println("Enter the Weight in KG:");
        weight = sc.nextDouble();

        System.out.println("Enter the Height in CM:");
        height = sc.nextDouble();

        double H= (height/100);
        double h=Math.pow(H,2);
        bmi = weight/h;
        System.out.println("BMI is "+df.format(bmi));


}}
