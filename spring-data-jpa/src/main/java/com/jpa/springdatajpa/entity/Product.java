package com.jpa.springdatajpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "products", uniqueConstraints = {@UniqueConstraint(name = "sku_unique", columnNames = "stock_keeping_unit")})
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "stock_keeping_unit",nullable = false)
    private String sku;
    private String name;
    private String description;
    private BigDecimal price;
    private Boolean active;
    private String imageURL;

    @CreationTimestamp private LocalDateTime createDate;
    @UpdateTimestamp private LocalDateTime updateDate;
}
