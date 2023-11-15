package week_10.assignments;

import java.sql.SQLOutput;

public class Question_10_27 {
    public static void main(String[] args) {
        MyStringBuilder1 myStringBuilder1= new MyStringBuilder1("La Casa De Papel--");
        MyStringBuilder1 myStringBuilder2= new MyStringBuilder1("@El Profesor");

        myStringBuilder1.append(myStringBuilder2);
        System.out.println(myStringBuilder1.toString());
        myStringBuilder1.append(5);
        System.out.println(myStringBuilder1.toString());

        System.out.println("----------------------");

        System.out.println("length: " +myStringBuilder1.length());
        System.out.println("charAt() :" + myStringBuilder1.charAt(3));

        System.out.println("-----------------------");

        MyStringBuilder1 myStringBuilder3 = myStringBuilder1.toLowerCase();
        System.out.println(myStringBuilder3.toString());

        System.out.println("-----------------------");

        MyStringBuilder1 myStringBuilder4 = myStringBuilder3.substring(19,30);
        System.out.println(myStringBuilder4.toString());
    }
}
