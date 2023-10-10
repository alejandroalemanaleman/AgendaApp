package org.ulpgc.is1.control;
import org.ulpgc.is1.model.*;
public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.addPerson("722310646", "alemanaleman.alejandro@gmail.com", "Alejandro", "Alemán Alemán", "El Mondalón", 2, 2, "LP");
        Contact contact1 = agenda.getContactArrayList().get(0);
        agenda.addPerson("640297330", "luciafme@gmail.com", "Lucía", "Afonso", "Las Cuevas", 2, 1, "LP" );
        Contact contact2 = agenda.getContactArrayList().get(1);
        agenda.addGroup("trabajo");
        Group group1 = agenda.getGroupArrayList().get(0);
        group1.addContact(contact1);
        System.out.println(agenda.getContactArrayList().size() + " is the number of contacts in agenda.");
        System.out.println(group1.getMembers().size() +  " is the number of contacts in group trabajo.");




    }
}
