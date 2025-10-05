package com.thanthiti.product_system.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "branches")
public class Branch extends BaseDate{
    @Id
    @GeneratedValue
    private UUID branchId;

    @Column(unique = true, nullable = false)
    @NotBlank(message = "Branch name is required")
    @Size(min = 3, max = 50, message = "Branch name must be between 3 and 50 characters")
    private String name;

    @Column(nullable = false)
    @Size(max = 255, message = "Branch description must be less than 255 characters")
    @Builder.Default
    private String description = "Branch description";

    @Column(nullable = false)
    @Size(max = 255, message = "Branch location must be less than 255 characters")
    @Builder.Default
    private String location = "Branch location";

}