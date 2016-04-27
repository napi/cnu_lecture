package com.study.service;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.domain.Board;
import com.study.domain.Post;
import com.study.domain.PostForm;
import com.study.exception.BoardNotFoundException;
import com.study.repository.BoardRepository;
import com.study.repository.PostRepository;

@Service
@Transactional
public class BoardService {
	@Autowired
	private BoardRepository boardRepository;
	@Autowired
	private PostRepository postRepository;
	
	public Board findBoard(String boardName) {
		Board board = boardRepository.findByName(boardName);
		if (Objects.isNull(board)) {
			throw new BoardNotFoundException(boardName);
		}
		return board;
	}
	
	public List<Post> findPosts(String boardName) {
		Board board = this.findBoard(boardName);
		return postRepository.findByBoard(board);
	}
	
	private Post getPost(long postId) {
		Post post = postRepository.findOne(postId);
		return post;
	}
	
	public Post writePost(String boardName, PostForm postForm) {
		Board board = this.findBoard(boardName);
		Post post = board.write(postForm.getAuthor(), postForm.getTitle(), postForm.getContent());
		
		return postRepository.save(post);
	}
	
	public Post editPost(long postId, String author, String title, String content) {
		Post post = getPost(postId);
		
		return post.update(author, title, content);
	}
	
	public Post erasePost(long postId) {
		Post post = getPost(postId);
		
		postRepository.delete(post);
		
		return post;
	}

}
