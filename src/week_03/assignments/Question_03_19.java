package week_03.assignments;

import java.util.*;

public class Question_03_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three edges of the triangle: ");

        int edge1 = input.nextInt();
        int edge2 = input.nextInt();
        int edge3 = input.nextInt();

        if ( ((edge1+edge2) > edge3 )
                && ((edge1 + edge3) > edge2)
                && ((edge2 + edge3) > edge1) )  {
            System.out.println("The perimeter is " + (edge1+edge2+edge3));
        }else{
            System.out.println(" The input is invalid");
        }






    }
}

