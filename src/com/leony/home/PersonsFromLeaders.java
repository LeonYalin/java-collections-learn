package com.leony.home;

import java.util.*;

public class PersonsFromLeaders {
    Set<Person> personsFromLeaders = new HashSet<>();
    Set<Person> personsFromLeadersSorted = new TreeSet<>(Person.BY_NAME_COMPARATOR);

    public PersonsFromLeaders() {}

    public PersonsFromLeaders(List<GroupLeader> leaders) {
        for (GroupLeader leader : leaders) {
            personsFromLeaders.addAll(leader.getGroup());
            personsFromLeadersSorted.addAll(leader.getGroup());
        }
    }

    public Set<Person> getPersonsFromLeaders() {
        return personsFromLeaders;
    }

    public void setPersonsFromLeaders(Set<Person> personsFromLeaders) {
        this.personsFromLeaders = personsFromLeaders;
    }

    public Set<Person> getPersonsFromLeadersSorted() {
        return personsFromLeadersSorted;
    }

    public void setPersonsFromLeadersSorted(Set<Person> personsFromLeadersSorted) {
        this.personsFromLeadersSorted = personsFromLeadersSorted;
    }
}
