package com.brs.course.repositeres;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brs.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
