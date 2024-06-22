package com.example.productmanagement.model;


import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private BigDecimal price;
    private Boolean available;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}

