package week_11.assignments;

public class Student extends Person {
    private int classStatus;

    public int getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(int classStatus) {
        this.classStatus = classStatus;
    }

    public Student() {

    }

    public Student(String name, String phoneNumber, String emailAddress, String address, int classStatus) {
        super(name, phoneNumber, emailAddress, address);
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return "-Student-" +
                "\nName: " + super.getName() +
                "\nAddress : " + super.getAddress() +
                "\nPhone Number: " + super.getPhoneNumber() +
                "\nEmail Address: " + super.getEmailAddress() +
                "\nClass Status: " + this.classStatus;
    }

}

