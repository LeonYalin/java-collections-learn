package com.leony.home;

import java.util.*;

public class CollectionsWithUniqueness {
    public void playWithSets() {
        List<GroupLeader> leaders = Arrays.asList(PersonFixtures.goodLeader, PersonFixtures.soSoLeader, PersonFixtures.womenLeader);
        PersonsFromLeaders allPersonsFromLeaders = new PersonsFromLeaders(leaders);
        HashSet<Person> personsSet = (HashSet<Person>) allPersonsFromLeaders.getPersonsFromLeaders();
        SortedSet<Person> personsSortedSet = (SortedSet<Person>) allPersonsFromLeaders.getPersonsFromLeadersSorted();
        TreeSet<Person> personsTreeSet = (TreeSet<Person>) allPersonsFromLeaders.getPersonsFromLeadersSorted();
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(12);
        numbers.add(2);
        numbers.add(45);
        numbers.add(-2);

        System.out.println("persons set: " + personsSet);
        System.out.println("persons sorted set: " + personsSortedSet);
        System.out.println("persons set first element: " + personsSortedSet.first());
        System.out.println("persons set last element: " + personsSortedSet.last());

        System.out.println("\nUse the SortedSet interface methods");
        System.out.println("persons sorted set tailSet: " + personsSortedSet.tailSet(PersonFixtures.nelly));
        System.out.println("persons sorted set headSet: " + personsSortedSet.headSet(PersonFixtures.lisa));
        System.out.println("persons sorted set subSet: " + personsSortedSet.subSet(PersonFixtures.mom, PersonFixtures.me));

        System.out.println("\nUse the NavigableSet interface methods");
        System.out.println("persons tree set lower: " + personsTreeSet.lower(PersonFixtures.me));
        System.out.println("persons tree set higher: " + personsTreeSet.higher(PersonFixtures.me));
        System.out.println("persons tree set floor: " + personsTreeSet.floor(PersonFixtures.me));
        System.out.println("persons tree set ceiling: " + personsTreeSet.ceiling(PersonFixtures.me));
        System.out.println("persons tree set pollFirst: " + personsTreeSet.pollFirst());
        System.out.println("persons tree set pollLast: " + personsTreeSet.pollLast());

        System.out.println("numbers set: " + numbers);
        System.out.println("numbers tree set floor: " + numbers.floor(4));
        System.out.println("numbers tree set ceiling: " + numbers.ceiling(4));
    }
}
