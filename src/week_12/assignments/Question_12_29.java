package week_12.assignments;

import java.io.File;

import java.util.Scanner;

public class Question_12_29 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String path = "C:\\Users\\ASUS\\workspace\\inar-java\\src\\week_12\\assignments\\";
        System.out.println("enter a file name: ");
        String fileName = input.nextLine();
        File file = new File(path + fileName);

        Scanner input2 = new Scanner(file);
        String str = "";
        while (input2.hasNext()) {
            str += input2.nextLine() + "\n";
        }

        display(str);

    }
    public static void display(String str) {
        str = str.toUpperCase();


        int[] countOfLetter = new int[91];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                ++countOfLetter[(int) str.charAt(i)];
            }
        }

        for (int i = 0; i < countOfLetter.length; i++) {
            if (countOfLetter[i] > 0) {
                System.out.println("Number of " + (char) (i) + "'s :" + countOfLetter[i]);
            }
        }

    }
}
