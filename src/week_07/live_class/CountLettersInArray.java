package week_07.live_class;

public class CountLettersInArray {
    public static void main(String[] args) {
        char[] chars = createArray();

        //Display the array
        System.out.println("The lowercase letters are: ");
        System.out.println("-------------------------");
        displayArray(chars);

        //Count the letters
        int[] counts = countLetters(chars);

        //Display the counts
        System.out.println();
        System.out.println("The occurrences of each letter are: ");
        System.out.println("-----------------------------------");
        displayCounts(counts);

    }

    public static char[] createArray() {
        char[] chars = new char[100];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = getRandomLowerCaseLetter();
        }
        return chars;
    }

    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static void displayArray(char[] chars) {
        //Display the characters in the array 20 on each line
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0) {
                System.out.println(chars[i]);
            } else {
                System.out.print(chars[i] + " ");
            }
        }

    }

    public static int[] countLetters(char[] chars) {
        int[] counts = new int[26];

        for (int i = 0; i < chars.length; i++) {
            counts[chars[i] - 'a']++;
        }
        return counts;
    }

    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println(counts[i] + " " + (char) (i + 'a'));
            } else {
                System.out.print(counts[i] + " " + (char) (i + 'a') + " | " + " ");
            }
        }

    }

}
