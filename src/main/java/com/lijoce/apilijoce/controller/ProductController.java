package com.lijoce.apilijoce.controller;

import com.lijoce.apilijoce.entity.Product;
import com.lijoce.apilijoce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/product")
public class ProductController {

    private  final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProduct(){
        return this.productService.getProducts();
    }
}
