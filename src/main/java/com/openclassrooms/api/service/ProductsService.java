package com.openclassrooms.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.api.model.Products;
import com.openclassrooms.api.repository.ProductsRepository;

import lombok.Data;

@Data
@Service
public class ProductsService {
	@Autowired
    private ProductsRepository productsRepository;

    public Optional<Products> getProducts(final Long id) {
        return this.productsRepository.findById(id);
    }

    public Iterable<Products> getProducts() {
        return this.productsRepository.findAll();
    }

    public void deleteProducts(final Long id) {
    	this.productsRepository.deleteById(id);
    }

    public Products saveProducts(Products products) {
    	Products savedProducts = this.productsRepository.save(products);
        return savedProducts;
    }
}
