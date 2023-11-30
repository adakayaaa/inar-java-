package week_11.assignments;

import week_10.assignments.MyDate;

public class Staff extends Employee{
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Staff(){

    }
    public Staff(String name, String phoneNumber, String emailAddress, String address,
                 String office, double salary,
                 String title){
        super(name, phoneNumber, emailAddress, address,office,salary);
        this.title=title;
    }

    @Override
    public String toString() {
        return "-Staff-" +
                "\nName: " + super.getName() +
                "\nAddress : " + super.getAddress() +
                "\nPhone Number: " + super.getPhoneNumber() +
                "\nEmail Address: " + super.getEmailAddress() +
                "\nOffice : " + super.getOffice()+
                "\nSalary : " + super.getSalary() +
                "\nhiredDate:  " + super.getDateHired()+
                "\ntitle: " + title;
    }
}

