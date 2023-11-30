package week_04.live_class;
import java.util.*;
public class ConversionBetweenStringsAndNumbers {
    public static void main (String[]args) {
        String intString = "123";
        int intValue = Integer.parseInt(intString);
        System.out.println(intValue);

        String doubleString = "123.45";
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println(doubleValue);
    }
}

