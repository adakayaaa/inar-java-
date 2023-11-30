package week_06.assigments;

public class Question_06_08 {
    public static void main(String[] args) {
        System.out.println("Celsius" + "        " + "Fahrenheit" + "    |" +
                "    " + "Fahrenheit" + "        " + "Celsius");
        System.out.println("--------------------------------------------------------------");

        double celcius = 40;
        double fahrenheit = 120;
        while (celcius >= 31 && fahrenheit >= 30) {
            System.out.printf("%-15.1f %-10.1f   |       %-15.1f%-10.2f"
                    , celcius,
                    celciusToFahrenheit(celcius),
                    fahrenheit,
                    fahrenheitToCelcius(fahrenheit));
            celcius--;
            fahrenheit -= 10;
            System.out.println();
        }

    }

    public static double celciusToFahrenheit(double celcius) {
        double fahrenheit = (9.0 / 5) * celcius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        return celcius;
    }
}

