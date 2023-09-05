package week_05.assignments;

public class Question_05_05 {
    public static void main(String[] args) {
        int kilogram = 1;
        int pound = 20;
        System.out.println("Kilograms     Pounds      |           Pounds            Kilograms");
        while (kilogram <= 199 && pound <= 515) {
            System.out.printf("%-15d %-10.1f|            %-10d         %-10.2f\n"
                    , kilogram,
                    (kilogram * 2.2),
                    pound,
                    (pound / 2.2));
            kilogram += 2;
            pound += 5;

        }

    }
}
