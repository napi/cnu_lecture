package com.study.domain;

import org.hibernate.validator.constraints.NotEmpty;

public class Popo {
	@NotEmpty
	private String author;
	@NotEmpty
	private String title;
	@NotEmpty
	private String content;
	
	public Popo() {
		// TODO Auto-generated constructor stub
	}
	
	public Popo(String author, String title, String content) {
		this.author = author;
		this.title = title;
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
