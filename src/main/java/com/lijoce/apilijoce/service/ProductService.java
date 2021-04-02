package com.lijoce.apilijoce.service;

import com.lijoce.apilijoce.entity.Product;
import com.lijoce.apilijoce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

   private ProductRepository repository;
    @Autowired
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product saveProduct(Product product){
       return repository.save(product);
   }
    public List<Product> saveProducts(List<Product> products){
       return  repository.saveAll(products);
    }

    public List<Product> getProducts(){
        return repository.findAll();
    }
    public Product getProductsById(int app_id){
        return repository.findById(app_id).orElse(null);
   }

//    public Product getProductsByName(String name){
//        return repository.findByName(name);
//    }

    public String deleteProduct(int app_id){
       repository.deleteById(app_id);
       return "product removed || " + app_id;
    }
}
