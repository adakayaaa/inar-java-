package week_11.assignments;

import week_09.assignments.Account;

import java.util.Date;

public class SavingsAccount extends Account {
    SavingsAccount(){

    }
    SavingsAccount(int id, double balance,double annualInterestRate) {
        super(id, balance,annualInterestRate);
    }

    public  String toString(){
        return "ID: " + super.getId()
        + "\nBalance is: $" + super.getBalance();
    }

}
