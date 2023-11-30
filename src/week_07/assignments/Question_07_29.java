package week_07.assignments;

public class Question_07_29 {
    public static void main(String[] args) {
        int[] numberOfCard = new int[4];
        int sum = 0;

        while (sum <= 24) {
            for (int i = 0; i < numberOfCard.length; i++) {
                numberOfCard[i] = (int) (Math.random() * 13 + 1);
                sum += numberOfCard[i];

            }
            if (sum == 24) {
                System.out.print("The number of picks that yields the sum of 24: ");
                for (int i = 0; i < numberOfCard.length; i++) {
                    if (numberOfCard[i] == 1) {
                        System.out.print("As ");
                    } else if (numberOfCard[i] == 11) {
                        System.out.print("Jack ");
                    } else if (numberOfCard[i] == 12) {
                        System.out.print("Queen ");
                    } else if (numberOfCard[i] == 13) {
                        System.out.print("King ");
                    } else {
                        System.out.print(numberOfCard[i] + " ");

                    }
                }
                break;

            } else {
                sum = 0;
            }


        }
    }


}

