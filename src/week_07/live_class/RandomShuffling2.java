package week_07.live_class;

public class RandomShuffling2 {
    public static void main(String[] args) {
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }

        for (int i = list.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));

            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;

        }

    }
}
