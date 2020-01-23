package com.ecom.sapient.Ecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.sapient.Ecom.repository.SellerRepository;
import com.ecom.sapient.Ecom.resources.Seller;

@Service
public class SellerSrevice {
	@Autowired
	SellerRepository sellerRepository;
	
	public Seller getsellerById(Long sellerId){
		return sellerRepository.findById(sellerId).get(); 
	}
	
	public void saveSeller(Seller seller){
		sellerRepository.save(seller); 
	}
	
}
