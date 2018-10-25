package com.leony.home;

import java.util.ArrayList;
import java.util.List;

public class CollectionsWithIterationOrder {
    public void tryListCommonMethods() {
        List<Person> persons = new ArrayList<>();
        Person me = new Person("Leon Yalin", 32);
        Person nelly = new Person("Nelly Yalin", 30);
        persons.add(me);
        persons.add(nelly);

        System.out.println("Use list get() method: element at index 1 " + persons.get(1));

        Person lisa = new Person("Lisa Yalin", 0);
        persons.set(0, lisa);
        System.out.println("Use list set() method: set element at index 0 " + persons);

        persons.add(new Person("bla bla", 234));
        System.out.println("Use list remove() method: before remove" + persons);
        persons.remove(2);
        System.out.println("Use list remove() method: remove element at index 2 " + persons);

        System.out.println("Use list indexOf() method: index of Lisa " + persons.indexOf(lisa));
        System.out.println("Use list subList() method: " + persons.subList(0, 1));
    }
}
