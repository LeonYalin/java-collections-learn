package com.leony.home;

import java.util.*;
import java.util.function.Predicate;

public class PersonsWaitingList {
    private static final Comparator<PersonWithHobby> BY_PRIORITY = Comparator.comparing(p -> p.getHobby().ordinal());
    private final Queue<PersonWithHobby> personQueue = new PriorityQueue<>(BY_PRIORITY);

    public Person add(Person person, Hobbies hobby) {
        PersonWithHobby personToAdd = new PersonWithHobby(person, hobby);
        boolean success = personQueue.offer(personToAdd);
        return success ? person : null;
    }

    public void process() {
        Iterator<PersonWithHobby> iterator = personQueue.iterator();
        // Example on how to use conditions as variables in JavaScript-like way
        Predicate<Iterator<PersonWithHobby>> predicate = it -> it.hasNext();
        while (predicate.test(iterator)) {
            PersonWithHobby person = iterator.next();
            System.out.println(person);
            iterator.remove();
        }
    }

    public int total() {
        return personQueue.size();
    }

    public Queue<PersonWithHobby> getPersonQueue() {
        return personQueue;
    }
}
