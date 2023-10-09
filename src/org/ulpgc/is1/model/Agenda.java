package org.ulpgc.is1.model;
import java.util.ArrayList;
import java.util.List;
public class Agenda {
    private ArrayList<Person> personArrayList;
    private ArrayList<Company> companyArrayList;
    private ArrayList<Group> groupArrayList;


    public void addPerson(String telephone, String email, String firstName, String lastName){
        Person person = new Person(telephone, email, firstName, lastName);
        personArrayList.add(person);
    }

    public void addCompany(String telephone, String email, String name, String description){
        Company company = new Company(telephone, email, name, description);
        companyArrayList.add(company);
    }
    public void addGroup(String name){
        Group group = new Group(name);
        personArrayList.add(group);
    }





}
