package com.project.sake.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sake.dto.request.ProductRequest;
import com.project.sake.entity.Product;
import com.project.sake.repository.ProductRepository;

import io.swagger.v3.oas.annotations.Operation;
import lombok.Builder;

@Builder
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Operation(summary = "產品", description = "新增商品")
    @Override
    public Product addProduct(ProductRequest req) {

        Product addProduct = Product.builder()
                .name(req.getName())
                .price(req.getPrice())
                .quantity(req.getQuantity())
                .description(req.getDescription())
                .build();
        Product Product = productRepository.save(addProduct);

        return Product;

    }

    @Operation(summary = "產品", description = "更新產品")
    @Override
    public Product update(Integer id, ProductRequest req) {
        Product product = productRepository.findById(id).get();
        Product update = Product.builder()
                .id(product.getId())
                .name(req.getName())
                .price(req.getPrice())
                .quantity(req.getQuantity())
                .description(req.getDescription())
                .build();
        return productRepository.save(update);

    }

    @Operation(summary = "產品", description = "刪除商品")
    @Override
    public Product delProduct(ProductRequest deleteProduct) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delProduct'");
    }

    @Operation(summary = "產品", description = "查詢所有產品")
    @Override
    public List<Product> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

}
