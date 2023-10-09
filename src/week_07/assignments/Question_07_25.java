package week_07.assignments;

import java.util.Scanner;

public class Question_07_25 {
    //anam-babam usulü oldu, bi' düzenle...
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] eqn = new double[3];

        System.out.println("Enter a,b,c: ");
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }

        double[] roots = new double[2];

        if (solveQuadratic(eqn, roots) > 0) {
            System.out.println("The number of real roots: 2 ");
            System.out.print("The root(s) of equation: " + roots[0] + " " + roots[1]);
        } else if (solveQuadratic(eqn, roots) == 0) {
            System.out.println("The number of real roots: 1 ");
            System.out.print("The root(s) of equation: " + roots[0]);
        } else {
            System.out.println("The equation has no real root.");
        }

    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        int discriminantOfTheQuadraticEquation = (int) (Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2]);

        roots[0] = ((-eqn[1] + Math.sqrt(Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2])) / (2 * eqn[0]));
        roots[1] = ((-eqn[1] - Math.sqrt(Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2])) / (2 * eqn[0]));

        return discriminantOfTheQuadraticEquation;
    }

}




