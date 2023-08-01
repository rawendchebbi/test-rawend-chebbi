package com.example.testtech.api.model;

import java.util.Map;

public class Order {

    private Map<Integer, Integer> orderItems;

    public Order(Map<Integer, Integer> orderItems) {
        this.orderItems = orderItems;
    }

    public Map<Integer, Integer> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Map<Integer, Integer> orderItems) {
        this.orderItems = orderItems;
    }

    public boolean hasOrderItems() {
        return orderItems != null && !orderItems.isEmpty();
    }
}
