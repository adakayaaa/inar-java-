package week_13.assignments;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Question_13_03 {
        public static void main(String[] args) {
            ArrayList<Number> list= new ArrayList<>();
            list.add(1);
            list.add(12.5);
            list.add(new BigInteger("188888888888888889000"));
            list.add(65);
            list.add(new BigDecimal("20999999999999999.300"));
            System.out.println("Before sorting: " +list);
            System.out.println("After sorting" + sortedList(list));
        }
        public static ArrayList<Number> sortedList(ArrayList<Number>list){
            for (int i = 0; i < list.size()-1; i++) {
                int minIndex=i;
                Number min= list.get(i);
                for (int j = i+1; j < list.size() ; j++) {
                    if(list.get(j).doubleValue() <min.doubleValue()){
                        min= list.get(j);
                        minIndex=j;
                    }
                }
                if(minIndex !=i){
                    list.set(minIndex, list.get(i));
                    list.set(i,min);
                }
            }
            return list;
        }

    }

