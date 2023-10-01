package week_07.live_class;

public class ShiftingElements {
    public static void main(String[] args) {
        int list[] = new int[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }

        int temp = list[0];
        for (int i = 1; i < list.length; i++) {
            list[i - 1] = list[i];
        }
        list[list.length - 1] = temp;
    }
}
