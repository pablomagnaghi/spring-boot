package com.pmagnaghi.service;

import com.pmagnaghi.domain.User;

public interface UserService {

	public User findByEmail(String email);
	
}
