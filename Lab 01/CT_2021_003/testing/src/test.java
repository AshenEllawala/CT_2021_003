import java.util.GregorianCalendar;
import java.util.Scanner;

class TestCalendar{ //
    public static void main(String[] args) { //
        GregorianCalendar cal = new GregorianCalendar(); //
        Scanner scanner = new Scanner(System.in); //
        System.out.println("Enter the year: "); //
        int year = scanner.nextInt(); //
        System.out.println("Enter the month: "); //
        int month = scanner.nextInt(); //
        System.out.println("Enter the day: "); //
        int day = scanner.nextInt(); //
        System.out.println("Enter the name of the day: "); //
        String dayName = scanner.next(); //
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);//
        System.out.println("The date you entered is " + calendar.getTime()); //
    }}