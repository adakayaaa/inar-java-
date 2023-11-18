package week_11.assignments;

public class Question_11_03 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount= new SavingsAccount(16,4820.0);
        System.out.println(savingsAccount.toString());

        System.out.println("-------------------");

        CheckingAccount checkingAccount=new CheckingAccount(11,1450.0,-500);
        System.out.println(checkingAccount.toString());
        System.out.println("-------------------");
        checkingAccount.withDraw(3000);
        System.out.println(checkingAccount.toString());
    }

}
