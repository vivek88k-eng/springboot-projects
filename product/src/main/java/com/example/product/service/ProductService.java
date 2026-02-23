package com.example.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
        return repository.save(product);
    }


    public List<Product> getAllProduct(){
        return repository.findAll();
    }
    
    public Optional<Product> getProductById(Long id){
        return repository.findById(id);
    }



    
    public List< Product> getByName(String name){
        return  repository.findByName(name);
    }

    public Product updateProduct(Long id, Product product){
        Product existing = repository.findById(id).orElse(null);
        existing.setName(product.getName());
        existing.setPrice(product.getPrice());
        existing.setQuantity(product.getQuantity());
        existing.setCategory(product.getCategory());
        return repository.save(existing);
    }

    public void deleteProduct(Long id){
        repository.deleteById(id);
    }
}
