package com.bharath.ws.soap;

import java.util.List;


import com.bharath.ws.soap.entities.Product;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface ProductWs {

	@WebMethod
	List<Product> getProducts();

	@WebMethod
	Product getProduct(int id);

	@WebMethod
	Product createProduct(Product product);

	@WebMethod
	Product updateProduct(Product product);

}
