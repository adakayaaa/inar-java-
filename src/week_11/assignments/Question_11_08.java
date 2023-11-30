package week_11.assignments;

public class Question_11_08 {
    public static void main(String[] args) {
        Account account=new Account(1122,1000,15,"George");
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withDraw(5);
        account.withDraw(4);
        account.withDraw(2);
        System.out.println(account.toString());
        System.out.println(account.getTransaction());
    }
}

