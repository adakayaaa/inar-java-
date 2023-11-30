package week_10.assignments;

public class Question_10_28 {
    public static void main(String[] args) {
        MyStringBuilder2 myString=new MyStringBuilder2("Fenerbahce");
        System.out.println(myString.toString());


        MyStringBuilder2 myString4 = myString.reverse();
        System.out.println("Reverse myString "  + myString4);

        MyStringBuilder2 myString3 = new MyStringBuilder2("19");
        System.out.println("Insert myString into myString3 at index 2");
        System.out.println(myString.insert(2,myString3));

        MyStringBuilder2 myString2 = myString.substring(5);
        System.out.println("Substring of myString2 index 5 --> " + myString2.toString());
    }
}

