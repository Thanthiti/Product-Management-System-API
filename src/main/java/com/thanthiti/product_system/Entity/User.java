package com.thanthiti.product_system.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

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

    @Column(unique = true, nullable = false)
    @NotBlank(message = "Username is required")
    @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters")
    private String username;

    @Column(unique = true, nullable = false)
    @NotBlank(message = "Email is required")
    @Size(min = 3, max = 50, message = "Email must be between 3 and 50 characters")
    @Email(message = "Email must be valid")
    private String email;

    @JsonIgnore
    @NotBlank(message = "Password is required")
    @Size(min = 6, max = 100, message = "Password must be between 6 and 100 characters")
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    @NotNull(message = "Role is required")
    private Role role;

}



