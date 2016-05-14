package com.study.controller;

import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.study.domain.Board;
import com.study.domain.Popo;
import com.study.domain.Post;
import com.study.domain.PostForm;
import com.study.exception.ResourceNotFoundException;
import com.study.repository.legacy.ConnectionRepository;
import com.study.repository.mybatis.CnuRepository;
import com.study.service.BoardService;

@RestController
@RequestMapping("/sample2")
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@Autowired
	private MessageSource messageSource;
//	private MessageSourceAccessor messageSource;
	
	@Autowired
	private CnuRepository cnuRepository;
	
	@Autowired
	private ConnectionRepository connectionRepository;
	
	@RequestMapping(value = "/{boardName}/info", method = {RequestMethod.GET, RequestMethod.HEAD})
	public ResponseEntity<Board> info(@PathVariable String boardName) {
		return ResponseEntity.ok(boardService.findBoard(boardName));
	}

	@RequestMapping(value = "/{boardName}", method = {RequestMethod.GET, RequestMethod.HEAD}) 
	public ResponseEntity<Board> free(@PathVariable String boardName) {
		System.out.println(boardName);
		return ResponseEntity.ok(boardService.findBoard(boardName));
	}

	@RequestMapping(value = "/{boardName}/list", method = {RequestMethod.GET, RequestMethod.HEAD})
	public ResponseEntity<List<Post>> listPosts(@PathVariable String boardName) {
		return ResponseEntity.ok(boardService.findPosts(boardName));
	}
	
	@RequestMapping(value = "/{boardName}", method = {RequestMethod.POST})
	public ResponseEntity<Post> createPost(@PathVariable String boardName, Popo popo) {
		PostForm postForm = new PostForm(popo.getAuthor(), popo.getTitle(), popo.getContent());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(boardService.writePost(boardName, postForm));
	}

	@RequestMapping(value = "/{boardName}/{postId}", method = {RequestMethod.PUT})
	public ResponseEntity<Post> updatePost(@PathVariable String boardName, @PathVariable long postId, String author, String title, String content) {
		return ResponseEntity.ok(boardService.editPost(postId, author, title, content));
	}

	@RequestMapping(value = "/{boardName}/{postId}", method = {RequestMethod.DELETE})
	public ResponseEntity<Post> updatePost(@PathVariable String boardName, @PathVariable long postId) {
		return ResponseEntity.ok(boardService.erasePost(postId));
	}

	@RequestMapping(value = "/listMybatis")
	public ResponseEntity<List<Board>> listMybatis() {
		return ResponseEntity.ok(cnuRepository.selectBoardList());
	}
	
	@RequestMapping(value = "/listLegacy")
	public ResponseEntity<List<Board>> listLegacy() throws SQLException {
		return ResponseEntity.ok(connectionRepository.selectBoardList());
	}
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Map<String, Object>> resourceNotFoundException(ResourceNotFoundException exception, Locale locale) {
		System.out.println(exception.getError());
		
		Map<String, Object> body = new LinkedHashMap<>();
		body.put("timestamp", new Date());
		body.put("status", exception.getStatus());
		body.put("error", exception.getError());
//		body.put("message", messageSource.getMessage(exception.getCode(), exception.getArgs(), locale).orElse("no message")0;
		body.put("message", messageSource.getMessage(exception.getCode(), exception.getArgs(), locale));
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
	}
	
}
