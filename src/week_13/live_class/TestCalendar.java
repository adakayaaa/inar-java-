package week_13.live_class;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar= new GregorianCalendar(2023,11,4);
        String[] dayNameOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        System.out.println("December 4,2023 is a "+
                dayNameOfWeek[calendar.get(Calendar.DAY_OF_WEEK)-1]);
    }
}
