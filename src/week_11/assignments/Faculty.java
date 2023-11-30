package week_11.assignments;

import week_10.assignments.MyDate;

public class Faculty extends  Employee{
    private String officeHours;
    private String rank;

    public String getOfficeHours() {
        return this.officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return this.rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Faculty(){

    }
    public Faculty(String name, String phoneNumber, String emailAddress, String address,
                   String office, double salary,
                   String officeHours,String rank){
        super(name, phoneNumber, emailAddress, address,office,salary);
        this.officeHours=officeHours;
        this.rank=rank;
    }
    @Override
    public String toString() {
        return "-Faculty-" +
                "\nName: " + super.getName() +
                "\nAddress : " + super.getAddress() +
                "\nPhone Number: " + super.getPhoneNumber() +
                "\nEmail Address: " + super.getEmailAddress() +
                "\nOffice : " + super.getOffice()+
                "\nSalary : " + super.getSalary() +
                "\nhiredDate:  " + super.getDateHired()+
                "\nofficeHours: " + officeHours+
                "\nrank: " + rank;
    }

}

