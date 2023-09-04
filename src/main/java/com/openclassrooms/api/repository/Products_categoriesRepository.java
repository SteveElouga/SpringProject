package com.openclassrooms.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openclassrooms.api.model.Products_categories;

@Repository
public interface Products_categoriesRepository extends CrudRepository<Products_categories,Long> {
	
}
