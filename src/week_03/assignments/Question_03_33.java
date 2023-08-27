package week_03.assignments;

import java.util.*;

public class Question_03_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight and price for package 1:  ");
        double weightForPackage1 = input.nextDouble();
        double priceForPackage1 = input.nextDouble();
        double oneWeightOfPrice1 = priceForPackage1/ weightForPackage1;

        System.out.println("Enter weight and price for package 2:  ");
        double weightForPackage2 = input.nextDouble();
        double priceForPackage2 = input.nextDouble();
        double oneWeightOfPrice2 = priceForPackage2 / weightForPackage2 ;

        if (oneWeightOfPrice1 > oneWeightOfPrice2) {
            System.out.println("Package 2 has a better price.");
        } else if (oneWeightOfPrice1 == oneWeightOfPrice2) {
            System.out.println("Two packages have the same price. ");
        } else if (oneWeightOfPrice1 < oneWeightOfPrice2) {
            System.out.println("Package 1 has a better price. ");
        } else {
            System.exit(1);
        }

    }
}
