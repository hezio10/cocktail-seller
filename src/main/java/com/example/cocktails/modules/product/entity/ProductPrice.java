package com.example.cocktails.modules.product.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product_prices")
public class ProductPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, precision = 10, scale = 2)
    private double price;

    @Column(nullable = false)
    private Integer isActive;

    @Column(nullable = false)
    private String expirationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;
}
