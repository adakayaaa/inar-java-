package week_06.assigments;

public class Question_06_38 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < 100; i++) {
           char ch = getRandomUpperCaseLetter();
            System.out.print(ch + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println("------------------------");
        for (int i = 0; i < 100; i++) {
          char  ch = getRandomDigitCharacter();
            System.out.print(ch + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');

    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }


    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));

    }
}

