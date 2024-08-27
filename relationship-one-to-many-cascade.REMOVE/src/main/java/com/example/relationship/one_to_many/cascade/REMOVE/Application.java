package com.example.relationship.one_to_many.cascade.REMOVE;

import com.example.relationship.one_to_many.cascade.REMOVE.model.Comment;
import com.example.relationship.one_to_many.cascade.REMOVE.model.Post;
import com.example.relationship.one_to_many.cascade.REMOVE.repository.CommentRepository;
import com.example.relationship.one_to_many.cascade.REMOVE.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	PostRepository postRepository;

	@Autowired
	CommentRepository commentRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//ilk oluşturulurken aç. Yoksa sürekli oluşturacaktır.
		//savePost();
		//saveComment();
		postRepository.deleteById(3L);  /*post id 3 olanı silince ->post id si 3L ile ilişkili olan tüm comment ler silinecek.cascadeType.REMOVE hepdini otomatik siler
		veritabanında id'si 3 olan silinir. POST İD 3 İLE İLİŞKİLİ TÜM COMMENTLERDE SİLİNİR*/


	}
	private void savePost(){

		Post post1 = new Post();
		post1.setTitle("hi!");
		post1.setContent("This is a new post.");
		post1.setUserId(1L);

		Post post2 = new Post();
		post2.setTitle("hi! Ali ");
		post2.setContent("This is a new post.");
		post2.setUserId(2L);

		Post post3 = new Post();
		post3.setTitle("Post title");
		post3.setContent("This is a new post.");
		post3.setUserId(3L);

		postRepository.save(post1);
		postRepository.save(post2);
		postRepository.save(post3);


	}
	private void saveComment(){
		Comment comment1 = new Comment();
		comment1.setAuthorName("Ali");
		comment1.setText("that is good job");
		comment1.setPost(postRepository.findById(1L).get());
		commentRepository.save(comment1);

		Comment comment2 = new Comment();
		comment2.setAuthorName("Canan");
		comment2.setText("how are u?");
		comment2.setPost(postRepository.findById(1L).get());
		commentRepository.save(comment2);

		Comment comment3 = new Comment();
		comment3.setAuthorName("Burcu");
		comment3.setText("How are u my friend?");
		comment3.setPost(postRepository.findById(1L).get());
		commentRepository.save(comment3);

		Comment comment4 = new Comment();
		comment4.setAuthorName("Başar");
		comment4.setText("Do u have any...");
		comment4.setPost(postRepository.findById(3L).get());
		commentRepository.save(comment4);

		Comment comment5 = new Comment();
		comment5.setAuthorName("İrem");
		comment5.setText("u are so cool");
		comment5.setPost(postRepository.findById(3L).get());
		commentRepository.save(comment5);

		commentRepository.save(comment1);
		commentRepository.save(comment2);
		commentRepository.save(comment3);
		commentRepository.save(comment4);
		commentRepository.save(comment5);

	}
}
