package week_04.live_class;

public class ComparisonMethods {
    public static void main (String [] args) {
        String s1= "Welcome to Java";
        String s2= "Welcome to Java";
        String s3= "Welcome to C++";

        if(s1.equals(s2)){
            System.out.println("s1 and s2 have the same content");
        }else{
            System.out.println("s1 and s2 have the different content");

        }
        System.out.println("************");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("************");

        System.out.println(s1.compareTo(s3)); //java compare to C++ at ascii table // result is: 7
        System.out.println("************");

        System.out.println("Welcome to java".startsWith("We")); //true
        System.out.println("Welcome to java".startsWith("we")); //false
        System.out.println("Welcome to java".endsWith("va")); //true
        System.out.println("Welcome to java".endsWith("v")); //false
        System.out.println("Welcome to java".contains("to")); //true
        System.out.println("Welcome to java".contains("To")); //false
    }
}
