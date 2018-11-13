package com.leony.home;

public interface IPersonOrders {
    Person getOrder(String orderId);
    void addOrder(Person person, String orderID);
    int total();
    void clear();

}
