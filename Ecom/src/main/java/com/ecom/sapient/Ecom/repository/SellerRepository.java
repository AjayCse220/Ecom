package com.ecom.sapient.Ecom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.sapient.Ecom.resources.Seller;
@Repository
public interface SellerRepository extends CrudRepository<Seller, Long>{
	

}
