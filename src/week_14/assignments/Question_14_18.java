package week_14.assignments;

public class Question_14_18 {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        contactManager.addContact("Steve Doe","1234567890");
        contactManager.addContact("Jane Smith","9087654310");

        System.out.println("Steve Doe's phone number: "+contactManager.searchByName("Steve Doe") );
        System.out.println("owner of tel number 9087654310:  "+contactManager.searchByPhoneNumber("9087654310") );
    }
}
