package week_09.assignments;

public class Question_09_01 {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(4,40);
        Rectangle rectangle1= new Rectangle(3.5,35.9);

        System.out.println("--Rectangle 1--");
        System.out.printf("%-10s%1.1f\n%-10s%1.1f\n%-10s%1.1f\n%-10s%1.1f\n",
                "Widht    :" , rectangle.getWeight() ,
                "Height   :" , rectangle.getHeight(),
                "Area     :" , rectangle.getArea(),
                "Perimeter:" , rectangle.getPerimeter());
        System.out.println();

        System.out.println("--Rectangle 2--");
        System.out.printf("%-10s%1.1f\n%-10s%1.1f\n%-10s%1.1f\n%-10s%1.1f",
                "Widht    :" , rectangle1.getWeight() ,
                "Height   :" , rectangle1.getHeight(),
                "Area     :" , rectangle1.getArea(),
                "Perimeter:" , rectangle1.getPerimeter());
    }

}
