package com.it.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;

import com.it.entity.Product;

@RepositoryDefinition(domainClass = Product.class, idClass = Long.class)
public interface ProductRepository extends CrudRepository<Product, Integer>{
	
}
