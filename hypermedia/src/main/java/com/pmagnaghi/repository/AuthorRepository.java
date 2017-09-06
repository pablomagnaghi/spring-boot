package com.pmagnaghi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.pmagnaghi.domain.Author;

public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {

}
