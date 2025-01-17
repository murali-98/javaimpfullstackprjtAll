package com.dxc.springcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.springcrud.entity.Product;
import com.dxc.springcrud.service.ProductService;

@RestController
public class Productcontroller {
	@Autowired
	private ProductService service;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products) {
		return service.saveProducts(products);
	}
	
	
	@GetMapping("/products")
	public List<Product> findAllProducts() {
		return service.getProduts();
	}
	@GetMapping("/product/{id}")
	public Product findProductById(@PathVariable int id) {
		return service.getProductById(id);
	}
	
	@GetMapping("/productByName/{name}")
	public Product findProductByName(@PathVariable String name) {
		return service.getProductName(name);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
		 
	}
	
}

