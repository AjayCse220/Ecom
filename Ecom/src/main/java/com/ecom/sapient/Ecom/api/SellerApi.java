package com.ecom.sapient.Ecom.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.sapient.Ecom.resources.Seller;
import com.ecom.sapient.Ecom.service.SellerSrevice;

@RestController
public class SellerApi {

	@Autowired
	private SellerSrevice sellerSrevice;
	@PostMapping(value="/sellers")
	public void saveSeller(@RequestBody Seller seller){
	 sellerSrevice.saveSeller(seller);; 
	}
	
}
