package com.thanthiti.product_system.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "branches")
public class Branch extends BaseDate{
    @Id
    @GeneratedValue
    private UUID branchId;

    private String name;
    private String description;
    private String location;

}