package com.leony.home;

import java.util.HashMap;
import java.util.Map;

public class PersonOrders implements IPersonOrders {
    private Map<String, Person> orders = new HashMap<>();

    @Override
    public Person getOrder(String id) {
        return orders.get(id);
    }

    @Override
    public void addOrder(Person person, String id) {
        orders.put(id, person);
    }

    @Override
    public int total() {
        return orders.size();
    }

    @Override
    public void clear() {
        orders.clear();
    }
}
