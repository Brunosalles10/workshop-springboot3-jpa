package com.brs.course.repositeres;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brs.course.entities.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
