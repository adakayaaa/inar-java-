package week_10.live_class;

import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        if (annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0) {
            throw new IllegalArgumentException(" Wrong input! Please greater than 0!");
        } else {
            this.annualInterestRate = annualInterestRate;
            this.numberOfYears = numberOfYears;
            this.loanAmount = loanAmount;
            loanDate = new Date();
        }
    }

    public Loan() {
        this(2.5, 1, 1000);

    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate <= 0) {
            throw new IllegalArgumentException(" Wrong input! Please greater than 0!");
        } else {
            this.annualInterestRate = annualInterestRate;
        }
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears <= 0) {
            throw new IllegalArgumentException(" Wrong input! Please greater than 0!");
        } else {
            this.numberOfYears = numberOfYears;
        }
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if (loanAmount <= 0) {
            throw new IllegalArgumentException(" Wrong input! Please greater than 0!");
        } else {
            this.loanAmount = loanAmount;
        }
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    //Find monthly payment
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    //Find total payment
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    public String toString() {
        return "Annual interest rate: " + annualInterestRate +
                "\nNumber Of Years: " + numberOfYears +
                "\nLoan Amount: " + loanAmount +
                "\nLoan Date: " + loanDate;
    }

}

