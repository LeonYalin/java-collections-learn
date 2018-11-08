package com.leony.home;

import java.util.Arrays;

public class WhatAreCollections {
    public void theProblemWithArrays() {
        Person persons[] = { PersonFixtures.me, PersonFixtures.nelly };

        System.out.println("Print array using toString:");
        System.out.println(persons.toString());

        System.out.println("\nPrint array using Arrays.toString:");
        System.out.println(Arrays.toString(persons));

        System.out.println("Add element to array using a  helper function");
        this.addElementToArray(PersonFixtures.lisa, persons);

        System.out.println("Arrays doesn't provide many useful features such as find by index, duplication check ect..");
    }

    private void addElementToArray(Person newPerson, Person persons[]) {
        Person newPersons[] = Arrays.copyOf(persons, persons.length + 1);
        newPersons[persons.length] = newPerson;
    }
}
