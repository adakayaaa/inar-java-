package week_03.assignments;

import java.util.*;

public class Question_03_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the temperature in fahrenheit between -58F and 41F: ");
        double fahrenheit = input.nextDouble();

        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        double windChillTemperature = 35.74 + (0.6215*fahrenheit) - (35.75* Math.pow (windSpeed,0.16)) +
                (0.4275*fahrenheit*Math.pow (windSpeed,0.16));

        if (( -58<fahrenheit && fahrenheit<41)&& ( windSpeed >=2)) {
            System.out.println("The wind chill index is " + windChillTemperature);
        }else if( windSpeed <2) {
            System.out.println("The wind speed invalid ");
        }else if ( (fahrenheit >= 41) ||(fahrenheit<= -58)){
            System.out.println( "The temperature invalid ");
        }








    }
}
