package com.openclassrooms.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.openclassrooms.api.model.Products;

@Repository
public interface ProductsRepository extends CrudRepository<Products,Long> {
	
}
