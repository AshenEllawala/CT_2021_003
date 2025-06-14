package q5;

import java.util.Scanner;

public class LoFatBurgers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to MyJava Lo-Fat Burgers\n");
        System.out.println("Please choose one item from each category:\n");

        // Entree
        System.out.println("Entree:");
        System.out.println("1. Tofu Burger - $3.49");
        System.out.println("2. Cajun Chicken - $4.59");
        System.out.println("3. Buffalo Wings - $3.99");
        System.out.println("4. Rainbow Fillet - $2.99");
        System.out.print("Enter your choice (1-4): ");
        int entreeChoice = input.nextInt();

        // Side Dish
        System.out.println("\nSide Dish:");
        System.out.println("1. Rice Cracker - $0.79");
        System.out.println("2. No-Salt Fries - $0.69");
        System.out.println("3. Zucchini - $1.09");
        System.out.println("4. Brown Rice - $0.59");
        System.out.print("Enter your choice (1-4): ");
        int sideChoice = input.nextInt();

        // Drink
        System.out.println("\nDrink:");
        System.out.println("1. Cafe Mocha - $1.99");
        System.out.println("2. Cafe Latte - $1.90");
        System.out.println("3. Espresso - $2.49");
        System.out.println("4. Oolong Tea - $0.99");
        System.out.print("Enter your choice (1-4): ");
        int drinkChoice = input.nextInt();

        double entreePrice = 0, sidePrice = 0, drinkPrice = 0;

        switch (entreeChoice) {
            case 1: entreePrice = 3.49; break;
            case 2: entreePrice = 4.59; break;
            case 3: entreePrice = 3.99; break;
            case 4: entreePrice = 2.99; break;
            default: System.out.println("Invalid entree choice.");
        }

        switch (sideChoice) {
            case 1: sidePrice = 0.79; break;
            case 2: sidePrice = 0.69; break;
            case 3: sidePrice = 1.09; break;
            case 4: sidePrice = 0.59; break;
            default: System.out.println("Invalid side choice.");
        }

        switch (drinkChoice) {
            case 1: drinkPrice = 1.99; break;
            case 2: drinkPrice = 1.90; break;
            case 3: drinkPrice = 2.49; break;
            case 4: drinkPrice = 0.99; break;
            default: System.out.println("Invalid drink choice.");
        }

        double total = entreePrice + sidePrice + drinkPrice;

        System.out.println("\nYour total is: $" + String.format("%.2f", total));

        input.close();
    }
}
