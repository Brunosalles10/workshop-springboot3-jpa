package com.brs.course.repositeres;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brs.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
