package org.ulpgc.is1.model;

public class Person extends Contact {
    private String firstName, secondName;

    public Person(String telephone, String email, String firstName, String secondName, String street, int number, int floor, String city) {
        this.firstName = firstName;
        this.secondName= secondName;
        setEmail(email);
        setTelephone(telephone);
        setAddress(street, number, floor, city);
    }

    @Override
    public String getName(){
        return firstName + " " + secondName;
    }


}
