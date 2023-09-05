package week_05.assignments;

public class Question_05_07 {
    public static void main(String[] args) {
        double cost = 10000;
        double totalCost = 0;
        int year = 1;
        while (year<= 10) {
            year++;
                cost = (int) (cost * 1.05);

        }System.out.println("Tuition in ten years " + cost);
        while (10<year&& year <= 15){
            year ++;
            totalCost += (cost *1.05);
        }

        System.out.println("Total cost four years' worth of tuition after the tenth year: " + totalCost);
    }
}
