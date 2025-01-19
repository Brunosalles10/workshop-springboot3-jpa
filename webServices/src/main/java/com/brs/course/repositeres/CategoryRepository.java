package com.brs.course.repositeres;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brs.course.entities.Category;



public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
