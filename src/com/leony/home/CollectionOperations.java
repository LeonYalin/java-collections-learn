package com.leony.home;

import java.util.*;

public class CollectionOperations {
    public void collectionAlgorithms() {
        PersonFixtures.reset();
        List<Person> persons = Arrays.asList(PersonFixtures.me, PersonFixtures.nelly, PersonFixtures.lisa);

        System.out.println(persons);
        Collections.rotate(persons, 1);
        System.out.println("Rotate the persons collection by 1\n" + persons);

        Collections.shuffle(persons);
        System.out.println("Shuffle the persons collection first time" + persons);
        Collections.shuffle(persons);
        System.out.println("Shuffle the persons collection second time" + persons);

        Collections.sort(persons, Person.BY_NAME_COMPARATOR);
        System.out.println("Sort the persons collection by name comparator" + persons);
        Collections.sort(persons, Person.BY_AGE_COMPARATOR);
        System.out.println("Sort the persons collection by age comparator" + persons);
        persons.sort(Person.BY_NAME_COMPARATOR);
        System.out.println("Sort can also be done using java 8 sort() method on lists" + persons);
    }

    public void collectionFactories() {
        Set<Person> singletonSet = Collections.singleton(PersonFixtures.me);
        System.out.println("Create an immutable Set with a single value using Collection.singleton: " + singletonSet);
        List<Person> singletonList = Collections.singletonList(PersonFixtures.me);
        System.out.println("Create an immutable list with a single value using Collection.singletonList: " + singletonList);
        Map<Integer, Person> singletonMap = Collections.singletonMap(1, PersonFixtures.me);
        System.out.println("Create an immutable map with a single value using Collection.singletonMap: " + singletonMap);

        Set<Person> emptySet = Collections.emptySet();
        System.out.println("\nCreate an immutable Set with no values using Collection.empty: " + emptySet);
        List<Person> emptyList = Collections.emptyList();
        System.out.println("Create an immutable list with no values using Collection.emptyList: " + emptyList);
        Map<Integer, Person> emptyMap = Collections.emptyMap();
        System.out.println("Create an immutable map with no values using Collection.emptyMap: " + emptyMap);

        List<Person> unmodifiableList = Collections.unmodifiableList(Collections.singletonList(PersonFixtures.me));
        try {
            unmodifiableList.add(PersonFixtures.lisa); // throws exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Using unmodifiable collections: list, set, map ect... " + unmodifiableList);
    }

    public void collectionUtilities() {
        List<Person> persons = new ArrayList<>();

        Collections.addAll(persons, PersonFixtures.me, PersonFixtures.nelly, PersonFixtures.lisa);
        System.out.println("Add multiple items to list using Collection.addAll method");

        System.out.println("get min element from a collection using Collection.min method: " + Collections.min(persons, Person.BY_NAME_COMPARATOR));
        System.out.println("get max element from a collection using Collection.max method: " + Collections.max(persons, Person.BY_NAME_COMPARATOR));
    }
}
