package com.project.sake.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.sake.dto.request.ProductRequest;
import com.project.sake.dto.response.ProductResponse;
import com.project.sake.entity.Product;
import com.project.sake.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    /**
     * 新增產品
     */
    @PostMapping("add")
    public ResponseEntity<Product> addProducts(@RequestBody ProductRequest req) {
        Product save = productService.addProduct(req);

        return ResponseEntity.ok(save);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Product> updateProducts(@PathVariable Integer id, @RequestBody ProductRequest req) {
        Product update = productService.update(id, req);

        return ResponseEntity.ok(update);
    }

    @GetMapping("find")
    public ResponseEntity<List<ProductResponse>> findAll() {
        List<ProductResponse> findAll = productService.findAll();
        return ResponseEntity.ok(findAll);
    }

}
