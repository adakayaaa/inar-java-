package week_09.assignments;

import java.util.Scanner;

public class Question_09_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a,b,c: ");
        double a= input.nextDouble();
        double b= input.nextDouble();
        double c= input.nextDouble();

        QuadraticEquation quadraticEquation= new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()<0){
            System.out.println("The equation has no real roots");
        } else if (quadraticEquation.getDiscriminant()==0) {
            System.out.println("The equation has one root " + quadraticEquation.getRoot1());
        }else{
            System.out.println("The equation has to roots " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        }
    }
}
