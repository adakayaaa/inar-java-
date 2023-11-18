package week_11.assignments;

import week_09.assignments.Account;

import java.util.Date;

public class SavingsAccount extends Account {
    SavingsAccount(){

    }
    SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    public  String toString(){
        return "ID: " + super.getId()
        + "\nBalance is: $" + super.getBalance();
    }

}
