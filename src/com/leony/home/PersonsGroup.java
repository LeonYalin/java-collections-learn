package com.leony.home;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PersonsGroup implements Iterable<Person> {
    private List<Person> group = new ArrayList<>();

    public List<Person> getGroup() {
        return group;
    }

    public boolean add(Person p) {
        return group.add(p);
    }

    public boolean replace(Person oldPerson, Person newPerson) {
        int index = group.indexOf(oldPerson);
        if (index == -1) return false;
        group.set(index, newPerson);
        return true;
    }

    public boolean remove(Person p) {
        return group.remove(p);
    }

    public int size() {
        return group.size();
    }

    public void clear() {
        group.clear();
    }

    public boolean contains(Person p) {
        return group.contains(p);
    }

    public void sort() {
        group.sort(Comparator.comparing(Person::getAge));
    }

    public Person get(int index) {
        return group.get(index);
    }

    @Override
    public Iterator<Person> iterator() {
        return group.iterator();
    }
}
