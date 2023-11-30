package week_05.live_class;

import java.util.*;

public class Example {
    public static void main(String[] args) {

        int positive = 0;
        int negative = 0;

        for (int i = 0; i < 100; i++) {
            int number = (int) (Math.random() * 100 + (-50));
            System.out.println((i + 1) + " -> " + number);
            if (number < 0) {
                negative++;

            } else {
                positive++;
            }

        }
        System.out.println("Negative number's count is :" + negative + "\npositive number's count is : " + positive);

    }
}

