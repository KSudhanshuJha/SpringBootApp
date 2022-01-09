package com.it.service;

import com.it.entity.Product;

public interface ProductService {
	
	Iterable<Product> listAllProducts();

	Product getProductById(Integer id);

	Product saveProduct(Product product);

	void deleteProduct(Integer id);
}
