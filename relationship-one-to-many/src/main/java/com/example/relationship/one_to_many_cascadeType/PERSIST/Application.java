package com.example.relationship.one_to_many_cascadeType.PERSIST;

import com.example.relationship.one_to_many_cascadeType.PERSIST.model.Comment;
import com.example.relationship.one_to_many_cascadeType.PERSIST.model.Post;
import com.example.relationship.one_to_many_cascadeType.PERSIST.repository.CommentRepository;
import com.example.relationship.one_to_many_cascadeType.PERSIST.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private CommentRepository commentRepository;

	@Autowired
	private PostRepository postRepository;

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//postSave();      	//ilk kez oluştururken çalıştır
		//commentSave();	//ilk kez oluştururken çalıştır


		//cascadeType.PERSIST kullanıNCA  -> Bir nesne veritabanına eklenirken, ilişkili nesnelerin de veritabanına eklenmesini sağlar.
		Post post = new Post();
		post.setTitle("New Post");
		post.setContent("This is a new post.");

		Comment comment1 = new Comment();
		comment1.setAuthorName("G");
		comment1.setText("Great post!");
		comment1.setPost(post);

		Comment comment2 = new Comment();
		comment2.setAuthorName("V");
		comment2.setText("Very informative.");
		comment2.setPost(post);

		post.setComments(Arrays.asList(comment1, comment2));

		postRepository.save(post);


	}
	private void commentSave(){
		Comment comment1 = new Comment();
		comment1.setAuthorName("A");
		comment1.setText("hello world");
		comment1.setPost(postRepository.findById(1L).get());
		commentRepository.save(comment1);

		Comment comment2 = new Comment();
		comment2.setAuthorName("B");
		comment2.setText("hello world2");
		comment2.setPost(postRepository.findById(1L).get());
		commentRepository.save(comment2);

		Comment comment3 = new Comment();
		comment3.setAuthorName("C");
		comment3.setText("hello world3");
		comment3.setPost(postRepository.findById(1L).get());
		commentRepository.save(comment3);
	}
	private void postSave() {
		Post post1 = new Post();
		post1.setTitle("Post Title1");
		post1.setContent("Post Content1");
		post1.setUserId(1L);

		Post post2 = new Post();
		post2.setTitle("Post Title2");
		post2.setContent("Post Content2");
		post2.setUserId(2L);

		Post post3 = new Post();
		post3.setTitle("Post Title3");
		post3.setContent("Post Content3");
		post3.setUserId(3L);

		postRepository.save(post1);
		postRepository.save(post2);
		postRepository.save(post3);
	}
}
