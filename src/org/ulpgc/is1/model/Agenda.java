package org.ulpgc.is1.model;
import java.util.ArrayList;
import java.util.List;
public class Agenda {
    private List<Group> groupArrayList;
    private List<Contact> contactArrayList;

    public Agenda() {
        groupArrayList = new ArrayList<Group>();
        contactArrayList = new ArrayList<Contact>();
    }

    public void addPerson(String telephone, String email, String firstName, String lastName, String street, int number, int floor, String city){
        Person person = new Person(telephone, email, firstName, lastName, street, number, floor, city);
        contactArrayList.add(person);
    }

    public void addCompany(String telephone, String email, String name, String description, String street, int number, int floor, String city){
        Company company = new Company(telephone, email, name, description, street, number, floor, city);
        contactArrayList.add(company);
    }
    public void addGroup(String name){
        Group group = new Group(name);
        groupArrayList.add(group);
    }

    public void removeContact(Contact contact){
        contactArrayList.remove(contact);
    }

    public List<Group> getGroupArrayList() {
        return groupArrayList;
    }

    public List<Contact> getContactArrayList() {
        return contactArrayList;
    }

    public void removeGroup(Group group){
        contactArrayList.remove(group);


    }
    //public void removeContactGroup(){}







}
