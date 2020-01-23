package com.ecom.sapient.Ecom.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.sapient.Ecom.resources.Product;
import com.ecom.sapient.Ecom.service.ProductSrevice;
import com.ecom.sapient.Ecom.service.SellerSrevice;

@RestController
public class ProductApi {

	@Autowired
	private ProductSrevice productSrevice;
	@Autowired
	private SellerSrevice sellerSrevice;
	@GetMapping(value="/products")
	public List<Product> fetchProducts(@RequestParam String property,@RequestParam String value){
		List<Product> productList=new ArrayList<Product>();
		if(property.equals("Color")) {
			productList=productSrevice.getProductByColor(value);
		}else if(property.equals("Size")){
			productList=productSrevice.getProductBySize(value);
		}else if(property.equals("Price")){
			productList=productSrevice.getProductByPrice(Integer.parseInt(value));
		}else if(property.equals("Brand")){
			productList=productSrevice.getProductByBrand(value);
		}
		return productList; 
	}
	@GetMapping(value="/products/{id}")
	public Product fetchProductById(@PathVariable Long id){
		
		return productSrevice.getProductBySku(id); 
	}
	
	@GetMapping(value="/products/sellers/{id}")
	public List<Product> fetchProductsBySellerId(@PathVariable Long id){
		return productSrevice.getProductBySellerId(id); 
	}
	
	@PostMapping(value="/products/sellers/{id}")
	public Product saveProduct(@PathVariable Long id,@RequestBody Product product){
		product.setSeller(sellerSrevice.getsellerById(id));
		return productSrevice.saveProduct(product);
	}
}
