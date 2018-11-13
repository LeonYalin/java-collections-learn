package com.leony.test;

import com.leony.home.Person;
import com.leony.home.PersonFixtures;
import com.leony.home.PersonOrders;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.UUID;

public class PersonOrdersTest {
    private PersonOrders orders = new PersonOrders();

    @Before
    public void beforeEach() {
        orders.clear();
    }

    @Test
    public void shouldAddOrder() {
        assertEquals(orders.total(), 0);
        orders.addOrder(PersonFixtures.me, "me");
        orders.addOrder(PersonFixtures.nelly, "nelly");
        assertEquals(orders.total(), 2);
    }

    @Test
    public void shouldGetOrder() {
        String MY_ORDER_ID = "me";
        orders.addOrder(PersonFixtures.me, MY_ORDER_ID);
        Person me = orders.getOrder(MY_ORDER_ID);
        assertEquals(me, PersonFixtures.me);
    }

    @Test
    public void shouldClearAllOrders() {
        orders.addOrder(PersonFixtures.me, "me");
        orders.addOrder(PersonFixtures.nelly, "nelly");
        orders.clear();
        assertEquals(orders.total(), 0);
    }

    @Test
    public void shouldCreateMultiplePersonsFast() {
        final int ORDER_ITERATIONS_NUM = 20000;
        Person testPerson = new Person("Test Person", 30);
        String uniqueID;
        final long startTime = System.currentTimeMillis();

        for (int i = 0; i < ORDER_ITERATIONS_NUM; i++) {
            uniqueID = UUID.randomUUID().toString();
            orders.addOrder(testPerson, uniqueID);
        }

        final long endTime = System.currentTimeMillis();
        long delta = endTime - startTime;
        System.out.printf("PersonOrders performance test: insertion of %d items took %d\n", ORDER_ITERATIONS_NUM, delta);
        assertTrue(delta < 1000);
    }
}
