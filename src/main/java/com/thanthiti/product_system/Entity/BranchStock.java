package com.thanthiti.product_system.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "branch_stock")
public class BranchStock extends BaseDate{
    @Id
    @GeneratedValue
    private UUID branchStockId;

    @ManyToOne
    @JoinColumn(name = "branch_id", nullable = false)
    @NotNull(message = "Branch is required")
    private Branch branch;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    @NotNull(message = "Product is required")
    private Product product;

    @Column(nullable = false)
    @Builder.Default
    @PositiveOrZero
    private int quantity = 0;
}