package week_09.assignments;

public class Question_09_02 {
    public static void main (String[] args){
        Stock stock= new Stock("ORCL","Oracle Corporation");
        System.out.println("Stock name  : " + stock.getName());
        System.out.println("Stock symbol: " + stock.getSymbol());
        System.out.println("Price-change percentage: " +stock.getChangePercent(34.35,34.5) );
    }
}
