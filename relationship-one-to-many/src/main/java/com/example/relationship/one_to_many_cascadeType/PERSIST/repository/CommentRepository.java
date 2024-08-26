package com.example.relationship.one_to_many_cascadeType.PERSIST.repository;

import com.example.relationship.one_to_many_cascadeType.PERSIST.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
