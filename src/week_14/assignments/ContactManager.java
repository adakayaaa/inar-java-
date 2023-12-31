package week_14.assignments;

import java.util.*;

public class ContactManager {
    private java.util.Map<String, String> contacts;

    public ContactManager() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        this.contacts.put(name, phoneNumber);
    }

    public String searchByName(String name) {
        String phoneNumber = contacts.get(name);
        return phoneNumber;
    }

    public String searchByPhoneNumber(String phoneNumber) {
        Set<String> keySet=contacts.keySet();
        ArrayList<String> name =new ArrayList<>(keySet);

        for (int i = 0; i < name.size(); i++) {
           if(this.contacts.get(name.get(i)).equals(phoneNumber)){
               return name.get(i);
           }
        }
        return "invalid input";
    }



}
