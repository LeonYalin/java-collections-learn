package com.leony.home;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DefiningAndIteratingCollections {
    public void tryCollectionCommonMethods() {
        List<Person> persons = new ArrayList<>();
        persons.add(PersonFixtures.me);
        persons.add(PersonFixtures.nelly);

        System.out.println("Created persons collection: " + persons);
        System.out.println("Use collection size() method: size is " + persons.size());
        System.out.println("Use collection isEmpty() method: is empty " + persons.isEmpty());

        persons.add(PersonFixtures.lisa);
        System.out.println("Use collection add() method: " + persons);

        persons.remove(PersonFixtures.lisa);
        System.out.println("Use collection remove() method: " + persons);

        List<Person> personsToAdd = new ArrayList<>();
        personsToAdd.add(PersonFixtures.lisa);
        personsToAdd.add(PersonFixtures.mom);
        persons.addAll(personsToAdd);
        System.out.println("Use collection addAll() method: " + persons);

        persons.removeAll(personsToAdd);
        System.out.println("Use collection removeAll() method: " + persons);

        persons.addAll(personsToAdd);
        persons.retainAll(personsToAdd);
        System.out.println("Use collection retainAll() method: " + persons);

        persons.clear();
        System.out.println("Use collection clear() method: " + persons);

        persons.add(PersonFixtures.me);
        persons.add(PersonFixtures.nelly);
        persons.addAll(personsToAdd);
        System.out.println("Use collection contains() method: " + persons.contains(PersonFixtures.me));
        System.out.println("Use collection containsAll() method: " + persons.containsAll(personsToAdd));

        System.out.println("Iterate the collection using iterator:");
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
            if (person.getName().equals("Leon")) {
                System.out.println("Elements can be removed during iteration using the iterator!!");
                iterator.remove();
            }
        }
    }
}
