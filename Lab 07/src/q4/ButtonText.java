package q4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonText extends JFrame {

    public ButtonText() {
        super("ButtonText");

        //create a text field

        JTextField text = new JTextField();
        text.setBounds(50,50,200,30);

        //create a push button
        JButton b1 = new JButton("Button 1");
        b1.setBounds(100,100,100,40);

        // add action listener to change te title when button is clicked
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String newTitle = text.getText();
                setTitle(newTitle);
            }
        });

        // add button and textfield
        add(b1);
        add(text);

        //frame settings
        setSize(400,400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


        //

    }
    public static void main(String[] args) {
        new ButtonText();
    }
}
