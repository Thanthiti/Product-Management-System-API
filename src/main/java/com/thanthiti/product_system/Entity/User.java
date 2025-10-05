package com.thanthiti.product_system.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

// 1. Users + Roles
@Entity
@Table(name = "users")

public class User extends BaseDate{
    @Id
    @GeneratedValue
    private UUID userId;

    @Column(unique = true)
    private String username;

    @JsonIgnore
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}



