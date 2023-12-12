package week_14;

import week_14.assignments.CompareY;
import week_14.assignments.Points;

import java.util.ArrayList;
import java.util.Collections;

public class Question_14_03 {
    public static void main(String[] args) {
        ArrayList<Points> list = createArrayList(100);
        sortedForCoordinateX(list);
        sortedForCoordinateY(list);
    }

    public static ArrayList<Points> createArrayList(int count) {
        ArrayList<Points> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            double x = Math.random() * 100;
            double y = Math.random() * 100;
            list.add(new Points(x, y));
        }
        return list;
    }

    public static void sortedForCoordinateX(ArrayList<Points> list) {
        Collections.sort(list);
        System.out.println("The points in increasing order of their x-coordinates:\n");
        display(list);

    }

    public static void sortedForCoordinateY(ArrayList<Points> list) {
        CompareY compareY = new CompareY();
        Collections.sort(list,compareY);
        System.out.println("The points in increasing order of their y-coordinates:\n");
        display(list);

    }

    public static void display(ArrayList<Points> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("(" + list.get(i).getX() + "," + list.get(i).getY() + ")");
        }
        System.out.println();
    }
}
