package com.thanthiti.product_system.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "orders")
public class Order extends BaseDate{
    @Id
    @GeneratedValue
    private UUID orderId;

    @ManyToOne
    @JoinColumn(name = "branch_id", nullable = false)
    @NotNull(message = "Branch is required")
    private Branch branch;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    @NotNull(message = "Order items are required")
    private List<OrderItem> items;
}