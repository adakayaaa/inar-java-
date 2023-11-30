package week_02.assignments;
import java.util.Scanner;
public class Question_02_07 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number of minutes: ");

        int minutes = input.nextInt();
        int years = minutes / (365*24*60);
        int newMinutes = minutes % (365*24*60);
        int days = newMinutes / (24*60);

        System.out.println(" " + minutes + " minutes is approximately " +
        " " + years + " years and " + " " + days + " days ");

    }
}

