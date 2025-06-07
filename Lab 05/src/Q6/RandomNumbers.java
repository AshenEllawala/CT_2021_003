package Q6;

import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Random number: ");
        int n = sc.nextInt();

        int a = (int) (Math.random() * 100); // 0 to 99

        while (true ){
            if(n==a){
                System.out.println("Congratulations! You got it!: " + a);
                return;
            }
            else{
                System.out.println("You Guest Wrong ---> Random Number: " + a);
                return;
            }
        }

    }
}
