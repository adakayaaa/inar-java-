package week_03.assignments;

import java.util.*;

public class Question_03_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Random coordinate in rectangle centered at (0.0) with width 100 and " +
                "height 200: ");

        int randomHeight = (int) (Math.random() * 200 - 100);

        int randomWidth = (int) (Math.random() * 100 - 50);
        System.out.print("(" + randomWidth + ", " + randomHeight + ")");


    }
}

