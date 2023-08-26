package week_04.live_class;

import java.util.*;

public class ClosestGym {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min, max, mid;

        System.out.println("Enter three numbers: ");
        int hourGym = input.nextInt();
        int benefitGym = input.nextInt();
        int sportGym = input.nextInt();
        int home = 0;

        int distanceHomeAndHourGym = Math.abs(home - hourGym);
        int distanceHomeAndSportGym = Math.abs(home - sportGym);
        int distanceHomeAndBenefitGym = Math.abs(home - benefitGym);

        int twoRoad = Math.min(distanceHomeAndBenefitGym, distanceHomeAndSportGym);
        min = Math.min(twoRoad, distanceHomeAndHourGym);

        if (min == distanceHomeAndBenefitGym) {
            System.out.println("Minimum road is Benefit Gym");
        } else if (min == distanceHomeAndHourGym) {
            System.out.println("Minimum road is Hour Gym" + min);
        } else {
            System.out.println("Minimum road is Sport Gym" + min);
        }
    }


}