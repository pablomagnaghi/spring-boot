package com.pmagnaghi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pmagnaghi.domain.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

}
