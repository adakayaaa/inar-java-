package week_10.live_class;

public class TestBMI {
    public static void main(String[] args) {
        BMI bmi = new BMI("Kim Yang",18,145,70);
        System.out.println("The BMI for " + bmi.getName() + " is " + bmi.getBMI() + " " + bmi.getStatus());
    }
}

