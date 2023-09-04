package com.openclassrooms.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.api.model.Products_categories;
import com.openclassrooms.api.repository.Products_categoriesRepository;

import lombok.Data;


@Service
@Data
public class Products_categoriesService {
	@Autowired
    private Products_categoriesRepository products_categoriesRepository;

    public Optional<Products_categories> getProducts_categories(final Long id) {
        return this.products_categoriesRepository.findById(id);
    }

    public Iterable<Products_categories> getProducts_categories() {
        return this.products_categoriesRepository.findAll();
    }

    public void deleteProducts_categories(final Long id) {
    	this.products_categoriesRepository.deleteById(id);
    }

    public Products_categories saveEmployee(Products_categories products_categories) {
    	Products_categories savedProducts_categories = this.products_categoriesRepository.save(products_categories);
        return savedProducts_categories;
    }
}
