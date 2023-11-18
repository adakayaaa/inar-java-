package week_11.assignments;

import week_10.assignments.MyDate;

public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee() {
        dateHired = new MyDate();
    }

    public Employee(String name, String phoneNumber, String emailAddress, String address, String office, double salary) {
        super(name, phoneNumber, emailAddress, address);
        this.office = office;
        this.salary = salary;
        dateHired = new MyDate();
    }

    public String getOffice() {
        return this.office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return this.dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "-Employee-" +
                "\nName: " + super.getName() +
                "\nAddress : " + super.getAddress() +
                "\nPhone Number: " + super.getPhoneNumber() +
                "\nEmail Address: " + super.getEmailAddress() +
                "\nOffice : " + this.office +
                "\nSalary : " + this.salary +
                "\nhiredDate:  " + this.dateHired;
    }
}