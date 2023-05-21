package com.turkcell.bootcamp.project.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

// product içindeki eksik alanları tamamla.
public class Product {
    @Column(name="product_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short productId;

    @Column(name = "unit_price")
    private float unitPrice;

    @ManyToOne()
    @JoinColumn(name="category_id")
    private Category category;
}
// 6:20

// SQL => Ödev