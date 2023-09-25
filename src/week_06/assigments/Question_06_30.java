package week_06.assigments;

public class Question_06_30 {
    public static void main(String[] args) {
        gameCrabs(10000);
    }

    public static void gameCrabs(int times) {

            int number1 = (int) (Math.random() * 6 + 1);
            int number2 = (int) (Math.random() * 6 + 1);

            int sum = number1 + number2;
            int sumNew = 0;

            System.out.println("You rolled " + number1 + " + " + number2 + " = " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You lose.");

            } else if (sum == 7 || sum == 11) {
                System.out.println("You win.");

            } else {
                System.out.println("point is " + sum);

                while (sumNew >= 0) {
                    number1 = (int) (Math.random() * 6 + 1);
                    number2 = (int) (Math.random() * 6 + 1);
                    sumNew = number1 + number2;
                    System.out.println("You rolled " + number1 + " + " + number2 + " = " + sumNew);

                    if (sumNew == 7) {
                        System.out.println("You lose");
                        break;
                    } else if (sumNew == sum) {
                        System.out.println("You win");
                        break;
                    }
                }
            }

    }
}