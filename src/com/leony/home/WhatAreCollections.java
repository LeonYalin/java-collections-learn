package com.leony.home;

import java.util.Arrays;

public class WhatAreCollections {
    public void theProblemWithArrays() {
        Person persons[] = {
                new Person("Leon Yalin", 32),
                new Person("Nelly Yalin", 30)
        };

        System.out.println("Print array using toString:");
        System.out.println(persons.toString());

        System.out.println("\nPrint array using Arrays.toString:");
        System.out.println(Arrays.toString(persons));

        System.out.println("\nAdd element to array using a  helper function");
        Person newPerson = new Person("Lisa Yalin", 0);
        this.addElementToArray(newPerson, persons);

        System.out.println("\nArrays doesn't provide many useful features such as find by index, duplication check ect..");
    }

    private void addElementToArray(Person newPerson, Person persons[]) {
        Person newPersons[] = Arrays.copyOf(persons, persons.length +1);
        newPersons[persons.length] = newPerson;
    }
}
