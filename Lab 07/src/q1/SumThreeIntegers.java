package q1;

import javax.swing.JOptionPane;

public class SumThreeIntegers {
    public static void main(String[] args) {
        // Get input from the user
        String input1 = JOptionPane.showInputDialog("Enter the first integer:");
        String input2 = JOptionPane.showInputDialog("Enter the second integer:");
        String input3 = JOptionPane.showInputDialog("Enter the third integer:");

        // Convert input strings to integers
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        int num3 = Integer.parseInt(input3);

        // Calculate the sum
        int sum = num1 + num2 + num3;

        // Display the result
        JOptionPane.showMessageDialog(null, "The sum of the three integers is: " + sum);
    }
}
