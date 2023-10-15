package week_08.live_class;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int NUMBER_OF_DAYS = 3;
        final int NUMBER_OF_HOURS = 4;

        double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

        for (int k = 0; k < NUMBER_OF_DAYS * NUMBER_OF_HOURS; k++) {

            int day = input.nextInt();
            int hours = input.nextInt();

            double temperature = input.nextDouble();
            double humidity = input.nextDouble();

            data[day - 1][hours - 1][0] = temperature;
            data[day - 1][hours - 1][1] = humidity;

        }

        /*
        we can also do  like this:
        for(int day =0; day< NUMBER_OF_DAYS; day++){
           for(int hour = 0; hour<NUMBER_OF_HOURS;hour++){
           data[day][hour][0]= input.nextDouble;
           data[day][hour][1]= input.nextDouble;

         */

        //Find the average temperature and humidity
        for (int i = 0; i < NUMBER_OF_DAYS; i++) {

            double dailyTemperatureTotal = 0;
            double dailyHumidityTotal = 0;

            for (int j = 0; j < NUMBER_OF_HOURS; j++) {
                dailyTemperatureTotal += data[i][j][0];
                dailyHumidityTotal += data[i][j][1];

            }

            //Display result
            System.out.println("Day " + i + "'s average temperature is " + dailyTemperatureTotal / NUMBER_OF_HOURS);
            System.out.println("Day " + i + "'s average humidity is " + dailyHumidityTotal / NUMBER_OF_HOURS);


        }

    }
}

