package com.service;

import java.util.List;

import com.project.sake.dto.request.ProductRequest;
import com.project.sake.entity.Product;

public class ProductServiceImpl implements ProductService {

    @Override
    public Product addProduct(ProductRequest req) {

        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Product update(Integer id, ProductRequest updateProduct) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Product delProduct(ProductRequest deleteProduct) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delProduct'");
    }

    @Override
    public List<Product> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

}
