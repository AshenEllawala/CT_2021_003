package q2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class SubClassJFrame extends JFrame {

    // Correct constructor
    public SubClassJFrame() {
        // Set the title of the frame (optional)
        setTitle("My Frame");

        // Set the size of the frame
        setSize(400, 450);

        // Set the default close operation to exit the program
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel with blue background and add it to the frame
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        add(panel);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of SubClassJFrame
        new SubClassJFrame();
    }
}

