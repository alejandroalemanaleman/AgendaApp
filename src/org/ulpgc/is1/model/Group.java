package org.ulpgc.is1.model;
import java.util.List;


public class Group {
    private final String name;
    private List<Contact> contacts;
    public Group(String name){
        this.name = name;
    }

    public void addContact(String telephone, String email){
        Contact contact = new Contact(telephone, email);
        contacts.add(contact);
    }
}
