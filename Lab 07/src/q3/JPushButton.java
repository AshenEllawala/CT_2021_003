package q3;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPushButton extends JFrame {

    public JPushButton() {
        JButton pushButton = new JButton("Push Button");
        pushButton.setBounds(100,100,120,40);

        //add action user to handle button click
        pushButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You Clicked");
            }
        });
        add(pushButton);

        //frame settings
        setSize(350,250);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
    public static void main(String[] args) {
        // Create an instance of SubClassJFrame
        new JPushButton();
    }
}
