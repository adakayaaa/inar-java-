package week_12.assignments;

import java.io.File;
import java.util.Scanner;

public class Question_12_31 {
    public static void main(String[] args) throws Exception {

        System.out.printf("%-8s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s\n", "Year", "Rank1", "Rank2", "Rank3", "Rank4", "Rank5",
                "Rank1", "Rank2", "Rank3", "Rank4", "Rank5");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");

        for (int i = 2001; i < 2006; i++) {
            String path = "C:\\Users\\ASUS\\workspace\\inar-java\\src\\week_12\\assignments\\babies_names\\babynameranking";
            File file = new File(path + i + ".txt");

            Scanner input = new Scanner(file);
            String[][] str = new String[5][5];
            int count = 0;
            while (input.hasNext() && count < 5) {
                for (int j = 0; j < 5; j++) {
                    for (int k = 0; k < 5; k++) {
                        str[j][k] = input.next();
                    }
                    count++;
                }
            }
            System.out.printf("%-8s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s\n", i, str[0][3], str[1][3], str[2][3], str[3][3], str[4][3],
                    str[0][1], str[1][1], str[2][1], str[3][1], str[4][1]);

        }
    }


}
