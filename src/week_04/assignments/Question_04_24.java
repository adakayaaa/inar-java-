package week_04.assignments;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Question_04_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first city: ");
        String firstCity = input.nextLine();

        System.out.println("Enter the second city: ");
        String secondCity = input.nextLine();

        System.out.println("Enter the third city: ");
        String thirdCity = input.nextLine();

        int compareFirstAndSecond = firstCity.compareTo(secondCity);
        System.out.println(compareFirstAndSecond);
        int compareSecondAndThird = secondCity.compareTo(thirdCity);
        System.out.println(compareSecondAndThird);
        int compareFirstAndThird = thirdCity.compareTo(firstCity);
        System.out.println(compareFirstAndThird);

        if (compareFirstAndSecond < 0) {
            if ((compareFirstAndThird < 0) && (compareFirstAndThird > compareFirstAndSecond)) {
                System.out.println(thirdCity + " " + firstCity + " " + secondCity);
            } else if ((compareFirstAndThird < 0) && (compareFirstAndSecond > compareFirstAndThird)) {
                System.out.println(firstCity + " " + thirdCity + " " + secondCity);
            } else if ((compareSecondAndThird < 0) && (compareFirstAndSecond > compareSecondAndThird)) {
                System.out.println(firstCity + " " + secondCity + " " + thirdCity);
            } else if ((compareSecondAndThird < 0) && (compareSecondAndThird > compareFirstAndSecond)) {
                System.out.println(thirdCity + " " + secondCity + " " + firstCity);
            }

        } else if (compareSecondAndThird < 0) {
            if ((compareFirstAndThird < 0) && (compareSecondAndThird > compareFirstAndThird)) {
                System.out.println(secondCity + " " + thirdCity + " " + firstCity);
            } else if ((compareFirstAndThird < 0) && (compareFirstAndThird > compareFirstAndThird)) {
                System.out.println(secondCity + " " + firstCity + " " + thirdCity);
            } else if ((compareFirstAndSecond<0)&& (compareSecondAndThird>compareFirstAndSecond)) {
                System.out.println("");
            }else if ((compareFirstAndSecond<0)&&(compareFirstAndSecond>compareSecondAndThird)){
                System.out.println("");
            }

        } else {
            System.out.println("Enter different cities");
        }

    }
}

