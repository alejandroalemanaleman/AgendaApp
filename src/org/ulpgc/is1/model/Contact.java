package org.ulpgc.is1.model;
import java.util.List;

public abstract class Contact {
    private String telephone;
    private String email;
    private Address address;

    public void setAddress(String street, int number, int floor, String city) {
        this.address = new Address(street, number, floor, city);
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public abstract String getName();
}
