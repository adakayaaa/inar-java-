package week_04.live_class;

import java.util.*;

public class CheapestGym {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min, max, mid;

        System.out.println("Enter three gym road: ");
        int roadHourGym1 = input.nextInt();
        int roadBenefitGym2 = input.nextInt();
        int roadSportGym3 = input.nextInt();


        int priceHourGym = 3;
        int priceBenefitGym = 10;
        int priceSportGym = 5;

        double pricePerKm = 0.5;

        int roadHourGym = Math.abs(roadHourGym1);
        int roadBenefitGym = Math.abs(roadBenefitGym2);
        int roadSportGym = Math.abs(roadSportGym3);


        double costHourGym = (roadHourGym * pricePerKm) * 2 + priceHourGym;
        double costBenefitGym = (roadBenefitGym * pricePerKm) * 2 + priceBenefitGym;
        double costSportGym = (roadSportGym * pricePerKm) * 2 + priceSportGym;


        double twoCheaper = Math.min(costBenefitGym, costSportGym);
        double cheapest = Math.min(twoCheaper, costHourGym);

        if (cheapest == costBenefitGym) {
            System.out.println("The cheapest gym is Benefit Gym");
        } else if (cheapest == costHourGym) {
            System.out.println("The cheapest gym is Hour Gym");
        } else {
            System.out.println("the cheapest gym is Sport Gym");
        }
    }
}

