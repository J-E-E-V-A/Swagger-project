package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Entity.Products;
import com.example.demo.Services.ProductService;


@RestController
public class ProductController {
@Autowired
private ProductService service;
@GetMapping("/Products")
public List<Products> getAllProducts(){
	return service.getAllProducts();
}
//@RequestMapping(method=- RequestMethod.PUT,value="/addustomer")
@PostMapping("/addproduct")
public void addProducts(@RequestBody Products product) {
	  this.service.addProducts(product);
}
@PutMapping("/product{productId}")
public void updateProducts(@PathVariable String productId,@RequestBody Products product) {
	this.service.updateProducts(Integer.parseInt(productId),product);
}
@DeleteMapping("/product/{productId}")
public void deleteCustomer(@PathVariable String productId) {
	this.service.deleteProducts(Integer.parseInt(productId));
}
}

 
