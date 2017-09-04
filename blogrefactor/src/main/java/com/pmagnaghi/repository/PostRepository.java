package com.pmagnaghi.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pmagnaghi.domain.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
    Post findFirstByOrderByPostedOnDesc();

    List<Post> findAllByOrderByPostedOnDesc();

    Post findBySlug(String slug);
}
