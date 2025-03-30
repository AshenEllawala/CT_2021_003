package q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the inner radius (ri): ");
        double ri = scanner.nextDouble();

        System.out.print("Enter the outer radius (ro): ");
        double ro = scanner.nextDouble();

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();

        System.out.println("The area of the circular region is: " + shadedArea);
    }
}
