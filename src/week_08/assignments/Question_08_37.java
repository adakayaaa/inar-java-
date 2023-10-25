package week_08.assignments;

import java.util.Scanner;

public class Question_08_37 {
    public static void main(String[] args) {
        String[][] capital = findCapital();
        getQuestionAndAnswer(capital);

    }

    public static String[][] findCapital() {
        String[][] capital = {{"Alabama", "Montgomery"},
                {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"},
                {"California", "Sacramento"},
                {"Colorado", "Denver"},
                {"Connecticut", "Hartford"},
                {"Delaware", "Dover"},
                {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},
                {"Hawaii", "Honolulu"},
                {"Idaho", "Boise"},
                {"Illinois", "Springfield"},
                {"Indiana", "Indianapolis"},
                {"Iowa", "Des Moines"},
                {"Kansas", "Topeka"},
                {"Kentucky", "Frankfort"},
                {"Louisiana", "Baton Rouge"},
                {"Maine", "Augusta"},
                {"Maryland", "Annapolis"},
                {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"},
                {"Minnesota", "St. Paul"},
                {"Mississippi", "Jackson"},
                {"Missouri", "Jefferson City"},
                {"Montana", "Helena"},
                {"Nebraska", "Lincoln"},
                {"Nevada", "Carson City"},
                {"New Hampshire", "Concord"},
                {"New Jersey", "Trenton"},
                {"New Mexico", "Santa Fe"},
                {"New York", "Albany"},
                {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"},
                {"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"},
                {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"},
                {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"},
                {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"},
                {"Texas", "Austin"},
                {"Utah", "Salt Lake City"},
                {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"},
                {"Washington", "Olympia"},
                {"West Virginia", "Charleston"},
                {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}};
        return capital;
    }

    public static void getQuestionAndAnswer(String[][] capital) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < capital.length; i++) {
            System.out.print("What is the capital of " + capital[i][0] + " ?");

            String answer = input.nextLine();
            String trimAnswer = answer.trim();

            if (trimAnswer.compareToIgnoreCase(capital[i][1]) == 0) {
                System.out.println("Your answer is correct");
                count++;

            } else {
                System.out.println("The correct answer should be " + capital[i][1]);
            }
        }
        System.out.println("The correct count is " + count);

    }
}

