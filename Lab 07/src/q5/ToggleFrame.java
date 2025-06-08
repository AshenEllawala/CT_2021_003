package q5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 public class ToggleFrame extends JFrame {
    private boolean isOn = false; // Flag to track state

    public ToggleFrame() {
        super("Toggle Background Example");

        // Create a button with initial text OFF
        JButton toggleButton = new JButton("OFF");
        toggleButton.setBounds(100, 100, 100, 50);

        // Set initial background color to green
        getContentPane().setBackground(Color.GREEN);
        setLayout(null);
        add(toggleButton);

        // Button click event handler
        toggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isOn) {
                    getContentPane().setBackground(Color.GREEN);
                    toggleButton.setText("OFF");
                    isOn = false;
                } else {
                    getContentPane().setBackground(Color.RED);
                    toggleButton.setText("ON");
                    isOn = true;
                }
            }
        });

        // Frame settings
        setSize(320, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit app on close
        setLocationRelativeTo(null); // Center the frame
        setVisible(true); // Display the frame
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ToggleFrame());
    }
}
