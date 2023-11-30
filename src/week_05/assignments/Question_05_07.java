package week_05.assignments;

public class Question_05_07 {
    public static void main(String[] args) {
        double cost = 10000;
        double totalCost = 0;
        int year = 1;
        while (year <= 10) {
            cost = (int) (cost * 1.05);
            year++;
            }
        System.out.println("Tuition in ten years " + cost);

        while ( year <= 14) {
            cost= (int)(cost * 1.05);
            totalCost+= cost;
            year++;
        }

        System.out.println("Total cost four years' worth of tuition after the tenth year: " + (totalCost));
    }
}

