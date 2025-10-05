package com.thanthiti.product_system.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "audit_logs")
public class AuditLog extends BaseDate{
    @Id
    @GeneratedValue
    private UUID logId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String action; // CREATE/UPDATE/DELETE/IMPORT/EXPORT

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = true)
    private Product product;

    @Column(columnDefinition = "TEXT")
    private String details; // JSON or text
}