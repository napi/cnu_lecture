package com.study.controller.jpa;

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

import com.study.domain.jpa.JpaBoard;
import com.study.domain.jpa.Popo;
import com.study.domain.jpa.JpaPost;
import com.study.domain.jpa.PostForm;
import com.study.exception.ResourceNotFoundException;
import com.study.repository.legacy.ConnectionRepository;
import com.study.repository.mybatis.MybatisRepository;
import com.study.service.jpa.JpaBoardService;

@RestController
@RequestMapping("/jpa")
public class JpaController {
	@Autowired
	private JpaBoardService jpaBoardService;
	
	@Autowired
	private MessageSource messageSource;
//	private MessageSourceAccessor messageSource;
	
	@Autowired
	private MybatisRepository mybatisRepository;
	
	@Autowired
	private ConnectionRepository connectionRepository;
	
	@RequestMapping(value = "/{boardName}/info", method = {RequestMethod.GET, RequestMethod.HEAD})
	public ResponseEntity<JpaBoard> info(@PathVariable String boardName) {
		return ResponseEntity.ok(jpaBoardService.findBoard(boardName));
	}

	@RequestMapping(value = "/{boardName}", method = {RequestMethod.GET, RequestMethod.HEAD}) 
	public ResponseEntity<JpaBoard> free(@PathVariable String boardName) {
		System.out.println(boardName);
		return ResponseEntity.ok(jpaBoardService.findBoard(boardName));
	}

	@RequestMapping(value = "/{boardName}/list", method = {RequestMethod.GET, RequestMethod.HEAD})
	public ResponseEntity<List<JpaPost>> listPosts(@PathVariable String boardName) {
		return ResponseEntity.ok(jpaBoardService.findPosts(boardName));
	}
	
	@RequestMapping(value = "/{boardName}", method = {RequestMethod.POST})
	public ResponseEntity<JpaPost> createPost(@PathVariable String boardName, Popo popo) {
		PostForm postForm = new PostForm(popo.getAuthor(), popo.getTitle(), popo.getContent());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(jpaBoardService.writePost(boardName, postForm));
	}

	@RequestMapping(value = "/{boardName}/{postId}", method = {RequestMethod.PUT})
	public ResponseEntity<JpaPost> updatePost(@PathVariable String boardName, @PathVariable long postId, String author, String title, String content) {
		return ResponseEntity.ok(jpaBoardService.editPost(postId, author, title, content));
	}

	@RequestMapping(value = "/{boardName}/{postId}", method = {RequestMethod.DELETE})
	public ResponseEntity<JpaPost> updatePost(@PathVariable String boardName, @PathVariable long postId) {
		return ResponseEntity.ok(jpaBoardService.erasePost(postId));
	}

	@RequestMapping(value = "/listMybatis")
	public ResponseEntity<List<JpaBoard>> listMybatis() {
		return ResponseEntity.ok(mybatisRepository.selectJpaBoardList());
	}
	
	@RequestMapping(value = "/listLegacy")
	public ResponseEntity<List<JpaBoard>> listLegacy() throws SQLException {
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
