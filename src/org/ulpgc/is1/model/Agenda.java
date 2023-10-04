package org.ulpgc.is1.model;
import java.util.List;
public class Agenda {
    private List<Person> personList;
    private List<Company> companyList;
    // contactList = new ArrayList<>();
    // groupList = new ArrayList<>();
    public void addPerson(String telephone, String email, String firstName, String lastName){
        Person person = new Person(telephone, email, firstName, lastName);
        personList.add(person);
    }
    public void addCompany(String telephone, String email, String name, String description){
            Company company = new Company(telephone, email, name, description);
            companyList.add(company);
    }
}
