package com.study.service.jpa;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.domain.jpa.JpaBoard;
import com.study.domain.jpa.JpaPost;
import com.study.domain.jpa.PostForm;
import com.study.exception.BoardNotFoundException;
import com.study.repository.jpa.JpaBoardRepository;
import com.study.repository.jpa.JpaPostRepository;

@Service
@Transactional
public class JpaBoardService {
	@Autowired
	private JpaBoardRepository jpaBoardRepository;
	@Autowired
	private JpaPostRepository jpaPostRepository;
	
	public JpaBoard findBoard(String boardName) {
		JpaBoard jpaBoard = jpaBoardRepository.findByName(boardName);
		if (Objects.isNull(jpaBoard)) {
			throw new BoardNotFoundException(boardName);
		}
		return jpaBoard;
	}
	
	public List<JpaPost> findPosts(String boardName) {
		JpaBoard jpaBoard = this.findBoard(boardName);
		return jpaPostRepository.findByJpaBoard(jpaBoard);
	}
	
	private JpaPost getPost(long postId) {
		JpaPost jpaPost = jpaPostRepository.findOne(postId);
		return jpaPost;
	}
	
	public JpaPost writePost(String boardName, PostForm postForm) {
		JpaBoard jpaBoard = this.findBoard(boardName);
		JpaPost jpaPost = jpaBoard.write(postForm.getAuthor(), postForm.getTitle(), postForm.getContent());
		
		return jpaPostRepository.save(jpaPost);
	}
	
	public JpaPost editPost(long postId, String author, String title, String content) {
		JpaPost jpaPost = getPost(postId);
		
		return jpaPost.update(author, title, content);
	}
	
	public JpaPost erasePost(long postId) {
		JpaPost jpaPost = getPost(postId);
		
		jpaPostRepository.delete(jpaPost);
		
		return jpaPost;
	}

}
