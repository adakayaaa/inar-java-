package week_11.assignments;

public class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String address;

    public Person(){

    }
    public Person(String name,String phoneNumber,String emailAddress,String address){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.emailAddress=emailAddress;
        this.address =address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public  String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address =address;
    }

    public  String toString(){
        return "-Person -" +
                " \nname : " + this.name +
                "\nAddress : " +  this.address  +
                "\nPhone Number: " +  this.phoneNumber +
                "\nEmail Address: " +  this.emailAddress ;
    }
}
