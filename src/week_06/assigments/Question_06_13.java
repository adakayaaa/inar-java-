package week_06.assigments;

public class Question_06_13 {
    public static void main(String[] args) {
        System.out.println("i" + "         " + "m(i)");
        System.out.println("-----------------");
       sum(20);

    }


    public static double sum(double i) {
        double number = 1;
        double sum = 0;
        while (number <= i) {
            sum += number / (number + 1);
            System.out.printf("%-10.0f%-10.4f", number, sum);
            number++;
            System.out.println();
        }
        return i;
    }
}

