package com.pmagnaghi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmagnaghi.domain.Author;
import com.pmagnaghi.repository.AuthorRepository;

@Service
public class AuthorService {

	private AuthorRepository authorRepository;
	
	@Autowired
	public AuthorService(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}

	public List<Author> list() {
		return authorRepository.findAllByOrderByLastNameAscFirstNameAsc();
	}

}
