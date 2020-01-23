package com.ecom.sapient.Ecom.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.sapient.Ecom.resources.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	List<Product> findByBrand(String brand);
	List<Product> findByPrice(int price);
	List<Product> findByColor(String color);
	List<Product> findBySize(String size);
	List<Product> findBySellerId(Long sellerId);

}
