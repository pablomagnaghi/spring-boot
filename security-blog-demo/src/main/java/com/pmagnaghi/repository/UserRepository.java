package com.pmagnaghi.repository;

import org.springframework.data.repository.CrudRepository;

import com.pmagnaghi.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByEmail(String email);
	
}
