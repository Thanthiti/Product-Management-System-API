package com.thanthiti.product_system.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "stock_logs")
public class StockLog extends BaseDate {
    @Id
    @GeneratedValue
    private UUID stockLogId;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Enumerated(EnumType.STRING)
    private ChangeType changeType;

    private int quantity;
    private String reason;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;

    public enum ChangeType {
        INCREASE, DECREASE
    }
}


