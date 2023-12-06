package week_13.assignments;

import java.util.Scanner;

public class Question_13_17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first complex number: ");
        double firstA= input.nextDouble();
        double firstB= input.nextDouble();

        System.out.println("Enter the second complex number: ");
        double secondA= input.nextDouble();
        double secondB= input.nextDouble();

        Complex complex1=new Complex(firstA,firstB);
        Complex complex2=new Complex(secondA,secondB);

        System.out.println(complex1.toString() + " + " + complex2.toString() + " = " + complex1.add(complex2));
        System.out.println(complex1.toString() + " - " + complex2.toString() + " = " + complex1.subtract(complex2));
        System.out.println(complex1.toString() + " * " + complex2.toString() + " = " + complex1.multiply(complex2));
        System.out.println(complex1.toString() + " / " + complex2.toString() + " = " + complex1.divide(complex2));
        System.out.println("|" + complex1.toString() + "| = " + complex1.abs() );
    }
}
