package com.project.sake.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.sake.dto.request.ProductRequest;
import com.project.sake.dto.response.ProductResponse;
import com.project.sake.entity.Product;

@Service
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
    public void delProduct(Integer id);

    /**
     * 查詢所有商品
     * 
     * @return
     */
    public List<ProductResponse> findAll();

    public ProductResponse findById(Integer id);
}
