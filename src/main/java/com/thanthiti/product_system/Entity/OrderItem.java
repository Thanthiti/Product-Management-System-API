package com.thanthiti.product_system.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Builder;

import java.util.UUID;

@Entity
@Table(name = "order_items")
public class OrderItem {
    @Id
    @GeneratedValue
    private UUID orderItemId;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    @NotNull(message = "Order is required")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    @NotNull(message = "Product is required")
    private Product product;

    @Column(nullable = false)
    @Builder.Default
    @PositiveOrZero
    private int quantity = 1;
}