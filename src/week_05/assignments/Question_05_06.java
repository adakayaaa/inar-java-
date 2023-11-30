package week_05.assignments;

public class Question_05_06 {
    public static void main(String[] args) {

        System.out.println(" Miles         Kilometers        |        Kilometers             Miles");
        int miles = 0;
        int kilometers = 15;

        while (miles < 10 && kilometers <= 60) {
            miles++;
            kilometers += 5;
            System.out.printf("%-15d %-17.3f|            %-10d         %-10.3f\n",
                    miles,
                    (miles * 1.609),
                    kilometers,
                    (kilometers / 1.609));


        }
    }


}

