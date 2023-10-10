package org.ulpgc.is1.model;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Group {

    private final String name;
    private List<Member> members = new ArrayList<>();

    public Group(String name) {
        this.name = name;
        ;
    }

    public void addContact(Contact contact){
        members.add(new Member(LocalDateTime.now(), contact));
    }

    public void removeContact(int index){
        members.remove(index);
    }

    public String getName() {
        return name;
    }


    public List<Member> getMembers() {
        return members;
    }
}