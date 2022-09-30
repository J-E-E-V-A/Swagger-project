package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Products;

public interface ProductRepository extends CrudRepository<Products, Integer> {

}
