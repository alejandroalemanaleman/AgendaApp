package org.ulpgc.is1.model;
import java.util.ArrayList;
import java.util.List;


public class Group {

    private final String name;
    private ArrayList<Contact> contactArrayList;

    public Group(String name) {
        this.name = name;
    }

    public void addContact(Contact contact){
        contactArrayList.add(contact);
    }

    public void removeContact(Contact contact){
        contactArrayList.remove(contact);
    }


}