package week_05.assignments;

import java.util.Scanner;

public class Question_05_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick (two distinct digits): ");
        int number = input.nextInt();
        int numberFirstDigit = number/10;
        int numberSecondDigit = number%10;

        int computerChoiceFirstDigit = (int) (Math.random() * 10);
        int computerChoiceSecondDigit = (int) (Math.random() * 10);

        while (computerChoiceSecondDigit == computerChoiceFirstDigit) {
            computerChoiceSecondDigit = (int) (Math.random() * 10);
            if (computerChoiceSecondDigit != computerChoiceFirstDigit) {
                break;
            }
        }

        System.out.println("The lottery number is " + computerChoiceFirstDigit + "" + computerChoiceSecondDigit);

        if ((computerChoiceFirstDigit == numberFirstDigit) && (computerChoiceSecondDigit == numberSecondDigit)) {
            System.out.println("Your guess is completely true!You win $10000");

        } else if ((computerChoiceFirstDigit == numberSecondDigit) && (computerChoiceSecondDigit == numberFirstDigit)) {
            System.out.println("Match all digit. You win $3000");

        } else if ((computerChoiceFirstDigit == numberFirstDigit) ||
                (computerChoiceFirstDigit == numberSecondDigit) ||
                (computerChoiceSecondDigit == numberSecondDigit) ||
                (computerChoiceSecondDigit == numberFirstDigit)) {
            System.out.println("Match one digit.You win $1000");

        }else{
            System.out.println("Sorry,no match");

        }


    }
}
