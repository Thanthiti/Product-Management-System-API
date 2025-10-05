package com.thanthiti.product_system.Entity;

    import jakarta.persistence.*;
    import jakarta.validation.constraints.NotBlank;
    import jakarta.validation.constraints.NotNull;
    import jakarta.validation.constraints.Size;
    import lombok.Builder;

    import java.math.BigDecimal;
    import java.time.LocalDateTime;
    import java.util.UUID;

    @Entity
    @Table(name = "products")
    public class Product extends BaseDate{
        @Id
        @GeneratedValue
        private UUID productId;

        @Column(unique = true, nullable = false)
        @NotBlank(message = "Product name is required")
        @Size(min = 3, max = 50, message = "Product name must be between 3 and 50 characters")
        @Builder.Default
        private String name = "Product name";

        @Column(nullable = false)
        @Size(max = 255, message = "Product description must be less than 255 characters")
        @Builder.Default
        private String description = "Product description";

        @Column(nullable = false)
        @Builder.Default
        private BigDecimal price = BigDecimal.ZERO;

        @ManyToOne
        @JoinColumn(name = "category_id", nullable = false)
        @NotNull(message = "Category is required")
        private Category category;

        @Enumerated(EnumType.STRING)
        @NotNull(message = "Product status is required")
        @Builder.Default
        private ProductStatus status = ProductStatus.DRAFT;


        public enum ProductStatus {
            DRAFT, ACTIVE, ARCHIVED
        }
    }



