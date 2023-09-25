package week_06.assigments;

public class Question_06_32 {
    public static void main(String[] args) {
        gameCrabs(10000);
    }

    public static void gameCrabs(int times) {
        int countWin = 0;
        for (int i = 0; i < times; i++) {
            int number1 = (int) (Math.random() * 6 + 1);
            int number2 = (int) (Math.random() * 6 + 1);

            int sum = number1 + number2;
            int sumNew = 0;

            System.out.println("You rolled " + number1 + " + " + number2 + " = " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You lose.");

            } else if (sum == 7 || sum == 11) {
                System.out.println("You win.");
                countWin++;

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
                        countWin++;
                        break;
                    }
                }
            }
        }
        System.out.println("Number of winning games: " + countWin);
    }
}