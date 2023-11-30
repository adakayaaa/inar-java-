package week_04.assignments;

import java.util.Scanner;

public class Question_04_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee's name : ");
        String name = input.next();

        System.out.println("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();

        System.out.println("Enter hourly pay rate: ");
        double payRate = input.nextDouble();

        double grossPay = hours * payRate;

        System.out.println("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        double federalWithHolding = federalTax * 100.0;

        System.out.println("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();
        double stateWithHolding = stateTax * 100.0;

        double totalDeduction = ((grossPay * federalWithHolding / 100) + (grossPay * stateWithHolding / 100));

        System.out.println("Employee name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.println("Pay rate: $" + payRate);
        System.out.println("Gross pay: $" + payRate * hours);

        System.out.println("Deductions:");
        System.out.println("     Federal Withholding (" + federalWithHolding + "%): " + (int) ((grossPay * federalWithHolding / 100) * 100) / 100.0);
        System.out.println("     State Withholding ( " + stateWithHolding + "%) + " + (int) ((grossPay * stateWithHolding / 100) * 100) / 100.0);
        System.out.println("     Total Deduction: $" + (int) (totalDeduction * 100) / 100.0);

        System.out.println("Net pay: $" + (int) ((grossPay - totalDeduction) * 100) / 100.0);

    }
}

