package week_05.assignments;

public class Question_05_18 {
    public static void main(String[] args) {

        //pattern a
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        //pattern b
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= (7 - i); j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        //pattern c
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < (7 - i); j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        //pattern d
        for (int i = 1; i <= 6; i++) {
            for (int j = 1;j<i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (7 - i); j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }


    }

}


