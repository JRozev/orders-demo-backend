package com.example.demo.order.dto;

import jakarta.validation.constraints.NotBlank;
import com.example.demo.order.OrderStatus;
import jakarta.validation.constraints.NotNull;

public class OrderRequest {

    @NotBlank(message = "Order number is required")
    private String orderNumber;
    @NotNull(message = "Status is required")
    private OrderStatus status;
    @NotBlank(message = "Applicant name is required")
    private String applicantName;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }
}