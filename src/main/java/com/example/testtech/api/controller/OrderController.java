package com.example.testtech.api.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.testtech.api.model.Order;
import com.example.testtech.service.OrderService;

@RestController
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders")
    public Map<Integer, Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping("/placeOrder")
    public String placeOrder(@RequestBody Map<Integer, Integer> orderItems) {
        if (orderItems.isEmpty()) {
            return "Failed to place order. No products in the order.";
        }

        int orderId = orderService.placeOrder(orderItems);
        return "Order placed successfully. Order Id: " + orderId;
    }
}
