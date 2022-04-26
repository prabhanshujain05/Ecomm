package com.springboot.mydemo.dao.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.mydemo.model.product.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
