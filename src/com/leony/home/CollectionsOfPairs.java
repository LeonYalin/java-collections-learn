package com.leony.home;

import java.util.*;

public class CollectionsOfPairs {
    public void java8Enhancements() {
        Map<String, Person> persons = new HashMap<>();
        persons.put("me", PersonFixtures.me);
        persons.put("nelly", PersonFixtures.nelly);
        persons.put("lisa", PersonFixtures.lisa);

        System.out.println("Replace a person map entry using replace method:");
        persons.replace("me", PersonFixtures.mom);
        System.out.println(persons);

        System.out.println("Replace all person map entries using replaceAll method:");
        persons.replaceAll((k, v) -> {
            v.setName(v.getName() + "_updated");
            return v;
        });
        System.out.println(persons);

        System.out.println("Remove an entry from person map using remove method:");
        persons.remove("me", PersonFixtures.mom);
        System.out.println(persons);

        Person getOrDefaultPerson = persons.getOrDefault("lalala", PersonFixtures.defaultPerson);
        System.out.println("Get a non existing map entry using getOrDefault method: " + getOrDefaultPerson);

        Person putIfAbsent = persons.putIfAbsent("lisa", PersonFixtures.lisa);
        System.out.println("Put an existing map entry using putIfAbsent method. Will not update: " + putIfAbsent);
        System.out.println(persons);

        Person computedPerson = persons.compute("lisa", (k, v) -> {
             v.setName(v.getName() + "_computed");
             return v;
        });
        System.out.println("Modify a map value using compute method:" + computedPerson);
        System.out.println(persons);

        Person computedIfPresentPerson = persons.computeIfPresent("lisa", (k, v) -> {
            v.setName(v.getName() + "_computeIfPresent");
            return v;
        });
        System.out.println("Modify a map value if exists using computeIfPresent method: " + computedIfPresentPerson);
        System.out.println(persons);

        Person computedIfAbsentPerson = persons.computeIfAbsent("lisa", v -> PersonFixtures.defaultPerson);
        System.out.println("Modify a map value if not exists using computedIfAbsentPerson method: " + computedIfAbsentPerson);
        System.out.println(persons);

        Person mergedPerson = persons.merge("lisa", PersonFixtures.defaultPerson, (oldPerson, newPerson) -> {
            newPerson.setName(oldPerson.getName() + "___" + newPerson.getName());
            newPerson.setAge(oldPerson.getAge() + newPerson.getAge());
            return newPerson;
        });
        System.out.println("Merge a map value with another one using merged method: " + mergedPerson);
        System.out.println(persons);

        System.out.println("Print persons using forEach loop");
        persons.forEach((k, v) -> System.out.printf("%s %s\n", k, v));
    }

    public void playWithMaps() {
        Map<String, Person> persons = new HashMap<>();

        persons.put("me", PersonFixtures.me);
        System.out.println("Add an element to map via push() method.");

        Map<String, Person> otherPersons = new HashMap<>();
        otherPersons.put("me", PersonFixtures.me);
        otherPersons.put("nelly", PersonFixtures.nelly);
        persons.putAll(otherPersons);
        System.out.println("Add multiple element to map via pushAll() method.");

        persons.put(null, PersonFixtures.me);
        persons.put(null, null);
        System.out.println("Add an element with null key or value will NOT fail.");
        System.out.println("Persons map for now: " + persons);

        System.out.println("Get an element from map by key 'me'. " + persons.get("me"));
        System.out.println("Check if map contains key 'me'. " + persons.containsKey("me"));
        System.out.println("Check if map contains value 'PersonFixtures.me'. " + persons.containsValue(persons.get("me")));
        System.out.println("Remove an element from map by key 'me'. " + persons.remove("me"));

        persons.clear();
        System.out.println("Clear all elements from map using clear() method");
        System.out.println("Map size after using the clear() method is: " + persons.size());
        System.out.println("Map is empty after using the clear() method: " + persons.isEmpty());

        persons.putAll(otherPersons);
        Set<String> personsKeySet = persons.keySet();
        System.out.println("The keySet of the map is: " + personsKeySet);
        System.out.println("Deleting a key from keySet also deletes it from the map. Remove 'me' key");
        personsKeySet.remove("me");
        System.out.printf("Keyset: %s, map: %s\n", personsKeySet, persons);
        persons.clear();

        persons.putAll(otherPersons);
        Collection<Person> personsValues = persons.values();
        System.out.println("The values of the map are: " + personsValues);
        System.out.println("Deleting a value from values also deletes it from the keys. Remove 'me' person");
        personsValues.remove(PersonFixtures.me);
        System.out.println(persons);
        persons.clear();

        persons.putAll(otherPersons);
        Set<Map.Entry<String, Person>> personsEntries = persons.entrySet();
        System.out.println("The entries of the map are: " + personsEntries);
        System.out.println("Iterating on map entries. It is also possible to change the entry value during iteration");
        for (Map.Entry<String, Person> entry : personsEntries) {
            entry.setValue(PersonFixtures.lisa);
        }
        System.out.println(personsEntries);
        persons.clear();
    }

    public void playWithSortedMaps() {
        SortedMap<Integer, Person> sortedMap = new TreeMap<>();

        sortedMap.put(2, PersonFixtures.me);
        sortedMap.put(1, PersonFixtures.nelly);
        sortedMap.put(3, PersonFixtures.lisa);

        System.out.println("Sorted map" + sortedMap);
        System.out.println("\nGet first key from sorted map: " + sortedMap.firstKey());
        System.out.println("Get last key from sorted map: " + sortedMap.lastKey());
        System.out.println("Get head map from sorted map: " + sortedMap.headMap(2));
        System.out.println("Get tail map from sorted map: " + sortedMap.tailMap(2));
        System.out.println("Get sub map from sorted map: " + sortedMap.subMap(1, 2));

        NavigableMap<Integer, Person> navigableMap = new TreeMap<>(sortedMap);
        System.out.println("\nGet first entry from navigable map: " + navigableMap.firstEntry());
        System.out.println("Get last entry from navigable map: " + navigableMap.lastEntry());
        System.out.println("Poll first entry from navigable map. Polling the element removes is from the map " + navigableMap.pollFirstEntry());
        System.out.println("Poll last entry from navigable map. Polling the element removes is from the map " + navigableMap.pollLastEntry());

        navigableMap.clear();
        navigableMap.putAll(sortedMap);
        System.out.println("\nGet lower entry from navigable map: " + navigableMap.lowerEntry(2));
        System.out.println("Get higher entry from navigable map: " + navigableMap.higherEntry(2));
        System.out.println("Get lower key from navigable map: " + navigableMap.lowerKey(2));
        System.out.println("Get higher key from navigable map: " + navigableMap.higherKey(2));

        System.out.println("\nGet floor entry from navigable map: " + navigableMap.floorEntry(2));
        System.out.println("Get ceiling entry from navigable map: " + navigableMap.ceilingEntry(2));
        System.out.println("Get floor key from navigable map: " + navigableMap.floorKey(2));
        System.out.println("Get ceiling key from navigable map: " + navigableMap.ceilingKey(2));

        System.out.println("\nGet descending map from navigable map: " + navigableMap.descendingMap());
        System.out.println("Get descending keySet from navigable map: " + navigableMap.descendingKeySet());
        System.out.println("Get navigable keySet from navigable map: " + navigableMap.navigableKeySet());

        System.out.println("\nGet tail map from navigable map: " + navigableMap.tailMap(2));
        System.out.println("Get head map from navigable map: " + navigableMap.headMap(2));
        System.out.println("Get sub map from navigable map: " + navigableMap.subMap(1, 2));
    }
}
