package com.bway.springproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.springproject.model.Product;

public interface ProductRepository  extends JpaRepository<Product,Integer>{

}
