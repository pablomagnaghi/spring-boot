package com.pmagnaghi.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.pmagnaghi.domain.Post;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {

		List<Post> findByTitleContaining(@Param("title") String title);
	
}
