package Q_07;

import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class userdate {
    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

        String formattedTime = currentTime.format(formatter);

        JFrame frame = new JFrame(formattedTime);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


