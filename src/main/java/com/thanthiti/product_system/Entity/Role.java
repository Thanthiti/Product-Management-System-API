package com.thanthiti.product_system.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue
    private UUID roleId;

    private String name; // Admin, Branch Manager, Stock Officer, Sales, Auditor
    private String description;
}