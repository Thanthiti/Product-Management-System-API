package com.thanthiti.product_system.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.util.UUID;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue
    private UUID categoryId;

    @Column(unique = true, nullable = false)
    @NotBlank(message = "Category name is required")
    @Size(min = 3, max = 50, message = "Category name must be between 3 and 50 characters")
    private String name;

    @Column(nullable = false)
    @Size(max = 255, message = "Category description must be less than 255 characters")
    @Builder.Default
    private String description = "Category description";
}
