package com.telusko.repo.pd;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.model.product.Product;

public interface IProduct extends JpaRepository<Product, Integer> {

}
