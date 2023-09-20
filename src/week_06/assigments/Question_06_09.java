package week_06.assigments;

public class Question_06_09 {
    public static void main(String[] args) {
        System.out.println("Feet" + "       " + "Meters" + "       |" +
                "       " + "Meters" + "     " + "Feet");
        System.out.println("--------------------------------------------------------------");

        double feet = 1;
        double meter = 20;
        while (feet <= 10 && meter <= 65) {
            System.out.printf("%-10.1f %-10.3f   |       %-10.1f%-10.3f"
                    , feet,
                    footToMeter(feet),
                    meter,
                    meterToFoot(meter));
            feet++;
            meter += 5;
            System.out.println();
        }

    }

    public static double footToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;
    }

    public static double meterToFoot(double meter) {
        double foot = 3.279 * meter;
        return foot;
    }
}

