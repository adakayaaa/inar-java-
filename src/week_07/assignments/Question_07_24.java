package week_07.assignments;

public class Question_07_24 {
    public static void main(String[] args) {
        int[] deck = createDeck();
        shuffleCards(deck);
        int[] pick = new int[4];
        int numberOfPicks = pickFourCards(deck, pick);
        display(pick);

        System.out.println("Number of picks " + numberOfPicks);

    }
    public static int[] createDeck(){
        int [] deck = new int[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        return deck;
    }

    public static void shuffleCards(int[] array) {
        for (int i = 0; i < array.length; i++) {

            int index = (int) (Math.random() * array.length);

            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }

    public static int pickFourCards(int[] deck, int[] pick) {
        int numberOfPicks = 0;
        for (int i = 0; i < pick.length; i++) {
            pick[i] = Integer.MIN_VALUE;
        }
        int index = 0;
        while (index < 4) {
            int card = pickOneCard(deck);
            numberOfPicks++;
            if (!contains(pick, card)) {
                pick[index] = card;
                index++;
            }
        }
        return numberOfPicks;
    }

    public static int pickOneCard(int[] deck) {
        return (int) (Math.random() * deck.length);
    }

    public static boolean contains(int[] pick, int card) {
        for (int i = 0; i < pick.length; i++) {
            if (pick[i] / 13 == card / 13) {
                return true;
            }
        }
        return false;


    }
    public static void display(int[] pick) {
        for (int i = 0; i < pick.length; i++) {
            String name = getName(pick[i]);
            System.out.println(name);
        }
    }

    public static String getName(int number) {
        String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};
        String[] numbers = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Joker", "Queen", "King"};
        String result = numbers[(number % 13)] + " of " + suits[(number / 13)];
        return result;
    }


}

