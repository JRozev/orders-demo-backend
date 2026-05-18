package com.example.demo.order;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import com.example.demo.order.dto.OrderRequest;
import com.example.demo.order.dto.OrderResponse;
import java.util.List;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/api/orders")
    public List<Order> getOrders() {
        return orderService.getOrders();
    }

    @GetMapping("/api/orders/{id}")
    public Order getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }

    @PostMapping("/api/orders")
    public OrderResponse createOrder(@Valid @RequestBody OrderRequest request) {

        Order order = new Order();

        order.setOrderNumber(request.getOrderNumber());
        order.setStatus(request.getStatus());
        order.setApplicantName(request.getApplicantName());

        Order savedOrder = orderService.createOrder(order);

        OrderResponse response = new OrderResponse();

        response.setId(savedOrder.getId());
        response.setOrderNumber(savedOrder.getOrderNumber());
        response.setStatus(savedOrder.getStatus());
        response.setApplicantName(savedOrder.getApplicantName());

        return response;
    }

    @PostMapping("/api/orders/bulk")
    public List<Order> createOrders(@RequestBody List<Order> orders) {
        return orderService.createOrders(orders);
    }

    @PutMapping("/api/orders/{id}")
    public Order updateOrder(@PathVariable Long id,
                             @Valid @RequestBody Order updatedOrder) {
        return orderService.updateOrder(id, updatedOrder);
    }

    @DeleteMapping("/api/orders/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
    }

    @GetMapping("/api/orders/status")
    public List<Order> getOrdersByStatus(@RequestParam String status) {
        return orderService.getOrdersByStatus(status);
    }

    @GetMapping("/api/orders/search")
    public List<Order> searchOrdersByApplicantName(@RequestParam String applicantName) {
        return orderService.searchOrdersByApplicantName(applicantName);
    }
}