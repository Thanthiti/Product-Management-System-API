package com.thanthiti.product_system.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.util.UUID;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue
    private UUID roleId;

    @Column(unique = true, nullable = false)
    @NotBlank(message = "Role name is required")
    @Size(min = 3, max = 50, message = "Role name must be between 3 and 50 characters")
    @Builder.Default
    private String name = "User"; // Admin, Branch Manager, Stock Officer, Sales, Auditor

    @Column(nullable = false)
    @Size(max = 255, message = "Role description must be less than 255 characters")
    @Builder.Default
    private String description = "User role";
}