package week_12.assignments;

import java.io.File;
import java.util.Scanner;

public class Question_12_30 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        String year = input.nextLine();

        System.out.println("Enter the gender(M or F): ");
        String gender = input.nextLine();

        System.out.println("Enter the name: ");
        String name = input.nextLine();

        String path = "C:\\Users\\ASUS\\workspace\\inar-java\\src\\week_12\\assignments\\babies_names\\babynameranking";
        File file = new File(path + year + ".txt");

        input = new Scanner(file);
        String[][] str = new String[1000][5];

        while (input.hasNext()) {
            for (int i = 0; i < str.length; i++) {
                for (int j = 0; j < str[0].length; j++) {
                    str[i][j] = input.next();
                }
            }
        }


        for (int i = 0; i < str.length; i++) {
            if ((str[i][1].compareTo(name) == 0) && (gender.equals("M"))) {
                System.out.println(str[i][1] + " is ranked #" + str[i][0] + " in year " + year);
                break;
            } else if ((gender.equals("F")) && (str[i][3].compareTo(name) == 0)) {
                System.out.println(str[i][3] + " is ranked #" + str[i][0] + " in year " + year);
                break;
            }
            if (i == str.length - 1) {
                if (((str[i][1].compareTo(name) != 0) && (gender.equals("M")))
                        || ((str[i][3].compareTo(name) != 0) && (gender.equals("F")))) {
                    System.out.println("The name " + name + " is not ranked in year " + year);
                }
            }
        }
    }
}