package Q_04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class date1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMM yyyy");
        String formattedDate = today.format(format);

        System.out.println("Today's date: "+ formattedDate);
    }
}
