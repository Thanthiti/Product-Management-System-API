package com.thanthiti.product_system.Entity;

    import jakarta.persistence.*;

    import java.math.BigDecimal;
    import java.time.LocalDateTime;
    import java.util.UUID;

    @Entity
    @Table(name = "products")
    public class Product extends BaseDate{
        @Id
        @GeneratedValue
        private UUID productId;

        private String name;
        private String description;
        private BigDecimal price;

        @ManyToOne
        @JoinColumn(name = "category_id")
        private Category category;

        @Enumerated(EnumType.STRING)
        private ProductStatus status;


        public enum ProductStatus {
            DRAFT, ACTIVE, ARCHIVED
        }


    }



