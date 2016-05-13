package com.study.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String author;
	private String title;
	private String content;
	private Date createAt;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Board board;
	
	public Post() {
		
	}
	
	protected Post(Board board, String author, String title, String content) {
		this.board = board;
		this.author = author;
		this.title = title;
		this.content = content;		
		
		this.createAt = new Date();
	}

	public Post update(String author, String title, String content) {
		this.author = author;
		this.title = title;
		this.content = content;
		
		return this;
	}
	
	public Long getId() {
		return id;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public Date getCreateAt() {
		return createAt;
	}

	protected Board getBoard() {
		return board;
	}

	
}
