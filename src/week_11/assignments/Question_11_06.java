package week_11.assignments;

import week_10.live_class.Loan;
import week_11.live_class.CircleFromSimpleGeometricObject;

import java.util.ArrayList;
import java.util.Date;

public class Question_11_06 {
    public static void main(String[] args) {
        ArrayList<Object> list =new ArrayList<>();

        list.add(new CircleFromSimpleGeometricObject(1));
        list.add(new Date());
        list.add(new Loan(2.5,1,1000.0));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
            System.out.println("---------------------");
        }

    }
}

