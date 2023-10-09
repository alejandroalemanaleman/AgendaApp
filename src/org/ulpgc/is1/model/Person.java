package org.ulpgc.is1.model;

public class Person extends Contact {
    private String firstName, secondName;

    public Person(String telephone, String email, String firstName, String secondName) {
        super(telephone, email);
        this.firstName = firstName;
        this.secondName= secondName;
    }

    public String getName(){
        return firstName + " " + secondName;
    }
}
