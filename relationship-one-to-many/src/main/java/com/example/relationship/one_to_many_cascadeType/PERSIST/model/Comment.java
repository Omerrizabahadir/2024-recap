package com.example.relationship.one_to_many_cascadeType.PERSIST.model;

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

    //her comment (yorum) bir post'a gidecek.Birçok Comment bir Post a gidecek
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
    /*
    Yorumun ilişkili olduğu Post nesnesini temsil eder.
    Post sınıfının bir örneğiyle ilişkilidir ve @ManyToOne notasyonu sayesinde bir yorumun bir gönderiye ait olduğu belirtilir.
    Birçoktan-Biriye İlişki: Bir Comment bir Post ile ilişkilidir.
    Ancak bir Post birden fazla Comment içerebilir.
    Bu, bir gönderi altında birçok yorum bulunabileceği anlamına gelir.
    Örneğin, bir blog gönderisi birçok yorumu barındırabilir, bu nedenle Comment sınıfı bir Post'a (post) bağlıdır.

     */

}
