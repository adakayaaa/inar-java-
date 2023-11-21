package week_11.assignments;

import java.util.Date;

public class Transaction {
    private double amount;
    private double balance;
    private String description;
    private char type;
    private java.util.Date dateCreated;


    Transaction() {
        dateCreated = new Date();
    }

    Transaction(char type, double amount, double balance, String description) {
        dateCreated = new Date();
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getType() {
        return this.type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "\nDate: " + dateCreated +
                "\nTransaction " + ((this.getType() == 'w' || this.getType() == 'W') ? "Withdraw" : "Deposit") +
                "\nAmount " + amount +
                "\nBalance " + balance +
                "\nDescription " + description + "\n";

    }
}

