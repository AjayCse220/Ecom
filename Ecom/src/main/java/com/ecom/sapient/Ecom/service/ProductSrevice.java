package com.ecom.sapient.Ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.sapient.Ecom.repository.ProductRepository;
import com.ecom.sapient.Ecom.resources.Product;

@Service
public class ProductSrevice {
	@Autowired
	ProductRepository productRepository;
	public List<Product> getProductByColor(String color){
		return productRepository.findByColor(color); 
	}
	public List<Product> getProductBySize(String size){
		return productRepository.findBySize(size); 
	}
	public List<Product> getProductByBrand(String brand){
		return productRepository.findByBrand(brand); 
	}
	public List<Product> getProductByPrice(int price){
		return productRepository.findByPrice(price); 
	}
	public List<Product> getProductBySellerId(Long sellerId){
		return productRepository.findBySellerId(sellerId); 
	}
	public Product getProductBySku(Long productId){
		return productRepository.findById(productId).get(); 
	}
	public Product saveProduct(Product product){
		return productRepository.save(product); 
	}
}
