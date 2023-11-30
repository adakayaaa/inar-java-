package week_12.assignments;

import week_10.live_class.Loan;

public class Question_12_04 extends Loan {
    public static void main(String[] args) {

        Loan loan = new Loan();
        loan.setLoanAmount(10);
        loan.setNumberOfYears(5);
        loan.setAnnualInterestRate(-19);
        System.out.println(loan.toString());
    }
}

