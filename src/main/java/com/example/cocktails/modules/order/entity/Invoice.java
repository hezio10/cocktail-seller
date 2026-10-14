package com.example.cocktails.modules.order.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "invoices")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, precision = 10, scale = 2)
    private double totalAmount;

    @Enumerated(EnumType.STRING)
    private InvoiceStatus status;
}
