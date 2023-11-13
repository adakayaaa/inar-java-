package week_10.assignments;

public class Question_10_22 {
    public static void main(String[] args) {
            char[] chars = {'I', 'n', 'a', 'r' };
        MyString1 myString = new MyString1(chars);
        System.out.println(myString.toString()); //Inar
        System.out.println(myString.charAt(2)); //a
        System.out.println(myString.length()); //4
        System.out.println(myString.equals(new MyString1("inarrr"))); //false
        System.out.println(myString.toLowerCase()); //inar
        MyString1 myString1= myString.valueOf(35467); //35467
        System.out.println(myString1);
        MyString1 myString11= myString.substring(1,3);
        System.out.println(myString11.toString()); //na


    }
}
