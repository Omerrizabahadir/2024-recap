package com.example.relationship.one_to_many.cascade.REMOVE.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "comment")
@Getter
@Setter
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;
    private String authorName;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
}
