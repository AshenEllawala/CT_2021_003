package Q_12;

import javax.swing.*;

public class framewindowtitle {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My First Frame");
        frame.setSize(300, 200);
        frame.setLocation( 50, 100 );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
