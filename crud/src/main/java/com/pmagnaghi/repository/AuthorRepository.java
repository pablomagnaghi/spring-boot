package com.pmagnaghi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pmagnaghi.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

	List<Author> findAllByOrderByLastNameAscFirstNameAsc();

}
