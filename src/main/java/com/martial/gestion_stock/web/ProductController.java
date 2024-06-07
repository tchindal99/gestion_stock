package com.martial.gestion_stock.web;

import com.martial.gestion_stock.entities.Product;
import com.martial.gestion_stock.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {
    private ProductRepository repository;
    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product){
        return repository.save(product);
    }
    @GetMapping("/products")
    public List<Product> findAllProduct(){
        return repository.findAll();
    }
}
