package week_07.assignments;

public class Question_07_07 {
    public static void main(String[] args) {
        int[] count = new int[10];
        int[] number = new int[100];

        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 10);
            count[number[i]]++;
        }

        System.out.println("count for each number between 0 and 9: ");
        for (int i = 0; i < count.length; i++) {
            System.out.println(i + "s :" + count[i]);
        }
    }
}
