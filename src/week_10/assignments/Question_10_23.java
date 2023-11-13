package week_10.assignments;

public class Question_10_23 {
    public static void main(String[] args) {
        MyString2 string= new MyString2("ELON MUSK");
        System.out.println(string.compare("ELONMUSK")); //-1

        MyString2 string2= new MyString2();
        string2=string.substring(1);
        System.out.println(string2.toString()); //LON MUSK

        MyString2 string3= new MyString2();
        string3=string.valueOf(true);
        System.out.println(string3.toString()); //true

        System.out.println(string3.toUpperCase()); //TRUE

        char[] chars = string.toChars(); //E L O N   M U S K
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]+" ");
        }

    }


}
