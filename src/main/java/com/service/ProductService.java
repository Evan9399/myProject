package com.service;

import java.util.List;

import com.project.sake.dto.request.ProductRequest;
import com.project.sake.entity.Product;

public interface ProductService {
    /**
     * 新增商品
     * 
     * @param productAdd
     * @return
     */
    public Product addProduct(ProductRequest addProduct);

    /**
     * 更新商品
     * 
     * @param updateProduct
     * @return
     */
    public Product update(Integer id, ProductRequest updateProduct);

    /**
     * 刪除商品
     * 
     * @param deleteProduct
     * @return
     */
    public Product delProduct(ProductRequest deleteProduct);

    /**
     * 查詢所有商品
     * 
     * @return
     */
    public List<Product> findAll();
}
