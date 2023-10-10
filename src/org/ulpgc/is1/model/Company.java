package org.ulpgc.is1.model;

public class Company extends Contact{
    private String name;
    private String description;

    public Company(String telephone, String email, String name, String description, String street, int number, int floor, String city) {

        this.name = name;
        this.description = description;
        setAddress( street,  number,  floor,  city);
        setEmail(email);
        setTelephone(telephone);
    }
    @Override
    public String getName() {
        return name;
    }
}
