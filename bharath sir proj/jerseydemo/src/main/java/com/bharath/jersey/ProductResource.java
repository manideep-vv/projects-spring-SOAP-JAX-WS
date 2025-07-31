package com.bharath.jersey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Path("/products")
public class ProductResource {
	private static Map<Integer, Product> DB = new HashMap<>();

	@GET
	@Produces("application/json")
	public Products getProducts() {
		Products products = new Products();
		products.setProducts(new ArrayList<>(DB.values()));
		return products;
	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response createProduct(Product product) {
		if (product.getName() == null || product.getPrice() == 0) {
			return Response.status(400).entity("Please set all the mandatory fields").build();
		}
		product.setId(DB.values().size() + 1);
		DB.put(product.getId(), product);
		return Response.status(201).entity(product).build();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Response getProduct(@PathParam("id") int id) {
		Product product = DB.get(id);
		if (product == null) {
			return Response.status(404).build();
		}
		return Response.status(200).entity(product).build();
	}

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public Response delete(@PathParam("id") int id) {
		Product product = DB.get(id);
		if (product != null) {
			DB.remove(product.getId());
			return Response.status(200).build();
		}
		return Response.status(404).build();
	}

	static {
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Mac Book Pro");
		product1.setDescription("Awesome");
		product1.setPrice(1000);

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Samsung");
		product2.setDescription("Awesome");
		product2.setPrice(800);

		DB.put(product1.getId(), product1);
		DB.put(product2.getId(), product2);
	}
}