package week_11.assignments;

import week_11.assignments.Transaction;

import java.util.ArrayList;

public class Account extends week_09.assignments.Account {
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    Account(int id, double balance, double annualInterestRate, String name) {
        super(id, balance, annualInterestRate);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getTransaction() {
        return transactions;
    }

    public void setTransaction(ArrayList<Transaction> transaction) {
        this.transactions = transaction;
    }

    public void withDraw(double amount) {
        super.withDraw(amount);
        Transaction transactionWithDraw = new Transaction('W', amount, getBalance(), "Withdraw from ATM");
        transactions.add(transactions.size(), transactionWithDraw);
    }

    public void deposit(double amount) {
        super.deposit(amount);
        Transaction transactionWithDraw = new Transaction('D', amount, getBalance(), "Deposit to Bank");
        transactions.add(transactions.size(), transactionWithDraw);
    }

    public String toString() {
        return "\nName: " + name +
                "\nID :" + super.getId() +
                "\nBalance : " + super.getBalance();
    }


}
