package com.study.domain.jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class JpaPost {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String author;
	private String title;
	private String content;
	private Date createAt;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private JpaBoard jpaBoard;
	
	public JpaPost() {
		
	}
	
	protected JpaPost(JpaBoard jpaBoard, String author, String title, String content) {
		this.jpaBoard = jpaBoard;
		this.author = author;
		this.title = title;
		this.content = content;		
		
		this.createAt = new Date();
	}

	public JpaPost update(String author, String title, String content) {
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

	protected JpaBoard getJpaBoard() {
		return jpaBoard;
	}

	
}
