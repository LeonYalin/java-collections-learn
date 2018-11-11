package com.leony.test;

import com.leony.home.Hobbies;
import com.leony.home.Person;
import com.leony.home.PersonFixtures;
import com.leony.home.PersonsWaitingList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonsWaitingListTest {
    private PersonsWaitingList personsWaitingList;

    @Before
    public void beforeEach() {
        personsWaitingList = new PersonsWaitingList();
    }

    @Test
    public void shouldCreateEmptyList() {
        assertNotNull(personsWaitingList.getPersonQueue());
    }

    @Test
    public void shouldAddPersonToList() {
        Person addedPerson = personsWaitingList.add(PersonFixtures.me, Hobbies.MUSIC);
        assertEquals(personsWaitingList.total(), 1);
        assertEquals(addedPerson, PersonFixtures.me);
    }

    @Test
    public void shouldProcessAllPersonsInList() {
        personsWaitingList.add(PersonFixtures.me, Hobbies.MUSIC);
        personsWaitingList.add(PersonFixtures.nelly, Hobbies.SPORT);
        personsWaitingList.process();
        assertEquals(personsWaitingList.total(), 0);
    }
}
