package com.thanthiti.product_system.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "branch_stock")
public class BranchStock extends BaseDate{
    @Id
    @GeneratedValue
    private UUID branchStockId;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;
}