package com.example.testtech.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;
import com.example.testtech.api.model.Order;

@Service
public class OrderService {

    private Map<Integer, Order> orderMap;
    private AtomicInteger orderIdCounter;

    public OrderService() {
        orderMap = new HashMap<>();
        orderIdCounter = new AtomicInteger(1); // Start with order ID 1
    }

    public Map<Integer, Order> getAllOrders() {
        return orderMap;
    }

    public int placeOrder(Map<Integer, Integer> orderItems) {
        int orderId = orderIdCounter.getAndIncrement();
        Order order = new Order(orderItems);
        orderMap.put(orderId, order);
        return orderId;
    }
}
