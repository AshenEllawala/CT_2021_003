package Q_05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class date2 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        String formattedDate = today.format(format);

        System.out.println("Today's date: "+ formattedDate);
    }
}
