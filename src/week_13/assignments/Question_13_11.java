package week_13.assignments;

public class Question_13_11 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Octagon octagon=new Octagon(5.0);

        System.out.println(octagon.toString());

        System.out.println("-------------------------");
        System.out.println("Cloning the Octagon...");
        Octagon octagon2= (Octagon)octagon.clone();

       if(octagon.equals(octagon2)){
           System.out.println("Octagon is equal to its clone.");
       }else {
           System.out.println("Octagon is not equal to its clone.");
       }
    }
}
