package com.project.sake.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    /**
     * 商品編號
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商品名稱
     */
    @Column(name = "product_name", nullable = false)
    private String name;

    /**
     * 商品描述
     */
    @Column(name = "product_description", nullable = true)
    private String description;

    /**
     * 商品價格
     */
    @Column(name = "product_price", nullable = false)
    private double price;
    /**
     * 商品數量
     */
    @Column(name = "product_quantity", nullable = false)
    private int quantity;
}