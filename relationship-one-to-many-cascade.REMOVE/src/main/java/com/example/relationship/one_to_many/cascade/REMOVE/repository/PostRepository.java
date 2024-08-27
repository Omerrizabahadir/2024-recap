package com.example.relationship.one_to_many.cascade.REMOVE.repository;

import com.example.relationship.one_to_many.cascade.REMOVE.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
