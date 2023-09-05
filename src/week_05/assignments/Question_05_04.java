package week_05.assignments;

public class Question_05_04 {
    public static void main(String[] args) {

        int miles = 1;
        double kilometres = 1.609;

        System.out.println(" Miles             Kilometres");
        while (miles < 11) {

            double kilometresPerMiles = miles * kilometres;
            System.out.print(miles);
            if (miles <= 9) {
                System.out.println("                   " + kilometresPerMiles);

            } else {
                System.out.println("                  " + kilometresPerMiles);
            }
            miles++;
        }
    }
}
