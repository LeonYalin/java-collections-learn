package com.leony.home;

public class PersonWithHobby {
    private Person person;
    private Hobbies hobby;

    public PersonWithHobby(Person person, Hobbies hobby) {
        this.person = person;
        this.hobby = hobby;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return String.format("[%s; %s]", person, hobby);
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Hobbies getHobby() {
        return hobby;
    }

    public void setHobby(Hobbies hobby) {
        this.hobby = hobby;
    }
}
