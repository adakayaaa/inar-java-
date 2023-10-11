package week_07.live_class;

public class Example1 {
    public static void main(String[] args) {
        boolean[] doors = new boolean[101];
        for (int students = 1; students < doors.length; students++) {
            for (int locker = students; locker < doors.length; locker += students) {
                if (doors[locker] == false) {
                    doors[locker] = true;
                } else {
                    doors[locker] = false;
                }
            }

        }
        for (int i = 1; i < doors.length; i++) {
            if (doors[i] == true) {
                System.out.print("L" + i + " ");
            }
        }
    }
}

