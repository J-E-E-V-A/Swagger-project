package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Products;
import com.example.demo.Repository.ProductRepository;

//import com.example.demo.Entity.Customer;

@Service
public class ProductService {
	@Autowired
	private ProductRepository servicesRepo;

	public List<Products> getAllProducts() {

		List<Products> list = new ArrayList<Products>();
		this.servicesRepo.findAll().forEach(list::add);
		return list;
	}

	public void addProducts(Products product) {
		this.servicesRepo.save(product);
	}

	public void updateProducts(Integer id, Products product) {
		this.servicesRepo.save(product);

		System.out.println();
	}

	public void deleteProducts(Integer id) {
		this.servicesRepo.deleteById(id);

	}

}
