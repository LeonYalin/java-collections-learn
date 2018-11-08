package com.leony.test;

import com.leony.home.PersonFixtures;
import com.leony.home.PersonsGroup;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonsGroupTest {
    private PersonsGroup group;

    @Before
    public void createEmptyGroup() {
        group = new PersonsGroup();
    }

    @Test
    public void shouldCreateEmptyGroup() {
        assertNotNull(group.getGroup());
    }

    @Test
    public void shouldAddPerson() {
        assertEquals(group.size(), 0);
        group.add(PersonFixtures.me);
        assertEquals(group.size(), 1);
        assertTrue(group.contains(PersonFixtures.me));
    }

    @Test
    public void shouldClearGroup() {
        group.add(PersonFixtures.me);
        assertEquals(group.size(), 1);
        group.clear();
        assertEquals(group.size(), 0);
    }

    @Test
    public void shouldReplacePerson() {
        group.add(PersonFixtures.me);
        group.replace(PersonFixtures.me, PersonFixtures.nelly);
        assertTrue(group.contains(PersonFixtures.nelly));
    }

    @Test
    public void shouldNotReplacePerson() {
        group.add(PersonFixtures.me);
        group.replace(PersonFixtures.lisa, PersonFixtures.nelly);
        assertFalse(group.contains(PersonFixtures.nelly));
    }

    @Test
    public void shouldSortPersonsByLastName() {
        group.add(PersonFixtures.me);
        group.add(PersonFixtures.nelly);
        group.add(PersonFixtures.lisa);
        group.add(PersonFixtures.mom);
        group.sort();
        assertTrue(group.get(0).equals(PersonFixtures.lisa));
    }
}
