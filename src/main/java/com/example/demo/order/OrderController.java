package com.example.demo.order;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/api/orders")
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    @PostMapping("/api/orders")
    public Order createOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }
}