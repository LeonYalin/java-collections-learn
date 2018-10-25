package com.leony.test;

import com.leony.home.PersonFixtures;
import com.leony.home.PersonsGroup;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonsGroupTest {
    private PersonsGroup group;

    @Before
    public void createEmptyGroup() {
        group = new PersonsGroup();
    }

    @Test
    public void shouldCreateEmptyGroup() {
        Assert.assertNotNull(group.getGroup());
    }

    @Test
    public void shouldAddPerson() {
        Assert.assertEquals(group.size(), 0);
        group.add(PersonFixtures.me);
        Assert.assertEquals(group.size(), 1);
        Assert.assertTrue(group.contains(PersonFixtures.me));
    }

    @Test
    public void shouldClearGroup() {
        group.add(PersonFixtures.me);
        Assert.assertEquals(group.size(), 1);
        group.clear();
        Assert.assertEquals(group.size(), 0);
    }

    @Test
    public void shouldReplacePerson() {
        group.add(PersonFixtures.me);
        group.replace(PersonFixtures.me, PersonFixtures.nelly);
        Assert.assertTrue(group.contains(PersonFixtures.nelly));
    }

    @Test
    public void shouldNotReplacePerson() {
        group.add(PersonFixtures.me);
        group.replace(PersonFixtures.lisa, PersonFixtures.nelly);
        Assert.assertFalse(group.contains(PersonFixtures.nelly));
    }

    @Test
    public void shouldSortPersonsByLastName() {
        group.add(PersonFixtures.me);
        group.add(PersonFixtures.nelly);
        group.add(PersonFixtures.lisa);
        group.add(PersonFixtures.mom);
        group.sort();
        Assert.assertTrue(group.get(0).equals(PersonFixtures.lisa));
    }
}
