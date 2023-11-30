package week_04.live_class;
import java.util.*;
public class FormatSpecifiers {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);

        int count =5;
        double amount = 45.56;
        System.out.printf("count is %d and amount is %f" , count , amount);
        System.out.println("******************");

        System.out.printf("%3d#%2s#%4.2f\n" , 1234 , "Java" , 51.6653); //1234#Java#51,67

        System.out.println("******************");

        System.out.printf("%8d%8s%8.1f\n", 1234 ,"Java" , 5.63); //     1234    Java     5,6 -right
        System.out.printf("%-8d%-8s%-8.1f\n", 1234, "Java" ,5.63); //1234    Java    5,6     -left


    }
}

